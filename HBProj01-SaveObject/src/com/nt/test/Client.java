package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Actor;

public class Client {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/nt/cfgs/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session ses = factory.openSession();

		boolean flag = false;
		Actor actor = new Actor();
		actor.setActorName("Allu Arjun");
		actor.setAddress("Hyderabad");
		actor.setRemuneration(100000000);

		Transaction tx = null;

		try {
			tx = ses.beginTransaction();
			ses.save(actor);
			flag = true;

		} catch (HibernateException he) {
			he.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {

			if (flag) {
				tx.commit();
				System.out.println("Record Inserted !!!");
			}
			else {
				tx.rollback();
				System.out.println("Record not inserted !!!");
			}
			ses.close();
			factory.close();

		}//finally

	}

}
