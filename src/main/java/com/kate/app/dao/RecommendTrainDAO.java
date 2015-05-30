package com.kate.app.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kate.app.model.RecommendTrain;

/**
 * A data access object (DAO) providing persistence and search support for
 * RecommendTrain entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.kate.app.model.RecommendTrain
 * @author MyEclipse Persistence Tools
 */

public class RecommendTrainDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(RecommendTrainDAO.class);
	// property constants
	public static final String TRAIN_IMG = "trainImg";
	public static final String TRAIN_ID = "trainId";

	public void save(RecommendTrain transientInstance) {
		log.debug("saving RecommendTrain instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(RecommendTrain persistentInstance) {
		log.debug("deleting RecommendTrain instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RecommendTrain findById(java.lang.Integer id) {
		log.debug("getting RecommendTrain instance with id: " + id);
		try {
			RecommendTrain instance = (RecommendTrain) getSession().get(
					"com.kate.app.model.RecommendTrain", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(RecommendTrain instance) {
		log.debug("finding RecommendTrain instance by example");
		try {
			List results = getSession()
					.createCriteria("com.kate.app.model.RecommendTrain")
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
		log.debug("finding RecommendTrain instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from RecommendTrain as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTrainImg(Object trainImg) {
		return findByProperty(TRAIN_IMG, trainImg);
	}

	public List findByTrainId(Object trainId) {
		return findByProperty(TRAIN_ID, trainId);
	}

	public List findAll() {
		log.debug("finding all RecommendTrain instances");
		try {
			String queryString = "from RecommendTrain";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public RecommendTrain merge(RecommendTrain detachedInstance) {
		log.debug("merging RecommendTrain instance");
		try {
			RecommendTrain result = (RecommendTrain) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(RecommendTrain instance) {
		log.debug("attaching dirty RecommendTrain instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RecommendTrain instance) {
		log.debug("attaching clean RecommendTrain instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}