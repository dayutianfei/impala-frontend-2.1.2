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

public class TDataSourceTable implements org.apache.thrift.TBase<TDataSourceTable, TDataSourceTable._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataSourceTable");

  private static final org.apache.thrift.protocol.TField DATA_SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("data_source", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField INIT_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("init_string", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDataSourceTableStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDataSourceTableTupleSchemeFactory());
  }

  public TDataSource data_source; // required
  public String init_string; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATA_SOURCE((short)1, "data_source"),
    INIT_STRING((short)2, "init_string");

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
        case 1: // DATA_SOURCE
          return DATA_SOURCE;
        case 2: // INIT_STRING
          return INIT_STRING;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATA_SOURCE, new org.apache.thrift.meta_data.FieldMetaData("data_source", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TDataSource.class)));
    tmpMap.put(_Fields.INIT_STRING, new org.apache.thrift.meta_data.FieldMetaData("init_string", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataSourceTable.class, metaDataMap);
  }

  public TDataSourceTable() {
  }

  public TDataSourceTable(
    TDataSource data_source,
    String init_string)
  {
    this();
    this.data_source = data_source;
    this.init_string = init_string;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataSourceTable(TDataSourceTable other) {
    if (other.isSetData_source()) {
      this.data_source = new TDataSource(other.data_source);
    }
    if (other.isSetInit_string()) {
      this.init_string = other.init_string;
    }
  }

  public TDataSourceTable deepCopy() {
    return new TDataSourceTable(this);
  }

  @Override
  public void clear() {
    this.data_source = null;
    this.init_string = null;
  }

  public TDataSource getData_source() {
    return this.data_source;
  }

  public TDataSourceTable setData_source(TDataSource data_source) {
    this.data_source = data_source;
    return this;
  }

  public void unsetData_source() {
    this.data_source = null;
  }

  /** Returns true if field data_source is set (has been assigned a value) and false otherwise */
  public boolean isSetData_source() {
    return this.data_source != null;
  }

  public void setData_sourceIsSet(boolean value) {
    if (!value) {
      this.data_source = null;
    }
  }

  public String getInit_string() {
    return this.init_string;
  }

  public TDataSourceTable setInit_string(String init_string) {
    this.init_string = init_string;
    return this;
  }

  public void unsetInit_string() {
    this.init_string = null;
  }

  /** Returns true if field init_string is set (has been assigned a value) and false otherwise */
  public boolean isSetInit_string() {
    return this.init_string != null;
  }

  public void setInit_stringIsSet(boolean value) {
    if (!value) {
      this.init_string = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATA_SOURCE:
      if (value == null) {
        unsetData_source();
      } else {
        setData_source((TDataSource)value);
      }
      break;

    case INIT_STRING:
      if (value == null) {
        unsetInit_string();
      } else {
        setInit_string((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATA_SOURCE:
      return getData_source();

    case INIT_STRING:
      return getInit_string();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATA_SOURCE:
      return isSetData_source();
    case INIT_STRING:
      return isSetInit_string();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataSourceTable)
      return this.equals((TDataSourceTable)that);
    return false;
  }

  public boolean equals(TDataSourceTable that) {
    if (that == null)
      return false;

    boolean this_present_data_source = true && this.isSetData_source();
    boolean that_present_data_source = true && that.isSetData_source();
    if (this_present_data_source || that_present_data_source) {
      if (!(this_present_data_source && that_present_data_source))
        return false;
      if (!this.data_source.equals(that.data_source))
        return false;
    }

    boolean this_present_init_string = true && this.isSetInit_string();
    boolean that_present_init_string = true && that.isSetInit_string();
    if (this_present_init_string || that_present_init_string) {
      if (!(this_present_init_string && that_present_init_string))
        return false;
      if (!this.init_string.equals(that.init_string))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_data_source = true && (isSetData_source());
    builder.append(present_data_source);
    if (present_data_source)
      builder.append(data_source);

    boolean present_init_string = true && (isSetInit_string());
    builder.append(present_init_string);
    if (present_init_string)
      builder.append(init_string);

    return builder.toHashCode();
  }

  public int compareTo(TDataSourceTable other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TDataSourceTable typedOther = (TDataSourceTable)other;

    lastComparison = Boolean.valueOf(isSetData_source()).compareTo(typedOther.isSetData_source());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData_source()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data_source, typedOther.data_source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInit_string()).compareTo(typedOther.isSetInit_string());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInit_string()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.init_string, typedOther.init_string);
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
    StringBuilder sb = new StringBuilder("TDataSourceTable(");
    boolean first = true;

    sb.append("data_source:");
    if (this.data_source == null) {
      sb.append("null");
    } else {
      sb.append(this.data_source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("init_string:");
    if (this.init_string == null) {
      sb.append("null");
    } else {
      sb.append(this.init_string);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (data_source == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data_source' was not present! Struct: " + toString());
    }
    if (init_string == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'init_string' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (data_source != null) {
      data_source.validate();
    }
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

  private static class TDataSourceTableStandardSchemeFactory implements SchemeFactory {
    public TDataSourceTableStandardScheme getScheme() {
      return new TDataSourceTableStandardScheme();
    }
  }

  private static class TDataSourceTableStandardScheme extends StandardScheme<TDataSourceTable> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataSourceTable struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATA_SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.data_source = new TDataSource();
              struct.data_source.read(iprot);
              struct.setData_sourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INIT_STRING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.init_string = iprot.readString();
              struct.setInit_stringIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataSourceTable struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.data_source != null) {
        oprot.writeFieldBegin(DATA_SOURCE_FIELD_DESC);
        struct.data_source.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.init_string != null) {
        oprot.writeFieldBegin(INIT_STRING_FIELD_DESC);
        oprot.writeString(struct.init_string);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataSourceTableTupleSchemeFactory implements SchemeFactory {
    public TDataSourceTableTupleScheme getScheme() {
      return new TDataSourceTableTupleScheme();
    }
  }

  private static class TDataSourceTableTupleScheme extends TupleScheme<TDataSourceTable> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataSourceTable struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.data_source.write(oprot);
      oprot.writeString(struct.init_string);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataSourceTable struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.data_source = new TDataSource();
      struct.data_source.read(iprot);
      struct.setData_sourceIsSet(true);
      struct.init_string = iprot.readString();
      struct.setInit_stringIsSet(true);
    }
  }

}

