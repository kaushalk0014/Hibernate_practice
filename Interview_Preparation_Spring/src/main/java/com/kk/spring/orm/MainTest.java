package com.kk.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

 

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		EmployeeDAO daoImpl = context.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
	}
}
