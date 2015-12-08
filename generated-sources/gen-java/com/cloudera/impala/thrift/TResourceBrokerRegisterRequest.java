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

public class TResourceBrokerRegisterRequest implements org.apache.thrift.TBase<TResourceBrokerRegisterRequest, TResourceBrokerRegisterRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResourceBrokerRegisterRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CLIENT_PROCESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("client_process_id", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NOTIFICATION_CALLBACK_SERVICE_FIELD_DESC = new org.apache.thrift.protocol.TField("notification_callback_service", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResourceBrokerRegisterRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResourceBrokerRegisterRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see TResourceBrokerServiceVersion
   */
  public TResourceBrokerServiceVersion version; // required
  public int client_process_id; // optional
  public com.cloudera.impala.thrift.TNetworkAddress notification_callback_service; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TResourceBrokerServiceVersion
     */
    VERSION((short)1, "version"),
    CLIENT_PROCESS_ID((short)2, "client_process_id"),
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
        case 2: // CLIENT_PROCESS_ID
          return CLIENT_PROCESS_ID;
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
  private static final int __CLIENT_PROCESS_ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CLIENT_PROCESS_ID,_Fields.NOTIFICATION_CALLBACK_SERVICE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TResourceBrokerServiceVersion.class)));
    tmpMap.put(_Fields.CLIENT_PROCESS_ID, new org.apache.thrift.meta_data.FieldMetaData("client_process_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NOTIFICATION_CALLBACK_SERVICE, new org.apache.thrift.meta_data.FieldMetaData("notification_callback_service", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TNetworkAddress.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResourceBrokerRegisterRequest.class, metaDataMap);
  }

  public TResourceBrokerRegisterRequest() {
  }

  public TResourceBrokerRegisterRequest(
    TResourceBrokerServiceVersion version)
  {
    this();
    this.version = version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResourceBrokerRegisterRequest(TResourceBrokerRegisterRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    this.client_process_id = other.client_process_id;
    if (other.isSetNotification_callback_service()) {
      this.notification_callback_service = new com.cloudera.impala.thrift.TNetworkAddress(other.notification_callback_service);
    }
  }

  public TResourceBrokerRegisterRequest deepCopy() {
    return new TResourceBrokerRegisterRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    setClient_process_idIsSet(false);
    this.client_process_id = 0;
    this.notification_callback_service = null;
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
  public TResourceBrokerRegisterRequest setVersion(TResourceBrokerServiceVersion version) {
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

  public int getClient_process_id() {
    return this.client_process_id;
  }

  public TResourceBrokerRegisterRequest setClient_process_id(int client_process_id) {
    this.client_process_id = client_process_id;
    setClient_process_idIsSet(true);
    return this;
  }

  public void unsetClient_process_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLIENT_PROCESS_ID_ISSET_ID);
  }

  /** Returns true if field client_process_id is set (has been assigned a value) and false otherwise */
  public boolean isSetClient_process_id() {
    return EncodingUtils.testBit(__isset_bitfield, __CLIENT_PROCESS_ID_ISSET_ID);
  }

  public void setClient_process_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLIENT_PROCESS_ID_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TNetworkAddress getNotification_callback_service() {
    return this.notification_callback_service;
  }

  public TResourceBrokerRegisterRequest setNotification_callback_service(com.cloudera.impala.thrift.TNetworkAddress notification_callback_service) {
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
        setVersion((TResourceBrokerServiceVersion)value);
      }
      break;

    case CLIENT_PROCESS_ID:
      if (value == null) {
        unsetClient_process_id();
      } else {
        setClient_process_id((Integer)value);
      }
      break;

    case NOTIFICATION_CALLBACK_SERVICE:
      if (value == null) {
        unsetNotification_callback_service();
      } else {
        setNotification_callback_service((com.cloudera.impala.thrift.TNetworkAddress)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case CLIENT_PROCESS_ID:
      return Integer.valueOf(getClient_process_id());

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
    case CLIENT_PROCESS_ID:
      return isSetClient_process_id();
    case NOTIFICATION_CALLBACK_SERVICE:
      return isSetNotification_callback_service();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResourceBrokerRegisterRequest)
      return this.equals((TResourceBrokerRegisterRequest)that);
    return false;
  }

  public boolean equals(TResourceBrokerRegisterRequest that) {
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

    boolean this_present_client_process_id = true && this.isSetClient_process_id();
    boolean that_present_client_process_id = true && that.isSetClient_process_id();
    if (this_present_client_process_id || that_present_client_process_id) {
      if (!(this_present_client_process_id && that_present_client_process_id))
        return false;
      if (this.client_process_id != that.client_process_id)
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

    boolean present_client_process_id = true && (isSetClient_process_id());
    builder.append(present_client_process_id);
    if (present_client_process_id)
      builder.append(client_process_id);

    boolean present_notification_callback_service = true && (isSetNotification_callback_service());
    builder.append(present_notification_callback_service);
    if (present_notification_callback_service)
      builder.append(notification_callback_service);

    return builder.toHashCode();
  }

  public int compareTo(TResourceBrokerRegisterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResourceBrokerRegisterRequest typedOther = (TResourceBrokerRegisterRequest)other;

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
    lastComparison = Boolean.valueOf(isSetClient_process_id()).compareTo(typedOther.isSetClient_process_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClient_process_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.client_process_id, typedOther.client_process_id);
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
    StringBuilder sb = new StringBuilder("TResourceBrokerRegisterRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (isSetClient_process_id()) {
      if (!first) sb.append(", ");
      sb.append("client_process_id:");
      sb.append(this.client_process_id);
      first = false;
    }
    if (isSetNotification_callback_service()) {
      if (!first) sb.append(", ");
      sb.append("notification_callback_service:");
      if (this.notification_callback_service == null) {
        sb.append("null");
      } else {
        sb.append(this.notification_callback_service);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TResourceBrokerRegisterRequestStandardSchemeFactory implements SchemeFactory {
    public TResourceBrokerRegisterRequestStandardScheme getScheme() {
      return new TResourceBrokerRegisterRequestStandardScheme();
    }
  }

  private static class TResourceBrokerRegisterRequestStandardScheme extends StandardScheme<TResourceBrokerRegisterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResourceBrokerRegisterRequest struct) throws org.apache.thrift.TException {
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
          case 2: // CLIENT_PROCESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.client_process_id = iprot.readI32();
              struct.setClient_process_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOTIFICATION_CALLBACK_SERVICE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.notification_callback_service = new com.cloudera.impala.thrift.TNetworkAddress();
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResourceBrokerRegisterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.isSetClient_process_id()) {
        oprot.writeFieldBegin(CLIENT_PROCESS_ID_FIELD_DESC);
        oprot.writeI32(struct.client_process_id);
        oprot.writeFieldEnd();
      }
      if (struct.notification_callback_service != null) {
        if (struct.isSetNotification_callback_service()) {
          oprot.writeFieldBegin(NOTIFICATION_CALLBACK_SERVICE_FIELD_DESC);
          struct.notification_callback_service.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResourceBrokerRegisterRequestTupleSchemeFactory implements SchemeFactory {
    public TResourceBrokerRegisterRequestTupleScheme getScheme() {
      return new TResourceBrokerRegisterRequestTupleScheme();
    }
  }

  private static class TResourceBrokerRegisterRequestTupleScheme extends TupleScheme<TResourceBrokerRegisterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerRegisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetClient_process_id()) {
        optionals.set(0);
      }
      if (struct.isSetNotification_callback_service()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetClient_process_id()) {
        oprot.writeI32(struct.client_process_id);
      }
      if (struct.isSetNotification_callback_service()) {
        struct.notification_callback_service.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerRegisterRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = TResourceBrokerServiceVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.client_process_id = iprot.readI32();
        struct.setClient_process_idIsSet(true);
      }
      if (incoming.get(1)) {
        struct.notification_callback_service = new com.cloudera.impala.thrift.TNetworkAddress();
        struct.notification_callback_service.read(iprot);
        struct.setNotification_callback_serviceIsSet(true);
      }
    }
  }

}

