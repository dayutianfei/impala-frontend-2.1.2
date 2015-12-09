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

public class TAlterTableDropPartitionParams implements org.apache.thrift.TBase<TAlterTableDropPartitionParams, TAlterTableDropPartitionParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableDropPartitionParams");

  private static final org.apache.thrift.protocol.TField PARTITION_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_spec", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField IF_EXISTS_FIELD_DESC = new org.apache.thrift.protocol.TField("if_exists", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableDropPartitionParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableDropPartitionParamsTupleSchemeFactory());
  }

  public List<com.cloudera.impala.thrift.TPartitionKeyValue> partition_spec; // required
  public boolean if_exists; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITION_SPEC((short)1, "partition_spec"),
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
        case 1: // PARTITION_SPEC
          return PARTITION_SPEC;
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
    tmpMap.put(_Fields.PARTITION_SPEC, new org.apache.thrift.meta_data.FieldMetaData("partition_spec", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TPartitionKeyValue.class))));
    tmpMap.put(_Fields.IF_EXISTS, new org.apache.thrift.meta_data.FieldMetaData("if_exists", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableDropPartitionParams.class, metaDataMap);
  }

  public TAlterTableDropPartitionParams() {
  }

  public TAlterTableDropPartitionParams(
    List<com.cloudera.impala.thrift.TPartitionKeyValue> partition_spec,
    boolean if_exists)
  {
    this();
    this.partition_spec = partition_spec;
    this.if_exists = if_exists;
    setIf_existsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableDropPartitionParams(TAlterTableDropPartitionParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPartition_spec()) {
      List<com.cloudera.impala.thrift.TPartitionKeyValue> __this__partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>();
      for (com.cloudera.impala.thrift.TPartitionKeyValue other_element : other.partition_spec) {
        __this__partition_spec.add(new com.cloudera.impala.thrift.TPartitionKeyValue(other_element));
      }
      this.partition_spec = __this__partition_spec;
    }
    this.if_exists = other.if_exists;
  }

  public TAlterTableDropPartitionParams deepCopy() {
    return new TAlterTableDropPartitionParams(this);
  }

  @Override
  public void clear() {
    this.partition_spec = null;
    setIf_existsIsSet(false);
    this.if_exists = false;
  }

  public int getPartition_specSize() {
    return (this.partition_spec == null) ? 0 : this.partition_spec.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TPartitionKeyValue> getPartition_specIterator() {
    return (this.partition_spec == null) ? null : this.partition_spec.iterator();
  }

  public void addToPartition_spec(com.cloudera.impala.thrift.TPartitionKeyValue elem) {
    if (this.partition_spec == null) {
      this.partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>();
    }
    this.partition_spec.add(elem);
  }

  public List<com.cloudera.impala.thrift.TPartitionKeyValue> getPartition_spec() {
    return this.partition_spec;
  }

  public TAlterTableDropPartitionParams setPartition_spec(List<com.cloudera.impala.thrift.TPartitionKeyValue> partition_spec) {
    this.partition_spec = partition_spec;
    return this;
  }

  public void unsetPartition_spec() {
    this.partition_spec = null;
  }

  /** Returns true if field partition_spec is set (has been assigned a value) and false otherwise */
  public boolean isSetPartition_spec() {
    return this.partition_spec != null;
  }

  public void setPartition_specIsSet(boolean value) {
    if (!value) {
      this.partition_spec = null;
    }
  }

  public boolean isIf_exists() {
    return this.if_exists;
  }

  public TAlterTableDropPartitionParams setIf_exists(boolean if_exists) {
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
    case PARTITION_SPEC:
      if (value == null) {
        unsetPartition_spec();
      } else {
        setPartition_spec((List<com.cloudera.impala.thrift.TPartitionKeyValue>)value);
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
    case PARTITION_SPEC:
      return getPartition_spec();

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
    case PARTITION_SPEC:
      return isSetPartition_spec();
    case IF_EXISTS:
      return isSetIf_exists();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableDropPartitionParams)
      return this.equals((TAlterTableDropPartitionParams)that);
    return false;
  }

  public boolean equals(TAlterTableDropPartitionParams that) {
    if (that == null)
      return false;

    boolean this_present_partition_spec = true && this.isSetPartition_spec();
    boolean that_present_partition_spec = true && that.isSetPartition_spec();
    if (this_present_partition_spec || that_present_partition_spec) {
      if (!(this_present_partition_spec && that_present_partition_spec))
        return false;
      if (!this.partition_spec.equals(that.partition_spec))
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

    boolean present_partition_spec = true && (isSetPartition_spec());
    builder.append(present_partition_spec);
    if (present_partition_spec)
      builder.append(partition_spec);

    boolean present_if_exists = true;
    builder.append(present_if_exists);
    if (present_if_exists)
      builder.append(if_exists);

    return builder.toHashCode();
  }

  public int compareTo(TAlterTableDropPartitionParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TAlterTableDropPartitionParams typedOther = (TAlterTableDropPartitionParams)other;

    lastComparison = Boolean.valueOf(isSetPartition_spec()).compareTo(typedOther.isSetPartition_spec());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartition_spec()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partition_spec, typedOther.partition_spec);
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
    StringBuilder sb = new StringBuilder("TAlterTableDropPartitionParams(");
    boolean first = true;

    sb.append("partition_spec:");
    if (this.partition_spec == null) {
      sb.append("null");
    } else {
      sb.append(this.partition_spec);
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
    if (partition_spec == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partition_spec' was not present! Struct: " + toString());
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

  private static class TAlterTableDropPartitionParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableDropPartitionParamsStandardScheme getScheme() {
      return new TAlterTableDropPartitionParamsStandardScheme();
    }
  }

  private static class TAlterTableDropPartitionParamsStandardScheme extends StandardScheme<TAlterTableDropPartitionParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableDropPartitionParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITION_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>(_list24.size);
                for (int _i25 = 0; _i25 < _list24.size; ++_i25)
                {
                  com.cloudera.impala.thrift.TPartitionKeyValue _elem26; // required
                  _elem26 = new com.cloudera.impala.thrift.TPartitionKeyValue();
                  _elem26.read(iprot);
                  struct.partition_spec.add(_elem26);
                }
                iprot.readListEnd();
              }
              struct.setPartition_specIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableDropPartitionParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partition_spec != null) {
        oprot.writeFieldBegin(PARTITION_SPEC_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_spec.size()));
          for (com.cloudera.impala.thrift.TPartitionKeyValue _iter27 : struct.partition_spec)
          {
            _iter27.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IF_EXISTS_FIELD_DESC);
      oprot.writeBool(struct.if_exists);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTableDropPartitionParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableDropPartitionParamsTupleScheme getScheme() {
      return new TAlterTableDropPartitionParamsTupleScheme();
    }
  }

  private static class TAlterTableDropPartitionParamsTupleScheme extends TupleScheme<TAlterTableDropPartitionParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableDropPartitionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partition_spec.size());
        for (com.cloudera.impala.thrift.TPartitionKeyValue _iter28 : struct.partition_spec)
        {
          _iter28.write(oprot);
        }
      }
      oprot.writeBool(struct.if_exists);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableDropPartitionParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>(_list29.size);
        for (int _i30 = 0; _i30 < _list29.size; ++_i30)
        {
          com.cloudera.impala.thrift.TPartitionKeyValue _elem31; // required
          _elem31 = new com.cloudera.impala.thrift.TPartitionKeyValue();
          _elem31.read(iprot);
          struct.partition_spec.add(_elem31);
        }
      }
      struct.setPartition_specIsSet(true);
      struct.if_exists = iprot.readBool();
      struct.setIf_existsIsSet(true);
    }
  }

}
