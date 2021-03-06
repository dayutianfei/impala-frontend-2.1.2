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

public enum TDdlType implements org.apache.thrift.TEnum {
  ALTER_TABLE(0),
  ALTER_VIEW(1),
  CREATE_DATABASE(2),
  CREATE_TABLE(3),
  CREATE_TABLE_AS_SELECT(4),
  CREATE_TABLE_LIKE(5),
  CREATE_VIEW(6),
  CREATE_FUNCTION(7),
  COMPUTE_STATS(8),
  DROP_DATABASE(9),
  DROP_TABLE(10),
  DROP_VIEW(11),
  DROP_FUNCTION(12),
  CREATE_DATA_SOURCE(13),
  DROP_DATA_SOURCE(14),
  DROP_STATS(15),
  CREATE_ROLE(16),
  DROP_ROLE(17),
  GRANT_ROLE(18),
  REVOKE_ROLE(19),
  GRANT_PRIVILEGE(20),
  REVOKE_PRIVILEGE(21),
  DROP_INDEX(22),
  ALTER_INDEX(23),
  CREATE_INDEX(24),
  DESCRIBE_INDEX(25),
  SHOW_INDICES(26);

  private final int value;

  private TDdlType(int value) {
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
  public static TDdlType findByValue(int value) { 
    switch (value) {
      case 0:
        return ALTER_TABLE;
      case 1:
        return ALTER_VIEW;
      case 2:
        return CREATE_DATABASE;
      case 3:
        return CREATE_TABLE;
      case 4:
        return CREATE_TABLE_AS_SELECT;
      case 5:
        return CREATE_TABLE_LIKE;
      case 6:
        return CREATE_VIEW;
      case 7:
        return CREATE_FUNCTION;
      case 8:
        return COMPUTE_STATS;
      case 9:
        return DROP_DATABASE;
      case 10:
        return DROP_TABLE;
      case 11:
        return DROP_VIEW;
      case 12:
        return DROP_FUNCTION;
      case 13:
        return CREATE_DATA_SOURCE;
      case 14:
        return DROP_DATA_SOURCE;
      case 15:
        return DROP_STATS;
      case 16:
        return CREATE_ROLE;
      case 17:
        return DROP_ROLE;
      case 18:
        return GRANT_ROLE;
      case 19:
        return REVOKE_ROLE;
      case 20:
        return GRANT_PRIVILEGE;
      case 21:
        return REVOKE_PRIVILEGE;
      case 22:
        return DROP_INDEX;
      case 23:
        return ALTER_INDEX;
      case 24:
        return CREATE_INDEX;
      case 25:
        return DESCRIBE_INDEX;
      case 26:
        return SHOW_INDICES;
      default:
        return null;
    }
  }
}
