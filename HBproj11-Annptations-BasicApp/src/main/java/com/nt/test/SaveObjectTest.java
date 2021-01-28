package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.InsurancePolicy;
import com.nt.utiliy.HibernateUtil;

public class SaveObjectTest {

	public static void main(String[] args) {
		
		Transaction tx = null;
		
		try(Session ses=HibernateUtil.getSession()) {
			tx=ses.beginTransaction();
			InsurancePolicy policy=new InsurancePolicy();
			policy.setPolicyId(2); 		policy.setPolicyName("Mobile Insurane");	
			policy.setCompany("Samsung Insurance"); 	policy.setTenure(3.0f);
			
			//save
			int idVal=(int) ses.save(policy);
			tx.commit();
			System.out.println("Objects is saved with id:: "+idVal);
			
		}catch (HibernateException he) {
			tx.rollback();
			he.printStackTrace();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
	}

}
