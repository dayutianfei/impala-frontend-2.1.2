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

public class THBaseScanNode implements org.apache.thrift.TBase<THBaseScanNode, THBaseScanNode._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("THBaseScanNode");

  private static final org.apache.thrift.protocol.TField TUPLE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tuple_id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("table_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FILTERS_FIELD_DESC = new org.apache.thrift.protocol.TField("filters", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField SUGGESTED_MAX_CACHING_FIELD_DESC = new org.apache.thrift.protocol.TField("suggested_max_caching", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new THBaseScanNodeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new THBaseScanNodeTupleSchemeFactory());
  }

  public int tuple_id; // required
  public String table_name; // required
  public List<THBaseFilter> filters; // optional
  public int suggested_max_caching; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TUPLE_ID((short)1, "tuple_id"),
    TABLE_NAME((short)2, "table_name"),
    FILTERS((short)3, "filters"),
    SUGGESTED_MAX_CACHING((short)4, "suggested_max_caching");

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
        case 1: // TUPLE_ID
          return TUPLE_ID;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // FILTERS
          return FILTERS;
        case 4: // SUGGESTED_MAX_CACHING
          return SUGGESTED_MAX_CACHING;
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
  private static final int __TUPLE_ID_ISSET_ID = 0;
  private static final int __SUGGESTED_MAX_CACHING_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.FILTERS,_Fields.SUGGESTED_MAX_CACHING};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TUPLE_ID, new org.apache.thrift.meta_data.FieldMetaData("tuple_id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "TTupleId")));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("table_name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILTERS, new org.apache.thrift.meta_data.FieldMetaData("filters", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, THBaseFilter.class))));
    tmpMap.put(_Fields.SUGGESTED_MAX_CACHING, new org.apache.thrift.meta_data.FieldMetaData("suggested_max_caching", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(THBaseScanNode.class, metaDataMap);
  }

  public THBaseScanNode() {
  }

  public THBaseScanNode(
    int tuple_id,
    String table_name)
  {
    this();
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
    this.table_name = table_name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public THBaseScanNode(THBaseScanNode other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tuple_id = other.tuple_id;
    if (other.isSetTable_name()) {
      this.table_name = other.table_name;
    }
    if (other.isSetFilters()) {
      List<THBaseFilter> __this__filters = new ArrayList<THBaseFilter>();
      for (THBaseFilter other_element : other.filters) {
        __this__filters.add(new THBaseFilter(other_element));
      }
      this.filters = __this__filters;
    }
    this.suggested_max_caching = other.suggested_max_caching;
  }

  public THBaseScanNode deepCopy() {
    return new THBaseScanNode(this);
  }

  @Override
  public void clear() {
    setTuple_idIsSet(false);
    this.tuple_id = 0;
    this.table_name = null;
    this.filters = null;
    setSuggested_max_cachingIsSet(false);
    this.suggested_max_caching = 0;
  }

  public int getTuple_id() {
    return this.tuple_id;
  }

  public THBaseScanNode setTuple_id(int tuple_id) {
    this.tuple_id = tuple_id;
    setTuple_idIsSet(true);
    return this;
  }

  public void unsetTuple_id() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  /** Returns true if field tuple_id is set (has been assigned a value) and false otherwise */
  public boolean isSetTuple_id() {
    return EncodingUtils.testBit(__isset_bitfield, __TUPLE_ID_ISSET_ID);
  }

  public void setTuple_idIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TUPLE_ID_ISSET_ID, value);
  }

  public String getTable_name() {
    return this.table_name;
  }

  public THBaseScanNode setTable_name(String table_name) {
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

  public int getFiltersSize() {
    return (this.filters == null) ? 0 : this.filters.size();
  }

  public java.util.Iterator<THBaseFilter> getFiltersIterator() {
    return (this.filters == null) ? null : this.filters.iterator();
  }

  public void addToFilters(THBaseFilter elem) {
    if (this.filters == null) {
      this.filters = new ArrayList<THBaseFilter>();
    }
    this.filters.add(elem);
  }

  public List<THBaseFilter> getFilters() {
    return this.filters;
  }

  public THBaseScanNode setFilters(List<THBaseFilter> filters) {
    this.filters = filters;
    return this;
  }

  public void unsetFilters() {
    this.filters = null;
  }

  /** Returns true if field filters is set (has been assigned a value) and false otherwise */
  public boolean isSetFilters() {
    return this.filters != null;
  }

  public void setFiltersIsSet(boolean value) {
    if (!value) {
      this.filters = null;
    }
  }

  public int getSuggested_max_caching() {
    return this.suggested_max_caching;
  }

  public THBaseScanNode setSuggested_max_caching(int suggested_max_caching) {
    this.suggested_max_caching = suggested_max_caching;
    setSuggested_max_cachingIsSet(true);
    return this;
  }

  public void unsetSuggested_max_caching() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUGGESTED_MAX_CACHING_ISSET_ID);
  }

  /** Returns true if field suggested_max_caching is set (has been assigned a value) and false otherwise */
  public boolean isSetSuggested_max_caching() {
    return EncodingUtils.testBit(__isset_bitfield, __SUGGESTED_MAX_CACHING_ISSET_ID);
  }

  public void setSuggested_max_cachingIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUGGESTED_MAX_CACHING_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TUPLE_ID:
      if (value == null) {
        unsetTuple_id();
      } else {
        setTuple_id((Integer)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTable_name();
      } else {
        setTable_name((String)value);
      }
      break;

    case FILTERS:
      if (value == null) {
        unsetFilters();
      } else {
        setFilters((List<THBaseFilter>)value);
      }
      break;

    case SUGGESTED_MAX_CACHING:
      if (value == null) {
        unsetSuggested_max_caching();
      } else {
        setSuggested_max_caching((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TUPLE_ID:
      return Integer.valueOf(getTuple_id());

    case TABLE_NAME:
      return getTable_name();

    case FILTERS:
      return getFilters();

    case SUGGESTED_MAX_CACHING:
      return Integer.valueOf(getSuggested_max_caching());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TUPLE_ID:
      return isSetTuple_id();
    case TABLE_NAME:
      return isSetTable_name();
    case FILTERS:
      return isSetFilters();
    case SUGGESTED_MAX_CACHING:
      return isSetSuggested_max_caching();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof THBaseScanNode)
      return this.equals((THBaseScanNode)that);
    return false;
  }

  public boolean equals(THBaseScanNode that) {
    if (that == null)
      return false;

    boolean this_present_tuple_id = true;
    boolean that_present_tuple_id = true;
    if (this_present_tuple_id || that_present_tuple_id) {
      if (!(this_present_tuple_id && that_present_tuple_id))
        return false;
      if (this.tuple_id != that.tuple_id)
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

    boolean this_present_filters = true && this.isSetFilters();
    boolean that_present_filters = true && that.isSetFilters();
    if (this_present_filters || that_present_filters) {
      if (!(this_present_filters && that_present_filters))
        return false;
      if (!this.filters.equals(that.filters))
        return false;
    }

    boolean this_present_suggested_max_caching = true && this.isSetSuggested_max_caching();
    boolean that_present_suggested_max_caching = true && that.isSetSuggested_max_caching();
    if (this_present_suggested_max_caching || that_present_suggested_max_caching) {
      if (!(this_present_suggested_max_caching && that_present_suggested_max_caching))
        return false;
      if (this.suggested_max_caching != that.suggested_max_caching)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_tuple_id = true;
    builder.append(present_tuple_id);
    if (present_tuple_id)
      builder.append(tuple_id);

    boolean present_table_name = true && (isSetTable_name());
    builder.append(present_table_name);
    if (present_table_name)
      builder.append(table_name);

    boolean present_filters = true && (isSetFilters());
    builder.append(present_filters);
    if (present_filters)
      builder.append(filters);

    boolean present_suggested_max_caching = true && (isSetSuggested_max_caching());
    builder.append(present_suggested_max_caching);
    if (present_suggested_max_caching)
      builder.append(suggested_max_caching);

    return builder.toHashCode();
  }

  public int compareTo(THBaseScanNode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    THBaseScanNode typedOther = (THBaseScanNode)other;

    lastComparison = Boolean.valueOf(isSetTuple_id()).compareTo(typedOther.isSetTuple_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTuple_id()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tuple_id, typedOther.tuple_id);
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
    lastComparison = Boolean.valueOf(isSetFilters()).compareTo(typedOther.isSetFilters());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilters()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filters, typedOther.filters);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuggested_max_caching()).compareTo(typedOther.isSetSuggested_max_caching());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuggested_max_caching()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.suggested_max_caching, typedOther.suggested_max_caching);
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
    StringBuilder sb = new StringBuilder("THBaseScanNode(");
    boolean first = true;

    sb.append("tuple_id:");
    sb.append(this.tuple_id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("table_name:");
    if (this.table_name == null) {
      sb.append("null");
    } else {
      sb.append(this.table_name);
    }
    first = false;
    if (isSetFilters()) {
      if (!first) sb.append(", ");
      sb.append("filters:");
      if (this.filters == null) {
        sb.append("null");
      } else {
        sb.append(this.filters);
      }
      first = false;
    }
    if (isSetSuggested_max_caching()) {
      if (!first) sb.append(", ");
      sb.append("suggested_max_caching:");
      sb.append(this.suggested_max_caching);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tuple_id' because it's a primitive and you chose the non-beans generator.
    if (table_name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'table_name' was not present! Struct: " + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class THBaseScanNodeStandardSchemeFactory implements SchemeFactory {
    public THBaseScanNodeStandardScheme getScheme() {
      return new THBaseScanNodeStandardScheme();
    }
  }

  private static class THBaseScanNodeStandardScheme extends StandardScheme<THBaseScanNode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, THBaseScanNode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TUPLE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tuple_id = iprot.readI32();
              struct.setTuple_idIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table_name = iprot.readString();
              struct.setTable_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FILTERS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.filters = new ArrayList<THBaseFilter>(_list16.size);
                for (int _i17 = 0; _i17 < _list16.size; ++_i17)
                {
                  THBaseFilter _elem18; // required
                  _elem18 = new THBaseFilter();
                  _elem18.read(iprot);
                  struct.filters.add(_elem18);
                }
                iprot.readListEnd();
              }
              struct.setFiltersIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SUGGESTED_MAX_CACHING
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.suggested_max_caching = iprot.readI32();
              struct.setSuggested_max_cachingIsSet(true);
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
      if (!struct.isSetTuple_id()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tuple_id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, THBaseScanNode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TUPLE_ID_FIELD_DESC);
      oprot.writeI32(struct.tuple_id);
      oprot.writeFieldEnd();
      if (struct.table_name != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.table_name);
        oprot.writeFieldEnd();
      }
      if (struct.filters != null) {
        if (struct.isSetFilters()) {
          oprot.writeFieldBegin(FILTERS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.filters.size()));
            for (THBaseFilter _iter19 : struct.filters)
            {
              _iter19.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSuggested_max_caching()) {
        oprot.writeFieldBegin(SUGGESTED_MAX_CACHING_FIELD_DESC);
        oprot.writeI32(struct.suggested_max_caching);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class THBaseScanNodeTupleSchemeFactory implements SchemeFactory {
    public THBaseScanNodeTupleScheme getScheme() {
      return new THBaseScanNodeTupleScheme();
    }
  }

  private static class THBaseScanNodeTupleScheme extends TupleScheme<THBaseScanNode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, THBaseScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.tuple_id);
      oprot.writeString(struct.table_name);
      BitSet optionals = new BitSet();
      if (struct.isSetFilters()) {
        optionals.set(0);
      }
      if (struct.isSetSuggested_max_caching()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetFilters()) {
        {
          oprot.writeI32(struct.filters.size());
          for (THBaseFilter _iter20 : struct.filters)
          {
            _iter20.write(oprot);
          }
        }
      }
      if (struct.isSetSuggested_max_caching()) {
        oprot.writeI32(struct.suggested_max_caching);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, THBaseScanNode struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tuple_id = iprot.readI32();
      struct.setTuple_idIsSet(true);
      struct.table_name = iprot.readString();
      struct.setTable_nameIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.filters = new ArrayList<THBaseFilter>(_list21.size);
          for (int _i22 = 0; _i22 < _list21.size; ++_i22)
          {
            THBaseFilter _elem23; // required
            _elem23 = new THBaseFilter();
            _elem23.read(iprot);
            struct.filters.add(_elem23);
          }
        }
        struct.setFiltersIsSet(true);
      }
      if (incoming.get(1)) {
        struct.suggested_max_caching = iprot.readI32();
        struct.setSuggested_max_cachingIsSet(true);
      }
    }
  }

}

