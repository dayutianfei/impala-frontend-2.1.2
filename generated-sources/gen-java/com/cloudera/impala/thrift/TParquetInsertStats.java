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

public class TParquetInsertStats implements org.apache.thrift.TBase<TParquetInsertStats, TParquetInsertStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TParquetInsertStats");

  private static final org.apache.thrift.protocol.TField PER_COLUMN_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("per_column_size", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TParquetInsertStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TParquetInsertStatsTupleSchemeFactory());
  }

  public Map<String,Long> per_column_size; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PER_COLUMN_SIZE((short)1, "per_column_size");

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
        case 1: // PER_COLUMN_SIZE
          return PER_COLUMN_SIZE;
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
    tmpMap.put(_Fields.PER_COLUMN_SIZE, new org.apache.thrift.meta_data.FieldMetaData("per_column_size", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TParquetInsertStats.class, metaDataMap);
  }

  public TParquetInsertStats() {
  }

  public TParquetInsertStats(
    Map<String,Long> per_column_size)
  {
    this();
    this.per_column_size = per_column_size;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TParquetInsertStats(TParquetInsertStats other) {
    if (other.isSetPer_column_size()) {
      Map<String,Long> __this__per_column_size = new HashMap<String,Long>();
      for (Map.Entry<String, Long> other_element : other.per_column_size.entrySet()) {

        String other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();

        String __this__per_column_size_copy_key = other_element_key;

        Long __this__per_column_size_copy_value = other_element_value;

        __this__per_column_size.put(__this__per_column_size_copy_key, __this__per_column_size_copy_value);
      }
      this.per_column_size = __this__per_column_size;
    }
  }

  public TParquetInsertStats deepCopy() {
    return new TParquetInsertStats(this);
  }

  @Override
  public void clear() {
    this.per_column_size = null;
  }

  public int getPer_column_sizeSize() {
    return (this.per_column_size == null) ? 0 : this.per_column_size.size();
  }

  public void putToPer_column_size(String key, long val) {
    if (this.per_column_size == null) {
      this.per_column_size = new HashMap<String,Long>();
    }
    this.per_column_size.put(key, val);
  }

  public Map<String,Long> getPer_column_size() {
    return this.per_column_size;
  }

  public TParquetInsertStats setPer_column_size(Map<String,Long> per_column_size) {
    this.per_column_size = per_column_size;
    return this;
  }

  public void unsetPer_column_size() {
    this.per_column_size = null;
  }

  /** Returns true if field per_column_size is set (has been assigned a value) and false otherwise */
  public boolean isSetPer_column_size() {
    return this.per_column_size != null;
  }

  public void setPer_column_sizeIsSet(boolean value) {
    if (!value) {
      this.per_column_size = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PER_COLUMN_SIZE:
      if (value == null) {
        unsetPer_column_size();
      } else {
        setPer_column_size((Map<String,Long>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PER_COLUMN_SIZE:
      return getPer_column_size();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PER_COLUMN_SIZE:
      return isSetPer_column_size();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TParquetInsertStats)
      return this.equals((TParquetInsertStats)that);
    return false;
  }

  public boolean equals(TParquetInsertStats that) {
    if (that == null)
      return false;

    boolean this_present_per_column_size = true && this.isSetPer_column_size();
    boolean that_present_per_column_size = true && that.isSetPer_column_size();
    if (this_present_per_column_size || that_present_per_column_size) {
      if (!(this_present_per_column_size && that_present_per_column_size))
        return false;
      if (!this.per_column_size.equals(that.per_column_size))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_per_column_size = true && (isSetPer_column_size());
    builder.append(present_per_column_size);
    if (present_per_column_size)
      builder.append(per_column_size);

    return builder.toHashCode();
  }

  public int compareTo(TParquetInsertStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TParquetInsertStats typedOther = (TParquetInsertStats)other;

    lastComparison = Boolean.valueOf(isSetPer_column_size()).compareTo(typedOther.isSetPer_column_size());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPer_column_size()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.per_column_size, typedOther.per_column_size);
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
    StringBuilder sb = new StringBuilder("TParquetInsertStats(");
    boolean first = true;

    sb.append("per_column_size:");
    if (this.per_column_size == null) {
      sb.append("null");
    } else {
      sb.append(this.per_column_size);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (per_column_size == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'per_column_size' was not present! Struct: " + toString());
    }
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

  private static class TParquetInsertStatsStandardSchemeFactory implements SchemeFactory {
    public TParquetInsertStatsStandardScheme getScheme() {
      return new TParquetInsertStatsStandardScheme();
    }
  }

  private static class TParquetInsertStatsStandardScheme extends StandardScheme<TParquetInsertStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TParquetInsertStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PER_COLUMN_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map44 = iprot.readMapBegin();
                struct.per_column_size = new HashMap<String,Long>(2*_map44.size);
                for (int _i45 = 0; _i45 < _map44.size; ++_i45)
                {
                  String _key46; // required
                  long _val47; // required
                  _key46 = iprot.readString();
                  _val47 = iprot.readI64();
                  struct.per_column_size.put(_key46, _val47);
                }
                iprot.readMapEnd();
              }
              struct.setPer_column_sizeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TParquetInsertStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.per_column_size != null) {
        oprot.writeFieldBegin(PER_COLUMN_SIZE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, struct.per_column_size.size()));
          for (Map.Entry<String, Long> _iter48 : struct.per_column_size.entrySet())
          {
            oprot.writeString(_iter48.getKey());
            oprot.writeI64(_iter48.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TParquetInsertStatsTupleSchemeFactory implements SchemeFactory {
    public TParquetInsertStatsTupleScheme getScheme() {
      return new TParquetInsertStatsTupleScheme();
    }
  }

  private static class TParquetInsertStatsTupleScheme extends TupleScheme<TParquetInsertStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TParquetInsertStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.per_column_size.size());
        for (Map.Entry<String, Long> _iter49 : struct.per_column_size.entrySet())
        {
          oprot.writeString(_iter49.getKey());
          oprot.writeI64(_iter49.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TParquetInsertStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map50 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I64, iprot.readI32());
        struct.per_column_size = new HashMap<String,Long>(2*_map50.size);
        for (int _i51 = 0; _i51 < _map50.size; ++_i51)
        {
          String _key52; // required
          long _val53; // required
          _key52 = iprot.readString();
          _val53 = iprot.readI64();
          struct.per_column_size.put(_key52, _val53);
        }
      }
      struct.setPer_column_sizeIsSet(true);
    }
  }

}

