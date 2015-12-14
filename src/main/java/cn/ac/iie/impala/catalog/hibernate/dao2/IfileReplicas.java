package cn.ac.iie.impala.catalog.hibernate.dao2;

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
 * IfileReplicas entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ifile_replicas", catalog = "idriller_files")
public class IfileReplicas implements java.io.Serializable {

	// Fields

	private Long repId;
	private Ifiles ifiles;
	private String repFileLocation;
	private String repNode;
	private String repDev;
	private Integer repUpdatetime;
	private Short repStatus;
	private Short repVersion;
	private Short repIdx;

	// Constructors

	/** default constructor */
	public IfileReplicas() {
	}

	/** full constructor */
	public IfileReplicas(Ifiles ifiles, String repFileLocation, String repNode,
			String repDev, Integer repUpdatetime, Short repStatus,
			Short repVersion, Short repIdx) {
		this.ifiles = ifiles;
		this.repFileLocation = repFileLocation;
		this.repNode = repNode;
		this.repDev = repDev;
		this.repUpdatetime = repUpdatetime;
		this.repStatus = repStatus;
		this.repVersion = repVersion;
		this.repIdx = repIdx;
	}

	// Property accessors
	@GenericGenerator(name = "generator", strategy = "increment")
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "rep_id", unique = true, nullable = false)
	public Long getRepId() {
		return this.repId;
	}

	public void setRepId(Long repId) {
		this.repId = repId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rep_file_id")
	public Ifiles getIfiles() {
		return this.ifiles;
	}

	public void setIfiles(Ifiles ifiles) {
		this.ifiles = ifiles;
	}

	@Column(name = "rep_file_location", length = 2000)
	public String getRepFileLocation() {
		return this.repFileLocation;
	}

	public void setRepFileLocation(String repFileLocation) {
		this.repFileLocation = repFileLocation;
	}

	@Column(name = "rep_node")
	public String getRepNode() {
		return this.repNode;
	}

	public void setRepNode(String repNode) {
		this.repNode = repNode;
	}

	@Column(name = "rep_dev")
	public String getRepDev() {
		return this.repDev;
	}

	public void setRepDev(String repDev) {
		this.repDev = repDev;
	}

	@Column(name = "rep_updatetime")
	public Integer getRepUpdatetime() {
		return this.repUpdatetime;
	}

	public void setRepUpdatetime(Integer repUpdatetime) {
		this.repUpdatetime = repUpdatetime;
	}

	@Column(name = "rep_status")
	public Short getRepStatus() {
		return this.repStatus;
	}

	public void setRepStatus(Short repStatus) {
		this.repStatus = repStatus;
	}

	@Column(name = "rep_version")
	public Short getRepVersion() {
		return this.repVersion;
	}

	public void setRepVersion(Short repVersion) {
		this.repVersion = repVersion;
	}

	@Column(name = "rep_idx")
	public Short getRepIdx() {
		return this.repIdx;
	}

	public void setRepIdx(Short repIdx) {
		this.repIdx = repIdx;
	}

}