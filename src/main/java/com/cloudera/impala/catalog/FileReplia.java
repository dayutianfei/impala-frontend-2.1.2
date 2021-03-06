package com.cloudera.impala.catalog;

import com.cloudera.impala.thrift.TCatalogObjectType;
import com.cloudera.impala.thrift.idriller.TFileReplica;

/**
 * 控制该类大小，缓存千万级文件，内存占用在1GB以内
 * 文件副本信息，即物理存储信息
 * @author dayutianfei
 *
 */
public class FileReplia implements CatalogObject {

    public long id_; // 文件唯一标识，全局唯一
    
    public String location_; // 文件访问路径，可以为一个URL地址
    
    public String node_;
    public String diskId_;
    
    public short status_; // 文件状态 {0:in-writing, 1:open, 2:closed, 3:in-reading, 4:unknown}
    
    public long lastAccessTime_; // 文件更新时间
    public short version_;
    
    private long catalogVersion_ = Catalog.INITIAL_CATALOG_VERSION;
    
    public TFileReplica file_;

    @Override
    public TCatalogObjectType getCatalogObjectType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getCatalogVersion() { return catalogVersion_; }

    @Override
    public void setCatalogVersion(long catalogVersion) {
      catalogVersion_ = catalogVersion;
    }

    @Override
    public boolean isLoaded() { return true; }
}
