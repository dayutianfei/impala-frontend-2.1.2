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

public class TIntermediateColumnStats implements org.apache.thrift.TBase<TIntermediateColumnStats, TIntermediateColumnStats._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TIntermediateColumnStats");

  private static final org.apache.thrift.protocol.TField INTERMEDIATE_NDV_FIELD_DESC = new org.apache.thrift.protocol.TField("intermediate_ndv", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IS_NDV_ENCODED_FIELD_DESC = new org.apache.thrift.protocol.TField("is_ndv_encoded", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField NUM_NULLS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_nulls", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField MAX_WIDTH_FIELD_DESC = new org.apache.thrift.protocol.TField("max_width", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField AVG_WIDTH_FIELD_DESC = new org.apache.thrift.protocol.TField("avg_width", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField NUM_ROWS_FIELD_DESC = new org.apache.thrift.protocol.TField("num_rows", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TIntermediateColumnStatsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TIntermediateColumnStatsTupleSchemeFactory());
  }

  public ByteBuffer intermediate_ndv; // optional
  public boolean is_ndv_encoded; // optional
  public long num_nulls; // optional
  public int max_width; // optional
  public double avg_width; // optional
  public long num_rows; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INTERMEDIATE_NDV((short)1, "intermediate_ndv"),
    IS_NDV_ENCODED((short)2, "is_ndv_encoded"),
    NUM_NULLS((short)3, "num_nulls"),
    MAX_WIDTH((short)4, "max_width"),
    AVG_WIDTH((short)5, "avg_width"),
    NUM_ROWS((short)6, "num_rows");

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
        case 1: // INTERMEDIATE_NDV
          return INTERMEDIATE_NDV;
        case 2: // IS_NDV_ENCODED
          return IS_NDV_ENCODED;
        case 3: // NUM_NULLS
          return NUM_NULLS;
        case 4: // MAX_WIDTH
          return MAX_WIDTH;
        case 5: // AVG_WIDTH
          return AVG_WIDTH;
        case 6: // NUM_ROWS
          return NUM_ROWS;
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
  private static final int __IS_NDV_ENCODED_ISSET_ID = 0;
  private static final int __NUM_NULLS_ISSET_ID = 1;
  private static final int __MAX_WIDTH_ISSET_ID = 2;
  private static final int __AVG_WIDTH_ISSET_ID = 3;
  private static final int __NUM_ROWS_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.INTERMEDIATE_NDV,_Fields.IS_NDV_ENCODED,_Fields.NUM_NULLS,_Fields.MAX_WIDTH,_Fields.AVG_WIDTH,_Fields.NUM_ROWS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INTERMEDIATE_NDV, new org.apache.thrift.meta_data.FieldMetaData("intermediate_ndv", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.IS_NDV_ENCODED, new org.apache.thrift.meta_data.FieldMetaData("is_ndv_encoded", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.NUM_NULLS, new org.apache.thrift.meta_data.FieldMetaData("num_nulls", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.MAX_WIDTH, new org.apache.thrift.meta_data.FieldMetaData("max_width", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.AVG_WIDTH, new org.apache.thrift.meta_data.FieldMetaData("avg_width", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NUM_ROWS, new org.apache.thrift.meta_data.FieldMetaData("num_rows", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TIntermediateColumnStats.class, metaDataMap);
  }

  public TIntermediateColumnStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TIntermediateColumnStats(TIntermediateColumnStats other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIntermediate_ndv()) {
      this.intermediate_ndv = org.apache.thrift.TBaseHelper.copyBinary(other.intermediate_ndv);
;
    }
    this.is_ndv_encoded = other.is_ndv_encoded;
    this.num_nulls = other.num_nulls;
    this.max_width = other.max_width;
    this.avg_width = other.avg_width;
    this.num_rows = other.num_rows;
  }

  public TIntermediateColumnStats deepCopy() {
    return new TIntermediateColumnStats(this);
  }

  @Override
  public void clear() {
    this.intermediate_ndv = null;
    setIs_ndv_encodedIsSet(false);
    this.is_ndv_encoded = false;
    setNum_nullsIsSet(false);
    this.num_nulls = 0;
    setMax_widthIsSet(false);
    this.max_width = 0;
    setAvg_widthIsSet(false);
    this.avg_width = 0.0;
    setNum_rowsIsSet(false);
    this.num_rows = 0;
  }

  public byte[] getIntermediate_ndv() {
    setIntermediate_ndv(org.apache.thrift.TBaseHelper.rightSize(intermediate_ndv));
    return intermediate_ndv == null ? null : intermediate_ndv.array();
  }

  public ByteBuffer bufferForIntermediate_ndv() {
    return intermediate_ndv;
  }

  public TIntermediateColumnStats setIntermediate_ndv(byte[] intermediate_ndv) {
    setIntermediate_ndv(intermediate_ndv == null ? (ByteBuffer)null : ByteBuffer.wrap(intermediate_ndv));
    return this;
  }

  public TIntermediateColumnStats setIntermediate_ndv(ByteBuffer intermediate_ndv) {
    this.intermediate_ndv = intermediate_ndv;
    return this;
  }

  public void unsetIntermediate_ndv() {
    this.intermediate_ndv = null;
  }

  /** Returns true if field intermediate_ndv is set (has been assigned a value) and false otherwise */
  public boolean isSetIntermediate_ndv() {
    return this.intermediate_ndv != null;
  }

  public void setIntermediate_ndvIsSet(boolean value) {
    if (!value) {
      this.intermediate_ndv = null;
    }
  }

  public boolean isIs_ndv_encoded() {
    return this.is_ndv_encoded;
  }

  public TIntermediateColumnStats setIs_ndv_encoded(boolean is_ndv_encoded) {
    this.is_ndv_encoded = is_ndv_encoded;
    setIs_ndv_encodedIsSet(true);
    return this;
  }

  public void unsetIs_ndv_encoded() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __IS_NDV_ENCODED_ISSET_ID);
  }

  /** Returns true if field is_ndv_encoded is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_ndv_encoded() {
    return EncodingUtils.testBit(__isset_bitfield, __IS_NDV_ENCODED_ISSET_ID);
  }

  public void setIs_ndv_encodedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __IS_NDV_ENCODED_ISSET_ID, value);
  }

  public long getNum_nulls() {
    return this.num_nulls;
  }

  public TIntermediateColumnStats setNum_nulls(long num_nulls) {
    this.num_nulls = num_nulls;
    setNum_nullsIsSet(true);
    return this;
  }

  public void unsetNum_nulls() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_NULLS_ISSET_ID);
  }

  /** Returns true if field num_nulls is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_nulls() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_NULLS_ISSET_ID);
  }

  public void setNum_nullsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_NULLS_ISSET_ID, value);
  }

  public int getMax_width() {
    return this.max_width;
  }

  public TIntermediateColumnStats setMax_width(int max_width) {
    this.max_width = max_width;
    setMax_widthIsSet(true);
    return this;
  }

  public void unsetMax_width() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAX_WIDTH_ISSET_ID);
  }

  /** Returns true if field max_width is set (has been assigned a value) and false otherwise */
  public boolean isSetMax_width() {
    return EncodingUtils.testBit(__isset_bitfield, __MAX_WIDTH_ISSET_ID);
  }

  public void setMax_widthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAX_WIDTH_ISSET_ID, value);
  }

  public double getAvg_width() {
    return this.avg_width;
  }

  public TIntermediateColumnStats setAvg_width(double avg_width) {
    this.avg_width = avg_width;
    setAvg_widthIsSet(true);
    return this;
  }

  public void unsetAvg_width() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVG_WIDTH_ISSET_ID);
  }

  /** Returns true if field avg_width is set (has been assigned a value) and false otherwise */
  public boolean isSetAvg_width() {
    return EncodingUtils.testBit(__isset_bitfield, __AVG_WIDTH_ISSET_ID);
  }

  public void setAvg_widthIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVG_WIDTH_ISSET_ID, value);
  }

  public long getNum_rows() {
    return this.num_rows;
  }

  public TIntermediateColumnStats setNum_rows(long num_rows) {
    this.num_rows = num_rows;
    setNum_rowsIsSet(true);
    return this;
  }

  public void unsetNum_rows() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUM_ROWS_ISSET_ID);
  }

  /** Returns true if field num_rows is set (has been assigned a value) and false otherwise */
  public boolean isSetNum_rows() {
    return EncodingUtils.testBit(__isset_bitfield, __NUM_ROWS_ISSET_ID);
  }

  public void setNum_rowsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUM_ROWS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INTERMEDIATE_NDV:
      if (value == null) {
        unsetIntermediate_ndv();
      } else {
        setIntermediate_ndv((ByteBuffer)value);
      }
      break;

    case IS_NDV_ENCODED:
      if (value == null) {
        unsetIs_ndv_encoded();
      } else {
        setIs_ndv_encoded((Boolean)value);
      }
      break;

    case NUM_NULLS:
      if (value == null) {
        unsetNum_nulls();
      } else {
        setNum_nulls((Long)value);
      }
      break;

    case MAX_WIDTH:
      if (value == null) {
        unsetMax_width();
      } else {
        setMax_width((Integer)value);
      }
      break;

    case AVG_WIDTH:
      if (value == null) {
        unsetAvg_width();
      } else {
        setAvg_width((Double)value);
      }
      break;

    case NUM_ROWS:
      if (value == null) {
        unsetNum_rows();
      } else {
        setNum_rows((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INTERMEDIATE_NDV:
      return getIntermediate_ndv();

    case IS_NDV_ENCODED:
      return Boolean.valueOf(isIs_ndv_encoded());

    case NUM_NULLS:
      return Long.valueOf(getNum_nulls());

    case MAX_WIDTH:
      return Integer.valueOf(getMax_width());

    case AVG_WIDTH:
      return Double.valueOf(getAvg_width());

    case NUM_ROWS:
      return Long.valueOf(getNum_rows());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INTERMEDIATE_NDV:
      return isSetIntermediate_ndv();
    case IS_NDV_ENCODED:
      return isSetIs_ndv_encoded();
    case NUM_NULLS:
      return isSetNum_nulls();
    case MAX_WIDTH:
      return isSetMax_width();
    case AVG_WIDTH:
      return isSetAvg_width();
    case NUM_ROWS:
      return isSetNum_rows();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TIntermediateColumnStats)
      return this.equals((TIntermediateColumnStats)that);
    return false;
  }

  public boolean equals(TIntermediateColumnStats that) {
    if (that == null)
      return false;

    boolean this_present_intermediate_ndv = true && this.isSetIntermediate_ndv();
    boolean that_present_intermediate_ndv = true && that.isSetIntermediate_ndv();
    if (this_present_intermediate_ndv || that_present_intermediate_ndv) {
      if (!(this_present_intermediate_ndv && that_present_intermediate_ndv))
        return false;
      if (!this.intermediate_ndv.equals(that.intermediate_ndv))
        return false;
    }

    boolean this_present_is_ndv_encoded = true && this.isSetIs_ndv_encoded();
    boolean that_present_is_ndv_encoded = true && that.isSetIs_ndv_encoded();
    if (this_present_is_ndv_encoded || that_present_is_ndv_encoded) {
      if (!(this_present_is_ndv_encoded && that_present_is_ndv_encoded))
        return false;
      if (this.is_ndv_encoded != that.is_ndv_encoded)
        return false;
    }

    boolean this_present_num_nulls = true && this.isSetNum_nulls();
    boolean that_present_num_nulls = true && that.isSetNum_nulls();
    if (this_present_num_nulls || that_present_num_nulls) {
      if (!(this_present_num_nulls && that_present_num_nulls))
        return false;
      if (this.num_nulls != that.num_nulls)
        return false;
    }

    boolean this_present_max_width = true && this.isSetMax_width();
    boolean that_present_max_width = true && that.isSetMax_width();
    if (this_present_max_width || that_present_max_width) {
      if (!(this_present_max_width && that_present_max_width))
        return false;
      if (this.max_width != that.max_width)
        return false;
    }

    boolean this_present_avg_width = true && this.isSetAvg_width();
    boolean that_present_avg_width = true && that.isSetAvg_width();
    if (this_present_avg_width || that_present_avg_width) {
      if (!(this_present_avg_width && that_present_avg_width))
        return false;
      if (this.avg_width != that.avg_width)
        return false;
    }

    boolean this_present_num_rows = true && this.isSetNum_rows();
    boolean that_present_num_rows = true && that.isSetNum_rows();
    if (this_present_num_rows || that_present_num_rows) {
      if (!(this_present_num_rows && that_present_num_rows))
        return false;
      if (this.num_rows != that.num_rows)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_intermediate_ndv = true && (isSetIntermediate_ndv());
    builder.append(present_intermediate_ndv);
    if (present_intermediate_ndv)
      builder.append(intermediate_ndv);

    boolean present_is_ndv_encoded = true && (isSetIs_ndv_encoded());
    builder.append(present_is_ndv_encoded);
    if (present_is_ndv_encoded)
      builder.append(is_ndv_encoded);

    boolean present_num_nulls = true && (isSetNum_nulls());
    builder.append(present_num_nulls);
    if (present_num_nulls)
      builder.append(num_nulls);

    boolean present_max_width = true && (isSetMax_width());
    builder.append(present_max_width);
    if (present_max_width)
      builder.append(max_width);

    boolean present_avg_width = true && (isSetAvg_width());
    builder.append(present_avg_width);
    if (present_avg_width)
      builder.append(avg_width);

    boolean present_num_rows = true && (isSetNum_rows());
    builder.append(present_num_rows);
    if (present_num_rows)
      builder.append(num_rows);

    return builder.toHashCode();
  }

  public int compareTo(TIntermediateColumnStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TIntermediateColumnStats typedOther = (TIntermediateColumnStats)other;

    lastComparison = Boolean.valueOf(isSetIntermediate_ndv()).compareTo(typedOther.isSetIntermediate_ndv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntermediate_ndv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intermediate_ndv, typedOther.intermediate_ndv);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_ndv_encoded()).compareTo(typedOther.isSetIs_ndv_encoded());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_ndv_encoded()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_ndv_encoded, typedOther.is_ndv_encoded);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_nulls()).compareTo(typedOther.isSetNum_nulls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_nulls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_nulls, typedOther.num_nulls);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMax_width()).compareTo(typedOther.isSetMax_width());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMax_width()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.max_width, typedOther.max_width);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvg_width()).compareTo(typedOther.isSetAvg_width());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvg_width()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.avg_width, typedOther.avg_width);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNum_rows()).compareTo(typedOther.isSetNum_rows());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNum_rows()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.num_rows, typedOther.num_rows);
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
    StringBuilder sb = new StringBuilder("TIntermediateColumnStats(");
    boolean first = true;

    if (isSetIntermediate_ndv()) {
      sb.append("intermediate_ndv:");
      if (this.intermediate_ndv == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.intermediate_ndv, sb);
      }
      first = false;
    }
    if (isSetIs_ndv_encoded()) {
      if (!first) sb.append(", ");
      sb.append("is_ndv_encoded:");
      sb.append(this.is_ndv_encoded);
      first = false;
    }
    if (isSetNum_nulls()) {
      if (!first) sb.append(", ");
      sb.append("num_nulls:");
      sb.append(this.num_nulls);
      first = false;
    }
    if (isSetMax_width()) {
      if (!first) sb.append(", ");
      sb.append("max_width:");
      sb.append(this.max_width);
      first = false;
    }
    if (isSetAvg_width()) {
      if (!first) sb.append(", ");
      sb.append("avg_width:");
      sb.append(this.avg_width);
      first = false;
    }
    if (isSetNum_rows()) {
      if (!first) sb.append(", ");
      sb.append("num_rows:");
      sb.append(this.num_rows);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

  private static class TIntermediateColumnStatsStandardSchemeFactory implements SchemeFactory {
    public TIntermediateColumnStatsStandardScheme getScheme() {
      return new TIntermediateColumnStatsStandardScheme();
    }
  }

  private static class TIntermediateColumnStatsStandardScheme extends StandardScheme<TIntermediateColumnStats> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TIntermediateColumnStats struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INTERMEDIATE_NDV
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.intermediate_ndv = iprot.readBinary();
              struct.setIntermediate_ndvIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_NDV_ENCODED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.is_ndv_encoded = iprot.readBool();
              struct.setIs_ndv_encodedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NUM_NULLS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.num_nulls = iprot.readI64();
              struct.setNum_nullsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MAX_WIDTH
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.max_width = iprot.readI32();
              struct.setMax_widthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AVG_WIDTH
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.avg_width = iprot.readDouble();
              struct.setAvg_widthIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NUM_ROWS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.num_rows = iprot.readI64();
              struct.setNum_rowsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TIntermediateColumnStats struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.intermediate_ndv != null) {
        if (struct.isSetIntermediate_ndv()) {
          oprot.writeFieldBegin(INTERMEDIATE_NDV_FIELD_DESC);
          oprot.writeBinary(struct.intermediate_ndv);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetIs_ndv_encoded()) {
        oprot.writeFieldBegin(IS_NDV_ENCODED_FIELD_DESC);
        oprot.writeBool(struct.is_ndv_encoded);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum_nulls()) {
        oprot.writeFieldBegin(NUM_NULLS_FIELD_DESC);
        oprot.writeI64(struct.num_nulls);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMax_width()) {
        oprot.writeFieldBegin(MAX_WIDTH_FIELD_DESC);
        oprot.writeI32(struct.max_width);
        oprot.writeFieldEnd();
      }
      if (struct.isSetAvg_width()) {
        oprot.writeFieldBegin(AVG_WIDTH_FIELD_DESC);
        oprot.writeDouble(struct.avg_width);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNum_rows()) {
        oprot.writeFieldBegin(NUM_ROWS_FIELD_DESC);
        oprot.writeI64(struct.num_rows);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TIntermediateColumnStatsTupleSchemeFactory implements SchemeFactory {
    public TIntermediateColumnStatsTupleScheme getScheme() {
      return new TIntermediateColumnStatsTupleScheme();
    }
  }

  private static class TIntermediateColumnStatsTupleScheme extends TupleScheme<TIntermediateColumnStats> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TIntermediateColumnStats struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIntermediate_ndv()) {
        optionals.set(0);
      }
      if (struct.isSetIs_ndv_encoded()) {
        optionals.set(1);
      }
      if (struct.isSetNum_nulls()) {
        optionals.set(2);
      }
      if (struct.isSetMax_width()) {
        optionals.set(3);
      }
      if (struct.isSetAvg_width()) {
        optionals.set(4);
      }
      if (struct.isSetNum_rows()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetIntermediate_ndv()) {
        oprot.writeBinary(struct.intermediate_ndv);
      }
      if (struct.isSetIs_ndv_encoded()) {
        oprot.writeBool(struct.is_ndv_encoded);
      }
      if (struct.isSetNum_nulls()) {
        oprot.writeI64(struct.num_nulls);
      }
      if (struct.isSetMax_width()) {
        oprot.writeI32(struct.max_width);
      }
      if (struct.isSetAvg_width()) {
        oprot.writeDouble(struct.avg_width);
      }
      if (struct.isSetNum_rows()) {
        oprot.writeI64(struct.num_rows);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TIntermediateColumnStats struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.intermediate_ndv = iprot.readBinary();
        struct.setIntermediate_ndvIsSet(true);
      }
      if (incoming.get(1)) {
        struct.is_ndv_encoded = iprot.readBool();
        struct.setIs_ndv_encodedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.num_nulls = iprot.readI64();
        struct.setNum_nullsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.max_width = iprot.readI32();
        struct.setMax_widthIsSet(true);
      }
      if (incoming.get(4)) {
        struct.avg_width = iprot.readDouble();
        struct.setAvg_widthIsSet(true);
      }
      if (incoming.get(5)) {
        struct.num_rows = iprot.readI64();
        struct.setNum_rowsIsSet(true);
      }
    }
  }

}

