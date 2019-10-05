package com.tutorial.spring.ioc._11BeanAutowiring._1byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		// ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_11BeanAutowiring/_1byName/springConfig.xml");// If inside package
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.greetCustomer();
	}
}
