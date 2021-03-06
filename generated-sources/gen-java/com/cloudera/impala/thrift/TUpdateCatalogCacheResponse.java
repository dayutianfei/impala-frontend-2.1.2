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

public class TUpdateCatalogCacheResponse implements org.apache.thrift.TBase<TUpdateCatalogCacheResponse, TUpdateCatalogCacheResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TUpdateCatalogCacheResponse");

  private static final org.apache.thrift.protocol.TField CATALOG_SERVICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("catalog_service_id", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TUpdateCatalogCacheResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TUpdateCatalogCacheResponseTupleSchemeFactory());
  }

  public com.cloudera.impala.thrift.TUniqueId catalog_service_id; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATALOG_SERVICE_ID((short)1, "catalog_service_id");

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
    tmpMap.put(_Fields.CATALOG_SERVICE_ID, new org.apache.thrift.meta_data.FieldMetaData("catalog_service_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TUniqueId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TUpdateCatalogCacheResponse.class, metaDataMap);
  }

  public TUpdateCatalogCacheResponse() {
  }

  public TUpdateCatalogCacheResponse(
    com.cloudera.impala.thrift.TUniqueId catalog_service_id)
  {
    this();
    this.catalog_service_id = catalog_service_id;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TUpdateCatalogCacheResponse(TUpdateCatalogCacheResponse other) {
    if (other.isSetCatalog_service_id()) {
      this.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId(other.catalog_service_id);
    }
  }

  public TUpdateCatalogCacheResponse deepCopy() {
    return new TUpdateCatalogCacheResponse(this);
  }

  @Override
  public void clear() {
    this.catalog_service_id = null;
  }

  public com.cloudera.impala.thrift.TUniqueId getCatalog_service_id() {
    return this.catalog_service_id;
  }

  public TUpdateCatalogCacheResponse setCatalog_service_id(com.cloudera.impala.thrift.TUniqueId catalog_service_id) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      if (value == null) {
        unsetCatalog_service_id();
      } else {
        setCatalog_service_id((com.cloudera.impala.thrift.TUniqueId)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATALOG_SERVICE_ID:
      return getCatalog_service_id();

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
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TUpdateCatalogCacheResponse)
      return this.equals((TUpdateCatalogCacheResponse)that);
    return false;
  }

  public boolean equals(TUpdateCatalogCacheResponse that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_catalog_service_id = true && (isSetCatalog_service_id());
    builder.append(present_catalog_service_id);
    if (present_catalog_service_id)
      builder.append(catalog_service_id);

    return builder.toHashCode();
  }

  public int compareTo(TUpdateCatalogCacheResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TUpdateCatalogCacheResponse typedOther = (TUpdateCatalogCacheResponse)other;

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
    StringBuilder sb = new StringBuilder("TUpdateCatalogCacheResponse(");
    boolean first = true;

    sb.append("catalog_service_id:");
    if (this.catalog_service_id == null) {
      sb.append("null");
    } else {
      sb.append(this.catalog_service_id);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (catalog_service_id == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'catalog_service_id' was not present! Struct: " + toString());
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TUpdateCatalogCacheResponseStandardSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheResponseStandardScheme getScheme() {
      return new TUpdateCatalogCacheResponseStandardScheme();
    }
  }

  private static class TUpdateCatalogCacheResponseStandardScheme extends StandardScheme<TUpdateCatalogCacheResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TUpdateCatalogCacheResponse struct) throws org.apache.thrift.TException {
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
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TUpdateCatalogCacheResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.catalog_service_id != null) {
        oprot.writeFieldBegin(CATALOG_SERVICE_ID_FIELD_DESC);
        struct.catalog_service_id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TUpdateCatalogCacheResponseTupleSchemeFactory implements SchemeFactory {
    public TUpdateCatalogCacheResponseTupleScheme getScheme() {
      return new TUpdateCatalogCacheResponseTupleScheme();
    }
  }

  private static class TUpdateCatalogCacheResponseTupleScheme extends TupleScheme<TUpdateCatalogCacheResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.catalog_service_id.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TUpdateCatalogCacheResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.catalog_service_id = new com.cloudera.impala.thrift.TUniqueId();
      struct.catalog_service_id.read(iprot);
      struct.setCatalog_service_idIsSet(true);
    }
  }

}

