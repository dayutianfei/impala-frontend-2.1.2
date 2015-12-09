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

public class TRegisterSubscriberRequest implements org.apache.thrift.TBase<TRegisterSubscriberRequest, TRegisterSubscriberRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TRegisterSubscriberRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SUBSCRIBER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriber_id", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SUBSCRIBER_LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriber_location", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TOPIC_REGISTRATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("topic_registrations", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TRegisterSubscriberRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TRegisterSubscriberRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see StatestoreServiceVersion
   */
  public StatestoreServiceVersion protocol_version; // required
  public String subscriber_id; // required
  public com.cloudera.impala.thrift.TNetworkAddress subscriber_location; // required
  public List<TTopicRegistration> topic_registrations; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see StatestoreServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    SUBSCRIBER_ID((short)2, "subscriber_id"),
    SUBSCRIBER_LOCATION((short)3, "subscriber_location"),
    TOPIC_REGISTRATIONS((short)4, "topic_registrations");

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
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // SUBSCRIBER_ID
          return SUBSCRIBER_ID;
        case 3: // SUBSCRIBER_LOCATION
          return SUBSCRIBER_LOCATION;
        case 4: // TOPIC_REGISTRATIONS
          return TOPIC_REGISTRATIONS;
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
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, StatestoreServiceVersion.class)));
    tmpMap.put(_Fields.SUBSCRIBER_ID, new org.apache.thrift.meta_data.FieldMetaData("subscriber_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SUBSCRIBER_LOCATION, new org.apache.thrift.meta_data.FieldMetaData("subscriber_location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TNetworkAddress.class)));
    tmpMap.put(_Fields.TOPIC_REGISTRATIONS, new org.apache.thrift.meta_data.FieldMetaData("topic_registrations", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTopicRegistration.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TRegisterSubscriberRequest.class, metaDataMap);
  }

  public TRegisterSubscriberRequest() {
    this.protocol_version = com.cloudera.impala.thrift.StatestoreServiceVersion.V1;

  }

  public TRegisterSubscriberRequest(
    StatestoreServiceVersion protocol_version,
    String subscriber_id,
    com.cloudera.impala.thrift.TNetworkAddress subscriber_location,
    List<TTopicRegistration> topic_registrations)
  {
    this();
    this.protocol_version = protocol_version;
    this.subscriber_id = subscriber_id;
    this.subscriber_location = subscriber_location;
    this.topic_registrations = topic_registrations;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TRegisterSubscriberRequest(TRegisterSubscriberRequest other) {
    if (other.isSetProtocol_version()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetSubscriber_id()) {
      this.subscriber_id = other.subscriber_id;
    }
    if (other.isSetSubscriber_location()) {
      this.subscriber_location = new com.cloudera.impala.thrift.TNetworkAddress(other.subscriber_location);
    }
    if (other.isSetTopic_registrations()) {
      List<TTopicRegistration> __this__topic_registrations = new ArrayList<TTopicRegistration>();
      for (TTopicRegistration other_element : other.topic_registrations) {
        __this__topic_registrations.add(new TTopicRegistration(other_element));
      }
      this.topic_registrations = __this__topic_registrations;
    }
  }

  public TRegisterSubscriberRequest deepCopy() {
    return new TRegisterSubscriberRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = com.cloudera.impala.thrift.StatestoreServiceVersion.V1;

    this.subscriber_id = null;
    this.subscriber_location = null;
    this.topic_registrations = null;
  }

  /**
   * 
   * @see StatestoreServiceVersion
   */
  public StatestoreServiceVersion getProtocol_version() {
    return this.protocol_version;
  }

  /**
   * 
   * @see StatestoreServiceVersion
   */
  public TRegisterSubscriberRequest setProtocol_version(StatestoreServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocol_version() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return this.protocol_version != null;
  }

  public void setProtocol_versionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  public String getSubscriber_id() {
    return this.subscriber_id;
  }

  public TRegisterSubscriberRequest setSubscriber_id(String subscriber_id) {
    this.subscriber_id = subscriber_id;
    return this;
  }

  public void unsetSubscriber_id() {
    this.subscriber_id = null;
  }

  /** Returns true if field subscriber_id is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriber_id() {
    return this.subscriber_id != null;
  }

  public void setSubscriber_idIsSet(boolean value) {
    if (!value) {
      this.subscriber_id = null;
    }
  }

  public com.cloudera.impala.thrift.TNetworkAddress getSubscriber_location() {
    return this.subscriber_location;
  }

  public TRegisterSubscriberRequest setSubscriber_location(com.cloudera.impala.thrift.TNetworkAddress subscriber_location) {
    this.subscriber_location = subscriber_location;
    return this;
  }

  public void unsetSubscriber_location() {
    this.subscriber_location = null;
  }

  /** Returns true if field subscriber_location is set (has been assigned a value) and false otherwise */
  public boolean isSetSubscriber_location() {
    return this.subscriber_location != null;
  }

  public void setSubscriber_locationIsSet(boolean value) {
    if (!value) {
      this.subscriber_location = null;
    }
  }

  public int getTopic_registrationsSize() {
    return (this.topic_registrations == null) ? 0 : this.topic_registrations.size();
  }

  public java.util.Iterator<TTopicRegistration> getTopic_registrationsIterator() {
    return (this.topic_registrations == null) ? null : this.topic_registrations.iterator();
  }

  public void addToTopic_registrations(TTopicRegistration elem) {
    if (this.topic_registrations == null) {
      this.topic_registrations = new ArrayList<TTopicRegistration>();
    }
    this.topic_registrations.add(elem);
  }

  public List<TTopicRegistration> getTopic_registrations() {
    return this.topic_registrations;
  }

  public TRegisterSubscriberRequest setTopic_registrations(List<TTopicRegistration> topic_registrations) {
    this.topic_registrations = topic_registrations;
    return this;
  }

  public void unsetTopic_registrations() {
    this.topic_registrations = null;
  }

  /** Returns true if field topic_registrations is set (has been assigned a value) and false otherwise */
  public boolean isSetTopic_registrations() {
    return this.topic_registrations != null;
  }

  public void setTopic_registrationsIsSet(boolean value) {
    if (!value) {
      this.topic_registrations = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((StatestoreServiceVersion)value);
      }
      break;

    case SUBSCRIBER_ID:
      if (value == null) {
        unsetSubscriber_id();
      } else {
        setSubscriber_id((String)value);
      }
      break;

    case SUBSCRIBER_LOCATION:
      if (value == null) {
        unsetSubscriber_location();
      } else {
        setSubscriber_location((com.cloudera.impala.thrift.TNetworkAddress)value);
      }
      break;

    case TOPIC_REGISTRATIONS:
      if (value == null) {
        unsetTopic_registrations();
      } else {
        setTopic_registrations((List<TTopicRegistration>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case SUBSCRIBER_ID:
      return getSubscriber_id();

    case SUBSCRIBER_LOCATION:
      return getSubscriber_location();

    case TOPIC_REGISTRATIONS:
      return getTopic_registrations();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case SUBSCRIBER_ID:
      return isSetSubscriber_id();
    case SUBSCRIBER_LOCATION:
      return isSetSubscriber_location();
    case TOPIC_REGISTRATIONS:
      return isSetTopic_registrations();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TRegisterSubscriberRequest)
      return this.equals((TRegisterSubscriberRequest)that);
    return false;
  }

  public boolean equals(TRegisterSubscriberRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true && this.isSetProtocol_version();
    boolean that_present_protocol_version = true && that.isSetProtocol_version();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_subscriber_id = true && this.isSetSubscriber_id();
    boolean that_present_subscriber_id = true && that.isSetSubscriber_id();
    if (this_present_subscriber_id || that_present_subscriber_id) {
      if (!(this_present_subscriber_id && that_present_subscriber_id))
        return false;
      if (!this.subscriber_id.equals(that.subscriber_id))
        return false;
    }

    boolean this_present_subscriber_location = true && this.isSetSubscriber_location();
    boolean that_present_subscriber_location = true && that.isSetSubscriber_location();
    if (this_present_subscriber_location || that_present_subscriber_location) {
      if (!(this_present_subscriber_location && that_present_subscriber_location))
        return false;
      if (!this.subscriber_location.equals(that.subscriber_location))
        return false;
    }

    boolean this_present_topic_registrations = true && this.isSetTopic_registrations();
    boolean that_present_topic_registrations = true && that.isSetTopic_registrations();
    if (this_present_topic_registrations || that_present_topic_registrations) {
      if (!(this_present_topic_registrations && that_present_topic_registrations))
        return false;
      if (!this.topic_registrations.equals(that.topic_registrations))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_protocol_version = true && (isSetProtocol_version());
    builder.append(present_protocol_version);
    if (present_protocol_version)
      builder.append(protocol_version.getValue());

    boolean present_subscriber_id = true && (isSetSubscriber_id());
    builder.append(present_subscriber_id);
    if (present_subscriber_id)
      builder.append(subscriber_id);

    boolean present_subscriber_location = true && (isSetSubscriber_location());
    builder.append(present_subscriber_location);
    if (present_subscriber_location)
      builder.append(subscriber_location);

    boolean present_topic_registrations = true && (isSetTopic_registrations());
    builder.append(present_topic_registrations);
    if (present_topic_registrations)
      builder.append(topic_registrations);

    return builder.toHashCode();
  }

  public int compareTo(TRegisterSubscriberRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TRegisterSubscriberRequest typedOther = (TRegisterSubscriberRequest)other;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(typedOther.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, typedOther.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriber_id()).compareTo(typedOther.isSetSubscriber_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriber_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriber_id, typedOther.subscriber_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubscriber_location()).compareTo(typedOther.isSetSubscriber_location());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubscriber_location()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriber_location, typedOther.subscriber_location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopic_registrations()).compareTo(typedOther.isSetTopic_registrations());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopic_registrations()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.topic_registrations, typedOther.topic_registrations);
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
    StringBuilder sb = new StringBuilder("TRegisterSubscriberRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("subscriber_id:");
    if (this.subscriber_id == null) {
      sb.append("null");
    } else {
      sb.append(this.subscriber_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("subscriber_location:");
    if (this.subscriber_location == null) {
      sb.append("null");
    } else {
      sb.append(this.subscriber_location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topic_registrations:");
    if (this.topic_registrations == null) {
      sb.append("null");
    } else {
      sb.append(this.topic_registrations);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    if (subscriber_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subscriber_id' was not present! Struct: " + toString());
    }
    if (subscriber_location == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'subscriber_location' was not present! Struct: " + toString());
    }
    if (topic_registrations == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'topic_registrations' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (subscriber_location != null) {
      subscriber_location.validate();
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

  private static class TRegisterSubscriberRequestStandardSchemeFactory implements SchemeFactory {
    public TRegisterSubscriberRequestStandardScheme getScheme() {
      return new TRegisterSubscriberRequestStandardScheme();
    }
  }

  private static class TRegisterSubscriberRequestStandardScheme extends StandardScheme<TRegisterSubscriberRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TRegisterSubscriberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = StatestoreServiceVersion.findByValue(iprot.readI32());
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUBSCRIBER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.subscriber_id = iprot.readString();
              struct.setSubscriber_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SUBSCRIBER_LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.subscriber_location = new com.cloudera.impala.thrift.TNetworkAddress();
              struct.subscriber_location.read(iprot);
              struct.setSubscriber_locationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOPIC_REGISTRATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.topic_registrations = new ArrayList<TTopicRegistration>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  TTopicRegistration _elem18; // required
                  _elem18 = new TTopicRegistration();
                  _elem18.read(iprot);
                  struct.topic_registrations.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setTopic_registrationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TRegisterSubscriberRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.subscriber_id != null) {
        oprot.writeFieldBegin(SUBSCRIBER_ID_FIELD_DESC);
        oprot.writeString(struct.subscriber_id);
        oprot.writeFieldEnd();
      }
      if (struct.subscriber_location != null) {
        oprot.writeFieldBegin(SUBSCRIBER_LOCATION_FIELD_DESC);
        struct.subscriber_location.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topic_registrations != null) {
        oprot.writeFieldBegin(TOPIC_REGISTRATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.topic_registrations.size()));
          for (TTopicRegistration _iter19 : struct.topic_registrations)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TRegisterSubscriberRequestTupleSchemeFactory implements SchemeFactory {
    public TRegisterSubscriberRequestTupleScheme getScheme() {
      return new TRegisterSubscriberRequestTupleScheme();
    }
  }

  private static class TRegisterSubscriberRequestTupleScheme extends TupleScheme<TRegisterSubscriberRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TRegisterSubscriberRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      oprot.writeString(struct.subscriber_id);
      struct.subscriber_location.write(oprot);
      {
        oprot.writeI32(struct.topic_registrations.size());
        for (TTopicRegistration _iter20 : struct.topic_registrations)
        {
          _iter20.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TRegisterSubscriberRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = StatestoreServiceVersion.findByValue(iprot.readI32());
      struct.setProtocol_versionIsSet(true);
      struct.subscriber_id = iprot.readString();
      struct.setSubscriber_idIsSet(true);
      struct.subscriber_location = new com.cloudera.impala.thrift.TNetworkAddress();
      struct.subscriber_location.read(iprot);
      struct.setSubscriber_locationIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.topic_registrations = new ArrayList<TTopicRegistration>(_list21.size);
        for (int _i22 = 0; _i22 < _list21.size; ++_i22)
        {
          TTopicRegistration _elem23; // required
          _elem23 = new TTopicRegistration();
          _elem23.read(iprot);
          struct.topic_registrations.add(_elem23);
        }
      }
      struct.setTopic_registrationsIsSet(true);
    }
  }

}
