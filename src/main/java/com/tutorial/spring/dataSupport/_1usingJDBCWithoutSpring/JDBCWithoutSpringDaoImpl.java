package com.tutorial.spring.dataSupport._1usingJDBCWithoutSpring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCWithoutSpringDaoImpl {

	public Circle getCircleById(int circleId) {
		Circle circle = null;
		Connection con = null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver).newInstance();
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
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
			e.printStackTrace();
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
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver).newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/durgadb", "root", "root123");
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

	public Circle getCircleById2(int circleId) {
		Circle circle = null;
		Connection con = null;
		try {
			con=MyDataSource.getConnection();
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

	public ArrayList<Circle> getAllCircle2() {
		ArrayList<Circle> circleList = null;
		Connection con = null;
		try {
			con=MyDataSource.getConnection();
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

}
