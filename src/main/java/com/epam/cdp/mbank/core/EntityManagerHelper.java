package com.epam.cdp.mbank.core;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;

public class EntityManagerHelper {

	private static final SessionFactory sessionFactory;
	private static final Ejb3Configuration ejb3Configuration;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
			ejb3Configuration = new Ejb3Configuration().configure("/hibernate.cfg.xml");
		} catch (Throwable ex) {
			//TODO LOGGER!!!!
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Ejb3Configuration getEjb3Configuration() {
		return ejb3Configuration;
	}
}