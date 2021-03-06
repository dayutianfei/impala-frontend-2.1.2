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

public class TResetMetadataRequest implements org.apache.thrift.TBase<TResetMetadataRequest, TResetMetadataRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TResetMetadataRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField IS_REFRESH_FIELD_DESC = new org.apache.thrift.protocol.TField("is_refresh", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TResetMetadataRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TResetMetadataRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see CatalogServiceVersion
   */
  public CatalogServiceVersion protocol_version; // required
  public TCatalogServiceRequestHeader header; // optional
  public boolean is_refresh; // required
  public com.cloudera.impala.thrift.TTableName table_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see CatalogServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    HEADER((short)4, "header"),
    IS_REFRESH((short)2, "is_refresh"),
    TABLE_NAME((short)3, "table_name");

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
        case 4: // HEADER
          return HEADER;
        case 2: // IS_REFRESH
          return IS_REFRESH;
        case 3: // TABLE_NAME
          return TABLE_NAME;
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
  private static final int __IS_REFRESH_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.HEADER,_Fields.TABLE_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, CatalogServiceVersion.class)));
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TCatalogServiceRequestHeader.class)));
    tmpMap.put(_Fields.IS_REFRESH, new org.apache.thrift.meta_data.FieldMetaData("is_refresh", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TTableName.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TResetMetadataRequest.class, metaDataMap);
  }

  public TResetMetadataRequest() {
    this.protocol_version = com.cloudera.impala.thrift.CatalogServiceVersion.V1;

  }

  public TResetMetadataRequest(
    CatalogServiceVersion protocol_version,
    boolean is_refresh)
  {
    this();
    this.protocol_version = protocol_version;
    this.is_refresh = is_refresh;
    setIs_refreshIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TResetMetadataRequest(TResetMetadataRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetProtocol_version()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetHeader()) {
      this.header = new TCatalogServiceRequestHeader(other.header);
    }
    this.is_refresh = other.is_refresh;
    if (other.isSetTable_name()) {
      this.table_name = new com.cloudera.impala.thrift.TTableName(other.table_name);
    }
  }

  public TResetMetadataRequest deepCopy() {
    return new TResetMetadataRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = com.cloudera.impala.thrift.CatalogServiceVersion.V1;

    this.header = null;
    setIs_refreshIsSet(false);
    this.is_refresh = false;
    this.table_name = null;
  }

  /**
   * 
   * @see CatalogServiceVersion
   */
  public CatalogServiceVersion getProtocol_version() {
    return this.protocol_version;
  }

  /**
   * 
   * @see CatalogServiceVersion
   */
  public TResetMetadataRequest setProtocol_version(CatalogServiceVersion protocol_version) {
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

  public TCatalogServiceRequestHeader getHeader() {
    return this.header;
  }

  public TResetMetadataRequest setHeader(TCatalogServiceRequestHeader header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public boolean isIs_refresh() {
    return this.is_refresh;
  }

  public TResetMetadataRequest setIs_refresh(boolean is_refresh) {
    this.is_refresh = is_refresh;
    setIs_refreshIsSet(true);
    return this;
  }

  public void unsetIs_refresh() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_REFRESH_ISSET_ID);
  }

  /** Returns true if field is_refresh is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_refresh() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_REFRESH_ISSET_ID);
  }

  public void setIs_refreshIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_REFRESH_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TTableName getTable_name() {
    return this.table_name;
  }

  public TResetMetadataRequest setTable_name(com.cloudera.impala.thrift.TTableName table_name) {
    this.table_name = table_name;
    return this;
  }

  public void unsetTable_name() {
    this.table_name = null;
  }

  /** Returns true if field table_name is set (has been assigned a value) and false otherwise */
  public boolean isSetTable_name() {
    return this.table_name != null;
  }

  public void setTable_nameIsSet(boolean value) {
    if (!value) {
      this.table_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((CatalogServiceVersion)value);
      }
      break;

    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((TCatalogServiceRequestHeader)value);
      }
      break;

    case IS_REFRESH:
      if (value == null) {
        unsetIs_refresh();
      } else {
        setIs_refresh((Boolean)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((com.cloudera.impala.thrift.TTableName)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case HEADER:
      return getHeader();

    case IS_REFRESH:
      return Boolean.valueOf(isIs_refresh());

    case TABLE_NAME:
      return getTable_name();

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
    case HEADER:
      return isSetHeader();
    case IS_REFRESH:
      return isSetIs_refresh();
    case TABLE_NAME:
      return isSetTable_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TResetMetadataRequest)
      return this.equals((TResetMetadataRequest)that);
    return false;
  }

  public boolean equals(TResetMetadataRequest that) {
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

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_is_refresh = true;
    boolean that_present_is_refresh = true;
    if (this_present_is_refresh || that_present_is_refresh) {
      if (!(this_present_is_refresh && that_present_is_refresh))
        return false;
      if (this.is_refresh != that.is_refresh)
        return false;
    }

    boolean this_present_table_name = true && this.isSetTable_name();
    boolean that_present_table_name = true && that.isSetTable_name();
    if (this_present_table_name || that_present_table_name) {
      if (!(this_present_table_name && that_present_table_name))
        return false;
      if (!this.table_name.equals(that.table_name))
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

    boolean present_header = true && (isSetHeader());
    builder.append(present_header);
    if (present_header)
      builder.append(header);

    boolean present_is_refresh = true;
    builder.append(present_is_refresh);
    if (present_is_refresh)
      builder.append(is_refresh);

    boolean present_table_name = true && (isSetTable_name());
    builder.append(present_table_name);
    if (present_table_name)
      builder.append(table_name);

    return builder.toHashCode();
  }

  public int compareTo(TResetMetadataRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TResetMetadataRequest typedOther = (TResetMetadataRequest)other;

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
    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(typedOther.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, typedOther.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_refresh()).compareTo(typedOther.isSetIs_refresh());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_refresh()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_refresh, typedOther.is_refresh);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTable_name()).compareTo(typedOther.isSetTable_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table_name, typedOther.table_name);
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
    StringBuilder sb = new StringBuilder("TResetMetadataRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (isSetHeader()) {
      if (!first) sb.append(", ");
      sb.append("header:");
      if (this.header == null) {
        sb.append("null");
      } else {
        sb.append(this.header);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("is_refresh:");
    sb.append(this.is_refresh);
    first = false;
    if (isSetTable_name()) {
      if (!first) sb.append(", ");
      sb.append("table_name:");
      if (this.table_name == null) {
        sb.append("null");
      } else {
        sb.append(this.table_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'is_refresh' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (header != null) {
      header.validate();
    }
    if (table_name != null) {
      table_name.validate();
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

  private static class TResetMetadataRequestStandardSchemeFactory implements SchemeFactory {
    public TResetMetadataRequestStandardScheme getScheme() {
      return new TResetMetadataRequestStandardScheme();
    }
  }

  private static class TResetMetadataRequestStandardScheme extends StandardScheme<TResetMetadataRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TResetMetadataRequest struct) throws org.apache.thrift.TException {
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
              struct.protocol_version = CatalogServiceVersion.findByValue(iprot.readI32());
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.header = new TCatalogServiceRequestHeader();
              struct.header.read(iprot);
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_REFRESH
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_refresh = iprot.readBool();
              struct.setIs_refreshIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.table_name = new com.cloudera.impala.thrift.TTableName();
              struct.table_name.read(iprot);
              struct.setTable_nameIsSet(true);
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
      if (!struct.isSetIs_refresh()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_refresh' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TResetMetadataRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_REFRESH_FIELD_DESC);
      oprot.writeBool(struct.is_refresh);
      oprot.writeFieldEnd();
      if (struct.table_name != null) {
        if (struct.isSetTable_name()) {
          oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
          struct.table_name.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.header != null) {
        if (struct.isSetHeader()) {
          oprot.writeFieldBegin(HEADER_FIELD_DESC);
          struct.header.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TResetMetadataRequestTupleSchemeFactory implements SchemeFactory {
    public TResetMetadataRequestTupleScheme getScheme() {
      return new TResetMetadataRequestTupleScheme();
    }
  }

  private static class TResetMetadataRequestTupleScheme extends TupleScheme<TResetMetadataRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TResetMetadataRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      oprot.writeBool(struct.is_refresh);
      BitSet optionals = new BitSet();
      if (struct.isSetHeader()) {
        optionals.set(0);
      }
      if (struct.isSetTable_name()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetHeader()) {
        struct.header.write(oprot);
      }
      if (struct.isSetTable_name()) {
        struct.table_name.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TResetMetadataRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = CatalogServiceVersion.findByValue(iprot.readI32());
      struct.setProtocol_versionIsSet(true);
      struct.is_refresh = iprot.readBool();
      struct.setIs_refreshIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.header = new TCatalogServiceRequestHeader();
        struct.header.read(iprot);
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(1)) {
        struct.table_name = new com.cloudera.impala.thrift.TTableName();
        struct.table_name.read(iprot);
        struct.setTable_nameIsSet(true);
      }
    }
  }

}

