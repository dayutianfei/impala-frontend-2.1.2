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

public class TSymbolLookupResult implements org.apache.thrift.TBase<TSymbolLookupResult, TSymbolLookupResult._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TSymbolLookupResult");

  private static final org.apache.thrift.protocol.TField RESULT_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("result_code", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SYMBOL_FIELD_DESC = new org.apache.thrift.protocol.TField("symbol", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ERROR_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("error_msg", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TSymbolLookupResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TSymbolLookupResultTupleSchemeFactory());
  }

  /**
   * 
   * @see TSymbolLookupResultCode
   */
  public TSymbolLookupResultCode result_code; // required
  public String symbol; // optional
  public String error_msg; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TSymbolLookupResultCode
     */
    RESULT_CODE((short)1, "result_code"),
    SYMBOL((short)2, "symbol"),
    ERROR_MSG((short)3, "error_msg");

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
        case 1: // RESULT_CODE
          return RESULT_CODE;
        case 2: // SYMBOL
          return SYMBOL;
        case 3: // ERROR_MSG
          return ERROR_MSG;
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
  private _Fields optionals[] = {_Fields.SYMBOL,_Fields.ERROR_MSG};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESULT_CODE, new org.apache.thrift.meta_data.FieldMetaData("result_code", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TSymbolLookupResultCode.class)));
    tmpMap.put(_Fields.SYMBOL, new org.apache.thrift.meta_data.FieldMetaData("symbol", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ERROR_MSG, new org.apache.thrift.meta_data.FieldMetaData("error_msg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TSymbolLookupResult.class, metaDataMap);
  }

  public TSymbolLookupResult() {
  }

  public TSymbolLookupResult(
    TSymbolLookupResultCode result_code)
  {
    this();
    this.result_code = result_code;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TSymbolLookupResult(TSymbolLookupResult other) {
    if (other.isSetResult_code()) {
      this.result_code = other.result_code;
    }
    if (other.isSetSymbol()) {
      this.symbol = other.symbol;
    }
    if (other.isSetError_msg()) {
      this.error_msg = other.error_msg;
    }
  }

  public TSymbolLookupResult deepCopy() {
    return new TSymbolLookupResult(this);
  }

  @Override
  public void clear() {
    this.result_code = null;
    this.symbol = null;
    this.error_msg = null;
  }

  /**
   * 
   * @see TSymbolLookupResultCode
   */
  public TSymbolLookupResultCode getResult_code() {
    return this.result_code;
  }

  /**
   * 
   * @see TSymbolLookupResultCode
   */
  public TSymbolLookupResult setResult_code(TSymbolLookupResultCode result_code) {
    this.result_code = result_code;
    return this;
  }

  public void unsetResult_code() {
    this.result_code = null;
  }

  /** Returns true if field result_code is set (has been assigned a value) and false otherwise */
  public boolean isSetResult_code() {
    return this.result_code != null;
  }

  public void setResult_codeIsSet(boolean value) {
    if (!value) {
      this.result_code = null;
    }
  }

  public String getSymbol() {
    return this.symbol;
  }

  public TSymbolLookupResult setSymbol(String symbol) {
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

  public String getError_msg() {
    return this.error_msg;
  }

  public TSymbolLookupResult setError_msg(String error_msg) {
    this.error_msg = error_msg;
    return this;
  }

  public void unsetError_msg() {
    this.error_msg = null;
  }

  /** Returns true if field error_msg is set (has been assigned a value) and false otherwise */
  public boolean isSetError_msg() {
    return this.error_msg != null;
  }

  public void setError_msgIsSet(boolean value) {
    if (!value) {
      this.error_msg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT_CODE:
      if (value == null) {
        unsetResult_code();
      } else {
        setResult_code((TSymbolLookupResultCode)value);
      }
      break;

    case SYMBOL:
      if (value == null) {
        unsetSymbol();
      } else {
        setSymbol((String)value);
      }
      break;

    case ERROR_MSG:
      if (value == null) {
        unsetError_msg();
      } else {
        setError_msg((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_CODE:
      return getResult_code();

    case SYMBOL:
      return getSymbol();

    case ERROR_MSG:
      return getError_msg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT_CODE:
      return isSetResult_code();
    case SYMBOL:
      return isSetSymbol();
    case ERROR_MSG:
      return isSetError_msg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TSymbolLookupResult)
      return this.equals((TSymbolLookupResult)that);
    return false;
  }

  public boolean equals(TSymbolLookupResult that) {
    if (that == null)
      return false;

    boolean this_present_result_code = true && this.isSetResult_code();
    boolean that_present_result_code = true && that.isSetResult_code();
    if (this_present_result_code || that_present_result_code) {
      if (!(this_present_result_code && that_present_result_code))
        return false;
      if (!this.result_code.equals(that.result_code))
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

    boolean this_present_error_msg = true && this.isSetError_msg();
    boolean that_present_error_msg = true && that.isSetError_msg();
    if (this_present_error_msg || that_present_error_msg) {
      if (!(this_present_error_msg && that_present_error_msg))
        return false;
      if (!this.error_msg.equals(that.error_msg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_result_code = true && (isSetResult_code());
    builder.append(present_result_code);
    if (present_result_code)
      builder.append(result_code.getValue());

    boolean present_symbol = true && (isSetSymbol());
    builder.append(present_symbol);
    if (present_symbol)
      builder.append(symbol);

    boolean present_error_msg = true && (isSetError_msg());
    builder.append(present_error_msg);
    if (present_error_msg)
      builder.append(error_msg);

    return builder.toHashCode();
  }

  public int compareTo(TSymbolLookupResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TSymbolLookupResult typedOther = (TSymbolLookupResult)other;

    lastComparison = Boolean.valueOf(isSetResult_code()).compareTo(typedOther.isSetResult_code());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult_code()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result_code, typedOther.result_code);
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
    lastComparison = Boolean.valueOf(isSetError_msg()).compareTo(typedOther.isSetError_msg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetError_msg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error_msg, typedOther.error_msg);
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
    StringBuilder sb = new StringBuilder("TSymbolLookupResult(");
    boolean first = true;

    sb.append("result_code:");
    if (this.result_code == null) {
      sb.append("null");
    } else {
      sb.append(this.result_code);
    }
    first = false;
    if (isSetSymbol()) {
      if (!first) sb.append(", ");
      sb.append("symbol:");
      if (this.symbol == null) {
        sb.append("null");
      } else {
        sb.append(this.symbol);
      }
      first = false;
    }
    if (isSetError_msg()) {
      if (!first) sb.append(", ");
      sb.append("error_msg:");
      if (this.error_msg == null) {
        sb.append("null");
      } else {
        sb.append(this.error_msg);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (result_code == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result_code' was not present! Struct: " + toString());
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

  private static class TSymbolLookupResultStandardSchemeFactory implements SchemeFactory {
    public TSymbolLookupResultStandardScheme getScheme() {
      return new TSymbolLookupResultStandardScheme();
    }
  }

  private static class TSymbolLookupResultStandardScheme extends StandardScheme<TSymbolLookupResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TSymbolLookupResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.result_code = TSymbolLookupResultCode.findByValue(iprot.readI32());
              struct.setResult_codeIsSet(true);
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
          case 3: // ERROR_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.error_msg = iprot.readString();
              struct.setError_msgIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TSymbolLookupResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.result_code != null) {
        oprot.writeFieldBegin(RESULT_CODE_FIELD_DESC);
        oprot.writeI32(struct.result_code.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.symbol != null) {
        if (struct.isSetSymbol()) {
          oprot.writeFieldBegin(SYMBOL_FIELD_DESC);
          oprot.writeString(struct.symbol);
          oprot.writeFieldEnd();
        }
      }
      if (struct.error_msg != null) {
        if (struct.isSetError_msg()) {
          oprot.writeFieldBegin(ERROR_MSG_FIELD_DESC);
          oprot.writeString(struct.error_msg);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TSymbolLookupResultTupleSchemeFactory implements SchemeFactory {
    public TSymbolLookupResultTupleScheme getScheme() {
      return new TSymbolLookupResultTupleScheme();
    }
  }

  private static class TSymbolLookupResultTupleScheme extends TupleScheme<TSymbolLookupResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TSymbolLookupResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.result_code.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetSymbol()) {
        optionals.set(0);
      }
      if (struct.isSetError_msg()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSymbol()) {
        oprot.writeString(struct.symbol);
      }
      if (struct.isSetError_msg()) {
        oprot.writeString(struct.error_msg);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TSymbolLookupResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.result_code = TSymbolLookupResultCode.findByValue(iprot.readI32());
      struct.setResult_codeIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.symbol = iprot.readString();
        struct.setSymbolIsSet(true);
      }
      if (incoming.get(1)) {
        struct.error_msg = iprot.readString();
        struct.setError_msgIsSet(true);
      }
    }
  }

}

