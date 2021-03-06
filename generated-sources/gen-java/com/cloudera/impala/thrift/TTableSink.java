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

public class TTableSink implements org.apache.thrift.TBase<TTableSink, TTableSink._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTableSink");

  private static final org.apache.thrift.protocol.TField TARGET_TABLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("target_table_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HDFS_TABLE_SINK_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_table_sink", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTableSinkStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTableSinkTupleSchemeFactory());
  }

  public int target_table_id; // required
  /**
   * 
   * @see TTableSinkType
   */
  public TTableSinkType type; // required
  public THdfsTableSink hdfs_table_sink; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TARGET_TABLE_ID((short)1, "target_table_id"),
    /**
     * 
     * @see TTableSinkType
     */
    TYPE((short)2, "type"),
    HDFS_TABLE_SINK((short)3, "hdfs_table_sink");

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
        case 1: // TARGET_TABLE_ID
          return TARGET_TABLE_ID;
        case 2: // TYPE
          return TYPE;
        case 3: // HDFS_TABLE_SINK
          return HDFS_TABLE_SINK;
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
  private static final int __TARGET_TABLE_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HDFS_TABLE_SINK};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TARGET_TABLE_ID, new org.apache.thrift.meta_data.FieldMetaData("target_table_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTableId")));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TTableSinkType.class)));
    tmpMap.put(_Fields.HDFS_TABLE_SINK, new org.apache.thrift.meta_data.FieldMetaData("hdfs_table_sink", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THdfsTableSink.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTableSink.class, metaDataMap);
  }

  public TTableSink() {
  }

  public TTableSink(
    int target_table_id,
    TTableSinkType type)
  {
    this();
    this.target_table_id = target_table_id;
    setTarget_table_idIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTableSink(TTableSink other) {
    __isset_bitfield = other.__isset_bitfield;
    this.target_table_id = other.target_table_id;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetHdfs_table_sink()) {
      this.hdfs_table_sink = new THdfsTableSink(other.hdfs_table_sink);
    }
  }

  public TTableSink deepCopy() {
    return new TTableSink(this);
  }

  @Override
  public void clear() {
    setTarget_table_idIsSet(false);
    this.target_table_id = 0;
    this.type = null;
    this.hdfs_table_sink = null;
  }

  public int getTarget_table_id() {
    return this.target_table_id;
  }

  public TTableSink setTarget_table_id(int target_table_id) {
    this.target_table_id = target_table_id;
    setTarget_table_idIsSet(true);
    return this;
  }

  public void unsetTarget_table_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TARGET_TABLE_ID_ISSET_ID);
  }

  /** Returns true if field target_table_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTarget_table_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TARGET_TABLE_ID_ISSET_ID);
  }

  public void setTarget_table_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TARGET_TABLE_ID_ISSET_ID, value);
  }

  /**
   * 
   * @see TTableSinkType
   */
  public TTableSinkType getType() {
    return this.type;
  }

  /**
   * 
   * @see TTableSinkType
   */
  public TTableSink setType(TTableSinkType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public THdfsTableSink getHdfs_table_sink() {
    return this.hdfs_table_sink;
  }

  public TTableSink setHdfs_table_sink(THdfsTableSink hdfs_table_sink) {
    this.hdfs_table_sink = hdfs_table_sink;
    return this;
  }

  public void unsetHdfs_table_sink() {
    this.hdfs_table_sink = null;
  }

  /** Returns true if field hdfs_table_sink is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfs_table_sink() {
    return this.hdfs_table_sink != null;
  }

  public void setHdfs_table_sinkIsSet(boolean value) {
    if (!value) {
      this.hdfs_table_sink = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TARGET_TABLE_ID:
      if (value == null) {
        unsetTarget_table_id();
      } else {
        setTarget_table_id((Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TTableSinkType)value);
      }
      break;

    case HDFS_TABLE_SINK:
      if (value == null) {
        unsetHdfs_table_sink();
      } else {
        setHdfs_table_sink((THdfsTableSink)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET_TABLE_ID:
      return Integer.valueOf(getTarget_table_id());

    case TYPE:
      return getType();

    case HDFS_TABLE_SINK:
      return getHdfs_table_sink();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TARGET_TABLE_ID:
      return isSetTarget_table_id();
    case TYPE:
      return isSetType();
    case HDFS_TABLE_SINK:
      return isSetHdfs_table_sink();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTableSink)
      return this.equals((TTableSink)that);
    return false;
  }

  public boolean equals(TTableSink that) {
    if (that == null)
      return false;

    boolean this_present_target_table_id = true;
    boolean that_present_target_table_id = true;
    if (this_present_target_table_id || that_present_target_table_id) {
      if (!(this_present_target_table_id && that_present_target_table_id))
        return false;
      if (this.target_table_id != that.target_table_id)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_hdfs_table_sink = true && this.isSetHdfs_table_sink();
    boolean that_present_hdfs_table_sink = true && that.isSetHdfs_table_sink();
    if (this_present_hdfs_table_sink || that_present_hdfs_table_sink) {
      if (!(this_present_hdfs_table_sink && that_present_hdfs_table_sink))
        return false;
      if (!this.hdfs_table_sink.equals(that.hdfs_table_sink))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_target_table_id = true;
    builder.append(present_target_table_id);
    if (present_target_table_id)
      builder.append(target_table_id);

    boolean present_type = true && (isSetType());
    builder.append(present_type);
    if (present_type)
      builder.append(type.getValue());

    boolean present_hdfs_table_sink = true && (isSetHdfs_table_sink());
    builder.append(present_hdfs_table_sink);
    if (present_hdfs_table_sink)
      builder.append(hdfs_table_sink);

    return builder.toHashCode();
  }

  public int compareTo(TTableSink other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TTableSink typedOther = (TTableSink)other;

    lastComparison = Boolean.valueOf(isSetTarget_table_id()).compareTo(typedOther.isSetTarget_table_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTarget_table_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.target_table_id, typedOther.target_table_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(typedOther.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, typedOther.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHdfs_table_sink()).compareTo(typedOther.isSetHdfs_table_sink());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfs_table_sink()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_table_sink, typedOther.hdfs_table_sink);
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
    StringBuilder sb = new StringBuilder("TTableSink(");
    boolean first = true;

    sb.append("target_table_id:");
    sb.append(this.target_table_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (isSetHdfs_table_sink()) {
      if (!first) sb.append(", ");
      sb.append("hdfs_table_sink:");
      if (this.hdfs_table_sink == null) {
        sb.append("null");
      } else {
        sb.append(this.hdfs_table_sink);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'target_table_id' because it's a primitive and you chose the non-beans generator.
    if (type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (hdfs_table_sink != null) {
      hdfs_table_sink.validate();
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

  private static class TTableSinkStandardSchemeFactory implements SchemeFactory {
    public TTableSinkStandardScheme getScheme() {
      return new TTableSinkStandardScheme();
    }
  }

  private static class TTableSinkStandardScheme extends StandardScheme<TTableSink> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTableSink struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET_TABLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.target_table_id = iprot.readI32();
              struct.setTarget_table_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = TTableSinkType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HDFS_TABLE_SINK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.hdfs_table_sink = new THdfsTableSink();
              struct.hdfs_table_sink.read(iprot);
              struct.setHdfs_table_sinkIsSet(true);
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
      if (!struct.isSetTarget_table_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'target_table_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTableSink struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TARGET_TABLE_ID_FIELD_DESC);
      oprot.writeI32(struct.target_table_id);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.hdfs_table_sink != null) {
        if (struct.isSetHdfs_table_sink()) {
          oprot.writeFieldBegin(HDFS_TABLE_SINK_FIELD_DESC);
          struct.hdfs_table_sink.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTableSinkTupleSchemeFactory implements SchemeFactory {
    public TTableSinkTupleScheme getScheme() {
      return new TTableSinkTupleScheme();
    }
  }

  private static class TTableSinkTupleScheme extends TupleScheme<TTableSink> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTableSink struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.target_table_id);
      oprot.writeI32(struct.type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetHdfs_table_sink()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHdfs_table_sink()) {
        struct.hdfs_table_sink.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTableSink struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.target_table_id = iprot.readI32();
      struct.setTarget_table_idIsSet(true);
      struct.type = TTableSinkType.findByValue(iprot.readI32());
      struct.setTypeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.hdfs_table_sink = new THdfsTableSink();
        struct.hdfs_table_sink.read(iprot);
        struct.setHdfs_table_sinkIsSet(true);
      }
    }
  }

}

