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

public class TShowFunctionsParams implements org.apache.thrift.TBase<TShowFunctionsParams, TShowFunctionsParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TShowFunctionsParams");

  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DB_FIELD_DESC = new org.apache.thrift.protocol.TField("db", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SHOW_PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("show_pattern", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TShowFunctionsParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TShowFunctionsParamsTupleSchemeFactory());
  }

  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionCategory
   */
  public com.cloudera.impala.thrift.TFunctionCategory category; // required
  public String db; // optional
  public String show_pattern; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see com.cloudera.impala.thrift.TFunctionCategory
     */
    CATEGORY((short)1, "category"),
    DB((short)2, "db"),
    SHOW_PATTERN((short)3, "show_pattern");

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
        case 1: // CATEGORY
          return CATEGORY;
        case 2: // DB
          return DB;
        case 3: // SHOW_PATTERN
          return SHOW_PATTERN;
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
  private _Fields optionals[] = {_Fields.DB,_Fields.SHOW_PATTERN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.cloudera.impala.thrift.TFunctionCategory.class)));
    tmpMap.put(_Fields.DB, new org.apache.thrift.meta_data.FieldMetaData("db", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHOW_PATTERN, new org.apache.thrift.meta_data.FieldMetaData("show_pattern", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TShowFunctionsParams.class, metaDataMap);
  }

  public TShowFunctionsParams() {
  }

  public TShowFunctionsParams(
    com.cloudera.impala.thrift.TFunctionCategory category)
  {
    this();
    this.category = category;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TShowFunctionsParams(TShowFunctionsParams other) {
    if (other.isSetCategory()) {
      this.category = other.category;
    }
    if (other.isSetDb()) {
      this.db = other.db;
    }
    if (other.isSetShow_pattern()) {
      this.show_pattern = other.show_pattern;
    }
  }

  public TShowFunctionsParams deepCopy() {
    return new TShowFunctionsParams(this);
  }

  @Override
  public void clear() {
    this.category = null;
    this.db = null;
    this.show_pattern = null;
  }

  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionCategory
   */
  public com.cloudera.impala.thrift.TFunctionCategory getCategory() {
    return this.category;
  }

  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionCategory
   */
  public TShowFunctionsParams setCategory(com.cloudera.impala.thrift.TFunctionCategory category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public String getDb() {
    return this.db;
  }

  public TShowFunctionsParams setDb(String db) {
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

  public String getShow_pattern() {
    return this.show_pattern;
  }

  public TShowFunctionsParams setShow_pattern(String show_pattern) {
    this.show_pattern = show_pattern;
    return this;
  }

  public void unsetShow_pattern() {
    this.show_pattern = null;
  }

  /** Returns true if field show_pattern is set (has been assigned a value) and false otherwise */
  public boolean isSetShow_pattern() {
    return this.show_pattern != null;
  }

  public void setShow_patternIsSet(boolean value) {
    if (!value) {
      this.show_pattern = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((com.cloudera.impala.thrift.TFunctionCategory)value);
      }
      break;

    case DB:
      if (value == null) {
        unsetDb();
      } else {
        setDb((String)value);
      }
      break;

    case SHOW_PATTERN:
      if (value == null) {
        unsetShow_pattern();
      } else {
        setShow_pattern((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORY:
      return getCategory();

    case DB:
      return getDb();

    case SHOW_PATTERN:
      return getShow_pattern();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATEGORY:
      return isSetCategory();
    case DB:
      return isSetDb();
    case SHOW_PATTERN:
      return isSetShow_pattern();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TShowFunctionsParams)
      return this.equals((TShowFunctionsParams)that);
    return false;
  }

  public boolean equals(TShowFunctionsParams that) {
    if (that == null)
      return false;

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_db = true && this.isSetDb();
    boolean that_present_db = true && that.isSetDb();
    if (this_present_db || that_present_db) {
      if (!(this_present_db && that_present_db))
        return false;
      if (!this.db.equals(that.db))
        return false;
    }

    boolean this_present_show_pattern = true && this.isSetShow_pattern();
    boolean that_present_show_pattern = true && that.isSetShow_pattern();
    if (this_present_show_pattern || that_present_show_pattern) {
      if (!(this_present_show_pattern && that_present_show_pattern))
        return false;
      if (!this.show_pattern.equals(that.show_pattern))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_category = true && (isSetCategory());
    builder.append(present_category);
    if (present_category)
      builder.append(category.getValue());

    boolean present_db = true && (isSetDb());
    builder.append(present_db);
    if (present_db)
      builder.append(db);

    boolean present_show_pattern = true && (isSetShow_pattern());
    builder.append(present_show_pattern);
    if (present_show_pattern)
      builder.append(show_pattern);

    return builder.toHashCode();
  }

  public int compareTo(TShowFunctionsParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TShowFunctionsParams typedOther = (TShowFunctionsParams)other;

    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(typedOther.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, typedOther.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetShow_pattern()).compareTo(typedOther.isSetShow_pattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShow_pattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.show_pattern, typedOther.show_pattern);
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
    StringBuilder sb = new StringBuilder("TShowFunctionsParams(");
    boolean first = true;

    sb.append("category:");
    if (this.category == null) {
      sb.append("null");
    } else {
      sb.append(this.category);
    }
    first = false;
    if (isSetDb()) {
      if (!first) sb.append(", ");
      sb.append("db:");
      if (this.db == null) {
        sb.append("null");
      } else {
        sb.append(this.db);
      }
      first = false;
    }
    if (isSetShow_pattern()) {
      if (!first) sb.append(", ");
      sb.append("show_pattern:");
      if (this.show_pattern == null) {
        sb.append("null");
      } else {
        sb.append(this.show_pattern);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TShowFunctionsParamsStandardSchemeFactory implements SchemeFactory {
    public TShowFunctionsParamsStandardScheme getScheme() {
      return new TShowFunctionsParamsStandardScheme();
    }
  }

  private static class TShowFunctionsParamsStandardScheme extends StandardScheme<TShowFunctionsParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TShowFunctionsParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.category = com.cloudera.impala.thrift.TFunctionCategory.findByValue(iprot.readI32());
              struct.setCategoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DB
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.db = iprot.readString();
              struct.setDbIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHOW_PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.show_pattern = iprot.readString();
              struct.setShow_patternIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TShowFunctionsParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.category != null) {
        oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
        oprot.writeI32(struct.category.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.db != null) {
        if (struct.isSetDb()) {
          oprot.writeFieldBegin(DB_FIELD_DESC);
          oprot.writeString(struct.db);
          oprot.writeFieldEnd();
        }
      }
      if (struct.show_pattern != null) {
        if (struct.isSetShow_pattern()) {
          oprot.writeFieldBegin(SHOW_PATTERN_FIELD_DESC);
          oprot.writeString(struct.show_pattern);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TShowFunctionsParamsTupleSchemeFactory implements SchemeFactory {
    public TShowFunctionsParamsTupleScheme getScheme() {
      return new TShowFunctionsParamsTupleScheme();
    }
  }

  private static class TShowFunctionsParamsTupleScheme extends TupleScheme<TShowFunctionsParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TShowFunctionsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCategory()) {
        optionals.set(0);
      }
      if (struct.isSetDb()) {
        optionals.set(1);
      }
      if (struct.isSetShow_pattern()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCategory()) {
        oprot.writeI32(struct.category.getValue());
      }
      if (struct.isSetDb()) {
        oprot.writeString(struct.db);
      }
      if (struct.isSetShow_pattern()) {
        oprot.writeString(struct.show_pattern);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TShowFunctionsParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.category = com.cloudera.impala.thrift.TFunctionCategory.findByValue(iprot.readI32());
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(1)) {
        struct.db = iprot.readString();
        struct.setDbIsSet(true);
      }
      if (incoming.get(2)) {
        struct.show_pattern = iprot.readString();
        struct.setShow_patternIsSet(true);
      }
    }
  }

}

