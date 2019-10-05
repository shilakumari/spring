package com.tutorial.spring.dataSupport._2usingSpringAndDataSourceConfiguration;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcDaoImpl {

	@Autowired
	MyDataSource myDataSource;
	@Autowired
	DataSource dataSource;
	@Autowired
	BasicDataSource dbcpDataSource;
	@Autowired
	DataSource dataSource2;

	public Circle getCircleById(int circleId) {
		Circle circle = null;
		Connection con = null;
		try {
			// con = myDataSource.getConnection();
			// con = dataSource.getConnection();
			// con = dbcpDataSource.getConnection();
			con = dataSource2.getConnection();

			PreparedStatement ps = con.prepareStatement("SELECT * FROM circle where id=?");
			ps.setInt(1, circleId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				circle = new Circle();
				circle.setId(rs.getInt("id"));
				circle.setName(rs.getString("name"));
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return circle;
	}

	public ArrayList<Circle> getAllCircle() {
		ArrayList<Circle> circleList = null;
		Connection con = null;
		try {
			String driver = "org.apache.derby.jdbc.ClientDriver";
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection("jdbc:derby://localhost:1527//dbSpringData");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM circle");
			ResultSet rs = ps.executeQuery();
			circleList = new ArrayList<Circle>();
			Circle circle = null;
			while (rs.next()) {
				circle = new Circle();
				circle.setId(rs.getInt("id"));
				circle.setName(rs.getString("name"));

				circleList.add(circle);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
		return circleList;
	}

	public int getCircleCount() {
		int circleCount = 0;

		Connection con = null;
		try {
			con = dataSource2.getConnection();

			// PreparedStatement ps = con.prepareStatement("SELECT count(*)
			// countCircle FROM circle");
			PreparedStatement ps = con.prepareStatement("SELECT count(*) AS countCircle FROM circle");

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				// circleCount = rs.getInt("1");
				circleCount = rs.getInt("countCircle");
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}

		return circleCount;
	}

}
