package cn.ac.iie.impala.catalog.hibernate.dao2;

import cn.dayutianfei.dao.BaseHibernateDAO;
import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * Ifiles entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.dayutianfei.dao2.Ifiles
 * @author MyEclipse Persistence Tools
 */

public class IfilesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(IfilesDAO.class);
	// property constants
	public static final String FILE_NAME = "fileName";
	public static final String FILE_TYPE = "fileType";
	public static final String FILE_LOCATION = "fileLocation";
	public static final String FILE_STATUS = "fileStatus";
	public static final String FILE_RECORD_NUMBER = "fileRecordNumber";
	public static final String FILE_BYTES = "fileBytes";
	public static final String FILE_CREATETIME = "fileCreatetime";
	public static final String FILE_UPDATETIME = "fileUpdatetime";
	public static final String FILE_DESC = "fileDesc";
	public static final String FILE_VERSION = "fileVersion";
	public static final String FILE_FS_ID = "fileFsId";

	public void save(Ifiles transientInstance) {
		log.debug("saving Ifiles instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ifiles persistentInstance) {
		log.debug("deleting Ifiles instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ifiles findById(java.lang.Long id) {
		log.debug("getting Ifiles instance with id: " + id);
		try {
			Ifiles instance = (Ifiles) getSession().get(
					"cn.dayutianfei.dao2.Ifiles", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Ifiles> findByExample(Ifiles instance) {
		log.debug("finding Ifiles instance by example");
		try {
			List<Ifiles> results = (List<Ifiles>) getSession()
					.createCriteria("cn.dayutianfei.dao2.Ifiles")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Ifiles instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Ifiles as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<Ifiles> findByFileName(Object fileName) {
		return findByProperty(FILE_NAME, fileName);
	}

	public List<Ifiles> findByFileType(Object fileType) {
		return findByProperty(FILE_TYPE, fileType);
	}

	public List<Ifiles> findByFileLocation(Object fileLocation) {
		return findByProperty(FILE_LOCATION, fileLocation);
	}

	public List<Ifiles> findByFileStatus(Object fileStatus) {
		return findByProperty(FILE_STATUS, fileStatus);
	}

	public List<Ifiles> findByFileRecordNumber(Object fileRecordNumber) {
		return findByProperty(FILE_RECORD_NUMBER, fileRecordNumber);
	}

	public List<Ifiles> findByFileBytes(Object fileBytes) {
		return findByProperty(FILE_BYTES, fileBytes);
	}

	public List<Ifiles> findByFileCreatetime(Object fileCreatetime) {
		return findByProperty(FILE_CREATETIME, fileCreatetime);
	}

	public List<Ifiles> findByFileUpdatetime(Object fileUpdatetime) {
		return findByProperty(FILE_UPDATETIME, fileUpdatetime);
	}

	public List<Ifiles> findByFileDesc(Object fileDesc) {
		return findByProperty(FILE_DESC, fileDesc);
	}

	public List<Ifiles> findByFileVersion(Object fileVersion) {
		return findByProperty(FILE_VERSION, fileVersion);
	}

	public List<Ifiles> findByFileFsId(Object fileFsId) {
		return findByProperty(FILE_FS_ID, fileFsId);
	}

	public List findAll() {
		log.debug("finding all Ifiles instances");
		try {
			String queryString = "from Ifiles";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ifiles merge(Ifiles detachedInstance) {
		log.debug("merging Ifiles instance");
		try {
			Ifiles result = (Ifiles) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ifiles instance) {
		log.debug("attaching dirty Ifiles instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ifiles instance) {
		log.debug("attaching clean Ifiles instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}