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

package com.cloudera.impala.catalog;

import com.cloudera.impala.thrift.TCatalogObjectType;

/**
 * Interface that all catalog objects implement.
 * 所有缓存对象的接口
 */
public interface CatalogObject {
    
    /**
     *   UNKNOWN,     // 转换失败或有异常时，为该类型
     *   CATALOG,     //
     *   DATABASE,    //
     *   TABLE,       //
     *   VIEW,        //
     *   FUNCTION,    //
     *   DATA_SOURCE, //
     *   ROLE,        //
     *   PRIVILEGE,   //
     *   HDFS_CACHE_POOL, //Unkown
     * */
  // Returns the TCatalogObject type of this Catalog object.
  public TCatalogObjectType getCatalogObjectType();

  // Returns the unqualified object name.
  // 通常不区分大小写
  public String getName();

  // Returns the version of this catalog object.
  public long getCatalogVersion();

  // Sets the version of this catalog object.
  public void setCatalogVersion(long newVersion);

  // Returns true if this CatalogObject has had its metadata loaded, false otherwise.
  public boolean isLoaded();
}