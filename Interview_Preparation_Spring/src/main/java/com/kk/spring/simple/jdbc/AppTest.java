package com.kk.spring.simple.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		 ApplicationContext context=new AnnotationConfigApplicationContext(Appconfiguration.class);
		 UserDAOImpl daoImpl=context.getBean("userDAOImpl",UserDAOImpl.class);
		 daoImpl.saveUser(new User("Kaushal","8084225043","EPLKH5525F", "44000"));
	}
}
