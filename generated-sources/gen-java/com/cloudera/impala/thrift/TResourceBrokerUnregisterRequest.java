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

public class TResourceBrokerUnregisterRequest implements org.apache.thrift.TBase<TResourceBrokerUnregisterRequest, TResourceBrokerUnregisterRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResourceBrokerUnregisterRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IRB_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("irb_handle", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResourceBrokerUnregisterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResourceBrokerUnregisterRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see TResourceBrokerServiceVersion
   */
  public TResourceBrokerServiceVersion version; // optional
  public com.cloudera.impala.thrift.TUniqueId irb_handle; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TResourceBrokerServiceVersion
     */
    VERSION((short)1, "version"),
    IRB_HANDLE((short)2, "irb_handle");

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
        case 1: // VERSION
          return VERSION;
        case 2: // IRB_HANDLE
          return IRB_HANDLE;
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
  private _Fields optionals[] = {_Fields.VERSION,_Fields.IRB_HANDLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TResourceBrokerServiceVersion.class)));
    tmpMap.put(_Fields.IRB_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("irb_handle", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResourceBrokerUnregisterRequest.class, metaDataMap);
  }

  public TResourceBrokerUnregisterRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResourceBrokerUnregisterRequest(TResourceBrokerUnregisterRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetIrb_handle()) {
      this.irb_handle = new com.cloudera.impala.thrift.TUniqueId(other.irb_handle);
    }
  }

  public TResourceBrokerUnregisterRequest deepCopy() {
    return new TResourceBrokerUnregisterRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.irb_handle = null;
  }

  /**
   * 
   * @see TResourceBrokerServiceVersion
   */
  public TResourceBrokerServiceVersion getVersion() {
    return this.version;
  }

  /**
   * 
   * @see TResourceBrokerServiceVersion
   */
  public TResourceBrokerUnregisterRequest setVersion(TResourceBrokerServiceVersion version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public com.cloudera.impala.thrift.TUniqueId getIrb_handle() {
    return this.irb_handle;
  }

  public TResourceBrokerUnregisterRequest setIrb_handle(com.cloudera.impala.thrift.TUniqueId irb_handle) {
    this.irb_handle = irb_handle;
    return this;
  }

  public void unsetIrb_handle() {
    this.irb_handle = null;
  }

  /** Returns true if field irb_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetIrb_handle() {
    return this.irb_handle != null;
  }

  public void setIrb_handleIsSet(boolean value) {
    if (!value) {
      this.irb_handle = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((TResourceBrokerServiceVersion)value);
      }
      break;

    case IRB_HANDLE:
      if (value == null) {
        unsetIrb_handle();
      } else {
        setIrb_handle((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case IRB_HANDLE:
      return getIrb_handle();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case VERSION:
      return isSetVersion();
    case IRB_HANDLE:
      return isSetIrb_handle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResourceBrokerUnregisterRequest)
      return this.equals((TResourceBrokerUnregisterRequest)that);
    return false;
  }

  public boolean equals(TResourceBrokerUnregisterRequest that) {
    if (that == null)
      return false;

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_irb_handle = true && this.isSetIrb_handle();
    boolean that_present_irb_handle = true && that.isSetIrb_handle();
    if (this_present_irb_handle || that_present_irb_handle) {
      if (!(this_present_irb_handle && that_present_irb_handle))
        return false;
      if (!this.irb_handle.equals(that.irb_handle))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_version = true && (isSetVersion());
    builder.append(present_version);
    if (present_version)
      builder.append(version.getValue());

    boolean present_irb_handle = true && (isSetIrb_handle());
    builder.append(present_irb_handle);
    if (present_irb_handle)
      builder.append(irb_handle);

    return builder.toHashCode();
  }

  public int compareTo(TResourceBrokerUnregisterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResourceBrokerUnregisterRequest typedOther = (TResourceBrokerUnregisterRequest)other;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIrb_handle()).compareTo(typedOther.isSetIrb_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIrb_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.irb_handle, typedOther.irb_handle);
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
    StringBuilder sb = new StringBuilder("TResourceBrokerUnregisterRequest(");
    boolean first = true;

    if (isSetVersion()) {
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    if (isSetIrb_handle()) {
      if (!first) sb.append(", ");
      sb.append("irb_handle:");
      if (this.irb_handle == null) {
        sb.append("null");
      } else {
        sb.append(this.irb_handle);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (irb_handle != null) {
      irb_handle.validate();
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

  private static class TResourceBrokerUnregisterRequestStandardSchemeFactory implements SchemeFactory {
    public TResourceBrokerUnregisterRequestStandardScheme getScheme() {
      return new TResourceBrokerUnregisterRequestStandardScheme();
    }
  }

  private static class TResourceBrokerUnregisterRequestStandardScheme extends StandardScheme<TResourceBrokerUnregisterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResourceBrokerUnregisterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.version = TResourceBrokerServiceVersion.findByValue(iprot.readI32());
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IRB_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.irb_handle = new com.cloudera.impala.thrift.TUniqueId();
              struct.irb_handle.read(iprot);
              struct.setIrb_handleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResourceBrokerUnregisterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeI32(struct.version.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.irb_handle != null) {
        if (struct.isSetIrb_handle()) {
          oprot.writeFieldBegin(IRB_HANDLE_FIELD_DESC);
          struct.irb_handle.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResourceBrokerUnregisterRequestTupleSchemeFactory implements SchemeFactory {
    public TResourceBrokerUnregisterRequestTupleScheme getScheme() {
      return new TResourceBrokerUnregisterRequestTupleScheme();
    }
  }

  private static class TResourceBrokerUnregisterRequestTupleScheme extends TupleScheme<TResourceBrokerUnregisterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerUnregisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetVersion()) {
        optionals.set(0);
      }
      if (struct.isSetIrb_handle()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetVersion()) {
        oprot.writeI32(struct.version.getValue());
      }
      if (struct.isSetIrb_handle()) {
        struct.irb_handle.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerUnregisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.version = TResourceBrokerServiceVersion.findByValue(iprot.readI32());
        struct.setVersionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.irb_handle = new com.cloudera.impala.thrift.TUniqueId();
        struct.irb_handle.read(iprot);
        struct.setIrb_handleIsSet(true);
      }
    }
  }

}

