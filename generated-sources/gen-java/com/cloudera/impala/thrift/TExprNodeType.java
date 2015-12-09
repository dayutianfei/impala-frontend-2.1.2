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

public enum TExprNodeType implements org.apache.thrift.TEnum {
  BOOL_LITERAL(0),
  CASE_EXPR(1),
  COMPOUND_PRED(2),
  FLOAT_LITERAL(3),
  INT_LITERAL(4),
  IN_PRED(5),
  IS_NULL_PRED(6),
  LIKE_PRED(7),
  LITERAL_PRED(8),
  NULL_LITERAL(9),
  SLOT_REF(10),
  STRING_LITERAL(11),
  TUPLE_IS_NULL_PRED(12),
  FUNCTION_CALL(13),
  AGGREGATE_EXPR(14),
  DECIMAL_LITERAL(15);

  private final int value;

  private TExprNodeType(int value) {
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
  public static TExprNodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return BOOL_LITERAL;
      case 1:
        return CASE_EXPR;
      case 2:
        return COMPOUND_PRED;
      case 3:
        return FLOAT_LITERAL;
      case 4:
        return INT_LITERAL;
      case 5:
        return IN_PRED;
      case 6:
        return IS_NULL_PRED;
      case 7:
        return LIKE_PRED;
      case 8:
        return LITERAL_PRED;
      case 9:
        return NULL_LITERAL;
      case 10:
        return SLOT_REF;
      case 11:
        return STRING_LITERAL;
      case 12:
        return TUPLE_IS_NULL_PRED;
      case 13:
        return FUNCTION_CALL;
      case 14:
        return AGGREGATE_EXPR;
      case 15:
        return DECIMAL_LITERAL;
      default:
        return null;
    }
  }
}