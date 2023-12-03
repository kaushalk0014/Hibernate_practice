package com.kk.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kk.hibernate.domail.Engineer;

public class TestApp {
	static SessionFactory factory=null;
	public static void main(String[] args) {
		 Configuration configuration=new Configuration();
		 factory=configuration.configure("com/kk/hibernate/resource/hibernate.cfg.xml")
				 .buildSessionFactory();
		 TestApp.saveEngineer();
	}
	
	static void saveEngineer() {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(new Engineer(105,"kaushal","5000"));
		transaction.commit();
	}
}
