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

public class THdfsCachingOp implements org.apache.thrift.TBase<THdfsCachingOp, THdfsCachingOp._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THdfsCachingOp");

  private static final org.apache.thrift.protocol.TField SET_CACHED_FIELD_DESC = new org.apache.thrift.protocol.TField("set_cached", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField CACHE_POOL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("cache_pool_name", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new THdfsCachingOpStandardSchemeFactory());
    schemes.put(TupleScheme.class, new THdfsCachingOpTupleSchemeFactory());
  }

  public boolean set_cached; // required
  public String cache_pool_name; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SET_CACHED((short)1, "set_cached"),
    CACHE_POOL_NAME((short)2, "cache_pool_name");

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
        case 1: // SET_CACHED
          return SET_CACHED;
        case 2: // CACHE_POOL_NAME
          return CACHE_POOL_NAME;
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
  private static final int __SET_CACHED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.CACHE_POOL_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SET_CACHED, new org.apache.thrift.meta_data.FieldMetaData("set_cached", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.CACHE_POOL_NAME, new org.apache.thrift.meta_data.FieldMetaData("cache_pool_name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THdfsCachingOp.class, metaDataMap);
  }

  public THdfsCachingOp() {
  }

  public THdfsCachingOp(
    boolean set_cached)
  {
    this();
    this.set_cached = set_cached;
    setSet_cachedIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THdfsCachingOp(THdfsCachingOp other) {
    __isset_bitfield = other.__isset_bitfield;
    this.set_cached = other.set_cached;
    if (other.isSetCache_pool_name()) {
      this.cache_pool_name = other.cache_pool_name;
    }
  }

  public THdfsCachingOp deepCopy() {
    return new THdfsCachingOp(this);
  }

  @Override
  public void clear() {
    setSet_cachedIsSet(false);
    this.set_cached = false;
    this.cache_pool_name = null;
  }

  public boolean isSet_cached() {
    return this.set_cached;
  }

  public THdfsCachingOp setSet_cached(boolean set_cached) {
    this.set_cached = set_cached;
    setSet_cachedIsSet(true);
    return this;
  }

  public void unsetSet_cached() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SET_CACHED_ISSET_ID);
  }

  /** Returns true if field set_cached is set (has been assigned a value) and false otherwise */
  public boolean isSetSet_cached() {
    return EncodingUtils.testBit(__isset_bitfield, __SET_CACHED_ISSET_ID);
  }

  public void setSet_cachedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SET_CACHED_ISSET_ID, value);
  }

  public String getCache_pool_name() {
    return this.cache_pool_name;
  }

  public THdfsCachingOp setCache_pool_name(String cache_pool_name) {
    this.cache_pool_name = cache_pool_name;
    return this;
  }

  public void unsetCache_pool_name() {
    this.cache_pool_name = null;
  }

  /** Returns true if field cache_pool_name is set (has been assigned a value) and false otherwise */
  public boolean isSetCache_pool_name() {
    return this.cache_pool_name != null;
  }

  public void setCache_pool_nameIsSet(boolean value) {
    if (!value) {
      this.cache_pool_name = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SET_CACHED:
      if (value == null) {
        unsetSet_cached();
      } else {
        setSet_cached((Boolean)value);
      }
      break;

    case CACHE_POOL_NAME:
      if (value == null) {
        unsetCache_pool_name();
      } else {
        setCache_pool_name((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SET_CACHED:
      return Boolean.valueOf(isSet_cached());

    case CACHE_POOL_NAME:
      return getCache_pool_name();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SET_CACHED:
      return isSetSet_cached();
    case CACHE_POOL_NAME:
      return isSetCache_pool_name();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof THdfsCachingOp)
      return this.equals((THdfsCachingOp)that);
    return false;
  }

  public boolean equals(THdfsCachingOp that) {
    if (that == null)
      return false;

    boolean this_present_set_cached = true;
    boolean that_present_set_cached = true;
    if (this_present_set_cached || that_present_set_cached) {
      if (!(this_present_set_cached && that_present_set_cached))
        return false;
      if (this.set_cached != that.set_cached)
        return false;
    }

    boolean this_present_cache_pool_name = true && this.isSetCache_pool_name();
    boolean that_present_cache_pool_name = true && that.isSetCache_pool_name();
    if (this_present_cache_pool_name || that_present_cache_pool_name) {
      if (!(this_present_cache_pool_name && that_present_cache_pool_name))
        return false;
      if (!this.cache_pool_name.equals(that.cache_pool_name))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_set_cached = true;
    builder.append(present_set_cached);
    if (present_set_cached)
      builder.append(set_cached);

    boolean present_cache_pool_name = true && (isSetCache_pool_name());
    builder.append(present_cache_pool_name);
    if (present_cache_pool_name)
      builder.append(cache_pool_name);

    return builder.toHashCode();
  }

  public int compareTo(THdfsCachingOp other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    THdfsCachingOp typedOther = (THdfsCachingOp)other;

    lastComparison = Boolean.valueOf(isSetSet_cached()).compareTo(typedOther.isSetSet_cached());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSet_cached()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.set_cached, typedOther.set_cached);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCache_pool_name()).compareTo(typedOther.isSetCache_pool_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCache_pool_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cache_pool_name, typedOther.cache_pool_name);
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
    StringBuilder sb = new StringBuilder("THdfsCachingOp(");
    boolean first = true;

    sb.append("set_cached:");
    sb.append(this.set_cached);
    first = false;
    if (isSetCache_pool_name()) {
      if (!first) sb.append(", ");
      sb.append("cache_pool_name:");
      if (this.cache_pool_name == null) {
        sb.append("null");
      } else {
        sb.append(this.cache_pool_name);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'set_cached' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class THdfsCachingOpStandardSchemeFactory implements SchemeFactory {
    public THdfsCachingOpStandardScheme getScheme() {
      return new THdfsCachingOpStandardScheme();
    }
  }

  private static class THdfsCachingOpStandardScheme extends StandardScheme<THdfsCachingOp> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THdfsCachingOp struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SET_CACHED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.set_cached = iprot.readBool();
              struct.setSet_cachedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CACHE_POOL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cache_pool_name = iprot.readString();
              struct.setCache_pool_nameIsSet(true);
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
      if (!struct.isSetSet_cached()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'set_cached' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, THdfsCachingOp struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SET_CACHED_FIELD_DESC);
      oprot.writeBool(struct.set_cached);
      oprot.writeFieldEnd();
      if (struct.cache_pool_name != null) {
        if (struct.isSetCache_pool_name()) {
          oprot.writeFieldBegin(CACHE_POOL_NAME_FIELD_DESC);
          oprot.writeString(struct.cache_pool_name);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THdfsCachingOpTupleSchemeFactory implements SchemeFactory {
    public THdfsCachingOpTupleScheme getScheme() {
      return new THdfsCachingOpTupleScheme();
    }
  }

  private static class THdfsCachingOpTupleScheme extends TupleScheme<THdfsCachingOp> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THdfsCachingOp struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.set_cached);
      BitSet optionals = new BitSet();
      if (struct.isSetCache_pool_name()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCache_pool_name()) {
        oprot.writeString(struct.cache_pool_name);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THdfsCachingOp struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.set_cached = iprot.readBool();
      struct.setSet_cachedIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.cache_pool_name = iprot.readString();
        struct.setCache_pool_nameIsSet(true);
      }
    }
  }

}

