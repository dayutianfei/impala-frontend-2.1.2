// Copyright 2012 Cloudera Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.cloudera.impala.analysis;

import com.cloudera.impala.authorization.Privilege;
import com.cloudera.impala.common.AnalysisException;
import com.cloudera.impala.thrift.TAlterIndexParms;

/**
 * Represents a ALTER INDEX indexName ON tableName [partitionSpec] statement
 */
public class AlterIndexStmt extends StatementBase {
  private final String indexName_;
  private TableName tableName_;
  private final PartitionSpec partitionSpec_;
  /**
   * Constructor for building the drop statement. If ifExists is true, an error will not
   * be thrown if the database does not exist.
   */
  public AlterIndexStmt(String indexName, TableName tableName, PartitionSpec partitionSpec) {
    this.indexName_ = indexName;
    this.tableName_ = tableName;
    this.partitionSpec_ = partitionSpec;
  }

  public String getIndex() { return indexName_; }

  public String getTable() { return tableName_.getTbl(); }

  @Override
  public String toSql() {
    StringBuilder sb = new StringBuilder("DROP INDEX");
    sb.append(getIndex());
    return sb.toString();
  }

  public TAlterIndexParms toThrift() {
	TAlterIndexParms params = new TAlterIndexParms();
	params.setIndex_name(getIndex());
	params.setTable_name(tableName_.toThrift());
	if(partitionSpec_ != null) params.setPartition_spec(partitionSpec_.toThrift());
    return params;
  }

  @Override
  public void analyze(Analyzer analyzer) throws AnalysisException {
	  if (!tableName_.isFullyQualified()) {
		  tableName_ = new TableName(analyzer.getDefaultDb(), tableName_.getTbl());
	  }
	  if(!analyzer.tableContainsIndex(tableName_.getDb() , tableName_.getTbl(), indexName_) ){
			throw new AnalysisException(Analyzer.INDEX_DOES_NOT_EXIST_ERROR_MSG
					+ String.format("%s", indexName_));
	  }
	  if (partitionSpec_ != null){
		  partitionSpec_.setTableName(tableName_);
		  partitionSpec_.setPartitionShouldExist();
		  partitionSpec_.setPrivilegeRequirement(Privilege.ALTER);
		  partitionSpec_.analyze(analyzer);
	  }
  }
}
