package com.epam.cdp.mbank.core;

import java.util.List;

public abstract class BaseDao<T> implements GenericDao<T> {

	private BaseTransformer<T> transformer;
	protected String tableName;

	public BaseDao(BaseTransformer<T> transformer, T obj) {
		this.transformer = transformer;
		//tableName = annotationGetter.getTableName(obj);
	}

	public BaseDao() {
	}

	public T getById(int id) {
		T result = null;
		return result;
	}

	public List<T> getAll() {
		List<T> result = null;
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
}
