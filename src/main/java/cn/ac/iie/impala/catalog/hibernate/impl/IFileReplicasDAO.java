package cn.ac.iie.impala.catalog.hibernate.impl;

import cn.ac.iie.impala.catalog.hibernate.BaseHibernateDAO;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * IfileReplicas entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.ac.iie.impala.catalog.hibernate.impl.IFileReplicas
 * @author MyEclipse Persistence Tools
 */

public class IFileReplicasDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(IFileReplicasDAO.class);
	// property constants
	public static final String REP_FILE_LOCATION = "repFileLocation";
	public static final String REP_NODE = "repNode";
	public static final String REP_DEV = "repDev";
	public static final String REP_UPDATETIME = "repUpdatetime";
	public static final String REP_STATUS = "repStatus";
	public static final String REP_VERSION = "repVersion";
	public static final String REP_IDX = "repIdx";

	public void save(IFileReplicas transientInstance) {
		log.debug("saving IfileReplicas instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IFileReplicas persistentInstance) {
		log.debug("deleting IfileReplicas instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IFileReplicas findById(java.lang.Long id) {
		log.debug("getting IfileReplicas instance with id: " + id);
		try {
			IFileReplicas instance = (IFileReplicas) getSession().get(
					"cn.dayutianfei.dao2.IfileReplicas", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<IFileReplicas> findByExample(IFileReplicas instance) {
		log.debug("finding IfileReplicas instance by example");
		try {
			List<IFileReplicas> results = (List<IFileReplicas>) getSession()
					.createCriteria("cn.dayutianfei.dao2.IfileReplicas")
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
		log.debug("finding IfileReplicas instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from IfileReplicas as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<IFileReplicas> findByRepFileLocation(Object repFileLocation) {
		return findByProperty(REP_FILE_LOCATION, repFileLocation);
	}

	public List<IFileReplicas> findByRepNode(Object repNode) {
		return findByProperty(REP_NODE, repNode);
	}

	public List<IFileReplicas> findByRepDev(Object repDev) {
		return findByProperty(REP_DEV, repDev);
	}

	public List<IFileReplicas> findByRepUpdatetime(Object repUpdatetime) {
		return findByProperty(REP_UPDATETIME, repUpdatetime);
	}

	public List<IFileReplicas> findByRepStatus(Object repStatus) {
		return findByProperty(REP_STATUS, repStatus);
	}

	public List<IFileReplicas> findByRepVersion(Object repVersion) {
		return findByProperty(REP_VERSION, repVersion);
	}

	public List<IFileReplicas> findByRepIdx(Object repIdx) {
		return findByProperty(REP_IDX, repIdx);
	}

	public List findAll() {
		log.debug("finding all IfileReplicas instances");
		try {
			String queryString = "from IfileReplicas";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IFileReplicas merge(IFileReplicas detachedInstance) {
		log.debug("merging IfileReplicas instance");
		try {
			IFileReplicas result = (IFileReplicas) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IFileReplicas instance) {
		log.debug("attaching dirty IfileReplicas instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IFileReplicas instance) {
		log.debug("attaching clean IfileReplicas instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}