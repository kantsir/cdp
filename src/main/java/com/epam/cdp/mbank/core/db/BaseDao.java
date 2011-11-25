package com.epam.cdp.mbank.core.db;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.epam.cdp.mbank.core.EntityManagerHelper;
import com.epam.cdp.mbank.model.Client;

@PersistenceContext
public abstract class BaseDao<T, IDType> implements GenericDao<T, IDType> {

	private EntityManager entityManager = EntityManagerHelper
			.getEntityManager();
	public EntityTransaction transaction = entityManager.getTransaction();

	public abstract Class<T> getObjectClass();

	protected abstract String getSelectAllQuery();

	public BaseDao() {

	}

	protected TypedQuery<T> createNamedQuery(String name) {
		return entityManager.createNamedQuery(name, getObjectClass());
	}

	public T getById(IDType id) {
		transaction.begin();
		T result = entityManager.find(getObjectClass(), id);
		transaction.commit();
		return result;
	}

	public List<T> getAll() {
		List<T> result = createNamedQuery(getSelectAllQuery())
				.getResultList();
		return result;
	}

	public void save(T object) {
		transaction.begin();
		entityManager.persist(object);
		transaction.commit();
	}

	public void saveAll(Collection<T> objects) {
		transaction.begin();
		for (T object : objects) {
			entityManager.persist(object);
		}
		transaction.commit();
	}

	public void remove(T object) {
		transaction.begin();
		entityManager.remove(object);
		transaction.commit();
	}

}
