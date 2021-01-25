package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utiliy.HibernateUtil;

public class DeleteObjectTest2 {

	public static void main(String[] args) {

		Session ses= HibernateUtil.getSession();
		Transaction tx = null;
		boolean flag = false;
		
		Actor actor  = ses.get(Actor.class, 2);
		
		if(actor!=null) {
		
		try {
			tx = ses.beginTransaction();
		
			ses.delete(actor);
			flag=true;
			
		}catch (HibernateException he) {
			he.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			if (flag) {
				System.out.println("Object is deleted");
				tx.commit();
			}else {
				System.out.println("Object is not deleted");
				tx.rollback();
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}}
		else {
			System.out.println("Object is not deleted");
		}
		
	}//main

}
// class
