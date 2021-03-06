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

public class TInsertPartitionStatus implements org.apache.thrift.TBase<TInsertPartitionStatus, TInsertPartitionStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInsertPartitionStatus");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField NUM_APPENDED_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_appended_rows", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField STATS_FIELD_DESC = new org.apache.thrift.protocol.TField("stats", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TInsertPartitionStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TInsertPartitionStatusTupleSchemeFactory());
  }

  public long id; // optional
  public long num_appended_rows; // optional
  public TInsertStats stats; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    NUM_APPENDED_ROWS((short)2, "num_appended_rows"),
    STATS((short)3, "stats");

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
        case 1: // ID
          return ID;
        case 2: // NUM_APPENDED_ROWS
          return NUM_APPENDED_ROWS;
        case 3: // STATS
          return STATS;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __NUM_APPENDED_ROWS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.ID,_Fields.NUM_APPENDED_ROWS,_Fields.STATS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NUM_APPENDED_ROWS, new org.apache.thrift.meta_data.FieldMetaData("num_appended_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATS, new org.apache.thrift.meta_data.FieldMetaData("stats", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TInsertStats.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInsertPartitionStatus.class, metaDataMap);
  }

  public TInsertPartitionStatus() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInsertPartitionStatus(TInsertPartitionStatus other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.num_appended_rows = other.num_appended_rows;
    if (other.isSetStats()) {
      this.stats = new TInsertStats(other.stats);
    }
  }

  public TInsertPartitionStatus deepCopy() {
    return new TInsertPartitionStatus(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setNum_appended_rowsIsSet(false);
    this.num_appended_rows = 0;
    this.stats = null;
  }

  public long getId() {
    return this.id;
  }

  public TInsertPartitionStatus setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public long getNum_appended_rows() {
    return this.num_appended_rows;
  }

  public TInsertPartitionStatus setNum_appended_rows(long num_appended_rows) {
    this.num_appended_rows = num_appended_rows;
    setNum_appended_rowsIsSet(true);
    return this;
  }

  public void unsetNum_appended_rows() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_APPENDED_ROWS_ISSET_ID);
  }

  /** Returns true if field num_appended_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_appended_rows() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_APPENDED_ROWS_ISSET_ID);
  }

  public void setNum_appended_rowsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_APPENDED_ROWS_ISSET_ID, value);
  }

  public TInsertStats getStats() {
    return this.stats;
  }

  public TInsertPartitionStatus setStats(TInsertStats stats) {
    this.stats = stats;
    return this;
  }

  public void unsetStats() {
    this.stats = null;
  }

  /** Returns true if field stats is set (has been assigned a value) and false otherwise */
  public boolean isSetStats() {
    return this.stats != null;
  }

  public void setStatsIsSet(boolean value) {
    if (!value) {
      this.stats = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case NUM_APPENDED_ROWS:
      if (value == null) {
        unsetNum_appended_rows();
      } else {
        setNum_appended_rows((Long)value);
      }
      break;

    case STATS:
      if (value == null) {
        unsetStats();
      } else {
        setStats((TInsertStats)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case NUM_APPENDED_ROWS:
      return Long.valueOf(getNum_appended_rows());

    case STATS:
      return getStats();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case NUM_APPENDED_ROWS:
      return isSetNum_appended_rows();
    case STATS:
      return isSetStats();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInsertPartitionStatus)
      return this.equals((TInsertPartitionStatus)that);
    return false;
  }

  public boolean equals(TInsertPartitionStatus that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_num_appended_rows = true && this.isSetNum_appended_rows();
    boolean that_present_num_appended_rows = true && that.isSetNum_appended_rows();
    if (this_present_num_appended_rows || that_present_num_appended_rows) {
      if (!(this_present_num_appended_rows && that_present_num_appended_rows))
        return false;
      if (this.num_appended_rows != that.num_appended_rows)
        return false;
    }

    boolean this_present_stats = true && this.isSetStats();
    boolean that_present_stats = true && that.isSetStats();
    if (this_present_stats || that_present_stats) {
      if (!(this_present_stats && that_present_stats))
        return false;
      if (!this.stats.equals(that.stats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_id = true && (isSetId());
    builder.append(present_id);
    if (present_id)
      builder.append(id);

    boolean present_num_appended_rows = true && (isSetNum_appended_rows());
    builder.append(present_num_appended_rows);
    if (present_num_appended_rows)
      builder.append(num_appended_rows);

    boolean present_stats = true && (isSetStats());
    builder.append(present_stats);
    if (present_stats)
      builder.append(stats);

    return builder.toHashCode();
  }

  public int compareTo(TInsertPartitionStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInsertPartitionStatus typedOther = (TInsertPartitionStatus)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_appended_rows()).compareTo(typedOther.isSetNum_appended_rows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_appended_rows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_appended_rows, typedOther.num_appended_rows);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStats()).compareTo(typedOther.isSetStats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stats, typedOther.stats);
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
    StringBuilder sb = new StringBuilder("TInsertPartitionStatus(");
    boolean first = true;

    if (isSetId()) {
      sb.append("id:");
      sb.append(this.id);
      first = false;
    }
    if (isSetNum_appended_rows()) {
      if (!first) sb.append(", ");
      sb.append("num_appended_rows:");
      sb.append(this.num_appended_rows);
      first = false;
    }
    if (isSetStats()) {
      if (!first) sb.append(", ");
      sb.append("stats:");
      if (this.stats == null) {
        sb.append("null");
      } else {
        sb.append(this.stats);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stats != null) {
      stats.validate();
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

  private static class TInsertPartitionStatusStandardSchemeFactory implements SchemeFactory {
    public TInsertPartitionStatusStandardScheme getScheme() {
      return new TInsertPartitionStatusStandardScheme();
    }
  }

  private static class TInsertPartitionStatusStandardScheme extends StandardScheme<TInsertPartitionStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInsertPartitionStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NUM_APPENDED_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.num_appended_rows = iprot.readI64();
              struct.setNum_appended_rowsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stats = new TInsertStats();
              struct.stats.read(iprot);
              struct.setStatsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInsertPartitionStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetId()) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeI64(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum_appended_rows()) {
        oprot.writeFieldBegin(NUM_APPENDED_ROWS_FIELD_DESC);
        oprot.writeI64(struct.num_appended_rows);
        oprot.writeFieldEnd();
      }
      if (struct.stats != null) {
        if (struct.isSetStats()) {
          oprot.writeFieldBegin(STATS_FIELD_DESC);
          struct.stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInsertPartitionStatusTupleSchemeFactory implements SchemeFactory {
    public TInsertPartitionStatusTupleScheme getScheme() {
      return new TInsertPartitionStatusTupleScheme();
    }
  }

  private static class TInsertPartitionStatusTupleScheme extends TupleScheme<TInsertPartitionStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInsertPartitionStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetNum_appended_rows()) {
        optionals.set(1);
      }
      if (struct.isSetStats()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI64(struct.id);
      }
      if (struct.isSetNum_appended_rows()) {
        oprot.writeI64(struct.num_appended_rows);
      }
      if (struct.isSetStats()) {
        struct.stats.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInsertPartitionStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI64();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.num_appended_rows = iprot.readI64();
        struct.setNum_appended_rowsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stats = new TInsertStats();
        struct.stats.read(iprot);
        struct.setStatsIsSet(true);
      }
    }
  }

}

