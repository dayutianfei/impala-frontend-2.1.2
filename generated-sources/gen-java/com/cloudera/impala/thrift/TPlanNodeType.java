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

public enum TPlanNodeType implements org.apache.thrift.TEnum {
  HDFS_SCAN_NODE(0),
  HBASE_SCAN_NODE(1),
  HASH_JOIN_NODE(2),
  AGGREGATION_NODE(3),
  SORT_NODE(4),
  EMPTY_SET_NODE(5),
  EXCHANGE_NODE(6),
  UNION_NODE(7),
  SELECT_NODE(8),
  CROSS_JOIN_NODE(9),
  DATA_SOURCE_NODE(10),
  ANALYTIC_EVAL_NODE(11);

  private final int value;

  private TPlanNodeType(int value) {
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
  public static TPlanNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return HDFS_SCAN_NODE;
      case 1:
        return HBASE_SCAN_NODE;
      case 2:
        return HASH_JOIN_NODE;
      case 3:
        return AGGREGATION_NODE;
      case 4:
        return SORT_NODE;
      case 5:
        return EMPTY_SET_NODE;
      case 6:
        return EXCHANGE_NODE;
      case 7:
        return UNION_NODE;
      case 8:
        return SELECT_NODE;
      case 9:
        return CROSS_JOIN_NODE;
      case 10:
        return DATA_SOURCE_NODE;
      case 11:
        return ANALYTIC_EVAL_NODE;
      default:
        return null;
    }
  }
}
