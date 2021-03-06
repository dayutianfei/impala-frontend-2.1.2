/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TCatalogObjectType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  CATALOG(1),
  DATABASE(2),
  TABLE(3),
  VIEW(4),
  FUNCTION(5),
  DATA_SOURCE(6),
  ROLE(7),
  PRIVILEGE(8),
  HDFS_CACHE_POOL(9);

  private final int value;

  private TCatalogObjectType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TCatalogObjectType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return CATALOG;
      case 2:
        return DATABASE;
      case 3:
        return TABLE;
      case 4:
        return VIEW;
      case 5:
        return FUNCTION;
      case 6:
        return DATA_SOURCE;
      case 7:
        return ROLE;
      case 8:
        return PRIVILEGE;
      case 9:
        return HDFS_CACHE_POOL;
      default:
        return null;
    }
  }
}
