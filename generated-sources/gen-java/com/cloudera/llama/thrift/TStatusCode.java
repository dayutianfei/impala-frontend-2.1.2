/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.llama.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TStatusCode implements org.apache.thrift.TEnum {
  OK(0),
  REQUEST_ERROR(1),
  INTERNAL_ERROR(2);

  private final int value;

  private TStatusCode(int value) {
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
  public static TStatusCode findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return REQUEST_ERROR;
      case 2:
        return INTERNAL_ERROR;
      default:
        return null;
    }
  }
}
