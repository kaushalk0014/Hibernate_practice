package com.kk.spring.simple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gstapp", "root", "root");
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	private int getMaxId() {
		int id = 0;
		int count = 0;
		try {
			PreparedStatement stmt = connection.prepareStatement("select max(user_ID),count(*) from user");
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				id = resultSet.getInt(1);
				count = resultSet.getInt(2);
			}
			if (count > 0) {
				if (id == 0) {
					throw new RuntimeException("Id not found");
				}
			} else if (count == 0) {
				return 1;
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return id+1;
	}

	@Override
	public User saveUser(User user) {
		try {
			PreparedStatement stmt = connection.prepareStatement("insert into user values(?,?,?,?,?)");
			stmt.setInt(1, getMaxId());
			stmt.setString(2, user.getName());
			stmt.setString(3, user.getMobileNo());
			stmt.setString(4, user.getPanNo());
			stmt.setString(5, user.getSalary());
			int i = stmt.executeUpdate();
			System.out.println(i);

		} catch (Exception e) {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e1) {
				throw new RuntimeException(e.getMessage());
			}
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return null;
	}

}
