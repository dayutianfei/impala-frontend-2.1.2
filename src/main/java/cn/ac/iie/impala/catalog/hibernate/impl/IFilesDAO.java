package cn.ac.iie.impala.catalog.hibernate.impl;

import cn.ac.iie.impala.catalog.hibernate.BaseHibernateDAO;
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
 * @see cn.ac.iie.impala.catalog.hibernate.impl.IFiles
 * @author MyEclipse Persistence Tools
 */

public class IFilesDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(IFilesDAO.class);
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

	public void save(IFiles transientInstance) {
		log.debug("saving Ifiles instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IFiles persistentInstance) {
		log.debug("deleting Ifiles instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IFiles findById(java.lang.Long id) {
		log.debug("getting Ifiles instance with id: " + id);
		try {
			IFiles instance = (IFiles) getSession().get(
					"cn.dayutianfei.dao2.Ifiles", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<IFiles> findByExample(IFiles instance) {
		log.debug("finding Ifiles instance by example");
		try {
			List<IFiles> results = (List<IFiles>) getSession()
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

	public List<IFiles> findByFileName(Object fileName) {
		return findByProperty(FILE_NAME, fileName);
	}

	public List<IFiles> findByFileType(Object fileType) {
		return findByProperty(FILE_TYPE, fileType);
	}

	public List<IFiles> findByFileLocation(Object fileLocation) {
		return findByProperty(FILE_LOCATION, fileLocation);
	}

	public List<IFiles> findByFileStatus(Object fileStatus) {
		return findByProperty(FILE_STATUS, fileStatus);
	}

	public List<IFiles> findByFileRecordNumber(Object fileRecordNumber) {
		return findByProperty(FILE_RECORD_NUMBER, fileRecordNumber);
	}

	public List<IFiles> findByFileBytes(Object fileBytes) {
		return findByProperty(FILE_BYTES, fileBytes);
	}

	public List<IFiles> findByFileCreatetime(Object fileCreatetime) {
		return findByProperty(FILE_CREATETIME, fileCreatetime);
	}

	public List<IFiles> findByFileUpdatetime(Object fileUpdatetime) {
		return findByProperty(FILE_UPDATETIME, fileUpdatetime);
	}

	public List<IFiles> findByFileDesc(Object fileDesc) {
		return findByProperty(FILE_DESC, fileDesc);
	}

	public List<IFiles> findByFileVersion(Object fileVersion) {
		return findByProperty(FILE_VERSION, fileVersion);
	}

	public List<IFiles> findByFileFsId(Object fileFsId) {
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

	public IFiles merge(IFiles detachedInstance) {
		log.debug("merging Ifiles instance");
		try {
			IFiles result = (IFiles) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IFiles instance) {
		log.debug("attaching dirty Ifiles instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IFiles instance) {
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