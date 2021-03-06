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

public class TAlterTableSetLocationParams implements org.apache.thrift.TBase<TAlterTableSetLocationParams, TAlterTableSetLocationParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterTableSetLocationParams");

  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PARTITION_SPEC_FIELD_DESC = new org.apache.thrift.protocol.TField("partition_spec", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterTableSetLocationParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterTableSetLocationParamsTupleSchemeFactory());
  }

  public String location; // required
  public List<com.cloudera.impala.thrift.TPartitionKeyValue> partition_spec; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCATION((short)1, "location"),
    PARTITION_SPEC((short)2, "partition_spec");

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
        case 1: // LOCATION
          return LOCATION;
        case 2: // PARTITION_SPEC
          return PARTITION_SPEC;
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
  private _Fields optionals[] = {_Fields.PARTITION_SPEC};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PARTITION_SPEC, new org.apache.thrift.meta_data.FieldMetaData("partition_spec", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TPartitionKeyValue.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterTableSetLocationParams.class, metaDataMap);
  }

  public TAlterTableSetLocationParams() {
  }

  public TAlterTableSetLocationParams(
    String location)
  {
    this();
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterTableSetLocationParams(TAlterTableSetLocationParams other) {
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    if (other.isSetPartition_spec()) {
      List<com.cloudera.impala.thrift.TPartitionKeyValue> __this__partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>();
      for (com.cloudera.impala.thrift.TPartitionKeyValue other_element : other.partition_spec) {
        __this__partition_spec.add(new com.cloudera.impala.thrift.TPartitionKeyValue(other_element));
      }
      this.partition_spec = __this__partition_spec;
    }
  }

  public TAlterTableSetLocationParams deepCopy() {
    return new TAlterTableSetLocationParams(this);
  }

  @Override
  public void clear() {
    this.location = null;
    this.partition_spec = null;
  }

  public String getLocation() {
    return this.location;
  }

  public TAlterTableSetLocationParams setLocation(String location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
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

  public TAlterTableSetLocationParams setPartition_spec(List<com.cloudera.impala.thrift.TPartitionKeyValue> partition_spec) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case PARTITION_SPEC:
      if (value == null) {
        unsetPartition_spec();
      } else {
        setPartition_spec((List<com.cloudera.impala.thrift.TPartitionKeyValue>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCATION:
      return getLocation();

    case PARTITION_SPEC:
      return getPartition_spec();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCATION:
      return isSetLocation();
    case PARTITION_SPEC:
      return isSetPartition_spec();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterTableSetLocationParams)
      return this.equals((TAlterTableSetLocationParams)that);
    return false;
  }

  public boolean equals(TAlterTableSetLocationParams that) {
    if (that == null)
      return false;

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_partition_spec = true && this.isSetPartition_spec();
    boolean that_present_partition_spec = true && that.isSetPartition_spec();
    if (this_present_partition_spec || that_present_partition_spec) {
      if (!(this_present_partition_spec && that_present_partition_spec))
        return false;
      if (!this.partition_spec.equals(that.partition_spec))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_location = true && (isSetLocation());
    builder.append(present_location);
    if (present_location)
      builder.append(location);

    boolean present_partition_spec = true && (isSetPartition_spec());
    builder.append(present_partition_spec);
    if (present_partition_spec)
      builder.append(partition_spec);

    return builder.toHashCode();
  }

  public int compareTo(TAlterTableSetLocationParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TAlterTableSetLocationParams typedOther = (TAlterTableSetLocationParams)other;

    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(typedOther.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, typedOther.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    StringBuilder sb = new StringBuilder("TAlterTableSetLocationParams(");
    boolean first = true;

    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (isSetPartition_spec()) {
      if (!first) sb.append(", ");
      sb.append("partition_spec:");
      if (this.partition_spec == null) {
        sb.append("null");
      } else {
        sb.append(this.partition_spec);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (location == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'location' was not present! Struct: " + toString());
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

  private static class TAlterTableSetLocationParamsStandardSchemeFactory implements SchemeFactory {
    public TAlterTableSetLocationParamsStandardScheme getScheme() {
      return new TAlterTableSetLocationParamsStandardScheme();
    }
  }

  private static class TAlterTableSetLocationParamsStandardScheme extends StandardScheme<TAlterTableSetLocationParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterTableSetLocationParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARTITION_SPEC
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list58 = iprot.readListBegin();
                struct.partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>(_list58.size);
                for (int _i59 = 0; _i59 < _list58.size; ++_i59)
                {
                  com.cloudera.impala.thrift.TPartitionKeyValue _elem60; // required
                  _elem60 = new com.cloudera.impala.thrift.TPartitionKeyValue();
                  _elem60.read(iprot);
                  struct.partition_spec.add(_elem60);
                }
                iprot.readListEnd();
              }
              struct.setPartition_specIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterTableSetLocationParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.location);
        oprot.writeFieldEnd();
      }
      if (struct.partition_spec != null) {
        if (struct.isSetPartition_spec()) {
          oprot.writeFieldBegin(PARTITION_SPEC_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.partition_spec.size()));
            for (com.cloudera.impala.thrift.TPartitionKeyValue _iter61 : struct.partition_spec)
            {
              _iter61.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterTableSetLocationParamsTupleSchemeFactory implements SchemeFactory {
    public TAlterTableSetLocationParamsTupleScheme getScheme() {
      return new TAlterTableSetLocationParamsTupleScheme();
    }
  }

  private static class TAlterTableSetLocationParamsTupleScheme extends TupleScheme<TAlterTableSetLocationParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetLocationParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.location);
      BitSet optionals = new BitSet();
      if (struct.isSetPartition_spec()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPartition_spec()) {
        {
          oprot.writeI32(struct.partition_spec.size());
          for (com.cloudera.impala.thrift.TPartitionKeyValue _iter62 : struct.partition_spec)
          {
            _iter62.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterTableSetLocationParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.location = iprot.readString();
      struct.setLocationIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list63 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.partition_spec = new ArrayList<com.cloudera.impala.thrift.TPartitionKeyValue>(_list63.size);
          for (int _i64 = 0; _i64 < _list63.size; ++_i64)
          {
            com.cloudera.impala.thrift.TPartitionKeyValue _elem65; // required
            _elem65 = new com.cloudera.impala.thrift.TPartitionKeyValue();
            _elem65.read(iprot);
            struct.partition_spec.add(_elem65);
          }
        }
        struct.setPartition_specIsSet(true);
      }
    }
  }

}

