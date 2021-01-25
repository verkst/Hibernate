package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utiliy.HibernateUtil;

public class UpdateObjectTest2 {

	public static void main(String[] args) {
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = null;
		boolean flag=false;
		
		Actor actor = ses.get(Actor.class, 1);
		if(actor!=null)
			System.out.println(actor);
		
		try {
			
			tx = ses.beginTransaction();
			actor.setAddress("KukatPally");
			ses.update(actor);
			
			flag=true;
		}catch (HibernateException he) {
			he.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			if (flag) {
				tx.commit();
				System.out.println("Object is Updated");
			}else {
				tx.rollback();
				System.out.println("Object is not updated");
			}
			
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
			
		}
		
	}

}
