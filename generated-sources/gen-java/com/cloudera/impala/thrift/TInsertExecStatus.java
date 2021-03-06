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

public class TInsertExecStatus implements org.apache.thrift.TBase<TInsertExecStatus, TInsertExecStatus._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TInsertExecStatus");

  private static final org.apache.thrift.protocol.TField FILES_TO_MOVE_FIELD_DESC = new org.apache.thrift.protocol.TField("files_to_move", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField PER_PARTITION_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("per_partition_status", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TInsertExecStatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TInsertExecStatusTupleSchemeFactory());
  }

  public Map<String,String> files_to_move; // required
  public Map<String,TInsertPartitionStatus> per_partition_status; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    FILES_TO_MOVE((short)1, "files_to_move"),
    PER_PARTITION_STATUS((short)2, "per_partition_status");

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
        case 1: // FILES_TO_MOVE
          return FILES_TO_MOVE;
        case 2: // PER_PARTITION_STATUS
          return PER_PARTITION_STATUS;
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
  private _Fields optionals[] = {_Fields.PER_PARTITION_STATUS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.FILES_TO_MOVE, new org.apache.thrift.meta_data.FieldMetaData("files_to_move", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.PER_PARTITION_STATUS, new org.apache.thrift.meta_data.FieldMetaData("per_partition_status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TInsertPartitionStatus.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TInsertExecStatus.class, metaDataMap);
  }

  public TInsertExecStatus() {
  }

  public TInsertExecStatus(
    Map<String,String> files_to_move)
  {
    this();
    this.files_to_move = files_to_move;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TInsertExecStatus(TInsertExecStatus other) {
    if (other.isSetFiles_to_move()) {
      Map<String,String> __this__files_to_move = new HashMap<String,String>();
      for (Map.Entry<String, String> other_element : other.files_to_move.entrySet()) {

        String other_element_key = other_element.getKey();
        String other_element_value = other_element.getValue();

        String __this__files_to_move_copy_key = other_element_key;

        String __this__files_to_move_copy_value = other_element_value;

        __this__files_to_move.put(__this__files_to_move_copy_key, __this__files_to_move_copy_value);
      }
      this.files_to_move = __this__files_to_move;
    }
    if (other.isSetPer_partition_status()) {
      Map<String,TInsertPartitionStatus> __this__per_partition_status = new HashMap<String,TInsertPartitionStatus>();
      for (Map.Entry<String, TInsertPartitionStatus> other_element : other.per_partition_status.entrySet()) {

        String other_element_key = other_element.getKey();
        TInsertPartitionStatus other_element_value = other_element.getValue();

        String __this__per_partition_status_copy_key = other_element_key;

        TInsertPartitionStatus __this__per_partition_status_copy_value = new TInsertPartitionStatus(other_element_value);

        __this__per_partition_status.put(__this__per_partition_status_copy_key, __this__per_partition_status_copy_value);
      }
      this.per_partition_status = __this__per_partition_status;
    }
  }

  public TInsertExecStatus deepCopy() {
    return new TInsertExecStatus(this);
  }

  @Override
  public void clear() {
    this.files_to_move = null;
    this.per_partition_status = null;
  }

  public int getFiles_to_moveSize() {
    return (this.files_to_move == null) ? 0 : this.files_to_move.size();
  }

  public void putToFiles_to_move(String key, String val) {
    if (this.files_to_move == null) {
      this.files_to_move = new HashMap<String,String>();
    }
    this.files_to_move.put(key, val);
  }

  public Map<String,String> getFiles_to_move() {
    return this.files_to_move;
  }

  public TInsertExecStatus setFiles_to_move(Map<String,String> files_to_move) {
    this.files_to_move = files_to_move;
    return this;
  }

  public void unsetFiles_to_move() {
    this.files_to_move = null;
  }

  /** Returns true if field files_to_move is set (has been assigned a value) and false otherwise */
  public boolean isSetFiles_to_move() {
    return this.files_to_move != null;
  }

  public void setFiles_to_moveIsSet(boolean value) {
    if (!value) {
      this.files_to_move = null;
    }
  }

  public int getPer_partition_statusSize() {
    return (this.per_partition_status == null) ? 0 : this.per_partition_status.size();
  }

  public void putToPer_partition_status(String key, TInsertPartitionStatus val) {
    if (this.per_partition_status == null) {
      this.per_partition_status = new HashMap<String,TInsertPartitionStatus>();
    }
    this.per_partition_status.put(key, val);
  }

  public Map<String,TInsertPartitionStatus> getPer_partition_status() {
    return this.per_partition_status;
  }

  public TInsertExecStatus setPer_partition_status(Map<String,TInsertPartitionStatus> per_partition_status) {
    this.per_partition_status = per_partition_status;
    return this;
  }

  public void unsetPer_partition_status() {
    this.per_partition_status = null;
  }

  /** Returns true if field per_partition_status is set (has been assigned a value) and false otherwise */
  public boolean isSetPer_partition_status() {
    return this.per_partition_status != null;
  }

  public void setPer_partition_statusIsSet(boolean value) {
    if (!value) {
      this.per_partition_status = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case FILES_TO_MOVE:
      if (value == null) {
        unsetFiles_to_move();
      } else {
        setFiles_to_move((Map<String,String>)value);
      }
      break;

    case PER_PARTITION_STATUS:
      if (value == null) {
        unsetPer_partition_status();
      } else {
        setPer_partition_status((Map<String,TInsertPartitionStatus>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case FILES_TO_MOVE:
      return getFiles_to_move();

    case PER_PARTITION_STATUS:
      return getPer_partition_status();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case FILES_TO_MOVE:
      return isSetFiles_to_move();
    case PER_PARTITION_STATUS:
      return isSetPer_partition_status();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TInsertExecStatus)
      return this.equals((TInsertExecStatus)that);
    return false;
  }

  public boolean equals(TInsertExecStatus that) {
    if (that == null)
      return false;

    boolean this_present_files_to_move = true && this.isSetFiles_to_move();
    boolean that_present_files_to_move = true && that.isSetFiles_to_move();
    if (this_present_files_to_move || that_present_files_to_move) {
      if (!(this_present_files_to_move && that_present_files_to_move))
        return false;
      if (!this.files_to_move.equals(that.files_to_move))
        return false;
    }

    boolean this_present_per_partition_status = true && this.isSetPer_partition_status();
    boolean that_present_per_partition_status = true && that.isSetPer_partition_status();
    if (this_present_per_partition_status || that_present_per_partition_status) {
      if (!(this_present_per_partition_status && that_present_per_partition_status))
        return false;
      if (!this.per_partition_status.equals(that.per_partition_status))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_files_to_move = true && (isSetFiles_to_move());
    builder.append(present_files_to_move);
    if (present_files_to_move)
      builder.append(files_to_move);

    boolean present_per_partition_status = true && (isSetPer_partition_status());
    builder.append(present_per_partition_status);
    if (present_per_partition_status)
      builder.append(per_partition_status);

    return builder.toHashCode();
  }

  public int compareTo(TInsertExecStatus other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TInsertExecStatus typedOther = (TInsertExecStatus)other;

    lastComparison = Boolean.valueOf(isSetFiles_to_move()).compareTo(typedOther.isSetFiles_to_move());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFiles_to_move()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.files_to_move, typedOther.files_to_move);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPer_partition_status()).compareTo(typedOther.isSetPer_partition_status());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPer_partition_status()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.per_partition_status, typedOther.per_partition_status);
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
    StringBuilder sb = new StringBuilder("TInsertExecStatus(");
    boolean first = true;

    sb.append("files_to_move:");
    if (this.files_to_move == null) {
      sb.append("null");
    } else {
      sb.append(this.files_to_move);
    }
    first = false;
    if (isSetPer_partition_status()) {
      if (!first) sb.append(", ");
      sb.append("per_partition_status:");
      if (this.per_partition_status == null) {
        sb.append("null");
      } else {
        sb.append(this.per_partition_status);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (files_to_move == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'files_to_move' was not present! Struct: " + toString());
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

  private static class TInsertExecStatusStandardSchemeFactory implements SchemeFactory {
    public TInsertExecStatusStandardScheme getScheme() {
      return new TInsertExecStatusStandardScheme();
    }
  }

  private static class TInsertExecStatusStandardScheme extends StandardScheme<TInsertExecStatus> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TInsertExecStatus struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // FILES_TO_MOVE
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map54 = iprot.readMapBegin();
                struct.files_to_move = new HashMap<String,String>(2*_map54.size);
                for (int _i55 = 0; _i55 < _map54.size; ++_i55)
                {
                  String _key56; // required
                  String _val57; // required
                  _key56 = iprot.readString();
                  _val57 = iprot.readString();
                  struct.files_to_move.put(_key56, _val57);
                }
                iprot.readMapEnd();
              }
              struct.setFiles_to_moveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PER_PARTITION_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map58 = iprot.readMapBegin();
                struct.per_partition_status = new HashMap<String,TInsertPartitionStatus>(2*_map58.size);
                for (int _i59 = 0; _i59 < _map58.size; ++_i59)
                {
                  String _key60; // required
                  TInsertPartitionStatus _val61; // required
                  _key60 = iprot.readString();
                  _val61 = new TInsertPartitionStatus();
                  _val61.read(iprot);
                  struct.per_partition_status.put(_key60, _val61);
                }
                iprot.readMapEnd();
              }
              struct.setPer_partition_statusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TInsertExecStatus struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.files_to_move != null) {
        oprot.writeFieldBegin(FILES_TO_MOVE_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.files_to_move.size()));
          for (Map.Entry<String, String> _iter62 : struct.files_to_move.entrySet())
          {
            oprot.writeString(_iter62.getKey());
            oprot.writeString(_iter62.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.per_partition_status != null) {
        if (struct.isSetPer_partition_status()) {
          oprot.writeFieldBegin(PER_PARTITION_STATUS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.per_partition_status.size()));
            for (Map.Entry<String, TInsertPartitionStatus> _iter63 : struct.per_partition_status.entrySet())
            {
              oprot.writeString(_iter63.getKey());
              _iter63.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TInsertExecStatusTupleSchemeFactory implements SchemeFactory {
    public TInsertExecStatusTupleScheme getScheme() {
      return new TInsertExecStatusTupleScheme();
    }
  }

  private static class TInsertExecStatusTupleScheme extends TupleScheme<TInsertExecStatus> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TInsertExecStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.files_to_move.size());
        for (Map.Entry<String, String> _iter64 : struct.files_to_move.entrySet())
        {
          oprot.writeString(_iter64.getKey());
          oprot.writeString(_iter64.getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetPer_partition_status()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPer_partition_status()) {
        {
          oprot.writeI32(struct.per_partition_status.size());
          for (Map.Entry<String, TInsertPartitionStatus> _iter65 : struct.per_partition_status.entrySet())
          {
            oprot.writeString(_iter65.getKey());
            _iter65.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TInsertExecStatus struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map66 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.files_to_move = new HashMap<String,String>(2*_map66.size);
        for (int _i67 = 0; _i67 < _map66.size; ++_i67)
        {
          String _key68; // required
          String _val69; // required
          _key68 = iprot.readString();
          _val69 = iprot.readString();
          struct.files_to_move.put(_key68, _val69);
        }
      }
      struct.setFiles_to_moveIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map70 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.per_partition_status = new HashMap<String,TInsertPartitionStatus>(2*_map70.size);
          for (int _i71 = 0; _i71 < _map70.size; ++_i71)
          {
            String _key72; // required
            TInsertPartitionStatus _val73; // required
            _key72 = iprot.readString();
            _val73 = new TInsertPartitionStatus();
            _val73.read(iprot);
            struct.per_partition_status.put(_key72, _val73);
          }
        }
        struct.setPer_partition_statusIsSet(true);
      }
    }
  }

}

