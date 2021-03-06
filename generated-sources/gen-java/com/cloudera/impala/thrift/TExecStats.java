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

public class TExecStats implements org.apache.thrift.TBase<TExecStats, TExecStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TExecStats");

  private static final org.apache.thrift.protocol.TField LATENCY_NS_FIELD_DESC = new org.apache.thrift.protocol.TField("latency_ns", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField CPU_TIME_NS_FIELD_DESC = new org.apache.thrift.protocol.TField("cpu_time_ns", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField CARDINALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("cardinality", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MEMORY_USED_FIELD_DESC = new org.apache.thrift.protocol.TField("memory_used", org.apache.thrift.protocol.TType.I64, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TExecStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TExecStatsTupleSchemeFactory());
  }

  public long latency_ns; // optional
  public long cpu_time_ns; // optional
  public long cardinality; // optional
  public long memory_used; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LATENCY_NS((short)1, "latency_ns"),
    CPU_TIME_NS((short)2, "cpu_time_ns"),
    CARDINALITY((short)3, "cardinality"),
    MEMORY_USED((short)4, "memory_used");

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
        case 1: // LATENCY_NS
          return LATENCY_NS;
        case 2: // CPU_TIME_NS
          return CPU_TIME_NS;
        case 3: // CARDINALITY
          return CARDINALITY;
        case 4: // MEMORY_USED
          return MEMORY_USED;
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
  private static final int __LATENCY_NS_ISSET_ID = 0;
  private static final int __CPU_TIME_NS_ISSET_ID = 1;
  private static final int __CARDINALITY_ISSET_ID = 2;
  private static final int __MEMORY_USED_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.LATENCY_NS,_Fields.CPU_TIME_NS,_Fields.CARDINALITY,_Fields.MEMORY_USED};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LATENCY_NS, new org.apache.thrift.meta_data.FieldMetaData("latency_ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CPU_TIME_NS, new org.apache.thrift.meta_data.FieldMetaData("cpu_time_ns", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CARDINALITY, new org.apache.thrift.meta_data.FieldMetaData("cardinality", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MEMORY_USED, new org.apache.thrift.meta_data.FieldMetaData("memory_used", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TExecStats.class, metaDataMap);
  }

  public TExecStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TExecStats(TExecStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.latency_ns = other.latency_ns;
    this.cpu_time_ns = other.cpu_time_ns;
    this.cardinality = other.cardinality;
    this.memory_used = other.memory_used;
  }

  public TExecStats deepCopy() {
    return new TExecStats(this);
  }

  @Override
  public void clear() {
    setLatency_nsIsSet(false);
    this.latency_ns = 0;
    setCpu_time_nsIsSet(false);
    this.cpu_time_ns = 0;
    setCardinalityIsSet(false);
    this.cardinality = 0;
    setMemory_usedIsSet(false);
    this.memory_used = 0;
  }

  public long getLatency_ns() {
    return this.latency_ns;
  }

  public TExecStats setLatency_ns(long latency_ns) {
    this.latency_ns = latency_ns;
    setLatency_nsIsSet(true);
    return this;
  }

  public void unsetLatency_ns() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LATENCY_NS_ISSET_ID);
  }

  /** Returns true if field latency_ns is set (has been assigned a value) and false otherwise */
  public boolean isSetLatency_ns() {
    return EncodingUtils.testBit(__isset_bitfield, __LATENCY_NS_ISSET_ID);
  }

  public void setLatency_nsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LATENCY_NS_ISSET_ID, value);
  }

  public long getCpu_time_ns() {
    return this.cpu_time_ns;
  }

  public TExecStats setCpu_time_ns(long cpu_time_ns) {
    this.cpu_time_ns = cpu_time_ns;
    setCpu_time_nsIsSet(true);
    return this;
  }

  public void unsetCpu_time_ns() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CPU_TIME_NS_ISSET_ID);
  }

  /** Returns true if field cpu_time_ns is set (has been assigned a value) and false otherwise */
  public boolean isSetCpu_time_ns() {
    return EncodingUtils.testBit(__isset_bitfield, __CPU_TIME_NS_ISSET_ID);
  }

  public void setCpu_time_nsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CPU_TIME_NS_ISSET_ID, value);
  }

  public long getCardinality() {
    return this.cardinality;
  }

  public TExecStats setCardinality(long cardinality) {
    this.cardinality = cardinality;
    setCardinalityIsSet(true);
    return this;
  }

  public void unsetCardinality() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CARDINALITY_ISSET_ID);
  }

  /** Returns true if field cardinality is set (has been assigned a value) and false otherwise */
  public boolean isSetCardinality() {
    return EncodingUtils.testBit(__isset_bitfield, __CARDINALITY_ISSET_ID);
  }

  public void setCardinalityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CARDINALITY_ISSET_ID, value);
  }

  public long getMemory_used() {
    return this.memory_used;
  }

  public TExecStats setMemory_used(long memory_used) {
    this.memory_used = memory_used;
    setMemory_usedIsSet(true);
    return this;
  }

  public void unsetMemory_used() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MEMORY_USED_ISSET_ID);
  }

  /** Returns true if field memory_used is set (has been assigned a value) and false otherwise */
  public boolean isSetMemory_used() {
    return EncodingUtils.testBit(__isset_bitfield, __MEMORY_USED_ISSET_ID);
  }

  public void setMemory_usedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MEMORY_USED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LATENCY_NS:
      if (value == null) {
        unsetLatency_ns();
      } else {
        setLatency_ns((Long)value);
      }
      break;

    case CPU_TIME_NS:
      if (value == null) {
        unsetCpu_time_ns();
      } else {
        setCpu_time_ns((Long)value);
      }
      break;

    case CARDINALITY:
      if (value == null) {
        unsetCardinality();
      } else {
        setCardinality((Long)value);
      }
      break;

    case MEMORY_USED:
      if (value == null) {
        unsetMemory_used();
      } else {
        setMemory_used((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LATENCY_NS:
      return Long.valueOf(getLatency_ns());

    case CPU_TIME_NS:
      return Long.valueOf(getCpu_time_ns());

    case CARDINALITY:
      return Long.valueOf(getCardinality());

    case MEMORY_USED:
      return Long.valueOf(getMemory_used());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LATENCY_NS:
      return isSetLatency_ns();
    case CPU_TIME_NS:
      return isSetCpu_time_ns();
    case CARDINALITY:
      return isSetCardinality();
    case MEMORY_USED:
      return isSetMemory_used();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TExecStats)
      return this.equals((TExecStats)that);
    return false;
  }

  public boolean equals(TExecStats that) {
    if (that == null)
      return false;

    boolean this_present_latency_ns = true && this.isSetLatency_ns();
    boolean that_present_latency_ns = true && that.isSetLatency_ns();
    if (this_present_latency_ns || that_present_latency_ns) {
      if (!(this_present_latency_ns && that_present_latency_ns))
        return false;
      if (this.latency_ns != that.latency_ns)
        return false;
    }

    boolean this_present_cpu_time_ns = true && this.isSetCpu_time_ns();
    boolean that_present_cpu_time_ns = true && that.isSetCpu_time_ns();
    if (this_present_cpu_time_ns || that_present_cpu_time_ns) {
      if (!(this_present_cpu_time_ns && that_present_cpu_time_ns))
        return false;
      if (this.cpu_time_ns != that.cpu_time_ns)
        return false;
    }

    boolean this_present_cardinality = true && this.isSetCardinality();
    boolean that_present_cardinality = true && that.isSetCardinality();
    if (this_present_cardinality || that_present_cardinality) {
      if (!(this_present_cardinality && that_present_cardinality))
        return false;
      if (this.cardinality != that.cardinality)
        return false;
    }

    boolean this_present_memory_used = true && this.isSetMemory_used();
    boolean that_present_memory_used = true && that.isSetMemory_used();
    if (this_present_memory_used || that_present_memory_used) {
      if (!(this_present_memory_used && that_present_memory_used))
        return false;
      if (this.memory_used != that.memory_used)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_latency_ns = true && (isSetLatency_ns());
    builder.append(present_latency_ns);
    if (present_latency_ns)
      builder.append(latency_ns);

    boolean present_cpu_time_ns = true && (isSetCpu_time_ns());
    builder.append(present_cpu_time_ns);
    if (present_cpu_time_ns)
      builder.append(cpu_time_ns);

    boolean present_cardinality = true && (isSetCardinality());
    builder.append(present_cardinality);
    if (present_cardinality)
      builder.append(cardinality);

    boolean present_memory_used = true && (isSetMemory_used());
    builder.append(present_memory_used);
    if (present_memory_used)
      builder.append(memory_used);

    return builder.toHashCode();
  }

  public int compareTo(TExecStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TExecStats typedOther = (TExecStats)other;

    lastComparison = Boolean.valueOf(isSetLatency_ns()).compareTo(typedOther.isSetLatency_ns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatency_ns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latency_ns, typedOther.latency_ns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCpu_time_ns()).compareTo(typedOther.isSetCpu_time_ns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCpu_time_ns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cpu_time_ns, typedOther.cpu_time_ns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCardinality()).compareTo(typedOther.isSetCardinality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCardinality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cardinality, typedOther.cardinality);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMemory_used()).compareTo(typedOther.isSetMemory_used());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemory_used()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memory_used, typedOther.memory_used);
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
    StringBuilder sb = new StringBuilder("TExecStats(");
    boolean first = true;

    if (isSetLatency_ns()) {
      sb.append("latency_ns:");
      sb.append(this.latency_ns);
      first = false;
    }
    if (isSetCpu_time_ns()) {
      if (!first) sb.append(", ");
      sb.append("cpu_time_ns:");
      sb.append(this.cpu_time_ns);
      first = false;
    }
    if (isSetCardinality()) {
      if (!first) sb.append(", ");
      sb.append("cardinality:");
      sb.append(this.cardinality);
      first = false;
    }
    if (isSetMemory_used()) {
      if (!first) sb.append(", ");
      sb.append("memory_used:");
      sb.append(this.memory_used);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TExecStatsStandardSchemeFactory implements SchemeFactory {
    public TExecStatsStandardScheme getScheme() {
      return new TExecStatsStandardScheme();
    }
  }

  private static class TExecStatsStandardScheme extends StandardScheme<TExecStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TExecStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LATENCY_NS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.latency_ns = iprot.readI64();
              struct.setLatency_nsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CPU_TIME_NS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cpu_time_ns = iprot.readI64();
              struct.setCpu_time_nsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CARDINALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.cardinality = iprot.readI64();
              struct.setCardinalityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MEMORY_USED
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.memory_used = iprot.readI64();
              struct.setMemory_usedIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TExecStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetLatency_ns()) {
        oprot.writeFieldBegin(LATENCY_NS_FIELD_DESC);
        oprot.writeI64(struct.latency_ns);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCpu_time_ns()) {
        oprot.writeFieldBegin(CPU_TIME_NS_FIELD_DESC);
        oprot.writeI64(struct.cpu_time_ns);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCardinality()) {
        oprot.writeFieldBegin(CARDINALITY_FIELD_DESC);
        oprot.writeI64(struct.cardinality);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMemory_used()) {
        oprot.writeFieldBegin(MEMORY_USED_FIELD_DESC);
        oprot.writeI64(struct.memory_used);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TExecStatsTupleSchemeFactory implements SchemeFactory {
    public TExecStatsTupleScheme getScheme() {
      return new TExecStatsTupleScheme();
    }
  }

  private static class TExecStatsTupleScheme extends TupleScheme<TExecStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TExecStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLatency_ns()) {
        optionals.set(0);
      }
      if (struct.isSetCpu_time_ns()) {
        optionals.set(1);
      }
      if (struct.isSetCardinality()) {
        optionals.set(2);
      }
      if (struct.isSetMemory_used()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLatency_ns()) {
        oprot.writeI64(struct.latency_ns);
      }
      if (struct.isSetCpu_time_ns()) {
        oprot.writeI64(struct.cpu_time_ns);
      }
      if (struct.isSetCardinality()) {
        oprot.writeI64(struct.cardinality);
      }
      if (struct.isSetMemory_used()) {
        oprot.writeI64(struct.memory_used);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TExecStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.latency_ns = iprot.readI64();
        struct.setLatency_nsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.cpu_time_ns = iprot.readI64();
        struct.setCpu_time_nsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.cardinality = iprot.readI64();
        struct.setCardinalityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.memory_used = iprot.readI64();
        struct.setMemory_usedIsSet(true);
      }
    }
  }

}

