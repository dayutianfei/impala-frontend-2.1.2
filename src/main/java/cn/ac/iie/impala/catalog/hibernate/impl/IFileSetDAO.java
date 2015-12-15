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
 * IfileSet entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see cn.ac.iie.impala.catalog.hibernate.impl.IFileSet
 * @author MyEclipse Persistence Tools
 */

public class IFileSetDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(IFileSetDAO.class);
	// property constants
	public static final String FS_DESC = "fsDesc";

	public void save(IFileSet transientInstance) {
		log.debug("saving IfileSet instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(IFileSet persistentInstance) {
		log.debug("deleting IfileSet instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IFileSet findById(java.lang.Long id) {
		log.debug("getting IfileSet instance with id: " + id);
		try {
			IFileSet instance = (IFileSet) getSession().get(
					"cn.dayutianfei.dao2.IfileSet", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<IFileSet> findByExample(IFileSet instance) {
		log.debug("finding IfileSet instance by example");
		try {
			List<IFileSet> results = (List<IFileSet>) getSession()
					.createCriteria("cn.dayutianfei.dao2.IfileSet")
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
		log.debug("finding IfileSet instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from IfileSet as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List<IFileSet> findByFsDesc(Object fsDesc) {
		return findByProperty(FS_DESC, fsDesc);
	}

	public List findAll() {
		log.debug("finding all IfileSet instances");
		try {
			String queryString = "from IfileSet";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public IFileSet merge(IFileSet detachedInstance) {
		log.debug("merging IfileSet instance");
		try {
			IFileSet result = (IFileSet) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(IFileSet instance) {
		log.debug("attaching dirty IfileSet instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IFileSet instance) {
		log.debug("attaching clean IfileSet instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}