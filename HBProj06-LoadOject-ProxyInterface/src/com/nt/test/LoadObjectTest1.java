package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.IActor;
import com.nt.utiliy.HibernateUtil;

public class LoadObjectTest1 {

	public static void main(String[] args) {

		Session ses= HibernateUtil.getSession();

		try {
			
			IActor actor = ses.load(IActor.class, 1);
			System.out.println(actor.getClass()+" "+actor.getClass().getSuperclass());
			
			
		}catch (HibernateException he) {
			he.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
		
	}//main

}//class
