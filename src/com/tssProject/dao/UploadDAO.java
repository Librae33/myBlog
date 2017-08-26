package com.tssProject.dao;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * Upload entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.tssProject.dao.Upload
 * @author MyEclipse Persistence Tools
 */

public class UploadDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(UploadDAO.class);
	// property constants
	public static final String LOCATION = "location";

	protected void initDao() {
		// do nothing
	}

	public void save(Upload transientInstance) {
		log.debug("saving Upload instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Upload persistentInstance) {
		log.debug("deleting Upload instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Upload findById(java.lang.Integer id) {
		log.debug("getting Upload instance with id: " + id);
		try {
			Upload instance = (Upload) getHibernateTemplate().get(
					"com.tssProject.dao.Upload", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Upload instance) {
		log.debug("finding Upload instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Upload instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Upload as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLocation(Object location) {
		return findByProperty(LOCATION, location);
	}

	public List findAll() {
		log.debug("finding all Upload instances");
		try {
			String queryString = "from Upload";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Upload merge(Upload detachedInstance) {
		log.debug("merging Upload instance");
		try {
			Upload result = (Upload) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Upload instance) {
		log.debug("attaching dirty Upload instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Upload instance) {
		log.debug("attaching clean Upload instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UploadDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UploadDAO) ctx.getBean("UploadDAO");
	}
}