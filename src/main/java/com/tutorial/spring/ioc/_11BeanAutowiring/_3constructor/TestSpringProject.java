package com.tutorial.spring.ioc._11BeanAutowiring._3constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_11BeanAutowiring/_3constructor/springConfig.xml");// If inside package
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.greetCustomer();
	}
}
