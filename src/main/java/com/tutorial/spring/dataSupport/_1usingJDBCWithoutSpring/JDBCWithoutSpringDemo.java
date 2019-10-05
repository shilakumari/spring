package com.tutorial.spring.dataSupport._1usingJDBCWithoutSpring;

import java.util.ArrayList;

public class JDBCWithoutSpringDemo {

	public static void main(String[] args) {
		
		//m1();
		m2();
	}

	private static void m2() {
		int circleId = 1;
		Circle circle = new JDBCWithoutSpringDaoImpl().getCircleById2(circleId);
		System.out.println(circle.getId() + "  " + circle.getName());
		System.out.println();

		ArrayList<Circle> circleList = new JDBCWithoutSpringDaoImpl().getAllCircle2();
		for (Circle c : circleList) {
			System.out.println(c.getId() + "  " + c.getName());
		}
	}
	private static void m1() {
		int circleId = 1;
		Circle circle = new JDBCWithoutSpringDaoImpl().getCircleById(circleId);
		System.out.println(circle.getId() + "  " + circle.getName());
		System.out.println();

		ArrayList<Circle> circleList = new JDBCWithoutSpringDaoImpl().getAllCircle();
		for (Circle c : circleList) {
			System.out.println(c.getId() + "  " + c.getName());
		}
	}
}
