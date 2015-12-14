package cn.ac.iie.impala.catalog.hibernate.dao2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * IfileSet entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ifile_set", catalog = "idriller_files")
public class IfileSet implements java.io.Serializable {

	// Fields

	private Long fsId;
	private String fsDesc;

	// Constructors

	/** default constructor */
	public IfileSet() {
	}

	/** full constructor */
	public IfileSet(String fsDesc) {
		this.fsDesc = fsDesc;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "fs_id", unique = true, nullable = false)
	public Long getFsId() {
		return this.fsId;
	}

	public void setFsId(Long fsId) {
		this.fsId = fsId;
	}

	@Column(name = "fs_desc")
	public String getFsDesc() {
		return this.fsDesc;
	}

	public void setFsDesc(String fsDesc) {
		this.fsDesc = fsDesc;
	}

}