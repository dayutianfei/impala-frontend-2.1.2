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

public enum TAnalyticWindowBoundaryType implements org.apache.thrift.TEnum {
  CURRENT_ROW(0),
  PRECEDING(1),
  FOLLOWING(2);

  private final int value;

  private TAnalyticWindowBoundaryType(int value) {
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
  public static TAnalyticWindowBoundaryType findByValue(int value) { 
    switch (value) {
      case 0:
        return CURRENT_ROW;
      case 1:
        return PRECEDING;
      case 2:
        return FOLLOWING;
      default:
        return null;
    }
  }
}
