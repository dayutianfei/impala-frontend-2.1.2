/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.llama.thrift;

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

public class TLlamaAMUnregisterRequest implements org.apache.thrift.TBase<TLlamaAMUnregisterRequest, TLlamaAMUnregisterRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLlamaAMUnregisterRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField AM_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("am_handle", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLlamaAMUnregisterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLlamaAMUnregisterRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see TLlamaServiceVersion
   */
  public TLlamaServiceVersion version; // required
  public TUniqueId am_handle; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TLlamaServiceVersion
     */
    VERSION((short)1, "version"),
    AM_HANDLE((short)2, "am_handle");

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
        case 2: // AM_HANDLE
          return AM_HANDLE;
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
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TLlamaServiceVersion.class)));
    tmpMap.put(_Fields.AM_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("am_handle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUniqueId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLlamaAMUnregisterRequest.class, metaDataMap);
  }

  public TLlamaAMUnregisterRequest() {
  }

  public TLlamaAMUnregisterRequest(
    TLlamaServiceVersion version,
    TUniqueId am_handle)
  {
    this();
    this.version = version;
    this.am_handle = am_handle;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLlamaAMUnregisterRequest(TLlamaAMUnregisterRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetAm_handle()) {
      this.am_handle = new TUniqueId(other.am_handle);
    }
  }

  public TLlamaAMUnregisterRequest deepCopy() {
    return new TLlamaAMUnregisterRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.am_handle = null;
  }

  /**
   * 
   * @see TLlamaServiceVersion
   */
  public TLlamaServiceVersion getVersion() {
    return this.version;
  }

  /**
   * 
   * @see TLlamaServiceVersion
   */
  public TLlamaAMUnregisterRequest setVersion(TLlamaServiceVersion version) {
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

  public TUniqueId getAm_handle() {
    return this.am_handle;
  }

  public TLlamaAMUnregisterRequest setAm_handle(TUniqueId am_handle) {
    this.am_handle = am_handle;
    return this;
  }

  public void unsetAm_handle() {
    this.am_handle = null;
  }

  /** Returns true if field am_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetAm_handle() {
    return this.am_handle != null;
  }

  public void setAm_handleIsSet(boolean value) {
    if (!value) {
      this.am_handle = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((TLlamaServiceVersion)value);
      }
      break;

    case AM_HANDLE:
      if (value == null) {
        unsetAm_handle();
      } else {
        setAm_handle((TUniqueId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case AM_HANDLE:
      return getAm_handle();

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
    case AM_HANDLE:
      return isSetAm_handle();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLlamaAMUnregisterRequest)
      return this.equals((TLlamaAMUnregisterRequest)that);
    return false;
  }

  public boolean equals(TLlamaAMUnregisterRequest that) {
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

    boolean this_present_am_handle = true && this.isSetAm_handle();
    boolean that_present_am_handle = true && that.isSetAm_handle();
    if (this_present_am_handle || that_present_am_handle) {
      if (!(this_present_am_handle && that_present_am_handle))
        return false;
      if (!this.am_handle.equals(that.am_handle))
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

    boolean present_am_handle = true && (isSetAm_handle());
    builder.append(present_am_handle);
    if (present_am_handle)
      builder.append(am_handle);

    return builder.toHashCode();
  }

  public int compareTo(TLlamaAMUnregisterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TLlamaAMUnregisterRequest typedOther = (TLlamaAMUnregisterRequest)other;

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
    lastComparison = Boolean.valueOf(isSetAm_handle()).compareTo(typedOther.isSetAm_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAm_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.am_handle, typedOther.am_handle);
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
    StringBuilder sb = new StringBuilder("TLlamaAMUnregisterRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("am_handle:");
    if (this.am_handle == null) {
      sb.append("null");
    } else {
      sb.append(this.am_handle);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }
    if (am_handle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'am_handle' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (am_handle != null) {
      am_handle.validate();
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

  private static class TLlamaAMUnregisterRequestStandardSchemeFactory implements SchemeFactory {
    public TLlamaAMUnregisterRequestStandardScheme getScheme() {
      return new TLlamaAMUnregisterRequestStandardScheme();
    }
  }

  private static class TLlamaAMUnregisterRequestStandardScheme extends StandardScheme<TLlamaAMUnregisterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLlamaAMUnregisterRequest struct) throws org.apache.thrift.TException {
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
              struct.version = TLlamaServiceVersion.findByValue(iprot.readI32());
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AM_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.am_handle = new TUniqueId();
              struct.am_handle.read(iprot);
              struct.setAm_handleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLlamaAMUnregisterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.am_handle != null) {
        oprot.writeFieldBegin(AM_HANDLE_FIELD_DESC);
        struct.am_handle.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLlamaAMUnregisterRequestTupleSchemeFactory implements SchemeFactory {
    public TLlamaAMUnregisterRequestTupleScheme getScheme() {
      return new TLlamaAMUnregisterRequestTupleScheme();
    }
  }

  private static class TLlamaAMUnregisterRequestTupleScheme extends TupleScheme<TLlamaAMUnregisterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLlamaAMUnregisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      struct.am_handle.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLlamaAMUnregisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = TLlamaServiceVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.am_handle = new TUniqueId();
      struct.am_handle.read(iprot);
      struct.setAm_handleIsSet(true);
    }
  }

}

