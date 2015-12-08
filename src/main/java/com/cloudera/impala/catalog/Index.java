package com.cloudera.impala.catalog;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.cloudera.impala.thrift.idriller.TIndex;

/**
 * Index 是IDriller中引入的特定类，用于进行索引功能的支持
 * 
 * @author dayutianfei
 * @since 2015-12-8
 * 
 */
public class Index {

    private static final Logger LOG = Logger.getLogger(Index.class);

    public String indexName_; // 索引名

    public enum IndexType {
        BLOOMFILTER,
        LUCENE
    }

    // TODO:使用枚举类表示，并增加到TObject中
    public String indexType_; // 索引类型

    // TODO 是否需要引入对象类型？
    public String db_; // required
    public String origTableName_; // required
    
    // col's alias name
    public List<String> cols_;
    // key:[ col's alias name ] --> value: [analyzer] 
    // value like 'org.apache.lucene.analysis.standard.StandardAnalyzer'
    // if empty,means all col use Default Analyzer : StandardAnalyzer
    public Map<String, String> col2Analyzer_;

    public int createTime_; // required
    public int lastAccessTime_; // optional

    // 如果存储在HDFS中，则使用hive自动生成的路径
    // 如果存储在本地磁盘中，则该路经仅表示根目录，具体目录由加载生成
    public String location_;

    public Map<String, String> params; // optional

    public boolean deferredRebuild; // required
    public boolean enabled; // optional

    protected org.apache.hadoop.hive.metastore.api.Index msIndex_;


    protected Index(TableId id, org.apache.hadoop.hive.metastore.api.Index msIndex, Db db, String name) {
        msIndex_ = msIndex;
        db_ = db.getName();
        indexName_ = name.toLowerCase();
        origTableName_ = msIndex.getOrigTableName();
        createTime_ = msIndex.getCreateTime();
        lastAccessTime_ = msIndex.getLastAccessTime();
        location_ = msIndex.getSd().getLocation();
        params = msIndex.getParameters();
    }
    
    //TODO
    /**
     * 将当前Index对象生成对应的TIndex对象
     * 主要用于写入和修改新对象
     * @return
     */
    public TIndex toThrift(){
        return null;
    }
    
    //TODO
    /**
     * 将获取的TIndex对象生成对应的Index对象
     * @param idx
     * @return
     */
    public Index fromThrift(TIndex idx){
        LOG.info("start to get index object from hive...");
        return null;
    }
    
    @Override
    public String toString() {
        return "Index [indexName_=" + indexName_ + ", indexType_=" + indexType_ + ", db_=" + db_
                + ", origTableName_=" + origTableName_ + ", cols_=" + cols_ + ", col2Analyzer_="
                + col2Analyzer_ + ", createTime_=" + createTime_ + ", lastAccessTime_=" + lastAccessTime_
                + ", location_=" + location_ + ", params=" + params + ", deferredRebuild=" + deferredRebuild
                + ", enabled=" + enabled + "]";
    }
}
