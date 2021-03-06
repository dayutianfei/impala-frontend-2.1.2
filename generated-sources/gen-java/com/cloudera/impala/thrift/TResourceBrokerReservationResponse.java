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

public class TResourceBrokerReservationResponse implements org.apache.thrift.TBase<TResourceBrokerReservationResponse, TResourceBrokerReservationResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResourceBrokerReservationResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField RESERVATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("reservation_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ALLOCATED_RESOURCES_FIELD_DESC = new org.apache.thrift.protocol.TField("allocated_resources", org.apache.thrift.protocol.TType.MAP, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResourceBrokerReservationResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResourceBrokerReservationResponseTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TStatus status; // optional
  public com.cloudera.impala.thrift.TUniqueId reservation_id; // optional
  public Map<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource> allocated_resources; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    RESERVATION_ID((short)2, "reservation_id"),
    ALLOCATED_RESOURCES((short)3, "allocated_resources");

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
        case 1: // STATUS
          return STATUS;
        case 2: // RESERVATION_ID
          return RESERVATION_ID;
        case 3: // ALLOCATED_RESOURCES
          return ALLOCATED_RESOURCES;
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
  private _Fields optionals[] = {_Fields.STATUS,_Fields.RESERVATION_ID,_Fields.ALLOCATED_RESOURCES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TStatus.class)));
    tmpMap.put(_Fields.RESERVATION_ID, new org.apache.thrift.meta_data.FieldMetaData("reservation_id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.ALLOCATED_RESOURCES, new org.apache.thrift.meta_data.FieldMetaData("allocated_resources", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TNetworkAddress.class), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.llama.thrift.TAllocatedResource.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResourceBrokerReservationResponse.class, metaDataMap);
  }

  public TResourceBrokerReservationResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResourceBrokerReservationResponse(TResourceBrokerReservationResponse other) {
    if (other.isSetStatus()) {
      this.status = new com.cloudera.impala.thrift.TStatus(other.status);
    }
    if (other.isSetReservation_id()) {
      this.reservation_id = new com.cloudera.impala.thrift.TUniqueId(other.reservation_id);
    }
    if (other.isSetAllocated_resources()) {
      Map<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource> __this__allocated_resources = new HashMap<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource>();
      for (Map.Entry<com.cloudera.impala.thrift.TNetworkAddress, com.cloudera.llama.thrift.TAllocatedResource> other_element : other.allocated_resources.entrySet()) {

        com.cloudera.impala.thrift.TNetworkAddress other_element_key = other_element.getKey();
        com.cloudera.llama.thrift.TAllocatedResource other_element_value = other_element.getValue();

        com.cloudera.impala.thrift.TNetworkAddress __this__allocated_resources_copy_key = new com.cloudera.impala.thrift.TNetworkAddress(other_element_key);

        com.cloudera.llama.thrift.TAllocatedResource __this__allocated_resources_copy_value = new com.cloudera.llama.thrift.TAllocatedResource(other_element_value);

        __this__allocated_resources.put(__this__allocated_resources_copy_key, __this__allocated_resources_copy_value);
      }
      this.allocated_resources = __this__allocated_resources;
    }
  }

  public TResourceBrokerReservationResponse deepCopy() {
    return new TResourceBrokerReservationResponse(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.reservation_id = null;
    this.allocated_resources = null;
  }

  public com.cloudera.impala.thrift.TStatus getStatus() {
    return this.status;
  }

  public TResourceBrokerReservationResponse setStatus(com.cloudera.impala.thrift.TStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public com.cloudera.impala.thrift.TUniqueId getReservation_id() {
    return this.reservation_id;
  }

  public TResourceBrokerReservationResponse setReservation_id(com.cloudera.impala.thrift.TUniqueId reservation_id) {
    this.reservation_id = reservation_id;
    return this;
  }

  public void unsetReservation_id() {
    this.reservation_id = null;
  }

  /** Returns true if field reservation_id is set (has been assigned a value) and false otherwise */
  public boolean isSetReservation_id() {
    return this.reservation_id != null;
  }

  public void setReservation_idIsSet(boolean value) {
    if (!value) {
      this.reservation_id = null;
    }
  }

  public int getAllocated_resourcesSize() {
    return (this.allocated_resources == null) ? 0 : this.allocated_resources.size();
  }

  public void putToAllocated_resources(com.cloudera.impala.thrift.TNetworkAddress key, com.cloudera.llama.thrift.TAllocatedResource val) {
    if (this.allocated_resources == null) {
      this.allocated_resources = new HashMap<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource>();
    }
    this.allocated_resources.put(key, val);
  }

  public Map<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource> getAllocated_resources() {
    return this.allocated_resources;
  }

  public TResourceBrokerReservationResponse setAllocated_resources(Map<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource> allocated_resources) {
    this.allocated_resources = allocated_resources;
    return this;
  }

  public void unsetAllocated_resources() {
    this.allocated_resources = null;
  }

  /** Returns true if field allocated_resources is set (has been assigned a value) and false otherwise */
  public boolean isSetAllocated_resources() {
    return this.allocated_resources != null;
  }

  public void setAllocated_resourcesIsSet(boolean value) {
    if (!value) {
      this.allocated_resources = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.cloudera.impala.thrift.TStatus)value);
      }
      break;

    case RESERVATION_ID:
      if (value == null) {
        unsetReservation_id();
      } else {
        setReservation_id((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    case ALLOCATED_RESOURCES:
      if (value == null) {
        unsetAllocated_resources();
      } else {
        setAllocated_resources((Map<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case RESERVATION_ID:
      return getReservation_id();

    case ALLOCATED_RESOURCES:
      return getAllocated_resources();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case RESERVATION_ID:
      return isSetReservation_id();
    case ALLOCATED_RESOURCES:
      return isSetAllocated_resources();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResourceBrokerReservationResponse)
      return this.equals((TResourceBrokerReservationResponse)that);
    return false;
  }

  public boolean equals(TResourceBrokerReservationResponse that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_reservation_id = true && this.isSetReservation_id();
    boolean that_present_reservation_id = true && that.isSetReservation_id();
    if (this_present_reservation_id || that_present_reservation_id) {
      if (!(this_present_reservation_id && that_present_reservation_id))
        return false;
      if (!this.reservation_id.equals(that.reservation_id))
        return false;
    }

    boolean this_present_allocated_resources = true && this.isSetAllocated_resources();
    boolean that_present_allocated_resources = true && that.isSetAllocated_resources();
    if (this_present_allocated_resources || that_present_allocated_resources) {
      if (!(this_present_allocated_resources && that_present_allocated_resources))
        return false;
      if (!this.allocated_resources.equals(that.allocated_resources))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    boolean present_reservation_id = true && (isSetReservation_id());
    builder.append(present_reservation_id);
    if (present_reservation_id)
      builder.append(reservation_id);

    boolean present_allocated_resources = true && (isSetAllocated_resources());
    builder.append(present_allocated_resources);
    if (present_allocated_resources)
      builder.append(allocated_resources);

    return builder.toHashCode();
  }

  public int compareTo(TResourceBrokerReservationResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResourceBrokerReservationResponse typedOther = (TResourceBrokerReservationResponse)other;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReservation_id()).compareTo(typedOther.isSetReservation_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReservation_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reservation_id, typedOther.reservation_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAllocated_resources()).compareTo(typedOther.isSetAllocated_resources());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAllocated_resources()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.allocated_resources, typedOther.allocated_resources);
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
    StringBuilder sb = new StringBuilder("TResourceBrokerReservationResponse(");
    boolean first = true;

    if (isSetStatus()) {
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetReservation_id()) {
      if (!first) sb.append(", ");
      sb.append("reservation_id:");
      if (this.reservation_id == null) {
        sb.append("null");
      } else {
        sb.append(this.reservation_id);
      }
      first = false;
    }
    if (isSetAllocated_resources()) {
      if (!first) sb.append(", ");
      sb.append("allocated_resources:");
      if (this.allocated_resources == null) {
        sb.append("null");
      } else {
        sb.append(this.allocated_resources);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
    if (reservation_id != null) {
      reservation_id.validate();
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

  private static class TResourceBrokerReservationResponseStandardSchemeFactory implements SchemeFactory {
    public TResourceBrokerReservationResponseStandardScheme getScheme() {
      return new TResourceBrokerReservationResponseStandardScheme();
    }
  }

  private static class TResourceBrokerReservationResponseStandardScheme extends StandardScheme<TResourceBrokerReservationResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResourceBrokerReservationResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.cloudera.impala.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESERVATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.reservation_id = new com.cloudera.impala.thrift.TUniqueId();
              struct.reservation_id.read(iprot);
              struct.setReservation_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ALLOCATED_RESOURCES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map18 = iprot.readMapBegin();
                struct.allocated_resources = new HashMap<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource>(2*_map18.size);
                for (int _i19 = 0; _i19 < _map18.size; ++_i19)
                {
                  com.cloudera.impala.thrift.TNetworkAddress _key20; // required
                  com.cloudera.llama.thrift.TAllocatedResource _val21; // required
                  _key20 = new com.cloudera.impala.thrift.TNetworkAddress();
                  _key20.read(iprot);
                  _val21 = new com.cloudera.llama.thrift.TAllocatedResource();
                  _val21.read(iprot);
                  struct.allocated_resources.put(_key20, _val21);
                }
                iprot.readMapEnd();
              }
              struct.setAllocated_resourcesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResourceBrokerReservationResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          struct.status.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.reservation_id != null) {
        if (struct.isSetReservation_id()) {
          oprot.writeFieldBegin(RESERVATION_ID_FIELD_DESC);
          struct.reservation_id.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.allocated_resources != null) {
        if (struct.isSetAllocated_resources()) {
          oprot.writeFieldBegin(ALLOCATED_RESOURCES_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, struct.allocated_resources.size()));
            for (Map.Entry<com.cloudera.impala.thrift.TNetworkAddress, com.cloudera.llama.thrift.TAllocatedResource> _iter22 : struct.allocated_resources.entrySet())
            {
              _iter22.getKey().write(oprot);
              _iter22.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResourceBrokerReservationResponseTupleSchemeFactory implements SchemeFactory {
    public TResourceBrokerReservationResponseTupleScheme getScheme() {
      return new TResourceBrokerReservationResponseTupleScheme();
    }
  }

  private static class TResourceBrokerReservationResponseTupleScheme extends TupleScheme<TResourceBrokerReservationResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerReservationResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStatus()) {
        optionals.set(0);
      }
      if (struct.isSetReservation_id()) {
        optionals.set(1);
      }
      if (struct.isSetAllocated_resources()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStatus()) {
        struct.status.write(oprot);
      }
      if (struct.isSetReservation_id()) {
        struct.reservation_id.write(oprot);
      }
      if (struct.isSetAllocated_resources()) {
        {
          oprot.writeI32(struct.allocated_resources.size());
          for (Map.Entry<com.cloudera.impala.thrift.TNetworkAddress, com.cloudera.llama.thrift.TAllocatedResource> _iter23 : struct.allocated_resources.entrySet())
          {
            _iter23.getKey().write(oprot);
            _iter23.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResourceBrokerReservationResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.status = new com.cloudera.impala.thrift.TStatus();
        struct.status.read(iprot);
        struct.setStatusIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reservation_id = new com.cloudera.impala.thrift.TUniqueId();
        struct.reservation_id.read(iprot);
        struct.setReservation_idIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map24 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRUCT, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.allocated_resources = new HashMap<com.cloudera.impala.thrift.TNetworkAddress,com.cloudera.llama.thrift.TAllocatedResource>(2*_map24.size);
          for (int _i25 = 0; _i25 < _map24.size; ++_i25)
          {
            com.cloudera.impala.thrift.TNetworkAddress _key26; // required
            com.cloudera.llama.thrift.TAllocatedResource _val27; // required
            _key26 = new com.cloudera.impala.thrift.TNetworkAddress();
            _key26.read(iprot);
            _val27 = new com.cloudera.llama.thrift.TAllocatedResource();
            _val27.read(iprot);
            struct.allocated_resources.put(_key26, _val27);
          }
        }
        struct.setAllocated_resourcesIsSet(true);
      }
    }
  }

}

