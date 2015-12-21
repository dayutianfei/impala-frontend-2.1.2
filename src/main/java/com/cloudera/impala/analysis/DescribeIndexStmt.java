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
import com.cloudera.impala.catalog.Table;
import com.cloudera.impala.common.AnalysisException;
import com.cloudera.impala.thrift.TDescribeIndexParams;

/**
 * Represents a DROP [IF EXISTS] DATABASE statement
 */
public class DescribeIndexStmt extends StatementBase {
  private final String indexName_;
  private TableName tableName_;
  /**
   * Constructor for building the drop statement. If ifExists is true, an error will not
   * be thrown if the database does not exist.
   */
  public DescribeIndexStmt(TableName tableName, String indexName) {
    this.tableName_ = tableName;
    this.indexName_ = indexName;
  }

  public String getIndex() { return indexName_; }

  public String getTable() { return tableName_.getTbl(); }

  @Override
  public String toSql() {
    return "DESC INDEX TABLE " + tableName_;
  }

  @Override
  public void analyze(Analyzer analyzer) throws AnalysisException {
    if (!tableName_.isFullyQualified()) {
      tableName_ = new TableName(analyzer.getDefaultDb(), tableName_.getTbl());
    }
    Table table = analyzer.getTable(tableName_, Privilege.VIEW_METADATA);
    if (table.isVirtualTable()) {
      throw new AnalysisException("SHOW CREATE TABLE not supported on VIEW: " +
          tableName_.toString());
    }
  }

  public TDescribeIndexParams toThrift() {
	TDescribeIndexParams params = new TDescribeIndexParams();
	params.setIndex_name(indexName_);
	params.setTable_name(tableName_.toThrift());
    return params;
  }


}
