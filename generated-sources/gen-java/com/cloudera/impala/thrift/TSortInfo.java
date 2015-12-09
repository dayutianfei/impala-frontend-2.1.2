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

public class TSortInfo implements org.apache.thrift.TBase<TSortInfo, TSortInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSortInfo");

  private static final org.apache.thrift.protocol.TField ORDERING_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("ordering_exprs", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField IS_ASC_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("is_asc_order", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField NULLS_FIRST_FIELD_DESC = new org.apache.thrift.protocol.TField("nulls_first", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField SORT_TUPLE_SLOT_EXPRS_FIELD_DESC = new org.apache.thrift.protocol.TField("sort_tuple_slot_exprs", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSortInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSortInfoTupleSchemeFactory());
  }

  public List<com.cloudera.impala.thrift.TExpr> ordering_exprs; // required
  public List<Boolean> is_asc_order; // required
  public List<Boolean> nulls_first; // required
  public List<com.cloudera.impala.thrift.TExpr> sort_tuple_slot_exprs; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ORDERING_EXPRS((short)1, "ordering_exprs"),
    IS_ASC_ORDER((short)2, "is_asc_order"),
    NULLS_FIRST((short)3, "nulls_first"),
    SORT_TUPLE_SLOT_EXPRS((short)4, "sort_tuple_slot_exprs");

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
        case 1: // ORDERING_EXPRS
          return ORDERING_EXPRS;
        case 2: // IS_ASC_ORDER
          return IS_ASC_ORDER;
        case 3: // NULLS_FIRST
          return NULLS_FIRST;
        case 4: // SORT_TUPLE_SLOT_EXPRS
          return SORT_TUPLE_SLOT_EXPRS;
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
  private _Fields optionals[] = {_Fields.SORT_TUPLE_SLOT_EXPRS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ORDERING_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("ordering_exprs", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TExpr.class))));
    tmpMap.put(_Fields.IS_ASC_ORDER, new org.apache.thrift.meta_data.FieldMetaData("is_asc_order", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.NULLS_FIRST, new org.apache.thrift.meta_data.FieldMetaData("nulls_first", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL))));
    tmpMap.put(_Fields.SORT_TUPLE_SLOT_EXPRS, new org.apache.thrift.meta_data.FieldMetaData("sort_tuple_slot_exprs", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TExpr.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSortInfo.class, metaDataMap);
  }

  public TSortInfo() {
  }

  public TSortInfo(
    List<com.cloudera.impala.thrift.TExpr> ordering_exprs,
    List<Boolean> is_asc_order,
    List<Boolean> nulls_first)
  {
    this();
    this.ordering_exprs = ordering_exprs;
    this.is_asc_order = is_asc_order;
    this.nulls_first = nulls_first;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSortInfo(TSortInfo other) {
    if (other.isSetOrdering_exprs()) {
      List<com.cloudera.impala.thrift.TExpr> __this__ordering_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>();
      for (com.cloudera.impala.thrift.TExpr other_element : other.ordering_exprs) {
        __this__ordering_exprs.add(new com.cloudera.impala.thrift.TExpr(other_element));
      }
      this.ordering_exprs = __this__ordering_exprs;
    }
    if (other.isSetIs_asc_order()) {
      List<Boolean> __this__is_asc_order = new ArrayList<Boolean>();
      for (Boolean other_element : other.is_asc_order) {
        __this__is_asc_order.add(other_element);
      }
      this.is_asc_order = __this__is_asc_order;
    }
    if (other.isSetNulls_first()) {
      List<Boolean> __this__nulls_first = new ArrayList<Boolean>();
      for (Boolean other_element : other.nulls_first) {
        __this__nulls_first.add(other_element);
      }
      this.nulls_first = __this__nulls_first;
    }
    if (other.isSetSort_tuple_slot_exprs()) {
      List<com.cloudera.impala.thrift.TExpr> __this__sort_tuple_slot_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>();
      for (com.cloudera.impala.thrift.TExpr other_element : other.sort_tuple_slot_exprs) {
        __this__sort_tuple_slot_exprs.add(new com.cloudera.impala.thrift.TExpr(other_element));
      }
      this.sort_tuple_slot_exprs = __this__sort_tuple_slot_exprs;
    }
  }

  public TSortInfo deepCopy() {
    return new TSortInfo(this);
  }

  @Override
  public void clear() {
    this.ordering_exprs = null;
    this.is_asc_order = null;
    this.nulls_first = null;
    this.sort_tuple_slot_exprs = null;
  }

  public int getOrdering_exprsSize() {
    return (this.ordering_exprs == null) ? 0 : this.ordering_exprs.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TExpr> getOrdering_exprsIterator() {
    return (this.ordering_exprs == null) ? null : this.ordering_exprs.iterator();
  }

  public void addToOrdering_exprs(com.cloudera.impala.thrift.TExpr elem) {
    if (this.ordering_exprs == null) {
      this.ordering_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>();
    }
    this.ordering_exprs.add(elem);
  }

  public List<com.cloudera.impala.thrift.TExpr> getOrdering_exprs() {
    return this.ordering_exprs;
  }

  public TSortInfo setOrdering_exprs(List<com.cloudera.impala.thrift.TExpr> ordering_exprs) {
    this.ordering_exprs = ordering_exprs;
    return this;
  }

  public void unsetOrdering_exprs() {
    this.ordering_exprs = null;
  }

  /** Returns true if field ordering_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetOrdering_exprs() {
    return this.ordering_exprs != null;
  }

  public void setOrdering_exprsIsSet(boolean value) {
    if (!value) {
      this.ordering_exprs = null;
    }
  }

  public int getIs_asc_orderSize() {
    return (this.is_asc_order == null) ? 0 : this.is_asc_order.size();
  }

  public java.util.Iterator<Boolean> getIs_asc_orderIterator() {
    return (this.is_asc_order == null) ? null : this.is_asc_order.iterator();
  }

  public void addToIs_asc_order(boolean elem) {
    if (this.is_asc_order == null) {
      this.is_asc_order = new ArrayList<Boolean>();
    }
    this.is_asc_order.add(elem);
  }

  public List<Boolean> getIs_asc_order() {
    return this.is_asc_order;
  }

  public TSortInfo setIs_asc_order(List<Boolean> is_asc_order) {
    this.is_asc_order = is_asc_order;
    return this;
  }

  public void unsetIs_asc_order() {
    this.is_asc_order = null;
  }

  /** Returns true if field is_asc_order is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_asc_order() {
    return this.is_asc_order != null;
  }

  public void setIs_asc_orderIsSet(boolean value) {
    if (!value) {
      this.is_asc_order = null;
    }
  }

  public int getNulls_firstSize() {
    return (this.nulls_first == null) ? 0 : this.nulls_first.size();
  }

  public java.util.Iterator<Boolean> getNulls_firstIterator() {
    return (this.nulls_first == null) ? null : this.nulls_first.iterator();
  }

  public void addToNulls_first(boolean elem) {
    if (this.nulls_first == null) {
      this.nulls_first = new ArrayList<Boolean>();
    }
    this.nulls_first.add(elem);
  }

  public List<Boolean> getNulls_first() {
    return this.nulls_first;
  }

  public TSortInfo setNulls_first(List<Boolean> nulls_first) {
    this.nulls_first = nulls_first;
    return this;
  }

  public void unsetNulls_first() {
    this.nulls_first = null;
  }

  /** Returns true if field nulls_first is set (has been assigned a value) and false otherwise */
  public boolean isSetNulls_first() {
    return this.nulls_first != null;
  }

  public void setNulls_firstIsSet(boolean value) {
    if (!value) {
      this.nulls_first = null;
    }
  }

  public int getSort_tuple_slot_exprsSize() {
    return (this.sort_tuple_slot_exprs == null) ? 0 : this.sort_tuple_slot_exprs.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TExpr> getSort_tuple_slot_exprsIterator() {
    return (this.sort_tuple_slot_exprs == null) ? null : this.sort_tuple_slot_exprs.iterator();
  }

  public void addToSort_tuple_slot_exprs(com.cloudera.impala.thrift.TExpr elem) {
    if (this.sort_tuple_slot_exprs == null) {
      this.sort_tuple_slot_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>();
    }
    this.sort_tuple_slot_exprs.add(elem);
  }

  public List<com.cloudera.impala.thrift.TExpr> getSort_tuple_slot_exprs() {
    return this.sort_tuple_slot_exprs;
  }

  public TSortInfo setSort_tuple_slot_exprs(List<com.cloudera.impala.thrift.TExpr> sort_tuple_slot_exprs) {
    this.sort_tuple_slot_exprs = sort_tuple_slot_exprs;
    return this;
  }

  public void unsetSort_tuple_slot_exprs() {
    this.sort_tuple_slot_exprs = null;
  }

  /** Returns true if field sort_tuple_slot_exprs is set (has been assigned a value) and false otherwise */
  public boolean isSetSort_tuple_slot_exprs() {
    return this.sort_tuple_slot_exprs != null;
  }

  public void setSort_tuple_slot_exprsIsSet(boolean value) {
    if (!value) {
      this.sort_tuple_slot_exprs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ORDERING_EXPRS:
      if (value == null) {
        unsetOrdering_exprs();
      } else {
        setOrdering_exprs((List<com.cloudera.impala.thrift.TExpr>)value);
      }
      break;

    case IS_ASC_ORDER:
      if (value == null) {
        unsetIs_asc_order();
      } else {
        setIs_asc_order((List<Boolean>)value);
      }
      break;

    case NULLS_FIRST:
      if (value == null) {
        unsetNulls_first();
      } else {
        setNulls_first((List<Boolean>)value);
      }
      break;

    case SORT_TUPLE_SLOT_EXPRS:
      if (value == null) {
        unsetSort_tuple_slot_exprs();
      } else {
        setSort_tuple_slot_exprs((List<com.cloudera.impala.thrift.TExpr>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ORDERING_EXPRS:
      return getOrdering_exprs();

    case IS_ASC_ORDER:
      return getIs_asc_order();

    case NULLS_FIRST:
      return getNulls_first();

    case SORT_TUPLE_SLOT_EXPRS:
      return getSort_tuple_slot_exprs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ORDERING_EXPRS:
      return isSetOrdering_exprs();
    case IS_ASC_ORDER:
      return isSetIs_asc_order();
    case NULLS_FIRST:
      return isSetNulls_first();
    case SORT_TUPLE_SLOT_EXPRS:
      return isSetSort_tuple_slot_exprs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSortInfo)
      return this.equals((TSortInfo)that);
    return false;
  }

  public boolean equals(TSortInfo that) {
    if (that == null)
      return false;

    boolean this_present_ordering_exprs = true && this.isSetOrdering_exprs();
    boolean that_present_ordering_exprs = true && that.isSetOrdering_exprs();
    if (this_present_ordering_exprs || that_present_ordering_exprs) {
      if (!(this_present_ordering_exprs && that_present_ordering_exprs))
        return false;
      if (!this.ordering_exprs.equals(that.ordering_exprs))
        return false;
    }

    boolean this_present_is_asc_order = true && this.isSetIs_asc_order();
    boolean that_present_is_asc_order = true && that.isSetIs_asc_order();
    if (this_present_is_asc_order || that_present_is_asc_order) {
      if (!(this_present_is_asc_order && that_present_is_asc_order))
        return false;
      if (!this.is_asc_order.equals(that.is_asc_order))
        return false;
    }

    boolean this_present_nulls_first = true && this.isSetNulls_first();
    boolean that_present_nulls_first = true && that.isSetNulls_first();
    if (this_present_nulls_first || that_present_nulls_first) {
      if (!(this_present_nulls_first && that_present_nulls_first))
        return false;
      if (!this.nulls_first.equals(that.nulls_first))
        return false;
    }

    boolean this_present_sort_tuple_slot_exprs = true && this.isSetSort_tuple_slot_exprs();
    boolean that_present_sort_tuple_slot_exprs = true && that.isSetSort_tuple_slot_exprs();
    if (this_present_sort_tuple_slot_exprs || that_present_sort_tuple_slot_exprs) {
      if (!(this_present_sort_tuple_slot_exprs && that_present_sort_tuple_slot_exprs))
        return false;
      if (!this.sort_tuple_slot_exprs.equals(that.sort_tuple_slot_exprs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_ordering_exprs = true && (isSetOrdering_exprs());
    builder.append(present_ordering_exprs);
    if (present_ordering_exprs)
      builder.append(ordering_exprs);

    boolean present_is_asc_order = true && (isSetIs_asc_order());
    builder.append(present_is_asc_order);
    if (present_is_asc_order)
      builder.append(is_asc_order);

    boolean present_nulls_first = true && (isSetNulls_first());
    builder.append(present_nulls_first);
    if (present_nulls_first)
      builder.append(nulls_first);

    boolean present_sort_tuple_slot_exprs = true && (isSetSort_tuple_slot_exprs());
    builder.append(present_sort_tuple_slot_exprs);
    if (present_sort_tuple_slot_exprs)
      builder.append(sort_tuple_slot_exprs);

    return builder.toHashCode();
  }

  public int compareTo(TSortInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSortInfo typedOther = (TSortInfo)other;

    lastComparison = Boolean.valueOf(isSetOrdering_exprs()).compareTo(typedOther.isSetOrdering_exprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrdering_exprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ordering_exprs, typedOther.ordering_exprs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_asc_order()).compareTo(typedOther.isSetIs_asc_order());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_asc_order()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_asc_order, typedOther.is_asc_order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNulls_first()).compareTo(typedOther.isSetNulls_first());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNulls_first()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nulls_first, typedOther.nulls_first);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSort_tuple_slot_exprs()).compareTo(typedOther.isSetSort_tuple_slot_exprs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSort_tuple_slot_exprs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sort_tuple_slot_exprs, typedOther.sort_tuple_slot_exprs);
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
    StringBuilder sb = new StringBuilder("TSortInfo(");
    boolean first = true;

    sb.append("ordering_exprs:");
    if (this.ordering_exprs == null) {
      sb.append("null");
    } else {
      sb.append(this.ordering_exprs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_asc_order:");
    if (this.is_asc_order == null) {
      sb.append("null");
    } else {
      sb.append(this.is_asc_order);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nulls_first:");
    if (this.nulls_first == null) {
      sb.append("null");
    } else {
      sb.append(this.nulls_first);
    }
    first = false;
    if (isSetSort_tuple_slot_exprs()) {
      if (!first) sb.append(", ");
      sb.append("sort_tuple_slot_exprs:");
      if (this.sort_tuple_slot_exprs == null) {
        sb.append("null");
      } else {
        sb.append(this.sort_tuple_slot_exprs);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (ordering_exprs == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'ordering_exprs' was not present! Struct: " + toString());
    }
    if (is_asc_order == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'is_asc_order' was not present! Struct: " + toString());
    }
    if (nulls_first == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'nulls_first' was not present! Struct: " + toString());
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

  private static class TSortInfoStandardSchemeFactory implements SchemeFactory {
    public TSortInfoStandardScheme getScheme() {
      return new TSortInfoStandardScheme();
    }
  }

  private static class TSortInfoStandardScheme extends StandardScheme<TSortInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSortInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ORDERING_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.ordering_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>(_list56.size);
                for (int _i57 = 0; _i57 < _list56.size; ++_i57)
                {
                  com.cloudera.impala.thrift.TExpr _elem58; // required
                  _elem58 = new com.cloudera.impala.thrift.TExpr();
                  _elem58.read(iprot);
                  struct.ordering_exprs.add(_elem58);
                }
                iprot.readListEnd();
              }
              struct.setOrdering_exprsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_ASC_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list59 = iprot.readListBegin();
                struct.is_asc_order = new ArrayList<Boolean>(_list59.size);
                for (int _i60 = 0; _i60 < _list59.size; ++_i60)
                {
                  boolean _elem61; // required
                  _elem61 = iprot.readBool();
                  struct.is_asc_order.add(_elem61);
                }
                iprot.readListEnd();
              }
              struct.setIs_asc_orderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NULLS_FIRST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list62 = iprot.readListBegin();
                struct.nulls_first = new ArrayList<Boolean>(_list62.size);
                for (int _i63 = 0; _i63 < _list62.size; ++_i63)
                {
                  boolean _elem64; // required
                  _elem64 = iprot.readBool();
                  struct.nulls_first.add(_elem64);
                }
                iprot.readListEnd();
              }
              struct.setNulls_firstIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SORT_TUPLE_SLOT_EXPRS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list65 = iprot.readListBegin();
                struct.sort_tuple_slot_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>(_list65.size);
                for (int _i66 = 0; _i66 < _list65.size; ++_i66)
                {
                  com.cloudera.impala.thrift.TExpr _elem67; // required
                  _elem67 = new com.cloudera.impala.thrift.TExpr();
                  _elem67.read(iprot);
                  struct.sort_tuple_slot_exprs.add(_elem67);
                }
                iprot.readListEnd();
              }
              struct.setSort_tuple_slot_exprsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSortInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ordering_exprs != null) {
        oprot.writeFieldBegin(ORDERING_EXPRS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.ordering_exprs.size()));
          for (com.cloudera.impala.thrift.TExpr _iter68 : struct.ordering_exprs)
          {
            _iter68.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.is_asc_order != null) {
        oprot.writeFieldBegin(IS_ASC_ORDER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.is_asc_order.size()));
          for (boolean _iter69 : struct.is_asc_order)
          {
            oprot.writeBool(_iter69);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.nulls_first != null) {
        oprot.writeFieldBegin(NULLS_FIRST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, struct.nulls_first.size()));
          for (boolean _iter70 : struct.nulls_first)
          {
            oprot.writeBool(_iter70);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.sort_tuple_slot_exprs != null) {
        if (struct.isSetSort_tuple_slot_exprs()) {
          oprot.writeFieldBegin(SORT_TUPLE_SLOT_EXPRS_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.sort_tuple_slot_exprs.size()));
            for (com.cloudera.impala.thrift.TExpr _iter71 : struct.sort_tuple_slot_exprs)
            {
              _iter71.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSortInfoTupleSchemeFactory implements SchemeFactory {
    public TSortInfoTupleScheme getScheme() {
      return new TSortInfoTupleScheme();
    }
  }

  private static class TSortInfoTupleScheme extends TupleScheme<TSortInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSortInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.ordering_exprs.size());
        for (com.cloudera.impala.thrift.TExpr _iter72 : struct.ordering_exprs)
        {
          _iter72.write(oprot);
        }
      }
      {
        oprot.writeI32(struct.is_asc_order.size());
        for (boolean _iter73 : struct.is_asc_order)
        {
          oprot.writeBool(_iter73);
        }
      }
      {
        oprot.writeI32(struct.nulls_first.size());
        for (boolean _iter74 : struct.nulls_first)
        {
          oprot.writeBool(_iter74);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetSort_tuple_slot_exprs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSort_tuple_slot_exprs()) {
        {
          oprot.writeI32(struct.sort_tuple_slot_exprs.size());
          for (com.cloudera.impala.thrift.TExpr _iter75 : struct.sort_tuple_slot_exprs)
          {
            _iter75.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSortInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list76 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.ordering_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>(_list76.size);
        for (int _i77 = 0; _i77 < _list76.size; ++_i77)
        {
          com.cloudera.impala.thrift.TExpr _elem78; // required
          _elem78 = new com.cloudera.impala.thrift.TExpr();
          _elem78.read(iprot);
          struct.ordering_exprs.add(_elem78);
        }
      }
      struct.setOrdering_exprsIsSet(true);
      {
        org.apache.thrift.protocol.TList _list79 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, iprot.readI32());
        struct.is_asc_order = new ArrayList<Boolean>(_list79.size);
        for (int _i80 = 0; _i80 < _list79.size; ++_i80)
        {
          boolean _elem81; // required
          _elem81 = iprot.readBool();
          struct.is_asc_order.add(_elem81);
        }
      }
      struct.setIs_asc_orderIsSet(true);
      {
        org.apache.thrift.protocol.TList _list82 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.BOOL, iprot.readI32());
        struct.nulls_first = new ArrayList<Boolean>(_list82.size);
        for (int _i83 = 0; _i83 < _list82.size; ++_i83)
        {
          boolean _elem84; // required
          _elem84 = iprot.readBool();
          struct.nulls_first.add(_elem84);
        }
      }
      struct.setNulls_firstIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.sort_tuple_slot_exprs = new ArrayList<com.cloudera.impala.thrift.TExpr>(_list85.size);
          for (int _i86 = 0; _i86 < _list85.size; ++_i86)
          {
            com.cloudera.impala.thrift.TExpr _elem87; // required
            _elem87 = new com.cloudera.impala.thrift.TExpr();
            _elem87.read(iprot);
            struct.sort_tuple_slot_exprs.add(_elem87);
          }
        }
        struct.setSort_tuple_slot_exprsIsSet(true);
      }
    }
  }

}
