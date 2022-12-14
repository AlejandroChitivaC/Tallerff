package com.university.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.university.entity.Usuario;
import com.university.entity.Auditoria;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private HibernateUtil() {
	}

	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				@SuppressWarnings("deprecation")
				Configuration ac = new Configuration();
				ac.addAnnotatedClass(Usuario.class);
				ac.addAnnotatedClass(Auditoria.class);
				sessionFactory = ac.configure().buildSessionFactory();

			} catch (Throwable ex) {
				// Log the exception.
				System.err.println("Initial SessionFactory creation failed." + ex);
				throw new ExceptionInInitializerError(ex);
			}
			return sessionFactory;
		} else {
			return sessionFactory;
		}

	}

}