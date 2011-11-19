package com.epam.cdp.mbank.core;

import java.util.Collection;

public interface GenericDao<T> {

    public T getById(Long id);

    public Collection<T> getAll(Class<T> model);

    public void save(T object);

    public void saveAll(Collection<T> objects);

    public void remove(T object);
    
}