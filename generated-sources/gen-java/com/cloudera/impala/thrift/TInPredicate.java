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

public class TInPredicate implements org.apache.thrift.TBase<TInPredicate, TInPredicate._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInPredicate");

  private static final org.apache.thrift.protocol.TField IS_NOT_IN_FIELD_DESC = new org.apache.thrift.protocol.TField("is_not_in", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TInPredicateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TInPredicateTupleSchemeFactory());
  }

  public boolean is_not_in; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_NOT_IN((short)1, "is_not_in");

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
        case 1: // IS_NOT_IN
          return IS_NOT_IN;
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
  private static final int __IS_NOT_IN_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_NOT_IN, new org.apache.thrift.meta_data.FieldMetaData("is_not_in", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInPredicate.class, metaDataMap);
  }

  public TInPredicate() {
  }

  public TInPredicate(
    boolean is_not_in)
  {
    this();
    this.is_not_in = is_not_in;
    setIs_not_inIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInPredicate(TInPredicate other) {
    __isset_bitfield = other.__isset_bitfield;
    this.is_not_in = other.is_not_in;
  }

  public TInPredicate deepCopy() {
    return new TInPredicate(this);
  }

  @Override
  public void clear() {
    setIs_not_inIsSet(false);
    this.is_not_in = false;
  }

  public boolean isIs_not_in() {
    return this.is_not_in;
  }

  public TInPredicate setIs_not_in(boolean is_not_in) {
    this.is_not_in = is_not_in;
    setIs_not_inIsSet(true);
    return this;
  }

  public void unsetIs_not_in() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID);
  }

  /** Returns true if field is_not_in is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_not_in() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID);
  }

  public void setIs_not_inIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_NOT_IN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_NOT_IN:
      if (value == null) {
        unsetIs_not_in();
      } else {
        setIs_not_in((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_NOT_IN:
      return Boolean.valueOf(isIs_not_in());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_NOT_IN:
      return isSetIs_not_in();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInPredicate)
      return this.equals((TInPredicate)that);
    return false;
  }

  public boolean equals(TInPredicate that) {
    if (that == null)
      return false;

    boolean this_present_is_not_in = true;
    boolean that_present_is_not_in = true;
    if (this_present_is_not_in || that_present_is_not_in) {
      if (!(this_present_is_not_in && that_present_is_not_in))
        return false;
      if (this.is_not_in != that.is_not_in)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_is_not_in = true;
    builder.append(present_is_not_in);
    if (present_is_not_in)
      builder.append(is_not_in);

    return builder.toHashCode();
  }

  public int compareTo(TInPredicate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInPredicate typedOther = (TInPredicate)other;

    lastComparison = Boolean.valueOf(isSetIs_not_in()).compareTo(typedOther.isSetIs_not_in());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_not_in()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_not_in, typedOther.is_not_in);
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
    StringBuilder sb = new StringBuilder("TInPredicate(");
    boolean first = true;

    sb.append("is_not_in:");
    sb.append(this.is_not_in);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'is_not_in' because it's a primitive and you chose the non-beans generator.
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

  private static class TInPredicateStandardSchemeFactory implements SchemeFactory {
    public TInPredicateStandardScheme getScheme() {
      return new TInPredicateStandardScheme();
    }
  }

  private static class TInPredicateStandardScheme extends StandardScheme<TInPredicate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInPredicate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_NOT_IN
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_not_in = iprot.readBool();
              struct.setIs_not_inIsSet(true);
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
      if (!struct.isSetIs_not_in()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_not_in' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInPredicate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_NOT_IN_FIELD_DESC);
      oprot.writeBool(struct.is_not_in);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInPredicateTupleSchemeFactory implements SchemeFactory {
    public TInPredicateTupleScheme getScheme() {
      return new TInPredicateTupleScheme();
    }
  }

  private static class TInPredicateTupleScheme extends TupleScheme<TInPredicate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBool(struct.is_not_in);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInPredicate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.is_not_in = iprot.readBool();
      struct.setIs_not_inIsSet(true);
    }
  }

}

