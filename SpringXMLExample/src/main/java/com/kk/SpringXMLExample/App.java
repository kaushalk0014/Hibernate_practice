package com.kk.SpringXMLExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	/*
	 * // @Bean public SpellChecker checker() { return new DatabaseSpellChecker();
	 * 
	 * }
	 */
	public static void main(String[] args) throws SQLException {
		
		
		
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/kk/resource/spring-config.xml");
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		Connection connection = dataSource.getConnection();

		//System.out.println(connection);
		PreparedStatement prreparedStatement = connection.prepareStatement("select * from doctor");
		ResultSet resultSet = prreparedStatement.executeQuery();
		while (resultSet.next()) {
			System.out.println(resultSet.getInt("doc_id"));
		}

	}
}
