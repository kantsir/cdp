package com.epam.cdp.mbank.core.db;

import java.util.Collection;

public interface GenericDao<T> {

    public T getById(Long id);

    public Collection<T> getAll();

    public void save(T object);

    public void saveAll(Collection<T> objects);

    public void remove(T object);

}