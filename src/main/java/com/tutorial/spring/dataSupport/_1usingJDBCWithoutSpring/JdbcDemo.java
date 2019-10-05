package com.tutorial.spring.dataSupport._1usingJDBCWithoutSpring;

import java.util.ArrayList;

public class JdbcDemo {

	public static void main(String[] args) {
		int circleId = 1;
		Circle circle = new JdbcDaoImpl().getCircleById(circleId);
		System.out.println(circle.getId() + "  " + circle.getName());
		System.out.println();

		ArrayList<Circle> circleList = new JdbcDaoImpl().getAllCircle();
		for (Circle c : circleList) {
			System.out.println(c.getId() + "  " + c.getName());
		}
	}
}
