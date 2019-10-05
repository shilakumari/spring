package com.tutorial.spring.ioc._12UsingApplicationContextAware._2ApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_12UsingApplicationContextAware/_2ApplicationContextAware/springConfig.xml");// If
		// inside
		// package

		// Triangle triangle = (Triangle) context.getBean("triangle");
		// triangle.draw();
	}
}
