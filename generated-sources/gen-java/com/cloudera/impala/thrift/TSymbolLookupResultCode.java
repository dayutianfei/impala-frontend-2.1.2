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

public enum TSymbolLookupResultCode implements org.apache.thrift.TEnum {
  SYMBOL_FOUND(0),
  BINARY_NOT_FOUND(1),
  SYMBOL_NOT_FOUND(2);

  private final int value;

  private TSymbolLookupResultCode(int value) {
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
  public static TSymbolLookupResultCode findByValue(int value) { 
    switch (value) {
      case 0:
        return SYMBOL_FOUND;
      case 1:
        return BINARY_NOT_FOUND;
      case 2:
        return SYMBOL_NOT_FOUND;
      default:
        return null;
    }
  }
}
