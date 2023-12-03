package com.kk.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kk.hibernate.domain.Doctor;

public class AppTest {
	static SessionFactory sessionFactory = null;

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		sessionFactory = configuration.configure("com/kk/hibernate/resource/hibernate.cfg.xml").buildSessionFactory();
		AppTest.getDoctor();
	}

	static void sveDoctor() {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(new Doctor(1,"kaushal","40000"));
		//session.close();
		transaction.commit();
	}
	
	static void getDoctor() {
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.get(Doctor.class,1);
		transaction.commit();
		
		
		Session session1 = sessionFactory.getCurrentSession();
		Transaction transaction1 = session.beginTransaction();
		session1.get(Doctor.class,1);
		transaction1.commit();
	}
}
