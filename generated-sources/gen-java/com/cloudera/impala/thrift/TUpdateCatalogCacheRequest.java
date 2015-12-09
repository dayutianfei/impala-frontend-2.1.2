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

public class TUpdateCatalogCacheRequest implements org.apache.thrift.TBase<TUpdateCatalogCacheRequest, TUpdateCatalogCacheRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateCatalogCacheRequest");

  private static final org.apache.thrift.protocol.TField IS_DELTA_FIELD_DESC = new org.apache.thrift.protocol.TField("is_delta", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField CATALOG_SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_service_id", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField UPDATED_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("updated_objects", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField REMOVED_OBJECTS_FIELD_DESC = new org.apache.thrift.protocol.TField("removed_objects", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateCatalogCacheRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateCatalogCacheRequestTupleSchemeFactory());
  }

  public boolean is_delta; // required
  public com.cloudera.impala.thrift.TUniqueId catalog_service_id; // required
  public List<com.cloudera.impala.thrift.TCatalogObject> updated_objects; // required
  public List<com.cloudera.impala.thrift.TCatalogObject> removed_objects; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_DELTA((short)1, "is_delta"),
    CATALOG_SERVICE_ID((short)2, "catalog_service_id"),
    UPDATED_OBJECTS((short)3, "updated_objects"),
    REMOVED_OBJECTS((short)4, "removed_objects");

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
        case 1: // IS_DELTA
          return IS_DELTA;
        case 2: // CATALOG_SERVICE_ID
          return CATALOG_SERVICE_ID;
        case 3: // UPDATED_OBJECTS
          return UPDATED_OBJECTS;
        case 4: // REMOVED_OBJECTS
          return REMOVED_OBJECTS;
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
  private static final int __IS_DELTA_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_DELTA, new org.apache.thrift.meta_data.FieldMetaData("is_delta", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CATALOG_SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("catalog_service_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    tmpMap.put(_Fields.UPDATED_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("updated_objects", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TCatalogObject.class))));
    tmpMap.put(_Fields.REMOVED_OBJECTS, new org.apache.thrift.meta_data.FieldMetaData("removed_objects", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TCatalogObject.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateCatalogCacheRequest.class, metaDataMap);
  }

  public TUpdateCatalogCacheRequest() {
  }

  public TUpdateCatalogCacheRequest(
    boolean is_delta,
    com.cloudera.impala.thrift.TUniqueId catalog_service_id,
    List<com.cloudera.impala.thrift.TCatalogObject> updated_objects,
    List<com.cloudera.impala.thrift.TCatalogObject> removed_objects)
  {
    this();
    this.is_delta = is_delta;
    setIs_deltaIsSet(true);
    this.catalog_service_id = catalog_service_id;
    this.updated_objects = updated_objects;
    this.removed_objects = removed_objects;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateCatalogCacheRequest(TUpdateCatalogCacheRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_delta = other.is_delta;
    if (other.isSetCatalog_service_id()) {
      this.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId(other.catalog_service_id);
    }
    if (other.isSetUpdated_objects()) {
      List<com.cloudera.impala.thrift.TCatalogObject> __this__updated_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>();
      for (com.cloudera.impala.thrift.TCatalogObject other_element : other.updated_objects) {
        __this__updated_objects.add(new com.cloudera.impala.thrift.TCatalogObject(other_element));
      }
      this.updated_objects = __this__updated_objects;
    }
    if (other.isSetRemoved_objects()) {
      List<com.cloudera.impala.thrift.TCatalogObject> __this__removed_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>();
      for (com.cloudera.impala.thrift.TCatalogObject other_element : other.removed_objects) {
        __this__removed_objects.add(new com.cloudera.impala.thrift.TCatalogObject(other_element));
      }
      this.removed_objects = __this__removed_objects;
    }
  }

  public TUpdateCatalogCacheRequest deepCopy() {
    return new TUpdateCatalogCacheRequest(this);
  }

  @Override
  public void clear() {
    setIs_deltaIsSet(false);
    this.is_delta = false;
    this.catalog_service_id = null;
    this.updated_objects = null;
    this.removed_objects = null;
  }

  public boolean isIs_delta() {
    return this.is_delta;
  }

  public TUpdateCatalogCacheRequest setIs_delta(boolean is_delta) {
    this.is_delta = is_delta;
    setIs_deltaIsSet(true);
    return this;
  }

  public void unsetIs_delta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_DELTA_ISSET_ID);
  }

  /** Returns true if field is_delta is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_delta() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_DELTA_ISSET_ID);
  }

  public void setIs_deltaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_DELTA_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TUniqueId getCatalog_service_id() {
    return this.catalog_service_id;
  }

  public TUpdateCatalogCacheRequest setCatalog_service_id(com.cloudera.impala.thrift.TUniqueId catalog_service_id) {
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

  public int getUpdated_objectsSize() {
    return (this.updated_objects == null) ? 0 : this.updated_objects.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TCatalogObject> getUpdated_objectsIterator() {
    return (this.updated_objects == null) ? null : this.updated_objects.iterator();
  }

  public void addToUpdated_objects(com.cloudera.impala.thrift.TCatalogObject elem) {
    if (this.updated_objects == null) {
      this.updated_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>();
    }
    this.updated_objects.add(elem);
  }

  public List<com.cloudera.impala.thrift.TCatalogObject> getUpdated_objects() {
    return this.updated_objects;
  }

  public TUpdateCatalogCacheRequest setUpdated_objects(List<com.cloudera.impala.thrift.TCatalogObject> updated_objects) {
    this.updated_objects = updated_objects;
    return this;
  }

  public void unsetUpdated_objects() {
    this.updated_objects = null;
  }

  /** Returns true if field updated_objects is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdated_objects() {
    return this.updated_objects != null;
  }

  public void setUpdated_objectsIsSet(boolean value) {
    if (!value) {
      this.updated_objects = null;
    }
  }

  public int getRemoved_objectsSize() {
    return (this.removed_objects == null) ? 0 : this.removed_objects.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TCatalogObject> getRemoved_objectsIterator() {
    return (this.removed_objects == null) ? null : this.removed_objects.iterator();
  }

  public void addToRemoved_objects(com.cloudera.impala.thrift.TCatalogObject elem) {
    if (this.removed_objects == null) {
      this.removed_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>();
    }
    this.removed_objects.add(elem);
  }

  public List<com.cloudera.impala.thrift.TCatalogObject> getRemoved_objects() {
    return this.removed_objects;
  }

  public TUpdateCatalogCacheRequest setRemoved_objects(List<com.cloudera.impala.thrift.TCatalogObject> removed_objects) {
    this.removed_objects = removed_objects;
    return this;
  }

  public void unsetRemoved_objects() {
    this.removed_objects = null;
  }

  /** Returns true if field removed_objects is set (has been assigned a value) and false otherwise */
  public boolean isSetRemoved_objects() {
    return this.removed_objects != null;
  }

  public void setRemoved_objectsIsSet(boolean value) {
    if (!value) {
      this.removed_objects = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_DELTA:
      if (value == null) {
        unsetIs_delta();
      } else {
        setIs_delta((Boolean)value);
      }
      break;

    case CATALOG_SERVICE_ID:
      if (value == null) {
        unsetCatalog_service_id();
      } else {
        setCatalog_service_id((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    case UPDATED_OBJECTS:
      if (value == null) {
        unsetUpdated_objects();
      } else {
        setUpdated_objects((List<com.cloudera.impala.thrift.TCatalogObject>)value);
      }
      break;

    case REMOVED_OBJECTS:
      if (value == null) {
        unsetRemoved_objects();
      } else {
        setRemoved_objects((List<com.cloudera.impala.thrift.TCatalogObject>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_DELTA:
      return Boolean.valueOf(isIs_delta());

    case CATALOG_SERVICE_ID:
      return getCatalog_service_id();

    case UPDATED_OBJECTS:
      return getUpdated_objects();

    case REMOVED_OBJECTS:
      return getRemoved_objects();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_DELTA:
      return isSetIs_delta();
    case CATALOG_SERVICE_ID:
      return isSetCatalog_service_id();
    case UPDATED_OBJECTS:
      return isSetUpdated_objects();
    case REMOVED_OBJECTS:
      return isSetRemoved_objects();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateCatalogCacheRequest)
      return this.equals((TUpdateCatalogCacheRequest)that);
    return false;
  }

  public boolean equals(TUpdateCatalogCacheRequest that) {
    if (that == null)
      return false;

    boolean this_present_is_delta = true;
    boolean that_present_is_delta = true;
    if (this_present_is_delta || that_present_is_delta) {
      if (!(this_present_is_delta && that_present_is_delta))
        return false;
      if (this.is_delta != that.is_delta)
        return false;
    }

    boolean this_present_catalog_service_id = true && this.isSetCatalog_service_id();
    boolean that_present_catalog_service_id = true && that.isSetCatalog_service_id();
    if (this_present_catalog_service_id || that_present_catalog_service_id) {
      if (!(this_present_catalog_service_id && that_present_catalog_service_id))
        return false;
      if (!this.catalog_service_id.equals(that.catalog_service_id))
        return false;
    }

    boolean this_present_updated_objects = true && this.isSetUpdated_objects();
    boolean that_present_updated_objects = true && that.isSetUpdated_objects();
    if (this_present_updated_objects || that_present_updated_objects) {
      if (!(this_present_updated_objects && that_present_updated_objects))
        return false;
      if (!this.updated_objects.equals(that.updated_objects))
        return false;
    }

    boolean this_present_removed_objects = true && this.isSetRemoved_objects();
    boolean that_present_removed_objects = true && that.isSetRemoved_objects();
    if (this_present_removed_objects || that_present_removed_objects) {
      if (!(this_present_removed_objects && that_present_removed_objects))
        return false;
      if (!this.removed_objects.equals(that.removed_objects))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_is_delta = true;
    builder.append(present_is_delta);
    if (present_is_delta)
      builder.append(is_delta);

    boolean present_catalog_service_id = true && (isSetCatalog_service_id());
    builder.append(present_catalog_service_id);
    if (present_catalog_service_id)
      builder.append(catalog_service_id);

    boolean present_updated_objects = true && (isSetUpdated_objects());
    builder.append(present_updated_objects);
    if (present_updated_objects)
      builder.append(updated_objects);

    boolean present_removed_objects = true && (isSetRemoved_objects());
    builder.append(present_removed_objects);
    if (present_removed_objects)
      builder.append(removed_objects);

    return builder.toHashCode();
  }

  public int compareTo(TUpdateCatalogCacheRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TUpdateCatalogCacheRequest typedOther = (TUpdateCatalogCacheRequest)other;

    lastComparison = Boolean.valueOf(isSetIs_delta()).compareTo(typedOther.isSetIs_delta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_delta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_delta, typedOther.is_delta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetUpdated_objects()).compareTo(typedOther.isSetUpdated_objects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdated_objects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updated_objects, typedOther.updated_objects);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRemoved_objects()).compareTo(typedOther.isSetRemoved_objects());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRemoved_objects()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.removed_objects, typedOther.removed_objects);
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
    StringBuilder sb = new StringBuilder("TUpdateCatalogCacheRequest(");
    boolean first = true;

    sb.append("is_delta:");
    sb.append(this.is_delta);
    first = false;
    if (!first) sb.append(", ");
    sb.append("catalog_service_id:");
    if (this.catalog_service_id == null) {
      sb.append("null");
    } else {
      sb.append(this.catalog_service_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updated_objects:");
    if (this.updated_objects == null) {
      sb.append("null");
    } else {
      sb.append(this.updated_objects);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("removed_objects:");
    if (this.removed_objects == null) {
      sb.append("null");
    } else {
      sb.append(this.removed_objects);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_delta' because it's a primitive and you chose the non-beans generator.
    if (catalog_service_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catalog_service_id' was not present! Struct: " + toString());
    }
    if (updated_objects == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'updated_objects' was not present! Struct: " + toString());
    }
    if (removed_objects == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'removed_objects' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (catalog_service_id != null) {
      catalog_service_id.validate();
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

  private static class TUpdateCatalogCacheRequestStandardSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheRequestStandardScheme getScheme() {
      return new TUpdateCatalogCacheRequestStandardScheme();
    }
  }

  private static class TUpdateCatalogCacheRequestStandardScheme extends StandardScheme<TUpdateCatalogCacheRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_DELTA
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_delta = iprot.readBool();
              struct.setIs_deltaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CATALOG_SERVICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId();
              struct.catalog_service_id.read(iprot);
              struct.setCatalog_service_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // UPDATED_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list170 = iprot.readListBegin();
                struct.updated_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>(_list170.size);
                for (int _i171 = 0; _i171 < _list170.size; ++_i171)
                {
                  com.cloudera.impala.thrift.TCatalogObject _elem172; // required
                  _elem172 = new com.cloudera.impala.thrift.TCatalogObject();
                  _elem172.read(iprot);
                  struct.updated_objects.add(_elem172);
                }
                iprot.readListEnd();
              }
              struct.setUpdated_objectsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REMOVED_OBJECTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list173 = iprot.readListBegin();
                struct.removed_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>(_list173.size);
                for (int _i174 = 0; _i174 < _list173.size; ++_i174)
                {
                  com.cloudera.impala.thrift.TCatalogObject _elem175; // required
                  _elem175 = new com.cloudera.impala.thrift.TCatalogObject();
                  _elem175.read(iprot);
                  struct.removed_objects.add(_elem175);
                }
                iprot.readListEnd();
              }
              struct.setRemoved_objectsIsSet(true);
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
      if (!struct.isSetIs_delta()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_delta' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_DELTA_FIELD_DESC);
      oprot.writeBool(struct.is_delta);
      oprot.writeFieldEnd();
      if (struct.catalog_service_id != null) {
        oprot.writeFieldBegin(CATALOG_SERVICE_ID_FIELD_DESC);
        struct.catalog_service_id.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.updated_objects != null) {
        oprot.writeFieldBegin(UPDATED_OBJECTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.updated_objects.size()));
          for (com.cloudera.impala.thrift.TCatalogObject _iter176 : struct.updated_objects)
          {
            _iter176.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.removed_objects != null) {
        oprot.writeFieldBegin(REMOVED_OBJECTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.removed_objects.size()));
          for (com.cloudera.impala.thrift.TCatalogObject _iter177 : struct.removed_objects)
          {
            _iter177.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateCatalogCacheRequestTupleSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheRequestTupleScheme getScheme() {
      return new TUpdateCatalogCacheRequestTupleScheme();
    }
  }

  private static class TUpdateCatalogCacheRequestTupleScheme extends TupleScheme<TUpdateCatalogCacheRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_delta);
      struct.catalog_service_id.write(oprot);
      {
        oprot.writeI32(struct.updated_objects.size());
        for (com.cloudera.impala.thrift.TCatalogObject _iter178 : struct.updated_objects)
        {
          _iter178.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.removed_objects.size());
        for (com.cloudera.impala.thrift.TCatalogObject _iter179 : struct.removed_objects)
        {
          _iter179.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_delta = iprot.readBool();
      struct.setIs_deltaIsSet(true);
      struct.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId();
      struct.catalog_service_id.read(iprot);
      struct.setCatalog_service_idIsSet(true);
      {
        org.apache.thrift.protocol.TList _list180 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.updated_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>(_list180.size);
        for (int _i181 = 0; _i181 < _list180.size; ++_i181)
        {
          com.cloudera.impala.thrift.TCatalogObject _elem182; // required
          _elem182 = new com.cloudera.impala.thrift.TCatalogObject();
          _elem182.read(iprot);
          struct.updated_objects.add(_elem182);
        }
      }
      struct.setUpdated_objectsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list183 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.removed_objects = new ArrayList<com.cloudera.impala.thrift.TCatalogObject>(_list183.size);
        for (int _i184 = 0; _i184 < _list183.size; ++_i184)
        {
          com.cloudera.impala.thrift.TCatalogObject _elem185; // required
          _elem185 = new com.cloudera.impala.thrift.TCatalogObject();
          _elem185.read(iprot);
          struct.removed_objects.add(_elem185);
        }
      }
      struct.setRemoved_objectsIsSet(true);
    }
  }

}
