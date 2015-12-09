namespace cpp impala
namespace java com.cloudera.impala.thrift.idriller


// added by dayutianfei on 2015-12-8 
struct TIndex {
  1:required string       indexName, // unique with in the whole database namespace
  2:required string       indexType, // reserved { "lucene", "bloomfilter", "unknown" }
  3:required string       dbName,
  4:required string       origTableName,
  5:required i32             createTime,
  6:optional i32             lastAccessTime,
  7:optional string   	  location,
  8:optional map<string, string> parameters,
  9:required bool         deferredRebuild, // true means the index file created by manual
  10:optional bool	      enabled // true mean not used for search
}

// added by dayutianfei on 2015-12-9
struct TFileReplica {
  1:required i64       	id, // unique with in the whole database namespace
  2:required string 	location, 
  3:optional string     nodeName,
  4:optional string     diskName,
  5:optional i16           status,
  6:optional i64           lastAccessTime,
  7:optional i64           createTime,
  8:optional i16			version
}

struct TFileDescriptor {
  1:required string     name, // unique with in the whole table namespace
  2:required string 	location, 
  3:required string     fileType,
  4:optional i16           status,
  5:optional i64           lastAccessTime,
  6:optional i64           createTime,
  7:required list<TFileReplica> fileReplicas,
  8:optional map<string, string> parameters,
}