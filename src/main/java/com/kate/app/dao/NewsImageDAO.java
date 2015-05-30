package com.kate.app.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kate.app.model.NewsImage;

/**
 * A data access object (DAO) providing persistence and search support for
 * NewsImage entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.kate.app.model.NewsImage
 * @author MyEclipse Persistence Tools
 */

public class NewsImageDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(NewsImageDAO.class);
	// property constants
	public static final String NEWS_ID = "newsId";
	public static final String NEWS_IMAGE = "newsImage";

	public void save(NewsImage transientInstance) {
		log.debug("saving NewsImage instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(NewsImage persistentInstance) {
		log.debug("deleting NewsImage instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public NewsImage findById(java.lang.Integer id) {
		log.debug("getting NewsImage instance with id: " + id);
		try {
			NewsImage instance = (NewsImage) getSession().get(
					"com.kate.app.model.NewsImage", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(NewsImage instance) {
		log.debug("finding NewsImage instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.NewsImage")
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
		log.debug("finding NewsImage instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from NewsImage as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNewsId(Object newsId) {
		return findByProperty(NEWS_ID, newsId);
	}

	public List findByNewsImage(Object newsImage) {
		return findByProperty(NEWS_IMAGE, newsImage);
	}

	public List findAll() {
		log.debug("finding all NewsImage instances");
		try {
			String queryString = "from NewsImage";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public NewsImage merge(NewsImage detachedInstance) {
		log.debug("merging NewsImage instance");
		try {
			NewsImage result = (NewsImage) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(NewsImage instance) {
		log.debug("attaching dirty NewsImage instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(NewsImage instance) {
		log.debug("attaching clean NewsImage instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}