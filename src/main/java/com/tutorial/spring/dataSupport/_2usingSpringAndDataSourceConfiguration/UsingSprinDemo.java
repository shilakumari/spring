package com.tutorial.spring.dataSupport._2usingSpringAndDataSourceConfiguration;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSprinDemo {

	public static void main(String[] args) {

		// m1();
		m2();
	}

	private static void m2() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/dataSupport/_2usingSpringAndDataSourceConfiguration/mySpring.xml");
		MyJdbcDaoSupportImpl myJdbcDaoSupportImpl = (MyJdbcDaoSupportImpl) context.getBean("myJdbcDaoSupportImpl");

		int circleCount = myJdbcDaoSupportImpl.getCircleCount();
		System.out.println(circleCount);
	}

	private static void m1() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/dataSupport/_2usingSpringAndDataSourceConfiguration/mySpring.xml");
		JdbcDaoImpl jdbcDaoImpl = (JdbcDaoImpl) context.getBean("jdbcDaoImpl");

		int circleId = 1;
		Circle circle = jdbcDaoImpl.getCircleById(circleId);
		System.out.println(circle.getId() + "  " + circle.getName());
		System.out.println();

		// ArrayList<Circle> circleList = new JdbcDaoImpl().getAllCircle();
		ArrayList<Circle> circleList = jdbcDaoImpl.getAllCircle();
		for (Circle c : circleList) {
			System.out.println(c.getId() + "  " + c.getName());
		}
		System.out.println();

		int circleCount = jdbcDaoImpl.getCircleCount();
		System.out.println(circleCount);
	}

}
