package com.epam.cdp.mbank.core;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public abstract class BaseDao<T> implements GenericDao<T> {

    private EntityManager entityManager = EntityManagerHelper
	    .getEntityManager();
    public EntityTransaction transaction = entityManager.getTransaction();

    public abstract Class<T> getObjectClass();

    public abstract String getSelectAllQuery();

    public BaseDao() {

    }

    public T getById(Long id) {
	transaction.begin();
	T result = entityManager.find(getObjectClass(), id);
	transaction.commit();
	return result;
    }

    @SuppressWarnings("unchecked")
    public Collection<T> getAll() {
	transaction.begin();
	Collection<T> result = entityManager.createQuery(getSelectAllQuery())
		.getResultList();
	transaction.commit();
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
