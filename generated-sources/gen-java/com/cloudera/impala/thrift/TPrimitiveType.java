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

public enum TPrimitiveType implements org.apache.thrift.TEnum {
  INVALID_TYPE(0),
  NULL_TYPE(1),
  BOOLEAN(2),
  TINYINT(3),
  SMALLINT(4),
  INT(5),
  BIGINT(6),
  FLOAT(7),
  DOUBLE(8),
  DATE(9),
  DATETIME(10),
  TIMESTAMP(11),
  STRING(12),
  BINARY(13),
  DECIMAL(14),
  CHAR(15),
  VARCHAR(16);

  private final int value;

  private TPrimitiveType(int value) {
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
  public static TPrimitiveType findByValue(int value) { 
    switch (value) {
      case 0:
        return INVALID_TYPE;
      case 1:
        return NULL_TYPE;
      case 2:
        return BOOLEAN;
      case 3:
        return TINYINT;
      case 4:
        return SMALLINT;
      case 5:
        return INT;
      case 6:
        return BIGINT;
      case 7:
        return FLOAT;
      case 8:
        return DOUBLE;
      case 9:
        return DATE;
      case 10:
        return DATETIME;
      case 11:
        return TIMESTAMP;
      case 12:
        return STRING;
      case 13:
        return BINARY;
      case 14:
        return DECIMAL;
      case 15:
        return CHAR;
      case 16:
        return VARCHAR;
      default:
        return null;
    }
  }
}
