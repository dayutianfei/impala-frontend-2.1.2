package cn.ac.iie.impala.catalog.hibernate.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * IfileParams entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ifile_params", catalog = "idriller_files")
public class IFileParams implements java.io.Serializable {

	// Fields

	private Long fileId;
	private IFiles ifiles;
	private String fileKey;
	private String fileValues;

	// Constructors

	/** default constructor */
	public IFileParams() {
	}

	/** minimal constructor */
	public IFileParams(IFiles ifiles) {
		this.ifiles = ifiles;
	}

	/** full constructor */
	public IFileParams(IFiles ifiles, String fileKey, String fileValues) {
		this.ifiles = ifiles;
		this.fileKey = fileKey;
		this.fileValues = fileValues;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "file_id", unique = true, nullable = false, insertable = false, updatable = false)
	public IFiles getIfiles() {
		return this.ifiles;
	}

	public void setIfiles(IFiles ifiles) {
		this.ifiles = ifiles;
	}

	@Column(name = "file_key")
	public String getFileKey() {
		return this.fileKey;
	}

	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

	@Column(name = "file_values", length = 2000)
	public String getFileValues() {
		return this.fileValues;
	}

	public void setFileValues(String fileValues) {
		this.fileValues = fileValues;
	}

}