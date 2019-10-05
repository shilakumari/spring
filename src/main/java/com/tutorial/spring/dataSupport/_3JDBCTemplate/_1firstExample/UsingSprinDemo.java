package com.tutorial.spring.dataSupport._3JDBCTemplate._1firstExample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSprinDemo {
	static JdbcDaoImpl jdbcDaoImpl = null;
	static {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/dataSupport/_3JDBCTemplate/_1firstExample/mySpring.xml");
		jdbcDaoImpl = (JdbcDaoImpl) context.getBean("jdbcDaoImpl");

	}

	public static void main(String[] args) {
		// m1();
		//m2();
		// m3();
		 m4();
	}

	private static void m4() {
		List<Circle> list = jdbcDaoImpl.getAllCircles(3,"circle3");
		for (Circle c : list) {
			System.out.println(c.getId() + " " + c.getName());
		}
	}

	private static void m3() {
		int circleId = jdbcDaoImpl.getCircleForId(1).getId();
		System.out.println("getCircleForId(1): " + circleId);
		
		String circleName = jdbcDaoImpl.getCircleForId(1).getName();
		System.out.println(circleName);

		int circleCount = jdbcDaoImpl.getAllCircles().size();
		System.out.println("getAllCircles(): " + circleCount);
	}

	private static void m2() {
		jdbcDaoImpl.createTriangle();
		Circle circle = new Circle();
		circle.setId(4);
		circle.setName("circle 4");
		jdbcDaoImpl.insertCircle(circle);
	}

	private static void m1() {

		int circleCount = jdbcDaoImpl.getCircleCount();
		System.out.println("Using getCircleCount() from the JdbcDaoImpl class:" + circleCount);

		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate();
		System.out.println("Using getCircleCountUsingJdbcTemplate(): " + circleCount);

		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate2();
		System.out.println("Using getCircleCountUsingJdbcTemplate2(): " + circleCount);
		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate3();
		System.out.println("Using getCircleCountUsingJdbcTemplate3(): " + circleCount);
		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate4();// java.lang.IllegalStateException:
																		// No
																		// DataSource
																		// set
		System.out.println("Using getCircleCountUsingJdbcTemplate4(): " + circleCount);
		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate5();
		System.out.println("Using getCircleCountUsingJdbcTemplate5(): " + circleCount);
		circleCount = jdbcDaoImpl.getCircleCountUsingJdbcTemplate6();
		System.out.println("Using getCircleCountUsingJdbcTemplate6(): " + circleCount);

		String circleName = jdbcDaoImpl.getCircleNameUsingJdbcTemplate(2);
		System.out.println("getCircleNameUsingJdbcTemplate(2): " + circleName);
	}

}
