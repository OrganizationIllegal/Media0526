package com.kate.app.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kate.app.model.LunboImage;

/**
 * A data access object (DAO) providing persistence and search support for
 * LunboImage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.LunboImage
 * @author MyEclipse Persistence Tools
 */

public class LunboImageDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(LunboImageDAO.class);
	// property constants
	public static final String IMG = "img";

	public void save(LunboImage transientInstance) {
		log.debug("saving LunboImage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LunboImage persistentInstance) {
		log.debug("deleting LunboImage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LunboImage findById(java.lang.Integer id) {
		log.debug("getting LunboImage instance with id: " + id);
		try {
			LunboImage instance = (LunboImage) getSession().get(
					"com.kate.app.model.LunboImage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LunboImage instance) {
		log.debug("finding LunboImage instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.LunboImage")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding LunboImage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LunboImage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByImg(Object img) {
		return findByProperty(IMG, img);
	}

	public List findAll() {
		log.debug("finding all LunboImage instances");
		try {
			String queryString = "from LunboImage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LunboImage merge(LunboImage detachedInstance) {
		log.debug("merging LunboImage instance");
		try {
			LunboImage result = (LunboImage) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LunboImage instance) {
		log.debug("attaching dirty LunboImage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LunboImage instance) {
		log.debug("attaching clean LunboImage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}