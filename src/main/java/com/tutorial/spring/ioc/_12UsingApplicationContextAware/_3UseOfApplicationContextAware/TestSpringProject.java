package com.tutorial.spring.ioc._12UsingApplicationContextAware._3UseOfApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_12UsingApplicationContextAware/_3UseOfApplicationContextAware/springConfig.xml");// If
		// inside
		// package

		Triangle triangle = (Triangle) context.getBean("triangle");
		System.out.println("Point A:(" + triangle.getPointA().getX() + "," + triangle.getPointA().getY() + ")"
				+ triangle.hashCode() + " " + triangle.getPointA().hashCode());

		triangle = (Triangle) context.getBean("triangle");
		System.out.println("Point A:(" + triangle.getPointA().getX() + "," + triangle.getPointA().getY() + ")"
				+ triangle.hashCode() + " " + triangle.getPointA().hashCode());

		triangle = (Triangle) context.getBean("triangle");
		System.out.println("Point A:(" + triangle.getPointA().getX() + "," + triangle.getPointA().getY() + ")"
				+ triangle.hashCode() + " " + triangle.getPointA().hashCode());
	}
}
