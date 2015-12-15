package cn.ac.iie.impala.catalog.hibernate.impl;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Ifiles entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ifiles", catalog = "idriller_files")
public class IFiles implements java.io.Serializable {

	// Fields

	private Long fileId;
	private String fileName;
	private String fileType;
	private String fileLocation;
	private Short fileStatus;
	private Long fileRecordNumber;
	private Long fileBytes;
	private Integer fileCreatetime;
	private Integer fileUpdatetime;
	private String fileDesc;
	private Short fileVersion;
	private Long fileFsId;
	private Set<IFileReplicas> ifileReplicases = new HashSet<IFileReplicas>(0);
	private Set<IFileParams> ifileParamses = new HashSet<IFileParams>(0);

	// Constructors

	/** default constructor */
	public IFiles() {
	}

	/** minimal constructor */
	public IFiles(String fileName) {
		this.fileName = fileName;
	}

	/** full constructor */
	public IFiles(String fileName, String fileType, String fileLocation,
			Short fileStatus, Long fileRecordNumber, Long fileBytes,
			Integer fileCreatetime, Integer fileUpdatetime, String fileDesc,
			Short fileVersion, Long fileFsId,
			Set<IFileReplicas> ifileReplicases, Set<IFileParams> ifileParamses) {
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileLocation = fileLocation;
		this.fileStatus = fileStatus;
		this.fileRecordNumber = fileRecordNumber;
		this.fileBytes = fileBytes;
		this.fileCreatetime = fileCreatetime;
		this.fileUpdatetime = fileUpdatetime;
		this.fileDesc = fileDesc;
		this.fileVersion = fileVersion;
		this.fileFsId = fileFsId;
		this.ifileReplicases = ifileReplicases;
		this.ifileParamses = ifileParamses;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "file_id", unique = true, nullable = false)
	public Long getFileId() {
		return this.fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	@Column(name = "file_name", nullable = false)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "file_type")
	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Column(name = "file_location", length = 1000)
	public String getFileLocation() {
		return this.fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	@Column(name = "file_status")
	public Short getFileStatus() {
		return this.fileStatus;
	}

	public void setFileStatus(Short fileStatus) {
		this.fileStatus = fileStatus;
	}

	@Column(name = "file_record_number")
	public Long getFileRecordNumber() {
		return this.fileRecordNumber;
	}

	public void setFileRecordNumber(Long fileRecordNumber) {
		this.fileRecordNumber = fileRecordNumber;
	}

	@Column(name = "file_bytes")
	public Long getFileBytes() {
		return this.fileBytes;
	}

	public void setFileBytes(Long fileBytes) {
		this.fileBytes = fileBytes;
	}

	@Column(name = "file_createtime")
	public Integer getFileCreatetime() {
		return this.fileCreatetime;
	}

	public void setFileCreatetime(Integer fileCreatetime) {
		this.fileCreatetime = fileCreatetime;
	}

	@Column(name = "file_updatetime")
	public Integer getFileUpdatetime() {
		return this.fileUpdatetime;
	}

	public void setFileUpdatetime(Integer fileUpdatetime) {
		this.fileUpdatetime = fileUpdatetime;
	}

	@Column(name = "file_desc")
	public String getFileDesc() {
		return this.fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	@Column(name = "file_version")
	public Short getFileVersion() {
		return this.fileVersion;
	}

	public void setFileVersion(Short fileVersion) {
		this.fileVersion = fileVersion;
	}

	@Column(name = "file_fs_id")
	public Long getFileFsId() {
		return this.fileFsId;
	}

	public void setFileFsId(Long fileFsId) {
		this.fileFsId = fileFsId;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ifiles")
	public Set<IFileReplicas> getIfileReplicases() {
		return this.ifileReplicases;
	}

	public void setIfileReplicases(Set<IFileReplicas> ifileReplicases) {
		this.ifileReplicases = ifileReplicases;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ifiles")
	public Set<IFileParams> getIfileParamses() {
		return this.ifileParamses;
	}

	public void setIfileParamses(Set<IFileParams> ifileParamses) {
		this.ifileParamses = ifileParamses;
	}

}