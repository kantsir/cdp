package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

public interface GenericDao<T,IDType> {

    public T getById(IDType id);

    public List<T> getAll();

    public void save(T object);

    public void saveAll(List<T> objects);

    public void remove(T object);

}