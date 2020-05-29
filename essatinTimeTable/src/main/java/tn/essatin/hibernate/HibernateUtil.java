package tn.essatin.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static final SessionFactory sessionFactory;
	static {
		try { 
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
				
	}catch(Throwable ex) {
		System.err.println("Creation du sessionFactory a echoue ."+ex);
		throw new ExceptionInInitializerError(ex);
		}
	}
    public static SessionFactory getSessionFactory() {
    	return sessionFactory;
    }
    public static void shutdown() {
    	getSessionFactory().close();
    	}
    }

