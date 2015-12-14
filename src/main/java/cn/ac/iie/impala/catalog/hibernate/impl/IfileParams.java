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
public class IfileParams implements java.io.Serializable {

	// Fields

	private Long fileId;
	private Ifiles ifiles;
	private String fileKey;
	private String fileValues;

	// Constructors

	/** default constructor */
	public IfileParams() {
	}

	/** minimal constructor */
	public IfileParams(Ifiles ifiles) {
		this.ifiles = ifiles;
	}

	/** full constructor */
	public IfileParams(Ifiles ifiles, String fileKey, String fileValues) {
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
	public Ifiles getIfiles() {
		return this.ifiles;
	}

	public void setIfiles(Ifiles ifiles) {
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