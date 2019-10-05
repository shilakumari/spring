package com.tutorial.spring.dataSupport._2usingSpringAndDataSourceConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyDataSource {

	private String driverClassName;
	private String url;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Connection getConnection() {
		Connection con = null;
		String driver = driverClassName;
		try {
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection(url);
			return con;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
