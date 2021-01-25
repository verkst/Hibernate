package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Actor;
import com.nt.utiliy.HibernateUtil;

public class SaveOrUpdateTest {

	public static void main(String[] args) {

		Session ses = HibernateUtil.getSession();
		Transaction tx = null;
		boolean flag = false;
		try {
			tx = ses.beginTransaction();
			Actor actor = new Actor();
			actor.setActorId(10);
			actor.setActorName("rajini");
			actor.setAddress("TamilNadu");
			actor.setRemuneration(8900666.0f);
			ses.saveOrUpdate(actor);
			flag = true;
		} // try
		catch (HibernateException he) {
			flag = false;
			he.printStackTrace();
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if (flag) {
				tx.commit();
				System.out.println("Object is saved or updated");
			} else {
				tx.rollback();
				System.out.println("Object is not saved or  updated");
			}
			// close Session,SessionFactory object
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		} // finally

	}// main
}// class