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

public class TInsertStats implements org.apache.thrift.TBase<TInsertStats, TInsertStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInsertStats");

  private static final org.apache.thrift.protocol.TField BYTES_WRITTEN_FIELD_DESC = new org.apache.thrift.protocol.TField("bytes_written", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField PARQUET_STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("parquet_stats", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TInsertStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TInsertStatsTupleSchemeFactory());
  }

  public long bytes_written; // required
  public TParquetInsertStats parquet_stats; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BYTES_WRITTEN((short)1, "bytes_written"),
    PARQUET_STATS((short)2, "parquet_stats");

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
        case 1: // BYTES_WRITTEN
          return BYTES_WRITTEN;
        case 2: // PARQUET_STATS
          return PARQUET_STATS;
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
  private static final int __BYTES_WRITTEN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.PARQUET_STATS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BYTES_WRITTEN, new org.apache.thrift.meta_data.FieldMetaData("bytes_written", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PARQUET_STATS, new org.apache.thrift.meta_data.FieldMetaData("parquet_stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TParquetInsertStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInsertStats.class, metaDataMap);
  }

  public TInsertStats() {
  }

  public TInsertStats(
    long bytes_written)
  {
    this();
    this.bytes_written = bytes_written;
    setBytes_writtenIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInsertStats(TInsertStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bytes_written = other.bytes_written;
    if (other.isSetParquet_stats()) {
      this.parquet_stats = new TParquetInsertStats(other.parquet_stats);
    }
  }

  public TInsertStats deepCopy() {
    return new TInsertStats(this);
  }

  @Override
  public void clear() {
    setBytes_writtenIsSet(false);
    this.bytes_written = 0;
    this.parquet_stats = null;
  }

  public long getBytes_written() {
    return this.bytes_written;
  }

  public TInsertStats setBytes_written(long bytes_written) {
    this.bytes_written = bytes_written;
    setBytes_writtenIsSet(true);
    return this;
  }

  public void unsetBytes_written() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BYTES_WRITTEN_ISSET_ID);
  }

  /** Returns true if field bytes_written is set (has been assigned a value) and false otherwise */
  public boolean isSetBytes_written() {
    return EncodingUtils.testBit(__isset_bitfield, __BYTES_WRITTEN_ISSET_ID);
  }

  public void setBytes_writtenIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BYTES_WRITTEN_ISSET_ID, value);
  }

  public TParquetInsertStats getParquet_stats() {
    return this.parquet_stats;
  }

  public TInsertStats setParquet_stats(TParquetInsertStats parquet_stats) {
    this.parquet_stats = parquet_stats;
    return this;
  }

  public void unsetParquet_stats() {
    this.parquet_stats = null;
  }

  /** Returns true if field parquet_stats is set (has been assigned a value) and false otherwise */
  public boolean isSetParquet_stats() {
    return this.parquet_stats != null;
  }

  public void setParquet_statsIsSet(boolean value) {
    if (!value) {
      this.parquet_stats = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BYTES_WRITTEN:
      if (value == null) {
        unsetBytes_written();
      } else {
        setBytes_written((Long)value);
      }
      break;

    case PARQUET_STATS:
      if (value == null) {
        unsetParquet_stats();
      } else {
        setParquet_stats((TParquetInsertStats)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BYTES_WRITTEN:
      return Long.valueOf(getBytes_written());

    case PARQUET_STATS:
      return getParquet_stats();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BYTES_WRITTEN:
      return isSetBytes_written();
    case PARQUET_STATS:
      return isSetParquet_stats();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInsertStats)
      return this.equals((TInsertStats)that);
    return false;
  }

  public boolean equals(TInsertStats that) {
    if (that == null)
      return false;

    boolean this_present_bytes_written = true;
    boolean that_present_bytes_written = true;
    if (this_present_bytes_written || that_present_bytes_written) {
      if (!(this_present_bytes_written && that_present_bytes_written))
        return false;
      if (this.bytes_written != that.bytes_written)
        return false;
    }

    boolean this_present_parquet_stats = true && this.isSetParquet_stats();
    boolean that_present_parquet_stats = true && that.isSetParquet_stats();
    if (this_present_parquet_stats || that_present_parquet_stats) {
      if (!(this_present_parquet_stats && that_present_parquet_stats))
        return false;
      if (!this.parquet_stats.equals(that.parquet_stats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_bytes_written = true;
    builder.append(present_bytes_written);
    if (present_bytes_written)
      builder.append(bytes_written);

    boolean present_parquet_stats = true && (isSetParquet_stats());
    builder.append(present_parquet_stats);
    if (present_parquet_stats)
      builder.append(parquet_stats);

    return builder.toHashCode();
  }

  public int compareTo(TInsertStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInsertStats typedOther = (TInsertStats)other;

    lastComparison = Boolean.valueOf(isSetBytes_written()).compareTo(typedOther.isSetBytes_written());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBytes_written()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bytes_written, typedOther.bytes_written);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParquet_stats()).compareTo(typedOther.isSetParquet_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParquet_stats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parquet_stats, typedOther.parquet_stats);
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
    StringBuilder sb = new StringBuilder("TInsertStats(");
    boolean first = true;

    sb.append("bytes_written:");
    sb.append(this.bytes_written);
    first = false;
    if (isSetParquet_stats()) {
      if (!first) sb.append(", ");
      sb.append("parquet_stats:");
      if (this.parquet_stats == null) {
        sb.append("null");
      } else {
        sb.append(this.parquet_stats);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'bytes_written' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (parquet_stats != null) {
      parquet_stats.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TInsertStatsStandardSchemeFactory implements SchemeFactory {
    public TInsertStatsStandardScheme getScheme() {
      return new TInsertStatsStandardScheme();
    }
  }

  private static class TInsertStatsStandardScheme extends StandardScheme<TInsertStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInsertStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BYTES_WRITTEN
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.bytes_written = iprot.readI64();
              struct.setBytes_writtenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARQUET_STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.parquet_stats = new TParquetInsertStats();
              struct.parquet_stats.read(iprot);
              struct.setParquet_statsIsSet(true);
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
      if (!struct.isSetBytes_written()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'bytes_written' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInsertStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BYTES_WRITTEN_FIELD_DESC);
      oprot.writeI64(struct.bytes_written);
      oprot.writeFieldEnd();
      if (struct.parquet_stats != null) {
        if (struct.isSetParquet_stats()) {
          oprot.writeFieldBegin(PARQUET_STATS_FIELD_DESC);
          struct.parquet_stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInsertStatsTupleSchemeFactory implements SchemeFactory {
    public TInsertStatsTupleScheme getScheme() {
      return new TInsertStatsTupleScheme();
    }
  }

  private static class TInsertStatsTupleScheme extends TupleScheme<TInsertStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInsertStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.bytes_written);
      BitSet optionals = new BitSet();
      if (struct.isSetParquet_stats()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetParquet_stats()) {
        struct.parquet_stats.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInsertStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.bytes_written = iprot.readI64();
      struct.setBytes_writtenIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.parquet_stats = new TParquetInsertStats();
        struct.parquet_stats.read(iprot);
        struct.setParquet_statsIsSet(true);
      }
    }
  }

}

