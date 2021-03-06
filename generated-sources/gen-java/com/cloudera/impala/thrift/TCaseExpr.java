/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TCaseExpr implements org.apache.thrift.TBase<TCaseExpr, TCaseExpr._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCaseExpr");

  private static final org.apache.thrift.protocol.TField HAS_CASE_EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("has_case_expr", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField HAS_ELSE_EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("has_else_expr", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCaseExprStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCaseExprTupleSchemeFactory());
  }

  public boolean has_case_expr; // required
  public boolean has_else_expr; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HAS_CASE_EXPR((short)1, "has_case_expr"),
    HAS_ELSE_EXPR((short)2, "has_else_expr");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HAS_CASE_EXPR
          return HAS_CASE_EXPR;
        case 2: // HAS_ELSE_EXPR
          return HAS_ELSE_EXPR;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __HAS_CASE_EXPR_ISSET_ID = 0;
  private static final int __HAS_ELSE_EXPR_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HAS_CASE_EXPR, new org.apache.thrift.meta_data.FieldMetaData("has_case_expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.HAS_ELSE_EXPR, new org.apache.thrift.meta_data.FieldMetaData("has_else_expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCaseExpr.class, metaDataMap);
  }

  public TCaseExpr() {
  }

  public TCaseExpr(
    boolean has_case_expr,
    boolean has_else_expr)
  {
    this();
    this.has_case_expr = has_case_expr;
    setHas_case_exprIsSet(true);
    this.has_else_expr = has_else_expr;
    setHas_else_exprIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCaseExpr(TCaseExpr other) {
    __isset_bitfield = other.__isset_bitfield;
    this.has_case_expr = other.has_case_expr;
    this.has_else_expr = other.has_else_expr;
  }

  public TCaseExpr deepCopy() {
    return new TCaseExpr(this);
  }

  @Override
  public void clear() {
    setHas_case_exprIsSet(false);
    this.has_case_expr = false;
    setHas_else_exprIsSet(false);
    this.has_else_expr = false;
  }

  public boolean isHas_case_expr() {
    return this.has_case_expr;
  }

  public TCaseExpr setHas_case_expr(boolean has_case_expr) {
    this.has_case_expr = has_case_expr;
    setHas_case_exprIsSet(true);
    return this;
  }

  public void unsetHas_case_expr() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID);
  }

  /** Returns true if field has_case_expr is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_case_expr() {
    return EncodingUtils.testBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID);
  }

  public void setHas_case_exprIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HAS_CASE_EXPR_ISSET_ID, value);
  }

  public boolean isHas_else_expr() {
    return this.has_else_expr;
  }

  public TCaseExpr setHas_else_expr(boolean has_else_expr) {
    this.has_else_expr = has_else_expr;
    setHas_else_exprIsSet(true);
    return this;
  }

  public void unsetHas_else_expr() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID);
  }

  /** Returns true if field has_else_expr is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_else_expr() {
    return EncodingUtils.testBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID);
  }

  public void setHas_else_exprIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HAS_ELSE_EXPR_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HAS_CASE_EXPR:
      if (value == null) {
        unsetHas_case_expr();
      } else {
        setHas_case_expr((Boolean)value);
      }
      break;

    case HAS_ELSE_EXPR:
      if (value == null) {
        unsetHas_else_expr();
      } else {
        setHas_else_expr((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HAS_CASE_EXPR:
      return Boolean.valueOf(isHas_case_expr());

    case HAS_ELSE_EXPR:
      return Boolean.valueOf(isHas_else_expr());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HAS_CASE_EXPR:
      return isSetHas_case_expr();
    case HAS_ELSE_EXPR:
      return isSetHas_else_expr();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCaseExpr)
      return this.equals((TCaseExpr)that);
    return false;
  }

  public boolean equals(TCaseExpr that) {
    if (that == null)
      return false;

    boolean this_present_has_case_expr = true;
    boolean that_present_has_case_expr = true;
    if (this_present_has_case_expr || that_present_has_case_expr) {
      if (!(this_present_has_case_expr && that_present_has_case_expr))
        return false;
      if (this.has_case_expr != that.has_case_expr)
        return false;
    }

    boolean this_present_has_else_expr = true;
    boolean that_present_has_else_expr = true;
    if (this_present_has_else_expr || that_present_has_else_expr) {
      if (!(this_present_has_else_expr && that_present_has_else_expr))
        return false;
      if (this.has_else_expr != that.has_else_expr)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_has_case_expr = true;
    builder.append(present_has_case_expr);
    if (present_has_case_expr)
      builder.append(has_case_expr);

    boolean present_has_else_expr = true;
    builder.append(present_has_else_expr);
    if (present_has_else_expr)
      builder.append(has_else_expr);

    return builder.toHashCode();
  }

  public int compareTo(TCaseExpr other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TCaseExpr typedOther = (TCaseExpr)other;

    lastComparison = Boolean.valueOf(isSetHas_case_expr()).compareTo(typedOther.isSetHas_case_expr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_case_expr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_case_expr, typedOther.has_case_expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHas_else_expr()).compareTo(typedOther.isSetHas_else_expr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_else_expr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_else_expr, typedOther.has_else_expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TCaseExpr(");
    boolean first = true;

    sb.append("has_case_expr:");
    sb.append(this.has_case_expr);
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_else_expr:");
    sb.append(this.has_else_expr);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'has_case_expr' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'has_else_expr' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCaseExprStandardSchemeFactory implements SchemeFactory {
    public TCaseExprStandardScheme getScheme() {
      return new TCaseExprStandardScheme();
    }
  }

  private static class TCaseExprStandardScheme extends StandardScheme<TCaseExpr> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCaseExpr struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HAS_CASE_EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_case_expr = iprot.readBool();
              struct.setHas_case_exprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HAS_ELSE_EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_else_expr = iprot.readBool();
              struct.setHas_else_exprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.isSetHas_case_expr()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'has_case_expr' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetHas_else_expr()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'has_else_expr' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCaseExpr struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HAS_CASE_EXPR_FIELD_DESC);
      oprot.writeBool(struct.has_case_expr);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HAS_ELSE_EXPR_FIELD_DESC);
      oprot.writeBool(struct.has_else_expr);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCaseExprTupleSchemeFactory implements SchemeFactory {
    public TCaseExprTupleScheme getScheme() {
      return new TCaseExprTupleScheme();
    }
  }

  private static class TCaseExprTupleScheme extends TupleScheme<TCaseExpr> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCaseExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.has_case_expr);
      oprot.writeBool(struct.has_else_expr);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCaseExpr struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.has_case_expr = iprot.readBool();
      struct.setHas_case_exprIsSet(true);
      struct.has_else_expr = iprot.readBool();
      struct.setHas_else_exprIsSet(true);
    }
  }

}

