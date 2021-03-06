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

public class TGetJvmMetricsResponse implements org.apache.thrift.TBase<TGetJvmMetricsResponse, TGetJvmMetricsResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TGetJvmMetricsResponse");

  private static final org.apache.thrift.protocol.TField MEMORY_POOLS_FIELD_DESC = new org.apache.thrift.protocol.TField("memory_pools", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TGetJvmMetricsResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TGetJvmMetricsResponseTupleSchemeFactory());
  }

  public List<TJvmMemoryPool> memory_pools; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MEMORY_POOLS((short)1, "memory_pools");

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
        case 1: // MEMORY_POOLS
          return MEMORY_POOLS;
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
    tmpMap.put(_Fields.MEMORY_POOLS, new org.apache.thrift.meta_data.FieldMetaData("memory_pools", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TJvmMemoryPool.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TGetJvmMetricsResponse.class, metaDataMap);
  }

  public TGetJvmMetricsResponse() {
  }

  public TGetJvmMetricsResponse(
    List<TJvmMemoryPool> memory_pools)
  {
    this();
    this.memory_pools = memory_pools;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TGetJvmMetricsResponse(TGetJvmMetricsResponse other) {
    if (other.isSetMemory_pools()) {
      List<TJvmMemoryPool> __this__memory_pools = new ArrayList<TJvmMemoryPool>();
      for (TJvmMemoryPool other_element : other.memory_pools) {
        __this__memory_pools.add(new TJvmMemoryPool(other_element));
      }
      this.memory_pools = __this__memory_pools;
    }
  }

  public TGetJvmMetricsResponse deepCopy() {
    return new TGetJvmMetricsResponse(this);
  }

  @Override
  public void clear() {
    this.memory_pools = null;
  }

  public int getMemory_poolsSize() {
    return (this.memory_pools == null) ? 0 : this.memory_pools.size();
  }

  public java.util.Iterator<TJvmMemoryPool> getMemory_poolsIterator() {
    return (this.memory_pools == null) ? null : this.memory_pools.iterator();
  }

  public void addToMemory_pools(TJvmMemoryPool elem) {
    if (this.memory_pools == null) {
      this.memory_pools = new ArrayList<TJvmMemoryPool>();
    }
    this.memory_pools.add(elem);
  }

  public List<TJvmMemoryPool> getMemory_pools() {
    return this.memory_pools;
  }

  public TGetJvmMetricsResponse setMemory_pools(List<TJvmMemoryPool> memory_pools) {
    this.memory_pools = memory_pools;
    return this;
  }

  public void unsetMemory_pools() {
    this.memory_pools = null;
  }

  /** Returns true if field memory_pools is set (has been assigned a value) and false otherwise */
  public boolean isSetMemory_pools() {
    return this.memory_pools != null;
  }

  public void setMemory_poolsIsSet(boolean value) {
    if (!value) {
      this.memory_pools = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case MEMORY_POOLS:
      if (value == null) {
        unsetMemory_pools();
      } else {
        setMemory_pools((List<TJvmMemoryPool>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case MEMORY_POOLS:
      return getMemory_pools();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case MEMORY_POOLS:
      return isSetMemory_pools();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TGetJvmMetricsResponse)
      return this.equals((TGetJvmMetricsResponse)that);
    return false;
  }

  public boolean equals(TGetJvmMetricsResponse that) {
    if (that == null)
      return false;

    boolean this_present_memory_pools = true && this.isSetMemory_pools();
    boolean that_present_memory_pools = true && that.isSetMemory_pools();
    if (this_present_memory_pools || that_present_memory_pools) {
      if (!(this_present_memory_pools && that_present_memory_pools))
        return false;
      if (!this.memory_pools.equals(that.memory_pools))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_memory_pools = true && (isSetMemory_pools());
    builder.append(present_memory_pools);
    if (present_memory_pools)
      builder.append(memory_pools);

    return builder.toHashCode();
  }

  public int compareTo(TGetJvmMetricsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TGetJvmMetricsResponse typedOther = (TGetJvmMetricsResponse)other;

    lastComparison = Boolean.valueOf(isSetMemory_pools()).compareTo(typedOther.isSetMemory_pools());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMemory_pools()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.memory_pools, typedOther.memory_pools);
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
    StringBuilder sb = new StringBuilder("TGetJvmMetricsResponse(");
    boolean first = true;

    sb.append("memory_pools:");
    if (this.memory_pools == null) {
      sb.append("null");
    } else {
      sb.append(this.memory_pools);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (memory_pools == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'memory_pools' was not present! Struct: " + toString());
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

  private static class TGetJvmMetricsResponseStandardSchemeFactory implements SchemeFactory {
    public TGetJvmMetricsResponseStandardScheme getScheme() {
      return new TGetJvmMetricsResponseStandardScheme();
    }
  }

  private static class TGetJvmMetricsResponseStandardScheme extends StandardScheme<TGetJvmMetricsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TGetJvmMetricsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MEMORY_POOLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list202 = iprot.readListBegin();
                struct.memory_pools = new ArrayList<TJvmMemoryPool>(_list202.size);
                for (int _i203 = 0; _i203 < _list202.size; ++_i203)
                {
                  TJvmMemoryPool _elem204; // required
                  _elem204 = new TJvmMemoryPool();
                  _elem204.read(iprot);
                  struct.memory_pools.add(_elem204);
                }
                iprot.readListEnd();
              }
              struct.setMemory_poolsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TGetJvmMetricsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.memory_pools != null) {
        oprot.writeFieldBegin(MEMORY_POOLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.memory_pools.size()));
          for (TJvmMemoryPool _iter205 : struct.memory_pools)
          {
            _iter205.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TGetJvmMetricsResponseTupleSchemeFactory implements SchemeFactory {
    public TGetJvmMetricsResponseTupleScheme getScheme() {
      return new TGetJvmMetricsResponseTupleScheme();
    }
  }

  private static class TGetJvmMetricsResponseTupleScheme extends TupleScheme<TGetJvmMetricsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TGetJvmMetricsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.memory_pools.size());
        for (TJvmMemoryPool _iter206 : struct.memory_pools)
        {
          _iter206.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TGetJvmMetricsResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list207 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.memory_pools = new ArrayList<TJvmMemoryPool>(_list207.size);
        for (int _i208 = 0; _i208 < _list207.size; ++_i208)
        {
          TJvmMemoryPool _elem209; // required
          _elem209 = new TJvmMemoryPool();
          _elem209.read(iprot);
          struct.memory_pools.add(_elem209);
        }
      }
      struct.setMemory_poolsIsSet(true);
    }
  }

}

