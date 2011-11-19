package com.epam.cdp.mbank.core;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.epam.cdp.mbank.model.Account;

public abstract class BaseDao<T> implements GenericDao<T> {

	private BaseTransformer<T> transformer = null;
	private Class<?> model;
	private EntityManager entityManager = EntityManagerHelper.getEjb3Configuration().buildEntityManagerFactory().createEntityManager();

	public BaseDao(BaseTransformer<T> transformer,Class<?> model) {
		this.setTransformer(transformer);
		this.model=model;
	}

	public T getById(int id) {
	  return null;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		List<T> result = null;

		EntityTransaction tx = entityManager.getTransaction();
		   tx.begin();
		   String selectQuery = new StringBuilder("select * from ").append(model.getName()).toString();
		   Query query = entityManager.createQuery(selectQuery);
		   result = query.getResultList();
    	return result;
	}

	public boolean delete(int id) {
		boolean result = false;
		return result;
	}

	public int getCount() {
		int result = 0;
		return result;
	}

	public void update(int id, T obj) {

	}

	public BaseTransformer<T> getTransformer() {
		return transformer;
	}

	public void setTransformer(BaseTransformer<T> transformer) {
		this.transformer = transformer;
	}
}
