package cn.ac.iie.impala.catalog.hibernate.dao2;

import cn.dayutianfei.dao.BaseHibernateDAO;
import java.util.List;
import org.hibernate.LockMode;
import org.hibernate.Query;
import static org.hibernate.criterion.Example.create;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * IfileParams entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see cn.dayutianfei.dao2.IfileParams
 * @author MyEclipse Persistence Tools
 */

public class IfileParamsDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(IfileParamsDAO.class);
	// property constants
	public static final String FILE_KEY = "fileKey";
	public static final String FILE_VALUES = "fileValues";

	public void save(IfileParams transientInstance) {
		log.debug("saving IfileParams instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IfileParams persistentInstance) {
		log.debug("deleting IfileParams instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IfileParams findById(java.lang.Long id) {
		log.debug("getting IfileParams instance with id: " + id);
		try {
			IfileParams instance = (IfileParams) getSession().get(
					"cn.dayutianfei.dao2.IfileParams", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<IfileParams> findByExample(IfileParams instance) {
		log.debug("finding IfileParams instance by example");
		try {
			List<IfileParams> results = (List<IfileParams>) getSession()
					.createCriteria("cn.dayutianfei.dao2.IfileParams")
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
		log.debug("finding IfileParams instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IfileParams as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<IfileParams> findByFileKey(Object fileKey) {
		return findByProperty(FILE_KEY, fileKey);
	}

	public List<IfileParams> findByFileValues(Object fileValues) {
		return findByProperty(FILE_VALUES, fileValues);
	}

	public List findAll() {
		log.debug("finding all IfileParams instances");
		try {
			String queryString = "from IfileParams";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IfileParams merge(IfileParams detachedInstance) {
		log.debug("merging IfileParams instance");
		try {
			IfileParams result = (IfileParams) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IfileParams instance) {
		log.debug("attaching dirty IfileParams instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IfileParams instance) {
		log.debug("attaching clean IfileParams instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}