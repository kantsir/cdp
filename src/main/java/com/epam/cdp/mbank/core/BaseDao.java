package com.epam.cdp.mbank.core;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public abstract class BaseDao<T> implements GenericDao<T> {

    private Class<T> model;
    private EntityManager entityManager = EntityManagerHelper
	    .getEjb3Configuration().buildEntityManagerFactory()
	    .createEntityManager();
    private EntityTransaction transaction = entityManager.getTransaction();

    abstract String getSelectAllQuery();

    public BaseDao(Class<T> model) {
	this.model = model;
    }

    public T getById(Long id) {
	T result = null;
	transaction.begin();
	result = (T) entityManager.find(model, id);
	transaction.commit();
	return result;
    }

    @SuppressWarnings("unchecked")
    public Collection<T> getAll() {
	Collection<T> result = null;
	transaction.begin();
	String selectAllQuery = getSelectAllQuery();
	Query query = entityManager.createQuery(selectAllQuery);
	result = query.getResultList();
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
