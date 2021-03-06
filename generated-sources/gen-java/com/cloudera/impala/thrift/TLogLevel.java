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

public enum TLogLevel implements org.apache.thrift.TEnum {
  VLOG_3(0),
  VLOG_2(1),
  VLOG(2),
  INFO(3),
  WARN(4),
  ERROR(5),
  FATAL(6);

  private final int value;

  private TLogLevel(int value) {
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
  public static TLogLevel findByValue(int value) { 
    switch (value) {
      case 0:
        return VLOG_3;
      case 1:
        return VLOG_2;
      case 2:
        return VLOG;
      case 3:
        return INFO;
      case 4:
        return WARN;
      case 5:
        return ERROR;
      case 6:
        return FATAL;
      default:
        return null;
    }
  }
}
