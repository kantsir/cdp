package com.epam.cdp.mbank.core.db.daoInterfaces;

import java.util.Collection;

public interface GenericDao<T,IDType> {

    public T getById(IDType id);

    public Collection<T> getAll();

    public void save(T object);

    public void saveAll(Collection<T> objects);

    public void remove(T object);

}