package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.Actor;
import com.nt.utiliy.HibernateUtil;

public class LoadObjectTest2 {

	public static void main(String[] args) {

		Session ses= HibernateUtil.getSession();

		try {
			
			Actor actor = ses.get(Actor.class, 1);
			if(actor == null)
				System.out.println("Actor not found");
			else
				System.out.println(actor);
			
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
