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

public class TLlamaNMRegisterRequest implements org.apache.thrift.TBase<TLlamaNMRegisterRequest, TLlamaNMRegisterRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLlamaNMRegisterRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CLIENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("client_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_CALLBACK_SERVICE_FIELD_DESC = new org.apache.thrift.protocol.TField("notification_callback_service", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLlamaNMRegisterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLlamaNMRegisterRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see TLlamaServiceVersion
   */
  public TLlamaServiceVersion version; // required
  public TUniqueId client_id; // required
  public TNetworkAddress notification_callback_service; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TLlamaServiceVersion
     */
    VERSION((short)1, "version"),
    CLIENT_ID((short)2, "client_id"),
    NOTIFICATION_CALLBACK_SERVICE((short)3, "notification_callback_service");

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
        case 2: // CLIENT_ID
          return CLIENT_ID;
        case 3: // NOTIFICATION_CALLBACK_SERVICE
          return NOTIFICATION_CALLBACK_SERVICE;
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
    tmpMap.put(_Fields.CLIENT_ID, new org.apache.thrift.meta_data.FieldMetaData("client_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUniqueId.class)));
    tmpMap.put(_Fields.NOTIFICATION_CALLBACK_SERVICE, new org.apache.thrift.meta_data.FieldMetaData("notification_callback_service", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TNetworkAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLlamaNMRegisterRequest.class, metaDataMap);
  }

  public TLlamaNMRegisterRequest() {
  }

  public TLlamaNMRegisterRequest(
    TLlamaServiceVersion version,
    TUniqueId client_id,
    TNetworkAddress notification_callback_service)
  {
    this();
    this.version = version;
    this.client_id = client_id;
    this.notification_callback_service = notification_callback_service;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLlamaNMRegisterRequest(TLlamaNMRegisterRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetClient_id()) {
      this.client_id = new TUniqueId(other.client_id);
    }
    if (other.isSetNotification_callback_service()) {
      this.notification_callback_service = new TNetworkAddress(other.notification_callback_service);
    }
  }

  public TLlamaNMRegisterRequest deepCopy() {
    return new TLlamaNMRegisterRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.client_id = null;
    this.notification_callback_service = null;
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
  public TLlamaNMRegisterRequest setVersion(TLlamaServiceVersion version) {
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

  public TUniqueId getClient_id() {
    return this.client_id;
  }

  public TLlamaNMRegisterRequest setClient_id(TUniqueId client_id) {
    this.client_id = client_id;
    return this;
  }

  public void unsetClient_id() {
    this.client_id = null;
  }

  /** Returns true if field client_id is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_id() {
    return this.client_id != null;
  }

  public void setClient_idIsSet(boolean value) {
    if (!value) {
      this.client_id = null;
    }
  }

  public TNetworkAddress getNotification_callback_service() {
    return this.notification_callback_service;
  }

  public TLlamaNMRegisterRequest setNotification_callback_service(TNetworkAddress notification_callback_service) {
    this.notification_callback_service = notification_callback_service;
    return this;
  }

  public void unsetNotification_callback_service() {
    this.notification_callback_service = null;
  }

  /** Returns true if field notification_callback_service is set (has been assigned a value) and false otherwise */
  public boolean isSetNotification_callback_service() {
    return this.notification_callback_service != null;
  }

  public void setNotification_callback_serviceIsSet(boolean value) {
    if (!value) {
      this.notification_callback_service = null;
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

    case CLIENT_ID:
      if (value == null) {
        unsetClient_id();
      } else {
        setClient_id((TUniqueId)value);
      }
      break;

    case NOTIFICATION_CALLBACK_SERVICE:
      if (value == null) {
        unsetNotification_callback_service();
      } else {
        setNotification_callback_service((TNetworkAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case CLIENT_ID:
      return getClient_id();

    case NOTIFICATION_CALLBACK_SERVICE:
      return getNotification_callback_service();

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
    case CLIENT_ID:
      return isSetClient_id();
    case NOTIFICATION_CALLBACK_SERVICE:
      return isSetNotification_callback_service();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLlamaNMRegisterRequest)
      return this.equals((TLlamaNMRegisterRequest)that);
    return false;
  }

  public boolean equals(TLlamaNMRegisterRequest that) {
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

    boolean this_present_client_id = true && this.isSetClient_id();
    boolean that_present_client_id = true && that.isSetClient_id();
    if (this_present_client_id || that_present_client_id) {
      if (!(this_present_client_id && that_present_client_id))
        return false;
      if (!this.client_id.equals(that.client_id))
        return false;
    }

    boolean this_present_notification_callback_service = true && this.isSetNotification_callback_service();
    boolean that_present_notification_callback_service = true && that.isSetNotification_callback_service();
    if (this_present_notification_callback_service || that_present_notification_callback_service) {
      if (!(this_present_notification_callback_service && that_present_notification_callback_service))
        return false;
      if (!this.notification_callback_service.equals(that.notification_callback_service))
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

    boolean present_client_id = true && (isSetClient_id());
    builder.append(present_client_id);
    if (present_client_id)
      builder.append(client_id);

    boolean present_notification_callback_service = true && (isSetNotification_callback_service());
    builder.append(present_notification_callback_service);
    if (present_notification_callback_service)
      builder.append(notification_callback_service);

    return builder.toHashCode();
  }

  public int compareTo(TLlamaNMRegisterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TLlamaNMRegisterRequest typedOther = (TLlamaNMRegisterRequest)other;

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
    lastComparison = Boolean.valueOf(isSetClient_id()).compareTo(typedOther.isSetClient_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_id, typedOther.client_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNotification_callback_service()).compareTo(typedOther.isSetNotification_callback_service());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotification_callback_service()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notification_callback_service, typedOther.notification_callback_service);
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
    StringBuilder sb = new StringBuilder("TLlamaNMRegisterRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("client_id:");
    if (this.client_id == null) {
      sb.append("null");
    } else {
      sb.append(this.client_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("notification_callback_service:");
    if (this.notification_callback_service == null) {
      sb.append("null");
    } else {
      sb.append(this.notification_callback_service);
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
    if (client_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'client_id' was not present! Struct: " + toString());
    }
    if (notification_callback_service == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'notification_callback_service' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (client_id != null) {
      client_id.validate();
    }
    if (notification_callback_service != null) {
      notification_callback_service.validate();
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

  private static class TLlamaNMRegisterRequestStandardSchemeFactory implements SchemeFactory {
    public TLlamaNMRegisterRequestStandardScheme getScheme() {
      return new TLlamaNMRegisterRequestStandardScheme();
    }
  }

  private static class TLlamaNMRegisterRequestStandardScheme extends StandardScheme<TLlamaNMRegisterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLlamaNMRegisterRequest struct) throws org.apache.thrift.TException {
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
          case 2: // CLIENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.client_id = new TUniqueId();
              struct.client_id.read(iprot);
              struct.setClient_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOTIFICATION_CALLBACK_SERVICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.notification_callback_service = new TNetworkAddress();
              struct.notification_callback_service.read(iprot);
              struct.setNotification_callback_serviceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLlamaNMRegisterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.client_id != null) {
        oprot.writeFieldBegin(CLIENT_ID_FIELD_DESC);
        struct.client_id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.notification_callback_service != null) {
        oprot.writeFieldBegin(NOTIFICATION_CALLBACK_SERVICE_FIELD_DESC);
        struct.notification_callback_service.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLlamaNMRegisterRequestTupleSchemeFactory implements SchemeFactory {
    public TLlamaNMRegisterRequestTupleScheme getScheme() {
      return new TLlamaNMRegisterRequestTupleScheme();
    }
  }

  private static class TLlamaNMRegisterRequestTupleScheme extends TupleScheme<TLlamaNMRegisterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLlamaNMRegisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      struct.client_id.write(oprot);
      struct.notification_callback_service.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLlamaNMRegisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = TLlamaServiceVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.client_id = new TUniqueId();
      struct.client_id.read(iprot);
      struct.setClient_idIsSet(true);
      struct.notification_callback_service = new TNetworkAddress();
      struct.notification_callback_service.read(iprot);
      struct.setNotification_callback_serviceIsSet(true);
    }
  }

}

