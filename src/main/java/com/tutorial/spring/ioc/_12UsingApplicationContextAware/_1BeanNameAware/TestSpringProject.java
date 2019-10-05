package com.tutorial.spring.ioc._12UsingApplicationContextAware._1BeanNameAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_12UsingApplicationContextAware/_1BeanNameAware/springConfig.xml");// If
																												// inside
		// package

		Triangle triangle = (Triangle) context.getBean("triangle11");

		ApplicationContext context2 = triangle.getContext();
		System.out.println("context " + context);
		System.out.println("context2 " + context2);

		Point p1 = (Point) context2.getBean("pointA");
		System.out.println(p1.getX() + " " + p1.getY());
		p1.setX(11);
		p1.setY(22);
		System.out.println(p1.getX() + " " + p1.getY());

		triangle.draw();

		triangle = (Triangle) context.getBean("triangle11");
		triangle = (Triangle) context.getBean("triangle11");

	}
}
