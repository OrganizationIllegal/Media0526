package com.kate.app.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kate.app.model.RecommendVideo;

/**
 * A data access object (DAO) providing persistence and search support for
 * RecommendVideo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.kate.app.model.RecommendVideo
 * @author MyEclipse Persistence Tools
 */

public class RecommendVideoDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RecommendVideoDAO.class);

	// property constants

	public void save(RecommendVideo transientInstance) {
		log.debug("saving RecommendVideo instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RecommendVideo persistentInstance) {
		log.debug("deleting RecommendVideo instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RecommendVideo findById(com.kate.app.model.RecommendVideoId id) {
		log.debug("getting RecommendVideo instance with id: " + id);
		try {
			RecommendVideo instance = (RecommendVideo) getSession().get(
					"com.kate.app.model.RecommendVideo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RecommendVideo instance) {
		log.debug("finding RecommendVideo instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.RecommendVideo")
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
		log.debug("finding RecommendVideo instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RecommendVideo as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all RecommendVideo instances");
		try {
			String queryString = "from RecommendVideo";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RecommendVideo merge(RecommendVideo detachedInstance) {
		log.debug("merging RecommendVideo instance");
		try {
			RecommendVideo result = (RecommendVideo) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RecommendVideo instance) {
		log.debug("attaching dirty RecommendVideo instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RecommendVideo instance) {
		log.debug("attaching clean RecommendVideo instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}