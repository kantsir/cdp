package com.epam.cdp.mbank.core;

import java.util.List;

public interface GenericDao<T> {

	T getById(int id);

	List<T> getAll();

	boolean delete(int id);

	void insert(T obj);

	void update(int id, T obj);

	int getCount();
}