package com.tutorial.spring.dataSupport._1usingJDBCWithoutSpring;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDataSource {

	public static Connection getConnection() {
		Connection con = null;
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver).newInstance();
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb?user=root&password=root123");

			return con;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
