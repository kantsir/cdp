package com.epam.cdp.mbank.core.db.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.epam.cdp.mbank.core.db.dao.GenericDao;

public abstract class AbstractBaseDao<T, IDType> implements
		GenericDao<T, IDType> {

	@PersistenceContext
	private EntityManager entityManager;

	public abstract Class<T> getObjectClass();

	protected abstract String getSelectAllQuery();

	public AbstractBaseDao() {

	}

	protected TypedQuery<T> createNamedQuery(String name) {
		return entityManager.createNamedQuery(name, getObjectClass());
	}

	public T getById(IDType id) {
		T result = null;
		if (id.getClass() == Long.class) {
			Long idLong = (Long) id;
			result = entityManager.find(getObjectClass(), idLong.longValue());
		} else if (id.getClass() == String.class) {
			result = entityManager.find(getObjectClass(), id);
		}
		return result;
	}

	public List<T> getAll() {
		List<T> result = createNamedQuery(getSelectAllQuery()).getResultList();
		return result;
	}

	public void save(T object) {
		entityManager.persist(object);
	}

	public void saveAll(List<T> objects) {
		for (T object : objects) {
			entityManager.persist(object);
		}
	}

	public void remove(T object) {
		entityManager.remove(object);
	}

}
