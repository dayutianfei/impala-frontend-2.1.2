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

public class TDataSource implements org.apache.thrift.TBase<TDataSource, TDataSource._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TDataSource");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HDFS_LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("hdfs_location", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CLASS_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("class_name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField API_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("api_version", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TDataSourceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TDataSourceTupleSchemeFactory());
  }

  public String name; // required
  public String hdfs_location; // required
  public String class_name; // required
  public String api_version; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    HDFS_LOCATION((short)2, "hdfs_location"),
    CLASS_NAME((short)3, "class_name"),
    API_VERSION((short)4, "api_version");

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
        case 1: // NAME
          return NAME;
        case 2: // HDFS_LOCATION
          return HDFS_LOCATION;
        case 3: // CLASS_NAME
          return CLASS_NAME;
        case 4: // API_VERSION
          return API_VERSION;
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
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HDFS_LOCATION, new org.apache.thrift.meta_data.FieldMetaData("hdfs_location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CLASS_NAME, new org.apache.thrift.meta_data.FieldMetaData("class_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.API_VERSION, new org.apache.thrift.meta_data.FieldMetaData("api_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TDataSource.class, metaDataMap);
  }

  public TDataSource() {
  }

  public TDataSource(
    String name,
    String hdfs_location,
    String class_name,
    String api_version)
  {
    this();
    this.name = name;
    this.hdfs_location = hdfs_location;
    this.class_name = class_name;
    this.api_version = api_version;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TDataSource(TDataSource other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetHdfs_location()) {
      this.hdfs_location = other.hdfs_location;
    }
    if (other.isSetClass_name()) {
      this.class_name = other.class_name;
    }
    if (other.isSetApi_version()) {
      this.api_version = other.api_version;
    }
  }

  public TDataSource deepCopy() {
    return new TDataSource(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.hdfs_location = null;
    this.class_name = null;
    this.api_version = null;
  }

  public String getName() {
    return this.name;
  }

  public TDataSource setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getHdfs_location() {
    return this.hdfs_location;
  }

  public TDataSource setHdfs_location(String hdfs_location) {
    this.hdfs_location = hdfs_location;
    return this;
  }

  public void unsetHdfs_location() {
    this.hdfs_location = null;
  }

  /** Returns true if field hdfs_location is set (has been assigned a value) and false otherwise */
  public boolean isSetHdfs_location() {
    return this.hdfs_location != null;
  }

  public void setHdfs_locationIsSet(boolean value) {
    if (!value) {
      this.hdfs_location = null;
    }
  }

  public String getClass_name() {
    return this.class_name;
  }

  public TDataSource setClass_name(String class_name) {
    this.class_name = class_name;
    return this;
  }

  public void unsetClass_name() {
    this.class_name = null;
  }

  /** Returns true if field class_name is set (has been assigned a value) and false otherwise */
  public boolean isSetClass_name() {
    return this.class_name != null;
  }

  public void setClass_nameIsSet(boolean value) {
    if (!value) {
      this.class_name = null;
    }
  }

  public String getApi_version() {
    return this.api_version;
  }

  public TDataSource setApi_version(String api_version) {
    this.api_version = api_version;
    return this;
  }

  public void unsetApi_version() {
    this.api_version = null;
  }

  /** Returns true if field api_version is set (has been assigned a value) and false otherwise */
  public boolean isSetApi_version() {
    return this.api_version != null;
  }

  public void setApi_versionIsSet(boolean value) {
    if (!value) {
      this.api_version = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case HDFS_LOCATION:
      if (value == null) {
        unsetHdfs_location();
      } else {
        setHdfs_location((String)value);
      }
      break;

    case CLASS_NAME:
      if (value == null) {
        unsetClass_name();
      } else {
        setClass_name((String)value);
      }
      break;

    case API_VERSION:
      if (value == null) {
        unsetApi_version();
      } else {
        setApi_version((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case HDFS_LOCATION:
      return getHdfs_location();

    case CLASS_NAME:
      return getClass_name();

    case API_VERSION:
      return getApi_version();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case HDFS_LOCATION:
      return isSetHdfs_location();
    case CLASS_NAME:
      return isSetClass_name();
    case API_VERSION:
      return isSetApi_version();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TDataSource)
      return this.equals((TDataSource)that);
    return false;
  }

  public boolean equals(TDataSource that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_hdfs_location = true && this.isSetHdfs_location();
    boolean that_present_hdfs_location = true && that.isSetHdfs_location();
    if (this_present_hdfs_location || that_present_hdfs_location) {
      if (!(this_present_hdfs_location && that_present_hdfs_location))
        return false;
      if (!this.hdfs_location.equals(that.hdfs_location))
        return false;
    }

    boolean this_present_class_name = true && this.isSetClass_name();
    boolean that_present_class_name = true && that.isSetClass_name();
    if (this_present_class_name || that_present_class_name) {
      if (!(this_present_class_name && that_present_class_name))
        return false;
      if (!this.class_name.equals(that.class_name))
        return false;
    }

    boolean this_present_api_version = true && this.isSetApi_version();
    boolean that_present_api_version = true && that.isSetApi_version();
    if (this_present_api_version || that_present_api_version) {
      if (!(this_present_api_version && that_present_api_version))
        return false;
      if (!this.api_version.equals(that.api_version))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_name = true && (isSetName());
    builder.append(present_name);
    if (present_name)
      builder.append(name);

    boolean present_hdfs_location = true && (isSetHdfs_location());
    builder.append(present_hdfs_location);
    if (present_hdfs_location)
      builder.append(hdfs_location);

    boolean present_class_name = true && (isSetClass_name());
    builder.append(present_class_name);
    if (present_class_name)
      builder.append(class_name);

    boolean present_api_version = true && (isSetApi_version());
    builder.append(present_api_version);
    if (present_api_version)
      builder.append(api_version);

    return builder.toHashCode();
  }

  public int compareTo(TDataSource other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TDataSource typedOther = (TDataSource)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHdfs_location()).compareTo(typedOther.isSetHdfs_location());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHdfs_location()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hdfs_location, typedOther.hdfs_location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClass_name()).compareTo(typedOther.isSetClass_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClass_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.class_name, typedOther.class_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApi_version()).compareTo(typedOther.isSetApi_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApi_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.api_version, typedOther.api_version);
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
    StringBuilder sb = new StringBuilder("TDataSource(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hdfs_location:");
    if (this.hdfs_location == null) {
      sb.append("null");
    } else {
      sb.append(this.hdfs_location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("class_name:");
    if (this.class_name == null) {
      sb.append("null");
    } else {
      sb.append(this.class_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("api_version:");
    if (this.api_version == null) {
      sb.append("null");
    } else {
      sb.append(this.api_version);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    if (hdfs_location == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'hdfs_location' was not present! Struct: " + toString());
    }
    if (class_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'class_name' was not present! Struct: " + toString());
    }
    if (api_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'api_version' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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

  private static class TDataSourceStandardSchemeFactory implements SchemeFactory {
    public TDataSourceStandardScheme getScheme() {
      return new TDataSourceStandardScheme();
    }
  }

  private static class TDataSourceStandardScheme extends StandardScheme<TDataSource> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TDataSource struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HDFS_LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hdfs_location = iprot.readString();
              struct.setHdfs_locationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CLASS_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.class_name = iprot.readString();
              struct.setClass_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // API_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.api_version = iprot.readString();
              struct.setApi_versionIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TDataSource struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.hdfs_location != null) {
        oprot.writeFieldBegin(HDFS_LOCATION_FIELD_DESC);
        oprot.writeString(struct.hdfs_location);
        oprot.writeFieldEnd();
      }
      if (struct.class_name != null) {
        oprot.writeFieldBegin(CLASS_NAME_FIELD_DESC);
        oprot.writeString(struct.class_name);
        oprot.writeFieldEnd();
      }
      if (struct.api_version != null) {
        oprot.writeFieldBegin(API_VERSION_FIELD_DESC);
        oprot.writeString(struct.api_version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TDataSourceTupleSchemeFactory implements SchemeFactory {
    public TDataSourceTupleScheme getScheme() {
      return new TDataSourceTupleScheme();
    }
  }

  private static class TDataSourceTupleScheme extends TupleScheme<TDataSource> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TDataSource struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeString(struct.hdfs_location);
      oprot.writeString(struct.class_name);
      oprot.writeString(struct.api_version);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TDataSource struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.hdfs_location = iprot.readString();
      struct.setHdfs_locationIsSet(true);
      struct.class_name = iprot.readString();
      struct.setClass_nameIsSet(true);
      struct.api_version = iprot.readString();
      struct.setApi_versionIsSet(true);
    }
  }

}
