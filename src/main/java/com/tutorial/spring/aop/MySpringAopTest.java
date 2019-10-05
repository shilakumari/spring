package com.tutorial.spring.aop;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringAopTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/aop/_1BasicExample/_1usingXML/springAopConfig.xml");
		System.out.println("start");
		Circle c = (Circle) context.getBean("circleBean");
		System.out.println(c.getName());

		// c.setNameAndReturn("abxyz");
		// c.setName("abxyz");

		// Triangle t = (Triangle) context.getBean("triangleBean");
		// System.out.println(t.getName());
		// System.out.println();

		// ShapeService shapeService = (ShapeService)
		// context.getBean("shapeServiceBean");
		// System.out.println(shapeService.getCircle().getName());
		// System.out.println(shapeService.getTriangle().getName());

		// shapeService.getCircle().setName("Dummy Name");
		// shapeService.getCircle().setNameAndReturn("Dummy NameAndReturn");
	}
}
