/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.cloudera.impala.thrift.idriller;

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

public class TFileReplica implements org.apache.thrift.TBase<TFileReplica, TFileReplica._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFileReplica");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NODE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DISK_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("diskName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I16, (short)5);
  private static final org.apache.thrift.protocol.TField LAST_ACCESS_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastAccessTime", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.I16, (short)8);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFileReplicaStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFileReplicaTupleSchemeFactory());
  }

  public long id; // required
  public String location; // required
  public String nodeName; // optional
  public String diskName; // optional
  public short status; // optional
  public long lastAccessTime; // optional
  public long createTime; // optional
  public short version; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    LOCATION((short)2, "location"),
    NODE_NAME((short)3, "nodeName"),
    DISK_NAME((short)4, "diskName"),
    STATUS((short)5, "status"),
    LAST_ACCESS_TIME((short)6, "lastAccessTime"),
    CREATE_TIME((short)7, "createTime"),
    VERSION((short)8, "version");

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
        case 1: // ID
          return ID;
        case 2: // LOCATION
          return LOCATION;
        case 3: // NODE_NAME
          return NODE_NAME;
        case 4: // DISK_NAME
          return DISK_NAME;
        case 5: // STATUS
          return STATUS;
        case 6: // LAST_ACCESS_TIME
          return LAST_ACCESS_TIME;
        case 7: // CREATE_TIME
          return CREATE_TIME;
        case 8: // VERSION
          return VERSION;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __STATUS_ISSET_ID = 1;
  private static final int __LASTACCESSTIME_ISSET_ID = 2;
  private static final int __CREATETIME_ISSET_ID = 3;
  private static final int __VERSION_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.NODE_NAME,_Fields.DISK_NAME,_Fields.STATUS,_Fields.LAST_ACCESS_TIME,_Fields.CREATE_TIME,_Fields.VERSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NODE_NAME, new org.apache.thrift.meta_data.FieldMetaData("nodeName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISK_NAME, new org.apache.thrift.meta_data.FieldMetaData("diskName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.LAST_ACCESS_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastAccessTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFileReplica.class, metaDataMap);
  }

  public TFileReplica() {
  }

  public TFileReplica(
    long id,
    String location)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFileReplica(TFileReplica other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetLocation()) {
      this.location = other.location;
    }
    if (other.isSetNodeName()) {
      this.nodeName = other.nodeName;
    }
    if (other.isSetDiskName()) {
      this.diskName = other.diskName;
    }
    this.status = other.status;
    this.lastAccessTime = other.lastAccessTime;
    this.createTime = other.createTime;
    this.version = other.version;
  }

  public TFileReplica deepCopy() {
    return new TFileReplica(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.location = null;
    this.nodeName = null;
    this.diskName = null;
    setStatusIsSet(false);
    this.status = 0;
    setLastAccessTimeIsSet(false);
    this.lastAccessTime = 0;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    setVersionIsSet(false);
    this.version = 0;
  }

  public long getId() {
    return this.id;
  }

  public TFileReplica setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public String getLocation() {
    return this.location;
  }

  public TFileReplica setLocation(String location) {
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

  public String getNodeName() {
    return this.nodeName;
  }

  public TFileReplica setNodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

  public void unsetNodeName() {
    this.nodeName = null;
  }

  /** Returns true if field nodeName is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeName() {
    return this.nodeName != null;
  }

  public void setNodeNameIsSet(boolean value) {
    if (!value) {
      this.nodeName = null;
    }
  }

  public String getDiskName() {
    return this.diskName;
  }

  public TFileReplica setDiskName(String diskName) {
    this.diskName = diskName;
    return this;
  }

  public void unsetDiskName() {
    this.diskName = null;
  }

  /** Returns true if field diskName is set (has been assigned a value) and false otherwise */
  public boolean isSetDiskName() {
    return this.diskName != null;
  }

  public void setDiskNameIsSet(boolean value) {
    if (!value) {
      this.diskName = null;
    }
  }

  public short getStatus() {
    return this.status;
  }

  public TFileReplica setStatus(short status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  public long getLastAccessTime() {
    return this.lastAccessTime;
  }

  public TFileReplica setLastAccessTime(long lastAccessTime) {
    this.lastAccessTime = lastAccessTime;
    setLastAccessTimeIsSet(true);
    return this;
  }

  public void unsetLastAccessTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  /** Returns true if field lastAccessTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastAccessTime() {
    return EncodingUtils.testBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID);
  }

  public void setLastAccessTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LASTACCESSTIME_ISSET_ID, value);
  }

  public long getCreateTime() {
    return this.createTime;
  }

  public TFileReplica setCreateTime(long createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    return this;
  }

  public void unsetCreateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  public short getVersion() {
    return this.version;
  }

  public TFileReplica setVersion(short version) {
    this.version = version;
    setVersionIsSet(true);
    return this;
  }

  public void unsetVersion() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return EncodingUtils.testBit(__isset_bitfield, __VERSION_ISSET_ID);
  }

  public void setVersionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VERSION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((String)value);
      }
      break;

    case NODE_NAME:
      if (value == null) {
        unsetNodeName();
      } else {
        setNodeName((String)value);
      }
      break;

    case DISK_NAME:
      if (value == null) {
        unsetDiskName();
      } else {
        setDiskName((String)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((Short)value);
      }
      break;

    case LAST_ACCESS_TIME:
      if (value == null) {
        unsetLastAccessTime();
      } else {
        setLastAccessTime((Long)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((Long)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Long.valueOf(getId());

    case LOCATION:
      return getLocation();

    case NODE_NAME:
      return getNodeName();

    case DISK_NAME:
      return getDiskName();

    case STATUS:
      return Short.valueOf(getStatus());

    case LAST_ACCESS_TIME:
      return Long.valueOf(getLastAccessTime());

    case CREATE_TIME:
      return Long.valueOf(getCreateTime());

    case VERSION:
      return Short.valueOf(getVersion());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case LOCATION:
      return isSetLocation();
    case NODE_NAME:
      return isSetNodeName();
    case DISK_NAME:
      return isSetDiskName();
    case STATUS:
      return isSetStatus();
    case LAST_ACCESS_TIME:
      return isSetLastAccessTime();
    case CREATE_TIME:
      return isSetCreateTime();
    case VERSION:
      return isSetVersion();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFileReplica)
      return this.equals((TFileReplica)that);
    return false;
  }

  public boolean equals(TFileReplica that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    boolean this_present_nodeName = true && this.isSetNodeName();
    boolean that_present_nodeName = true && that.isSetNodeName();
    if (this_present_nodeName || that_present_nodeName) {
      if (!(this_present_nodeName && that_present_nodeName))
        return false;
      if (!this.nodeName.equals(that.nodeName))
        return false;
    }

    boolean this_present_diskName = true && this.isSetDiskName();
    boolean that_present_diskName = true && that.isSetDiskName();
    if (this_present_diskName || that_present_diskName) {
      if (!(this_present_diskName && that_present_diskName))
        return false;
      if (!this.diskName.equals(that.diskName))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_lastAccessTime = true && this.isSetLastAccessTime();
    boolean that_present_lastAccessTime = true && that.isSetLastAccessTime();
    if (this_present_lastAccessTime || that_present_lastAccessTime) {
      if (!(this_present_lastAccessTime && that_present_lastAccessTime))
        return false;
      if (this.lastAccessTime != that.lastAccessTime)
        return false;
    }

    boolean this_present_createTime = true && this.isSetCreateTime();
    boolean that_present_createTime = true && that.isSetCreateTime();
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (this.version != that.version)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TFileReplica other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TFileReplica typedOther = (TFileReplica)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetNodeName()).compareTo(typedOther.isSetNodeName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeName, typedOther.nodeName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDiskName()).compareTo(typedOther.isSetDiskName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiskName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.diskName, typedOther.diskName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(typedOther.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, typedOther.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLastAccessTime()).compareTo(typedOther.isSetLastAccessTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastAccessTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastAccessTime, typedOther.lastAccessTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreateTime()).compareTo(typedOther.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, typedOther.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(typedOther.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, typedOther.version);
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
    StringBuilder sb = new StringBuilder("TFileReplica(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    if (isSetNodeName()) {
      if (!first) sb.append(", ");
      sb.append("nodeName:");
      if (this.nodeName == null) {
        sb.append("null");
      } else {
        sb.append(this.nodeName);
      }
      first = false;
    }
    if (isSetDiskName()) {
      if (!first) sb.append(", ");
      sb.append("diskName:");
      if (this.diskName == null) {
        sb.append("null");
      } else {
        sb.append(this.diskName);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      sb.append(this.status);
      first = false;
    }
    if (isSetLastAccessTime()) {
      if (!first) sb.append(", ");
      sb.append("lastAccessTime:");
      sb.append(this.lastAccessTime);
      first = false;
    }
    if (isSetCreateTime()) {
      if (!first) sb.append(", ");
      sb.append("createTime:");
      sb.append(this.createTime);
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      sb.append(this.version);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
    if (location == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'location' was not present! Struct: " + toString());
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

  private static class TFileReplicaStandardSchemeFactory implements SchemeFactory {
    public TFileReplicaStandardScheme getScheme() {
      return new TFileReplicaStandardScheme();
    }
  }

  private static class TFileReplicaStandardScheme extends StandardScheme<TFileReplica> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFileReplica struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.id = iprot.readI64();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.location = iprot.readString();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NODE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nodeName = iprot.readString();
              struct.setNodeNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DISK_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.diskName = iprot.readString();
              struct.setDiskNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.status = iprot.readI16();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // LAST_ACCESS_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastAccessTime = iprot.readI64();
              struct.setLastAccessTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createTime = iprot.readI64();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.version = iprot.readI16();
              struct.setVersionIsSet(true);
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
      if (!struct.isSetId()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFileReplica struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(struct.id);
      oprot.writeFieldEnd();
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        oprot.writeString(struct.location);
        oprot.writeFieldEnd();
      }
      if (struct.nodeName != null) {
        if (struct.isSetNodeName()) {
          oprot.writeFieldBegin(NODE_NAME_FIELD_DESC);
          oprot.writeString(struct.nodeName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.diskName != null) {
        if (struct.isSetDiskName()) {
          oprot.writeFieldBegin(DISK_NAME_FIELD_DESC);
          oprot.writeString(struct.diskName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStatus()) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        oprot.writeI16(struct.status);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLastAccessTime()) {
        oprot.writeFieldBegin(LAST_ACCESS_TIME_FIELD_DESC);
        oprot.writeI64(struct.lastAccessTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetCreateTime()) {
        oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.createTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetVersion()) {
        oprot.writeFieldBegin(VERSION_FIELD_DESC);
        oprot.writeI16(struct.version);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFileReplicaTupleSchemeFactory implements SchemeFactory {
    public TFileReplicaTupleScheme getScheme() {
      return new TFileReplicaTupleScheme();
    }
  }

  private static class TFileReplicaTupleScheme extends TupleScheme<TFileReplica> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFileReplica struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI64(struct.id);
      oprot.writeString(struct.location);
      BitSet optionals = new BitSet();
      if (struct.isSetNodeName()) {
        optionals.set(0);
      }
      if (struct.isSetDiskName()) {
        optionals.set(1);
      }
      if (struct.isSetStatus()) {
        optionals.set(2);
      }
      if (struct.isSetLastAccessTime()) {
        optionals.set(3);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(4);
      }
      if (struct.isSetVersion()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetNodeName()) {
        oprot.writeString(struct.nodeName);
      }
      if (struct.isSetDiskName()) {
        oprot.writeString(struct.diskName);
      }
      if (struct.isSetStatus()) {
        oprot.writeI16(struct.status);
      }
      if (struct.isSetLastAccessTime()) {
        oprot.writeI64(struct.lastAccessTime);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI64(struct.createTime);
      }
      if (struct.isSetVersion()) {
        oprot.writeI16(struct.version);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFileReplica struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI64();
      struct.setIdIsSet(true);
      struct.location = iprot.readString();
      struct.setLocationIsSet(true);
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.nodeName = iprot.readString();
        struct.setNodeNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.diskName = iprot.readString();
        struct.setDiskNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.status = iprot.readI16();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.lastAccessTime = iprot.readI64();
        struct.setLastAccessTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.createTime = iprot.readI64();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.version = iprot.readI16();
        struct.setVersionIsSet(true);
      }
    }
  }

}
