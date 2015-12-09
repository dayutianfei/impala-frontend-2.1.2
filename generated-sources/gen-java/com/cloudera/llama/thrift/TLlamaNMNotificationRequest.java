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

public class TLlamaNMNotificationRequest implements org.apache.thrift.TBase<TLlamaNMNotificationRequest, TLlamaNMNotificationRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLlamaNMNotificationRequest");

  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NM_HANDLE_FIELD_DESC = new org.apache.thrift.protocol.TField("nm_handle", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_CAPACITY_FIELD_DESC = new org.apache.thrift.protocol.TField("node_capacity", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField PREEMPTED_RM_RESOURCE_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("preempted_rm_resource_ids", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLlamaNMNotificationRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLlamaNMNotificationRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see TLlamaServiceVersion
   */
  public TLlamaServiceVersion version; // required
  public TUniqueId nm_handle; // required
  public TNodeCapacity node_capacity; // required
  public List<String> preempted_rm_resource_ids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TLlamaServiceVersion
     */
    VERSION((short)1, "version"),
    NM_HANDLE((short)2, "nm_handle"),
    NODE_CAPACITY((short)3, "node_capacity"),
    PREEMPTED_RM_RESOURCE_IDS((short)4, "preempted_rm_resource_ids");

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
        case 2: // NM_HANDLE
          return NM_HANDLE;
        case 3: // NODE_CAPACITY
          return NODE_CAPACITY;
        case 4: // PREEMPTED_RM_RESOURCE_IDS
          return PREEMPTED_RM_RESOURCE_IDS;
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
    tmpMap.put(_Fields.NM_HANDLE, new org.apache.thrift.meta_data.FieldMetaData("nm_handle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUniqueId.class)));
    tmpMap.put(_Fields.NODE_CAPACITY, new org.apache.thrift.meta_data.FieldMetaData("node_capacity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TNodeCapacity.class)));
    tmpMap.put(_Fields.PREEMPTED_RM_RESOURCE_IDS, new org.apache.thrift.meta_data.FieldMetaData("preempted_rm_resource_ids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLlamaNMNotificationRequest.class, metaDataMap);
  }

  public TLlamaNMNotificationRequest() {
  }

  public TLlamaNMNotificationRequest(
    TLlamaServiceVersion version,
    TUniqueId nm_handle,
    TNodeCapacity node_capacity,
    List<String> preempted_rm_resource_ids)
  {
    this();
    this.version = version;
    this.nm_handle = nm_handle;
    this.node_capacity = node_capacity;
    this.preempted_rm_resource_ids = preempted_rm_resource_ids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLlamaNMNotificationRequest(TLlamaNMNotificationRequest other) {
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    if (other.isSetNm_handle()) {
      this.nm_handle = new TUniqueId(other.nm_handle);
    }
    if (other.isSetNode_capacity()) {
      this.node_capacity = new TNodeCapacity(other.node_capacity);
    }
    if (other.isSetPreempted_rm_resource_ids()) {
      List<String> __this__preempted_rm_resource_ids = new ArrayList<String>();
      for (String other_element : other.preempted_rm_resource_ids) {
        __this__preempted_rm_resource_ids.add(other_element);
      }
      this.preempted_rm_resource_ids = __this__preempted_rm_resource_ids;
    }
  }

  public TLlamaNMNotificationRequest deepCopy() {
    return new TLlamaNMNotificationRequest(this);
  }

  @Override
  public void clear() {
    this.version = null;
    this.nm_handle = null;
    this.node_capacity = null;
    this.preempted_rm_resource_ids = null;
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
  public TLlamaNMNotificationRequest setVersion(TLlamaServiceVersion version) {
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

  public TUniqueId getNm_handle() {
    return this.nm_handle;
  }

  public TLlamaNMNotificationRequest setNm_handle(TUniqueId nm_handle) {
    this.nm_handle = nm_handle;
    return this;
  }

  public void unsetNm_handle() {
    this.nm_handle = null;
  }

  /** Returns true if field nm_handle is set (has been assigned a value) and false otherwise */
  public boolean isSetNm_handle() {
    return this.nm_handle != null;
  }

  public void setNm_handleIsSet(boolean value) {
    if (!value) {
      this.nm_handle = null;
    }
  }

  public TNodeCapacity getNode_capacity() {
    return this.node_capacity;
  }

  public TLlamaNMNotificationRequest setNode_capacity(TNodeCapacity node_capacity) {
    this.node_capacity = node_capacity;
    return this;
  }

  public void unsetNode_capacity() {
    this.node_capacity = null;
  }

  /** Returns true if field node_capacity is set (has been assigned a value) and false otherwise */
  public boolean isSetNode_capacity() {
    return this.node_capacity != null;
  }

  public void setNode_capacityIsSet(boolean value) {
    if (!value) {
      this.node_capacity = null;
    }
  }

  public int getPreempted_rm_resource_idsSize() {
    return (this.preempted_rm_resource_ids == null) ? 0 : this.preempted_rm_resource_ids.size();
  }

  public java.util.Iterator<String> getPreempted_rm_resource_idsIterator() {
    return (this.preempted_rm_resource_ids == null) ? null : this.preempted_rm_resource_ids.iterator();
  }

  public void addToPreempted_rm_resource_ids(String elem) {
    if (this.preempted_rm_resource_ids == null) {
      this.preempted_rm_resource_ids = new ArrayList<String>();
    }
    this.preempted_rm_resource_ids.add(elem);
  }

  public List<String> getPreempted_rm_resource_ids() {
    return this.preempted_rm_resource_ids;
  }

  public TLlamaNMNotificationRequest setPreempted_rm_resource_ids(List<String> preempted_rm_resource_ids) {
    this.preempted_rm_resource_ids = preempted_rm_resource_ids;
    return this;
  }

  public void unsetPreempted_rm_resource_ids() {
    this.preempted_rm_resource_ids = null;
  }

  /** Returns true if field preempted_rm_resource_ids is set (has been assigned a value) and false otherwise */
  public boolean isSetPreempted_rm_resource_ids() {
    return this.preempted_rm_resource_ids != null;
  }

  public void setPreempted_rm_resource_idsIsSet(boolean value) {
    if (!value) {
      this.preempted_rm_resource_ids = null;
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

    case NM_HANDLE:
      if (value == null) {
        unsetNm_handle();
      } else {
        setNm_handle((TUniqueId)value);
      }
      break;

    case NODE_CAPACITY:
      if (value == null) {
        unsetNode_capacity();
      } else {
        setNode_capacity((TNodeCapacity)value);
      }
      break;

    case PREEMPTED_RM_RESOURCE_IDS:
      if (value == null) {
        unsetPreempted_rm_resource_ids();
      } else {
        setPreempted_rm_resource_ids((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case VERSION:
      return getVersion();

    case NM_HANDLE:
      return getNm_handle();

    case NODE_CAPACITY:
      return getNode_capacity();

    case PREEMPTED_RM_RESOURCE_IDS:
      return getPreempted_rm_resource_ids();

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
    case NM_HANDLE:
      return isSetNm_handle();
    case NODE_CAPACITY:
      return isSetNode_capacity();
    case PREEMPTED_RM_RESOURCE_IDS:
      return isSetPreempted_rm_resource_ids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLlamaNMNotificationRequest)
      return this.equals((TLlamaNMNotificationRequest)that);
    return false;
  }

  public boolean equals(TLlamaNMNotificationRequest that) {
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

    boolean this_present_nm_handle = true && this.isSetNm_handle();
    boolean that_present_nm_handle = true && that.isSetNm_handle();
    if (this_present_nm_handle || that_present_nm_handle) {
      if (!(this_present_nm_handle && that_present_nm_handle))
        return false;
      if (!this.nm_handle.equals(that.nm_handle))
        return false;
    }

    boolean this_present_node_capacity = true && this.isSetNode_capacity();
    boolean that_present_node_capacity = true && that.isSetNode_capacity();
    if (this_present_node_capacity || that_present_node_capacity) {
      if (!(this_present_node_capacity && that_present_node_capacity))
        return false;
      if (!this.node_capacity.equals(that.node_capacity))
        return false;
    }

    boolean this_present_preempted_rm_resource_ids = true && this.isSetPreempted_rm_resource_ids();
    boolean that_present_preempted_rm_resource_ids = true && that.isSetPreempted_rm_resource_ids();
    if (this_present_preempted_rm_resource_ids || that_present_preempted_rm_resource_ids) {
      if (!(this_present_preempted_rm_resource_ids && that_present_preempted_rm_resource_ids))
        return false;
      if (!this.preempted_rm_resource_ids.equals(that.preempted_rm_resource_ids))
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

    boolean present_nm_handle = true && (isSetNm_handle());
    builder.append(present_nm_handle);
    if (present_nm_handle)
      builder.append(nm_handle);

    boolean present_node_capacity = true && (isSetNode_capacity());
    builder.append(present_node_capacity);
    if (present_node_capacity)
      builder.append(node_capacity);

    boolean present_preempted_rm_resource_ids = true && (isSetPreempted_rm_resource_ids());
    builder.append(present_preempted_rm_resource_ids);
    if (present_preempted_rm_resource_ids)
      builder.append(preempted_rm_resource_ids);

    return builder.toHashCode();
  }

  public int compareTo(TLlamaNMNotificationRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TLlamaNMNotificationRequest typedOther = (TLlamaNMNotificationRequest)other;

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
    lastComparison = Boolean.valueOf(isSetNm_handle()).compareTo(typedOther.isSetNm_handle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNm_handle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nm_handle, typedOther.nm_handle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNode_capacity()).compareTo(typedOther.isSetNode_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNode_capacity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.node_capacity, typedOther.node_capacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPreempted_rm_resource_ids()).compareTo(typedOther.isSetPreempted_rm_resource_ids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPreempted_rm_resource_ids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.preempted_rm_resource_ids, typedOther.preempted_rm_resource_ids);
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
    StringBuilder sb = new StringBuilder("TLlamaNMNotificationRequest(");
    boolean first = true;

    sb.append("version:");
    if (this.version == null) {
      sb.append("null");
    } else {
      sb.append(this.version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nm_handle:");
    if (this.nm_handle == null) {
      sb.append("null");
    } else {
      sb.append(this.nm_handle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("node_capacity:");
    if (this.node_capacity == null) {
      sb.append("null");
    } else {
      sb.append(this.node_capacity);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("preempted_rm_resource_ids:");
    if (this.preempted_rm_resource_ids == null) {
      sb.append("null");
    } else {
      sb.append(this.preempted_rm_resource_ids);
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
    if (nm_handle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nm_handle' was not present! Struct: " + toString());
    }
    if (node_capacity == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'node_capacity' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (nm_handle != null) {
      nm_handle.validate();
    }
    if (node_capacity != null) {
      node_capacity.validate();
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

  private static class TLlamaNMNotificationRequestStandardSchemeFactory implements SchemeFactory {
    public TLlamaNMNotificationRequestStandardScheme getScheme() {
      return new TLlamaNMNotificationRequestStandardScheme();
    }
  }

  private static class TLlamaNMNotificationRequestStandardScheme extends StandardScheme<TLlamaNMNotificationRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLlamaNMNotificationRequest struct) throws org.apache.thrift.TException {
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
          case 2: // NM_HANDLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nm_handle = new TUniqueId();
              struct.nm_handle.read(iprot);
              struct.setNm_handleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE_CAPACITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.node_capacity = new TNodeCapacity();
              struct.node_capacity.read(iprot);
              struct.setNode_capacityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PREEMPTED_RM_RESOURCE_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list128 = iprot.readListBegin();
                struct.preempted_rm_resource_ids = new ArrayList<String>(_list128.size);
                for (int _i129 = 0; _i129 < _list128.size; ++_i129)
                {
                  String _elem130; // required
                  _elem130 = iprot.readString();
                  struct.preempted_rm_resource_ids.add(_elem130);
                }
                iprot.readListEnd();
              }
              struct.setPreempted_rm_resource_idsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLlamaNMNotificationRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.version != null) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI32(struct.version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.nm_handle != null) {
        oprot.writeFieldBegin(NM_HANDLE_FIELD_DESC);
        struct.nm_handle.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.node_capacity != null) {
        oprot.writeFieldBegin(NODE_CAPACITY_FIELD_DESC);
        struct.node_capacity.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.preempted_rm_resource_ids != null) {
        oprot.writeFieldBegin(PREEMPTED_RM_RESOURCE_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.preempted_rm_resource_ids.size()));
          for (String _iter131 : struct.preempted_rm_resource_ids)
          {
            oprot.writeString(_iter131);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLlamaNMNotificationRequestTupleSchemeFactory implements SchemeFactory {
    public TLlamaNMNotificationRequestTupleScheme getScheme() {
      return new TLlamaNMNotificationRequestTupleScheme();
    }
  }

  private static class TLlamaNMNotificationRequestTupleScheme extends TupleScheme<TLlamaNMNotificationRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLlamaNMNotificationRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.version.getValue());
      struct.nm_handle.write(oprot);
      struct.node_capacity.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetPreempted_rm_resource_ids()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPreempted_rm_resource_ids()) {
        {
          oprot.writeI32(struct.preempted_rm_resource_ids.size());
          for (String _iter132 : struct.preempted_rm_resource_ids)
          {
            oprot.writeString(_iter132);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLlamaNMNotificationRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.version = TLlamaServiceVersion.findByValue(iprot.readI32());
      struct.setVersionIsSet(true);
      struct.nm_handle = new TUniqueId();
      struct.nm_handle.read(iprot);
      struct.setNm_handleIsSet(true);
      struct.node_capacity = new TNodeCapacity();
      struct.node_capacity.read(iprot);
      struct.setNode_capacityIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list133 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.preempted_rm_resource_ids = new ArrayList<String>(_list133.size);
          for (int _i134 = 0; _i134 < _list133.size; ++_i134)
          {
            String _elem135; // required
            _elem135 = iprot.readString();
            struct.preempted_rm_resource_ids.add(_elem135);
          }
        }
        struct.setPreempted_rm_resource_idsIsSet(true);
      }
    }
  }

}
