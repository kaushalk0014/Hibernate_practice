package com.kk.simplehibernetexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kk.entity.Employee;

/**
 * Hello world!
 *
 */
public class TestApp {
	static SessionFactory sessionFactory = null;

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		sessionFactory = configuration.configure("com/kk/resource/hibernate.cfg.xml").buildSessionFactory();
		TestApp.getUser();
	}

	static void getUser() {

		Session session1 = sessionFactory.openSession();
		session1.get(Employee.class, 1);
		session1.get(Employee.class, 1);
		session1.close();
		Session session2 = sessionFactory.openSession();
		//session2.get(Employee.class, 1);
		session2.close();
	}

	static void SaveUser() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(new Employee(101, "kaushal", "10000000"));
		transaction.commit();
		session.close();
	}
}
