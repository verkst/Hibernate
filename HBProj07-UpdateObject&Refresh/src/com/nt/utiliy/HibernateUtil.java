package com.nt.utiliy;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory factory;
	
	static {
		
		try {
		Configuration cfg = new Configuration();
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		
		factory = cfg.buildSessionFactory();
		
		}catch (HibernateException he) {
			he.printStackTrace();
		}
	}
	
	// session object
	public static Session getSession() {
		Session ses = null;
		if(factory!=null)
			ses = factory.openSession();
		
		return ses;
	}
	
	// close session object
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
	
	// close factory object
	public static void closeSessionFactory() {
		if(factory!=null)
			factory.close();
	}
	
}
