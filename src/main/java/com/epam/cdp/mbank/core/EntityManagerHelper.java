package com.epam.cdp.mbank.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityManagerHelper {

    private final static String PERSISTENCE_UNIT = "MBANK_PERSISTENCE_UNIT";

    private static EntityManagerFactory entityFactory = Persistence
	    .createEntityManagerFactory(PERSISTENCE_UNIT);

    private static EntityManager entityManager = getEntityFactory()
	    .createEntityManager();

    private EntityManagerHelper() {
    }

    public static EntityManager getEntityManager() {
	return entityManager;
    }

    public static EntityManagerFactory getEntityFactory() {
	return entityFactory;
    }

}
