package com.epam.cdp.mbank.core.db.daoImplementation;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.epam.cdp.mbank.core.EntityManagerHelper;
import com.epam.cdp.mbank.core.db.daoInterfaces.GenericDao;

@PersistenceContext
public abstract class AbstractBaseDao<T, IDType> implements GenericDao<T, IDType> {

	private EntityManager entityManager = EntityManagerHelper
			.getEntityManager();
	public EntityTransaction transaction = entityManager.getTransaction();

	public abstract Class<T> getObjectClass();

	protected abstract String getSelectAllQuery();

	public AbstractBaseDao() {

	}

	protected TypedQuery<T> createNamedQuery(String name) {
		return entityManager.createNamedQuery(name, getObjectClass());
	}

	public T getById(IDType id) {
		T result = null;
		transaction.begin();
		if (id.getClass() == Long.class) {
			Long idLong = (Long) id;
			 result = entityManager.find(getObjectClass(), idLong.longValue());
		} else if (id.getClass() == String.class) {
			 result = entityManager.find(getObjectClass(), id);
		}
		transaction.commit();
		return result;
	}

	public List<T> getAll() {
		List<T> result = createNamedQuery(getSelectAllQuery()).getResultList();
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
