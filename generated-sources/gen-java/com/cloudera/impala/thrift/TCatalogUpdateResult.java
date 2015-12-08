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

public class TCatalogUpdateResult implements org.apache.thrift.TBase<TCatalogUpdateResult, TCatalogUpdateResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCatalogUpdateResult");

  private static final org.apache.thrift.protocol.TField CATALOG_SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_service_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField UPDATED_CATALOG_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_catalog_object", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField REMOVED_CATALOG_OBJECT_FIELD_DESC = new org.apache.thrift.protocol.TField("removed_catalog_object", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCatalogUpdateResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCatalogUpdateResultTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TUniqueId catalog_service_id; // required
  public long version; // required
  public com.cloudera.impala.thrift.TStatus status; // required
  public com.cloudera.impala.thrift.TCatalogObject updated_catalog_object; // optional
  public com.cloudera.impala.thrift.TCatalogObject removed_catalog_object; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATALOG_SERVICE_ID((short)1, "catalog_service_id"),
    VERSION((short)2, "version"),
    STATUS((short)3, "status"),
    UPDATED_CATALOG_OBJECT((short)4, "updated_catalog_object"),
    REMOVED_CATALOG_OBJECT((short)5, "removed_catalog_object");

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
        case 1: // CATALOG_SERVICE_ID
          return CATALOG_SERVICE_ID;
        case 2: // VERSION
          return VERSION;
        case 3: // STATUS
          return STATUS;
        case 4: // UPDATED_CATALOG_OBJECT
          return UPDATED_CATALOG_OBJECT;
        case 5: // REMOVED_CATALOG_OBJECT
          return REMOVED_CATALOG_OBJECT;
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
  private static final int __VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.UPDATED_CATALOG_OBJECT,_Fields.REMOVED_CATALOG_OBJECT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATALOG_SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("catalog_service_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TStatus.class)));
    tmpMap.put(_Fields.UPDATED_CATALOG_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("updated_catalog_object", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TCatalogObject.class)));
    tmpMap.put(_Fields.REMOVED_CATALOG_OBJECT, new org.apache.thrift.meta_data.FieldMetaData("removed_catalog_object", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TCatalogObject.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCatalogUpdateResult.class, metaDataMap);
  }

  public TCatalogUpdateResult() {
  }

  public TCatalogUpdateResult(
    com.cloudera.impala.thrift.TUniqueId catalog_service_id,
    long version,
    com.cloudera.impala.thrift.TStatus status)
  {
    this();
    this.catalog_service_id = catalog_service_id;
    this.version = version;
    setVersionIsSet(true);
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCatalogUpdateResult(TCatalogUpdateResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCatalog_service_id()) {
      this.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId(other.catalog_service_id);
    }
    this.version = other.version;
    if (other.isSetStatus()) {
      this.status = new com.cloudera.impala.thrift.TStatus(other.status);
    }
    if (other.isSetUpdated_catalog_object()) {
      this.updated_catalog_object = new com.cloudera.impala.thrift.TCatalogObject(other.updated_catalog_object);
    }
    if (other.isSetRemoved_catalog_object()) {
      this.removed_catalog_object = new com.cloudera.impala.thrift.TCatalogObject(other.removed_catalog_object);
    }
  }

  public TCatalogUpdateResult deepCopy() {
    return new TCatalogUpdateResult(this);
  }

  @Override
  public void clear() {
    this.catalog_service_id = null;
    setVersionIsSet(false);
    this.version = 0;
    this.status = null;
    this.updated_catalog_object = null;
    this.removed_catalog_object = null;
  }

  public com.cloudera.impala.thrift.TUniqueId getCatalog_service_id() {
    return this.catalog_service_id;
  }

  public TCatalogUpdateResult setCatalog_service_id(com.cloudera.impala.thrift.TUniqueId catalog_service_id) {
    this.catalog_service_id = catalog_service_id;
    return this;
  }

  public void unsetCatalog_service_id() {
    this.catalog_service_id = null;
  }

  /** Returns true if field catalog_service_id is set (has been assigned a value) and false otherwise */
  public boolean isSetCatalog_service_id() {
    return this.catalog_service_id != null;
  }

  public void setCatalog_service_idIsSet(boolean value) {
    if (!value) {
      this.catalog_service_id = null;
    }
  }

  public long getVersion() {
    return this.version;
  }

  public TCatalogUpdateResult setVersion(long version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TStatus getStatus() {
    return this.status;
  }

  public TCatalogUpdateResult setStatus(com.cloudera.impala.thrift.TStatus status) {
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

  public com.cloudera.impala.thrift.TCatalogObject getUpdated_catalog_object() {
    return this.updated_catalog_object;
  }

  public TCatalogUpdateResult setUpdated_catalog_object(com.cloudera.impala.thrift.TCatalogObject updated_catalog_object) {
    this.updated_catalog_object = updated_catalog_object;
    return this;
  }

  public void unsetUpdated_catalog_object() {
    this.updated_catalog_object = null;
  }

  /** Returns true if field updated_catalog_object is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_catalog_object() {
    return this.updated_catalog_object != null;
  }

  public void setUpdated_catalog_objectIsSet(boolean value) {
    if (!value) {
      this.updated_catalog_object = null;
    }
  }

  public com.cloudera.impala.thrift.TCatalogObject getRemoved_catalog_object() {
    return this.removed_catalog_object;
  }

  public TCatalogUpdateResult setRemoved_catalog_object(com.cloudera.impala.thrift.TCatalogObject removed_catalog_object) {
    this.removed_catalog_object = removed_catalog_object;
    return this;
  }

  public void unsetRemoved_catalog_object() {
    this.removed_catalog_object = null;
  }

  /** Returns true if field removed_catalog_object is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoved_catalog_object() {
    return this.removed_catalog_object != null;
  }

  public void setRemoved_catalog_objectIsSet(boolean value) {
    if (!value) {
      this.removed_catalog_object = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      if (value == null) {
        unsetCatalog_service_id();
      } else {
        setCatalog_service_id((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((com.cloudera.impala.thrift.TStatus)value);
      }
      break;

    case UPDATED_CATALOG_OBJECT:
      if (value == null) {
        unsetUpdated_catalog_object();
      } else {
        setUpdated_catalog_object((com.cloudera.impala.thrift.TCatalogObject)value);
      }
      break;

    case REMOVED_CATALOG_OBJECT:
      if (value == null) {
        unsetRemoved_catalog_object();
      } else {
        setRemoved_catalog_object((com.cloudera.impala.thrift.TCatalogObject)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      return getCatalog_service_id();

    case VERSION:
      return Long.valueOf(getVersion());

    case STATUS:
      return getStatus();

    case UPDATED_CATALOG_OBJECT:
      return getUpdated_catalog_object();

    case REMOVED_CATALOG_OBJECT:
      return getRemoved_catalog_object();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATALOG_SERVICE_ID:
      return isSetCatalog_service_id();
    case VERSION:
      return isSetVersion();
    case STATUS:
      return isSetStatus();
    case UPDATED_CATALOG_OBJECT:
      return isSetUpdated_catalog_object();
    case REMOVED_CATALOG_OBJECT:
      return isSetRemoved_catalog_object();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCatalogUpdateResult)
      return this.equals((TCatalogUpdateResult)that);
    return false;
  }

  public boolean equals(TCatalogUpdateResult that) {
    if (that == null)
      return false;

    boolean this_present_catalog_service_id = true && this.isSetCatalog_service_id();
    boolean that_present_catalog_service_id = true && that.isSetCatalog_service_id();
    if (this_present_catalog_service_id || that_present_catalog_service_id) {
      if (!(this_present_catalog_service_id && that_present_catalog_service_id))
        return false;
      if (!this.catalog_service_id.equals(that.catalog_service_id))
        return false;
    }

    boolean this_present_version = true;
    boolean that_present_version = true;
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_updated_catalog_object = true && this.isSetUpdated_catalog_object();
    boolean that_present_updated_catalog_object = true && that.isSetUpdated_catalog_object();
    if (this_present_updated_catalog_object || that_present_updated_catalog_object) {
      if (!(this_present_updated_catalog_object && that_present_updated_catalog_object))
        return false;
      if (!this.updated_catalog_object.equals(that.updated_catalog_object))
        return false;
    }

    boolean this_present_removed_catalog_object = true && this.isSetRemoved_catalog_object();
    boolean that_present_removed_catalog_object = true && that.isSetRemoved_catalog_object();
    if (this_present_removed_catalog_object || that_present_removed_catalog_object) {
      if (!(this_present_removed_catalog_object && that_present_removed_catalog_object))
        return false;
      if (!this.removed_catalog_object.equals(that.removed_catalog_object))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_catalog_service_id = true && (isSetCatalog_service_id());
    builder.append(present_catalog_service_id);
    if (present_catalog_service_id)
      builder.append(catalog_service_id);

    boolean present_version = true;
    builder.append(present_version);
    if (present_version)
      builder.append(version);

    boolean present_status = true && (isSetStatus());
    builder.append(present_status);
    if (present_status)
      builder.append(status);

    boolean present_updated_catalog_object = true && (isSetUpdated_catalog_object());
    builder.append(present_updated_catalog_object);
    if (present_updated_catalog_object)
      builder.append(updated_catalog_object);

    boolean present_removed_catalog_object = true && (isSetRemoved_catalog_object());
    builder.append(present_removed_catalog_object);
    if (present_removed_catalog_object)
      builder.append(removed_catalog_object);

    return builder.toHashCode();
  }

  public int compareTo(TCatalogUpdateResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TCatalogUpdateResult typedOther = (TCatalogUpdateResult)other;

    lastComparison = Boolean.valueOf(isSetCatalog_service_id()).compareTo(typedOther.isSetCatalog_service_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatalog_service_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catalog_service_id, typedOther.catalog_service_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetUpdated_catalog_object()).compareTo(typedOther.isSetUpdated_catalog_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_catalog_object()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_catalog_object, typedOther.updated_catalog_object);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemoved_catalog_object()).compareTo(typedOther.isSetRemoved_catalog_object());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoved_catalog_object()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removed_catalog_object, typedOther.removed_catalog_object);
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
    StringBuilder sb = new StringBuilder("TCatalogUpdateResult(");
    boolean first = true;

    sb.append("catalog_service_id:");
    if (this.catalog_service_id == null) {
      sb.append("null");
    } else {
      sb.append(this.catalog_service_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("version:");
    sb.append(this.version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetUpdated_catalog_object()) {
      if (!first) sb.append(", ");
      sb.append("updated_catalog_object:");
      if (this.updated_catalog_object == null) {
        sb.append("null");
      } else {
        sb.append(this.updated_catalog_object);
      }
      first = false;
    }
    if (isSetRemoved_catalog_object()) {
      if (!first) sb.append(", ");
      sb.append("removed_catalog_object:");
      if (this.removed_catalog_object == null) {
        sb.append("null");
      } else {
        sb.append(this.removed_catalog_object);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (catalog_service_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catalog_service_id' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'version' because it's a primitive and you chose the non-beans generator.
    if (status == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (catalog_service_id != null) {
      catalog_service_id.validate();
    }
    if (status != null) {
      status.validate();
    }
    if (updated_catalog_object != null) {
      updated_catalog_object.validate();
    }
    if (removed_catalog_object != null) {
      removed_catalog_object.validate();
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

  private static class TCatalogUpdateResultStandardSchemeFactory implements SchemeFactory {
    public TCatalogUpdateResultStandardScheme getScheme() {
      return new TCatalogUpdateResultStandardScheme();
    }
  }

  private static class TCatalogUpdateResultStandardScheme extends StandardScheme<TCatalogUpdateResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATALOG_SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId();
              struct.catalog_service_id.read(iprot);
              struct.setCatalog_service_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.version = iprot.readI64();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new com.cloudera.impala.thrift.TStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UPDATED_CATALOG_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.updated_catalog_object = new com.cloudera.impala.thrift.TCatalogObject();
              struct.updated_catalog_object.read(iprot);
              struct.setUpdated_catalog_objectIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REMOVED_CATALOG_OBJECT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.removed_catalog_object = new com.cloudera.impala.thrift.TCatalogObject();
              struct.removed_catalog_object.read(iprot);
              struct.setRemoved_catalog_objectIsSet(true);
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
      if (!struct.isSetVersion()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'version' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catalog_service_id != null) {
        oprot.writeFieldBegin(CATALOG_SERVICE_ID_FIELD_DESC);
        struct.catalog_service_id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI64(struct.version);
      oprot.writeFieldEnd();
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.updated_catalog_object != null) {
        if (struct.isSetUpdated_catalog_object()) {
          oprot.writeFieldBegin(UPDATED_CATALOG_OBJECT_FIELD_DESC);
          struct.updated_catalog_object.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.removed_catalog_object != null) {
        if (struct.isSetRemoved_catalog_object()) {
          oprot.writeFieldBegin(REMOVED_CATALOG_OBJECT_FIELD_DESC);
          struct.removed_catalog_object.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCatalogUpdateResultTupleSchemeFactory implements SchemeFactory {
    public TCatalogUpdateResultTupleScheme getScheme() {
      return new TCatalogUpdateResultTupleScheme();
    }
  }

  private static class TCatalogUpdateResultTupleScheme extends TupleScheme<TCatalogUpdateResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.catalog_service_id.write(oprot);
      oprot.writeI64(struct.version);
      struct.status.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetUpdated_catalog_object()) {
        optionals.set(0);
      }
      if (struct.isSetRemoved_catalog_object()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdated_catalog_object()) {
        struct.updated_catalog_object.write(oprot);
      }
      if (struct.isSetRemoved_catalog_object()) {
        struct.removed_catalog_object.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCatalogUpdateResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId();
      struct.catalog_service_id.read(iprot);
      struct.setCatalog_service_idIsSet(true);
      struct.version = iprot.readI64();
      struct.setVersionIsSet(true);
      struct.status = new com.cloudera.impala.thrift.TStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.updated_catalog_object = new com.cloudera.impala.thrift.TCatalogObject();
        struct.updated_catalog_object.read(iprot);
        struct.setUpdated_catalog_objectIsSet(true);
      }
      if (incoming.get(1)) {
        struct.removed_catalog_object = new com.cloudera.impala.thrift.TCatalogObject();
        struct.removed_catalog_object.read(iprot);
        struct.setRemoved_catalog_objectIsSet(true);
      }
    }
  }

}

