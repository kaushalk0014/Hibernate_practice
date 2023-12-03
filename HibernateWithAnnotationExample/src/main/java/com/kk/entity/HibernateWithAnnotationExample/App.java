package com.kk.entity.HibernateWithAnnotationExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kk.hibernate.entity.BookDetails;

/**
 * Hello world!
 *
 */
public class App {
	private static SessionFactory factory;

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		factory = configuration.configure("com/kk/hibernate/resource/hibernate.cfg.xml").buildSessionFactory();
		
		saveBook();

		System.out.println("------------------------");
	}

	public static void saveBook() {
		Transaction trans =null;
		try {
			Session session=factory.openSession();
			if(session!=null) {
				trans=session.beginTransaction();
				 System.out.println("trans   : "+trans);
				session.save(new BookDetails(103l, "Kaushal", "Kaushal"));
				trans.commit();
			}
			 

		} catch (Exception e) {
			if(trans!=null) 
			trans.rollback();
			e.printStackTrace();
		}

	}
}
