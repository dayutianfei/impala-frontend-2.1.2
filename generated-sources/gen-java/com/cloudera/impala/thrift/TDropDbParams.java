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

public class TDropDbParams implements org.apache.thrift.TBase<TDropDbParams, TDropDbParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDropDbParams");

  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IF_EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("if_exists", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDropDbParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDropDbParamsTupleSchemeFactory());
  }

  public String db; // required
  public boolean if_exists; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB((short)1, "db"),
    IF_EXISTS((short)2, "if_exists");

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
        case 1: // DB
          return DB;
        case 2: // IF_EXISTS
          return IF_EXISTS;
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
  private static final int __IF_EXISTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IF_EXISTS, new org.apache.thrift.meta_data.FieldMetaData("if_exists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDropDbParams.class, metaDataMap);
  }

  public TDropDbParams() {
  }

  public TDropDbParams(
    String db,
    boolean if_exists)
  {
    this();
    this.db = db;
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDropDbParams(TDropDbParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDb()) {
      this.db = other.db;
    }
    this.if_exists = other.if_exists;
  }

  public TDropDbParams deepCopy() {
    return new TDropDbParams(this);
  }

  @Override
  public void clear() {
    this.db = null;
    setIf_existsIsSet(false);
    this.if_exists = false;
  }

  public String getDb() {
    return this.db;
  }

  public TDropDbParams setDb(String db) {
    this.db = db;
    return this;
  }

  public void unsetDb() {
    this.db = null;
  }

  /** Returns true if field db is set (has been assigned a value) and false otherwise */
  public boolean isSetDb() {
    return this.db != null;
  }

  public void setDbIsSet(boolean value) {
    if (!value) {
      this.db = null;
    }
  }

  public boolean isIf_exists() {
    return this.if_exists;
  }

  public TDropDbParams setIf_exists(boolean if_exists) {
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
    return this;
  }

  public void unsetIf_exists() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IF_EXISTS_ISSET_ID);
  }

  /** Returns true if field if_exists is set (has been assigned a value) and false otherwise */
  public boolean isSetIf_exists() {
    return EncodingUtils.testBit(__isset_bitfield, __IF_EXISTS_ISSET_ID);
  }

  public void setIf_existsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IF_EXISTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((String)value);
      }
      break;

    case IF_EXISTS:
      if (value == null) {
        unsetIf_exists();
      } else {
        setIf_exists((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DB:
      return getDb();

    case IF_EXISTS:
      return Boolean.valueOf(isIf_exists());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DB:
      return isSetDb();
    case IF_EXISTS:
      return isSetIf_exists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDropDbParams)
      return this.equals((TDropDbParams)that);
    return false;
  }

  public boolean equals(TDropDbParams that) {
    if (that == null)
      return false;

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_if_exists = true;
    boolean that_present_if_exists = true;
    if (this_present_if_exists || that_present_if_exists) {
      if (!(this_present_if_exists && that_present_if_exists))
        return false;
      if (this.if_exists != that.if_exists)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_db = true && (isSetDb());
    builder.append(present_db);
    if (present_db)
      builder.append(db);

    boolean present_if_exists = true;
    builder.append(present_if_exists);
    if (present_if_exists)
      builder.append(if_exists);

    return builder.toHashCode();
  }

  public int compareTo(TDropDbParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TDropDbParams typedOther = (TDropDbParams)other;

    lastComparison = Boolean.valueOf(isSetDb()).compareTo(typedOther.isSetDb());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDb()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.db, typedOther.db);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIf_exists()).compareTo(typedOther.isSetIf_exists());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIf_exists()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.if_exists, typedOther.if_exists);
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
    StringBuilder sb = new StringBuilder("TDropDbParams(");
    boolean first = true;

    sb.append("db:");
    if (this.db == null) {
      sb.append("null");
    } else {
      sb.append(this.db);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("if_exists:");
    sb.append(this.if_exists);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (db == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'db' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'if_exists' because it's a primitive and you chose the non-beans generator.
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

  private static class TDropDbParamsStandardSchemeFactory implements SchemeFactory {
    public TDropDbParamsStandardScheme getScheme() {
      return new TDropDbParamsStandardScheme();
    }
  }

  private static class TDropDbParamsStandardScheme extends StandardScheme<TDropDbParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDropDbParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IF_EXISTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.if_exists = iprot.readBool();
              struct.setIf_existsIsSet(true);
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
      if (!struct.isSetIf_exists()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'if_exists' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDropDbParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.db != null) {
        oprot.writeFieldBegin(DB_FIELD_DESC);
        oprot.writeString(struct.db);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IF_EXISTS_FIELD_DESC);
      oprot.writeBool(struct.if_exists);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDropDbParamsTupleSchemeFactory implements SchemeFactory {
    public TDropDbParamsTupleScheme getScheme() {
      return new TDropDbParamsTupleScheme();
    }
  }

  private static class TDropDbParamsTupleScheme extends TupleScheme<TDropDbParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDropDbParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.db);
      oprot.writeBool(struct.if_exists);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDropDbParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.db = iprot.readString();
      struct.setDbIsSet(true);
      struct.if_exists = iprot.readBool();
      struct.setIf_existsIsSet(true);
    }
  }

}

