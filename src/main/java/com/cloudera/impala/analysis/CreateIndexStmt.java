package com.cloudera.impala.analysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import com.cloudera.impala.authorization.Privilege;
import com.cloudera.impala.catalog.Column;
import com.cloudera.impala.catalog.Db;
import com.cloudera.impala.catalog.Index;
import com.cloudera.impala.catalog.Table;
import com.cloudera.impala.catalog.Type;
import com.cloudera.impala.common.AnalysisException;
import com.cloudera.impala.thrift.TCreateIndexParms;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

public class CreateIndexStmt extends StatementBase {
	private String dbName;
	private TableName tableName_;
	private final String indexName;
	private final List<String> columns_;
	private final String indexType;
	private boolean isWithDeferedRebuild = false;
	private final Map<String, String> indexProperties_;
	protected final static Logger LOG = Logger.getLogger(CreateIndexStmt.class);
	
	public CreateIndexStmt(String indexName, TableName tableName,
			List<String> columns, String indexType,
			boolean isWithDeferedRebuild, Map<String, String> indexProperties) {
		this.tableName_ = tableName;
		this.indexName = indexName;
		this.columns_ = columns;
		this.indexType = indexType;
		this.isWithDeferedRebuild = isWithDeferedRebuild;
		this.indexProperties_ = indexProperties;
	}

	public String getTbl() {
		return tableName_.getTbl();
	}

	public TableName getTblName() {
		return tableName_;
	}

	@Override
	public String toSql() {
		StringBuilder sb = new StringBuilder("CREATE INDEX " + indexName
				+ " ON TABLE " + tableName_ + " (");
		sb.append(Joiner.on(", ").join(columns_) + ") AS '" + indexType + "'");
		if (isWithDeferedRebuild) {
			sb.append(" WITH DEFERRED REBUILD");
		}
		if (indexProperties_ != null) {
			sb.append(" TBLPROPERTIES(" + this.propertyMapToSql(indexProperties_)
					+ ")");
		}

		return sb.toString();
	}

	public TCreateIndexParms toThrift() {
		TCreateIndexParms params = new TCreateIndexParms();
		params.setTable_name(tableName_.toThrift());
		params.setIndex_name(indexName);
		params.setIndex_type(indexType);
		params.setColumns(columns_);
		params.setIf_with_defered_rebuild(isWithDeferedRebuild);
		if (indexProperties_ != null){
			params.setIndex_properties(indexProperties_);
		}else {
			params.setIndex_properties(new HashMap<String,String>());
		}
		return params;
	}
	
	@Override
	public void analyze(Analyzer analyzer) throws AnalysisException {
	    if (!tableName_.isFullyQualified()) {
	    	tableName_ = new TableName(analyzer.getDefaultDb(), tableName_.getTbl());
	    }
		super.analyze(analyzer);
		Preconditions.checkState(tableName_ != null && !tableName_.isEmpty());
		tableName_.analyze();
		dbName = analyzer.getTargetDbName(tableName_);
		analyzer.getUser().getName();

		if (!analyzer.dbContainsTable(dbName, tableName_.getTbl(),
				Privilege.ANY)) {
			throw new AnalysisException(Analyzer.TBL_DOES_NOT_EXIST_ERROR_MSG
					+ String.format("%s.%s", dbName, getTbl()));
		}
		//check whether the index exists
		if(analyzer.tableContainsIndex(dbName , tableName_.getTbl(), indexName) ){
			throw new AnalysisException(Analyzer.INDEX_ALREADY_EXISTS_ERROR_MSG
					+ String.format("%s", indexName));
		}
		
		//in the same db, view , table and index can't be same
		//TODO:XXX
		//analyzer.checkSameName(dbName, indexName,1);
		
		Table table = analyzer.getTable(tableName_, Privilege.VIEW_METADATA);
		
	    if (table.isVirtualTable()) {
	      throw new AnalysisException("CREATE INDEX not supported on VIEW: " +
	          tableName_.toString());
	    }
		
		//check that the size of columns_ should be bigger than 1.
		if (columns_ == null || columns_.size() == 0){
			throw new AnalysisException("index should contains one or more than one clumn. but columns_.size() is 0.");
		}
		
		//check whether with duplicate.
		Set<String> colNameWithDup = Sets.newHashSet();
	    for (String colDef: columns_) {
	      if (!colNameWithDup.add(colDef.toLowerCase())) {
	        throw new AnalysisException("thr columns in an index should be different, but duplicate column name: " + colDef);
	      }
	    }
		//check the selected columns is in columns of a table.
		List<String> allColumnsInTbl = table.getColumnNames();
		for (String columnName : columns_){
			if (!allColumnsInTbl.contains(columnName.toLowerCase())){
				throw new AnalysisException("the selected columns index should be columns of the table, but columnName: " + columnName + " is not in the table.");
			}
		}
		//check the index type
		if (!indexType.equalsIgnoreCase(Index.IndexType.BLOOMFILTER.toString()) && !indexType.equalsIgnoreCase(Index.IndexType.LUCENE.toString())){
			throw new AnalysisException("the type of index only support lucene_index and bloomfilter_index, but indexType is : " + indexType);
		}

		//check indexName
	    //TODO:XXX

		//check type of column if the indextype if bloomfilter.
	    //TODO
	    
	    //check whether idxProperties is right or not
	    //TODO
	    
		//check whether the index to create does already exist. 
		//TODO
		
	}

	private String propertyMapToSql(Map<String, String> propertyMap) {
		List<String> properties = Lists.newArrayList();
		for (Map.Entry<String, String> entry : propertyMap.entrySet()) {
			properties.add(String.format("'%s'='%s'", entry.getKey(),
			// Properties may contain characters that need to be escaped.
			// e.g. If the row format escape delimiter is '\', the map of serde
			// properties
			// from the metastore table will contain 'escape.delim' => '\',
			// which is not
			// properly escaped.
					StringEscapeUtils.escapeJava(entry.getValue())));
		}
		return "(" + Joiner.on(", ").join(properties) + ")";
	}
	
	//check whether the columns in a index already is the as columns_, if they are equal, return true.
	private boolean checkColumnsEquality(List<String> cols1, List<String> cols2){
		if (cols1.size() != cols2.size()){
			return false;
		}
		//TODO 
		for (String col : cols1){
			if (!cols2.contains(col)){
				return false;
			}
		}
		return true;
	}
	
	private boolean checkAnalyzerEquality(Map<String, String> property1, Map<String, String> property2){
		
		List<String> colWithAnalyzer1 = getColumnAnlyzer(property1);
		List<String> colWithAnalyzer2 = getColumnAnlyzer(property2);
		if (colWithAnalyzer1.size() != colWithAnalyzer2.size()){
			return false;
		}
		for (String col : colWithAnalyzer1){
			if (!colWithAnalyzer2.contains(col)){
				return false;
			}
		}
		return true;
	}
	
	private List<String> getColumnAnlyzer(Map<String, String> property){
		List<String> colWithAnalyzer = Lists.newArrayList();
		if (property != null){
	    	for (String key : property.keySet()){
	    		if (key.toLowerCase().startsWith("_lucene")){
	    			colWithAnalyzer.add(key.substring(8));
	    		}else {
	    			colWithAnalyzer.add(key);
	    		}
	    	}
	    }
		return colWithAnalyzer;
	}
}
