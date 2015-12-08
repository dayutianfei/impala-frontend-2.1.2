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

public class TSymbolLookupParams implements org.apache.thrift.TBase<TSymbolLookupParams, TSymbolLookupParams._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSymbolLookupParams");

  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SYMBOL_FIELD_DESC = new org.apache.thrift.protocol.TField("symbol", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField FN_BINARY_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("fn_binary_type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ARG_TYPES_FIELD_DESC = new org.apache.thrift.protocol.TField("arg_types", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField HAS_VAR_ARGS_FIELD_DESC = new org.apache.thrift.protocol.TField("has_var_args", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField RET_ARG_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("ret_arg_type", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField SYMBOL_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("symbol_type", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSymbolLookupParamsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSymbolLookupParamsTupleSchemeFactory());
  }

  public String location; // required
  public String symbol; // required
  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionBinaryType
   */
  public com.cloudera.impala.thrift.TFunctionBinaryType fn_binary_type; // required
  public List<com.cloudera.impala.thrift.TColumnType> arg_types; // required
  public boolean has_var_args; // required
  public com.cloudera.impala.thrift.TColumnType ret_arg_type; // optional
  /**
   * 
   * @see TSymbolType
   */
  public TSymbolType symbol_type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOCATION((short)1, "location"),
    SYMBOL((short)2, "symbol"),
    /**
     * 
     * @see com.cloudera.impala.thrift.TFunctionBinaryType
     */
    FN_BINARY_TYPE((short)3, "fn_binary_type"),
    ARG_TYPES((short)4, "arg_types"),
    HAS_VAR_ARGS((short)5, "has_var_args"),
    RET_ARG_TYPE((short)6, "ret_arg_type"),
    /**
     * 
     * @see TSymbolType
     */
    SYMBOL_TYPE((short)7, "symbol_type");

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
        case 1: // LOCATION
          return LOCATION;
        case 2: // SYMBOL
          return SYMBOL;
        case 3: // FN_BINARY_TYPE
          return FN_BINARY_TYPE;
        case 4: // ARG_TYPES
          return ARG_TYPES;
        case 5: // HAS_VAR_ARGS
          return HAS_VAR_ARGS;
        case 6: // RET_ARG_TYPE
          return RET_ARG_TYPE;
        case 7: // SYMBOL_TYPE
          return SYMBOL_TYPE;
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
  private static final int __HAS_VAR_ARGS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.RET_ARG_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SYMBOL, new org.apache.thrift.meta_data.FieldMetaData("symbol", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FN_BINARY_TYPE, new org.apache.thrift.meta_data.FieldMetaData("fn_binary_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, com.cloudera.impala.thrift.TFunctionBinaryType.class)));
    tmpMap.put(_Fields.ARG_TYPES, new org.apache.thrift.meta_data.FieldMetaData("arg_types", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TColumnType.class))));
    tmpMap.put(_Fields.HAS_VAR_ARGS, new org.apache.thrift.meta_data.FieldMetaData("has_var_args", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RET_ARG_TYPE, new org.apache.thrift.meta_data.FieldMetaData("ret_arg_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.cloudera.impala.thrift.TColumnType.class)));
    tmpMap.put(_Fields.SYMBOL_TYPE, new org.apache.thrift.meta_data.FieldMetaData("symbol_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TSymbolType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSymbolLookupParams.class, metaDataMap);
  }

  public TSymbolLookupParams() {
  }

  public TSymbolLookupParams(
    String location,
    String symbol,
    com.cloudera.impala.thrift.TFunctionBinaryType fn_binary_type,
    List<com.cloudera.impala.thrift.TColumnType> arg_types,
    boolean has_var_args,
    TSymbolType symbol_type)
  {
    this();
    this.location = location;
    this.symbol = symbol;
    this.fn_binary_type = fn_binary_type;
    this.arg_types = arg_types;
    this.has_var_args = has_var_args;
    setHas_var_argsIsSet(true);
    this.symbol_type = symbol_type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSymbolLookupParams(TSymbolLookupParams other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    if (other.isSetSymbol()) {
      this.symbol = other.symbol;
    }
    if (other.isSetFn_binary_type()) {
      this.fn_binary_type = other.fn_binary_type;
    }
    if (other.isSetArg_types()) {
      List<com.cloudera.impala.thrift.TColumnType> __this__arg_types = new ArrayList<com.cloudera.impala.thrift.TColumnType>();
      for (com.cloudera.impala.thrift.TColumnType other_element : other.arg_types) {
        __this__arg_types.add(new com.cloudera.impala.thrift.TColumnType(other_element));
      }
      this.arg_types = __this__arg_types;
    }
    this.has_var_args = other.has_var_args;
    if (other.isSetRet_arg_type()) {
      this.ret_arg_type = new com.cloudera.impala.thrift.TColumnType(other.ret_arg_type);
    }
    if (other.isSetSymbol_type()) {
      this.symbol_type = other.symbol_type;
    }
  }

  public TSymbolLookupParams deepCopy() {
    return new TSymbolLookupParams(this);
  }

  @Override
  public void clear() {
    this.location = null;
    this.symbol = null;
    this.fn_binary_type = null;
    this.arg_types = null;
    setHas_var_argsIsSet(false);
    this.has_var_args = false;
    this.ret_arg_type = null;
    this.symbol_type = null;
  }

  public String getLocation() {
    return this.location;
  }

  public TSymbolLookupParams setLocation(String location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public String getSymbol() {
    return this.symbol;
  }

  public TSymbolLookupParams setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public void unsetSymbol() {
    this.symbol = null;
  }

  /** Returns true if field symbol is set (has been assigned a value) and false otherwise */
  public boolean isSetSymbol() {
    return this.symbol != null;
  }

  public void setSymbolIsSet(boolean value) {
    if (!value) {
      this.symbol = null;
    }
  }

  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionBinaryType
   */
  public com.cloudera.impala.thrift.TFunctionBinaryType getFn_binary_type() {
    return this.fn_binary_type;
  }

  /**
   * 
   * @see com.cloudera.impala.thrift.TFunctionBinaryType
   */
  public TSymbolLookupParams setFn_binary_type(com.cloudera.impala.thrift.TFunctionBinaryType fn_binary_type) {
    this.fn_binary_type = fn_binary_type;
    return this;
  }

  public void unsetFn_binary_type() {
    this.fn_binary_type = null;
  }

  /** Returns true if field fn_binary_type is set (has been assigned a value) and false otherwise */
  public boolean isSetFn_binary_type() {
    return this.fn_binary_type != null;
  }

  public void setFn_binary_typeIsSet(boolean value) {
    if (!value) {
      this.fn_binary_type = null;
    }
  }

  public int getArg_typesSize() {
    return (this.arg_types == null) ? 0 : this.arg_types.size();
  }

  public java.util.Iterator<com.cloudera.impala.thrift.TColumnType> getArg_typesIterator() {
    return (this.arg_types == null) ? null : this.arg_types.iterator();
  }

  public void addToArg_types(com.cloudera.impala.thrift.TColumnType elem) {
    if (this.arg_types == null) {
      this.arg_types = new ArrayList<com.cloudera.impala.thrift.TColumnType>();
    }
    this.arg_types.add(elem);
  }

  public List<com.cloudera.impala.thrift.TColumnType> getArg_types() {
    return this.arg_types;
  }

  public TSymbolLookupParams setArg_types(List<com.cloudera.impala.thrift.TColumnType> arg_types) {
    this.arg_types = arg_types;
    return this;
  }

  public void unsetArg_types() {
    this.arg_types = null;
  }

  /** Returns true if field arg_types is set (has been assigned a value) and false otherwise */
  public boolean isSetArg_types() {
    return this.arg_types != null;
  }

  public void setArg_typesIsSet(boolean value) {
    if (!value) {
      this.arg_types = null;
    }
  }

  public boolean isHas_var_args() {
    return this.has_var_args;
  }

  public TSymbolLookupParams setHas_var_args(boolean has_var_args) {
    this.has_var_args = has_var_args;
    setHas_var_argsIsSet(true);
    return this;
  }

  public void unsetHas_var_args() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HAS_VAR_ARGS_ISSET_ID);
  }

  /** Returns true if field has_var_args is set (has been assigned a value) and false otherwise */
  public boolean isSetHas_var_args() {
    return EncodingUtils.testBit(__isset_bitfield, __HAS_VAR_ARGS_ISSET_ID);
  }

  public void setHas_var_argsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HAS_VAR_ARGS_ISSET_ID, value);
  }

  public com.cloudera.impala.thrift.TColumnType getRet_arg_type() {
    return this.ret_arg_type;
  }

  public TSymbolLookupParams setRet_arg_type(com.cloudera.impala.thrift.TColumnType ret_arg_type) {
    this.ret_arg_type = ret_arg_type;
    return this;
  }

  public void unsetRet_arg_type() {
    this.ret_arg_type = null;
  }

  /** Returns true if field ret_arg_type is set (has been assigned a value) and false otherwise */
  public boolean isSetRet_arg_type() {
    return this.ret_arg_type != null;
  }

  public void setRet_arg_typeIsSet(boolean value) {
    if (!value) {
      this.ret_arg_type = null;
    }
  }

  /**
   * 
   * @see TSymbolType
   */
  public TSymbolType getSymbol_type() {
    return this.symbol_type;
  }

  /**
   * 
   * @see TSymbolType
   */
  public TSymbolLookupParams setSymbol_type(TSymbolType symbol_type) {
    this.symbol_type = symbol_type;
    return this;
  }

  public void unsetSymbol_type() {
    this.symbol_type = null;
  }

  /** Returns true if field symbol_type is set (has been assigned a value) and false otherwise */
  public boolean isSetSymbol_type() {
    return this.symbol_type != null;
  }

  public void setSymbol_typeIsSet(boolean value) {
    if (!value) {
      this.symbol_type = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case SYMBOL:
      if (value == null) {
        unsetSymbol();
      } else {
        setSymbol((String)value);
      }
      break;

    case FN_BINARY_TYPE:
      if (value == null) {
        unsetFn_binary_type();
      } else {
        setFn_binary_type((com.cloudera.impala.thrift.TFunctionBinaryType)value);
      }
      break;

    case ARG_TYPES:
      if (value == null) {
        unsetArg_types();
      } else {
        setArg_types((List<com.cloudera.impala.thrift.TColumnType>)value);
      }
      break;

    case HAS_VAR_ARGS:
      if (value == null) {
        unsetHas_var_args();
      } else {
        setHas_var_args((Boolean)value);
      }
      break;

    case RET_ARG_TYPE:
      if (value == null) {
        unsetRet_arg_type();
      } else {
        setRet_arg_type((com.cloudera.impala.thrift.TColumnType)value);
      }
      break;

    case SYMBOL_TYPE:
      if (value == null) {
        unsetSymbol_type();
      } else {
        setSymbol_type((TSymbolType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOCATION:
      return getLocation();

    case SYMBOL:
      return getSymbol();

    case FN_BINARY_TYPE:
      return getFn_binary_type();

    case ARG_TYPES:
      return getArg_types();

    case HAS_VAR_ARGS:
      return Boolean.valueOf(isHas_var_args());

    case RET_ARG_TYPE:
      return getRet_arg_type();

    case SYMBOL_TYPE:
      return getSymbol_type();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOCATION:
      return isSetLocation();
    case SYMBOL:
      return isSetSymbol();
    case FN_BINARY_TYPE:
      return isSetFn_binary_type();
    case ARG_TYPES:
      return isSetArg_types();
    case HAS_VAR_ARGS:
      return isSetHas_var_args();
    case RET_ARG_TYPE:
      return isSetRet_arg_type();
    case SYMBOL_TYPE:
      return isSetSymbol_type();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSymbolLookupParams)
      return this.equals((TSymbolLookupParams)that);
    return false;
  }

  public boolean equals(TSymbolLookupParams that) {
    if (that == null)
      return false;

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_symbol = true && this.isSetSymbol();
    boolean that_present_symbol = true && that.isSetSymbol();
    if (this_present_symbol || that_present_symbol) {
      if (!(this_present_symbol && that_present_symbol))
        return false;
      if (!this.symbol.equals(that.symbol))
        return false;
    }

    boolean this_present_fn_binary_type = true && this.isSetFn_binary_type();
    boolean that_present_fn_binary_type = true && that.isSetFn_binary_type();
    if (this_present_fn_binary_type || that_present_fn_binary_type) {
      if (!(this_present_fn_binary_type && that_present_fn_binary_type))
        return false;
      if (!this.fn_binary_type.equals(that.fn_binary_type))
        return false;
    }

    boolean this_present_arg_types = true && this.isSetArg_types();
    boolean that_present_arg_types = true && that.isSetArg_types();
    if (this_present_arg_types || that_present_arg_types) {
      if (!(this_present_arg_types && that_present_arg_types))
        return false;
      if (!this.arg_types.equals(that.arg_types))
        return false;
    }

    boolean this_present_has_var_args = true;
    boolean that_present_has_var_args = true;
    if (this_present_has_var_args || that_present_has_var_args) {
      if (!(this_present_has_var_args && that_present_has_var_args))
        return false;
      if (this.has_var_args != that.has_var_args)
        return false;
    }

    boolean this_present_ret_arg_type = true && this.isSetRet_arg_type();
    boolean that_present_ret_arg_type = true && that.isSetRet_arg_type();
    if (this_present_ret_arg_type || that_present_ret_arg_type) {
      if (!(this_present_ret_arg_type && that_present_ret_arg_type))
        return false;
      if (!this.ret_arg_type.equals(that.ret_arg_type))
        return false;
    }

    boolean this_present_symbol_type = true && this.isSetSymbol_type();
    boolean that_present_symbol_type = true && that.isSetSymbol_type();
    if (this_present_symbol_type || that_present_symbol_type) {
      if (!(this_present_symbol_type && that_present_symbol_type))
        return false;
      if (!this.symbol_type.equals(that.symbol_type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_location = true && (isSetLocation());
    builder.append(present_location);
    if (present_location)
      builder.append(location);

    boolean present_symbol = true && (isSetSymbol());
    builder.append(present_symbol);
    if (present_symbol)
      builder.append(symbol);

    boolean present_fn_binary_type = true && (isSetFn_binary_type());
    builder.append(present_fn_binary_type);
    if (present_fn_binary_type)
      builder.append(fn_binary_type.getValue());

    boolean present_arg_types = true && (isSetArg_types());
    builder.append(present_arg_types);
    if (present_arg_types)
      builder.append(arg_types);

    boolean present_has_var_args = true;
    builder.append(present_has_var_args);
    if (present_has_var_args)
      builder.append(has_var_args);

    boolean present_ret_arg_type = true && (isSetRet_arg_type());
    builder.append(present_ret_arg_type);
    if (present_ret_arg_type)
      builder.append(ret_arg_type);

    boolean present_symbol_type = true && (isSetSymbol_type());
    builder.append(present_symbol_type);
    if (present_symbol_type)
      builder.append(symbol_type.getValue());

    return builder.toHashCode();
  }

  public int compareTo(TSymbolLookupParams other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSymbolLookupParams typedOther = (TSymbolLookupParams)other;

    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(typedOther.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, typedOther.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSymbol()).compareTo(typedOther.isSetSymbol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSymbol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.symbol, typedOther.symbol);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFn_binary_type()).compareTo(typedOther.isSetFn_binary_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFn_binary_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fn_binary_type, typedOther.fn_binary_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetArg_types()).compareTo(typedOther.isSetArg_types());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArg_types()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.arg_types, typedOther.arg_types);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHas_var_args()).compareTo(typedOther.isSetHas_var_args());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHas_var_args()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.has_var_args, typedOther.has_var_args);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRet_arg_type()).compareTo(typedOther.isSetRet_arg_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRet_arg_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ret_arg_type, typedOther.ret_arg_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSymbol_type()).compareTo(typedOther.isSetSymbol_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSymbol_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.symbol_type, typedOther.symbol_type);
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
    StringBuilder sb = new StringBuilder("TSymbolLookupParams(");
    boolean first = true;

    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("symbol:");
    if (this.symbol == null) {
      sb.append("null");
    } else {
      sb.append(this.symbol);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("fn_binary_type:");
    if (this.fn_binary_type == null) {
      sb.append("null");
    } else {
      sb.append(this.fn_binary_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("arg_types:");
    if (this.arg_types == null) {
      sb.append("null");
    } else {
      sb.append(this.arg_types);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("has_var_args:");
    sb.append(this.has_var_args);
    first = false;
    if (isSetRet_arg_type()) {
      if (!first) sb.append(", ");
      sb.append("ret_arg_type:");
      if (this.ret_arg_type == null) {
        sb.append("null");
      } else {
        sb.append(this.ret_arg_type);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("symbol_type:");
    if (this.symbol_type == null) {
      sb.append("null");
    } else {
      sb.append(this.symbol_type);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (location == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'location' was not present! Struct: " + toString());
    }
    if (symbol == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'symbol' was not present! Struct: " + toString());
    }
    if (fn_binary_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'fn_binary_type' was not present! Struct: " + toString());
    }
    if (arg_types == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'arg_types' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'has_var_args' because it's a primitive and you chose the non-beans generator.
    if (symbol_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'symbol_type' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (ret_arg_type != null) {
      ret_arg_type.validate();
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

  private static class TSymbolLookupParamsStandardSchemeFactory implements SchemeFactory {
    public TSymbolLookupParamsStandardScheme getScheme() {
      return new TSymbolLookupParamsStandardScheme();
    }
  }

  private static class TSymbolLookupParamsStandardScheme extends StandardScheme<TSymbolLookupParams> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSymbolLookupParams struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SYMBOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.symbol = iprot.readString();
              struct.setSymbolIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // FN_BINARY_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.fn_binary_type = com.cloudera.impala.thrift.TFunctionBinaryType.findByValue(iprot.readI32());
              struct.setFn_binary_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ARG_TYPES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list162 = iprot.readListBegin();
                struct.arg_types = new ArrayList<com.cloudera.impala.thrift.TColumnType>(_list162.size);
                for (int _i163 = 0; _i163 < _list162.size; ++_i163)
                {
                  com.cloudera.impala.thrift.TColumnType _elem164; // required
                  _elem164 = new com.cloudera.impala.thrift.TColumnType();
                  _elem164.read(iprot);
                  struct.arg_types.add(_elem164);
                }
                iprot.readListEnd();
              }
              struct.setArg_typesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HAS_VAR_ARGS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.has_var_args = iprot.readBool();
              struct.setHas_var_argsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RET_ARG_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ret_arg_type = new com.cloudera.impala.thrift.TColumnType();
              struct.ret_arg_type.read(iprot);
              struct.setRet_arg_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // SYMBOL_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.symbol_type = TSymbolType.findByValue(iprot.readI32());
              struct.setSymbol_typeIsSet(true);
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
      if (!struct.isSetHas_var_args()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'has_var_args' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSymbolLookupParams struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.location);
        oprot.writeFieldEnd();
      }
      if (struct.symbol != null) {
        oprot.writeFieldBegin(SYMBOL_FIELD_DESC);
        oprot.writeString(struct.symbol);
        oprot.writeFieldEnd();
      }
      if (struct.fn_binary_type != null) {
        oprot.writeFieldBegin(FN_BINARY_TYPE_FIELD_DESC);
        oprot.writeI32(struct.fn_binary_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.arg_types != null) {
        oprot.writeFieldBegin(ARG_TYPES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.arg_types.size()));
          for (com.cloudera.impala.thrift.TColumnType _iter165 : struct.arg_types)
          {
            _iter165.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_VAR_ARGS_FIELD_DESC);
      oprot.writeBool(struct.has_var_args);
      oprot.writeFieldEnd();
      if (struct.ret_arg_type != null) {
        if (struct.isSetRet_arg_type()) {
          oprot.writeFieldBegin(RET_ARG_TYPE_FIELD_DESC);
          struct.ret_arg_type.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.symbol_type != null) {
        oprot.writeFieldBegin(SYMBOL_TYPE_FIELD_DESC);
        oprot.writeI32(struct.symbol_type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSymbolLookupParamsTupleSchemeFactory implements SchemeFactory {
    public TSymbolLookupParamsTupleScheme getScheme() {
      return new TSymbolLookupParamsTupleScheme();
    }
  }

  private static class TSymbolLookupParamsTupleScheme extends TupleScheme<TSymbolLookupParams> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSymbolLookupParams struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.location);
      oprot.writeString(struct.symbol);
      oprot.writeI32(struct.fn_binary_type.getValue());
      {
        oprot.writeI32(struct.arg_types.size());
        for (com.cloudera.impala.thrift.TColumnType _iter166 : struct.arg_types)
        {
          _iter166.write(oprot);
        }
      }
      oprot.writeBool(struct.has_var_args);
      oprot.writeI32(struct.symbol_type.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetRet_arg_type()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRet_arg_type()) {
        struct.ret_arg_type.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSymbolLookupParams struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.location = iprot.readString();
      struct.setLocationIsSet(true);
      struct.symbol = iprot.readString();
      struct.setSymbolIsSet(true);
      struct.fn_binary_type = com.cloudera.impala.thrift.TFunctionBinaryType.findByValue(iprot.readI32());
      struct.setFn_binary_typeIsSet(true);
      {
        org.apache.thrift.protocol.TList _list167 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.arg_types = new ArrayList<com.cloudera.impala.thrift.TColumnType>(_list167.size);
        for (int _i168 = 0; _i168 < _list167.size; ++_i168)
        {
          com.cloudera.impala.thrift.TColumnType _elem169; // required
          _elem169 = new com.cloudera.impala.thrift.TColumnType();
          _elem169.read(iprot);
          struct.arg_types.add(_elem169);
        }
      }
      struct.setArg_typesIsSet(true);
      struct.has_var_args = iprot.readBool();
      struct.setHas_var_argsIsSet(true);
      struct.symbol_type = TSymbolType.findByValue(iprot.readI32());
      struct.setSymbol_typeIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.ret_arg_type = new com.cloudera.impala.thrift.TColumnType();
        struct.ret_arg_type.read(iprot);
        struct.setRet_arg_typeIsSet(true);
      }
    }
  }

}

