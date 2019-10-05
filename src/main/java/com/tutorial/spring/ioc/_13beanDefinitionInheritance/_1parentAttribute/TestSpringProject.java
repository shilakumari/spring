package com.tutorial.spring.ioc._13beanDefinitionInheritance._1parentAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_13beanDefinitionInheritance/_1parentAttribute/springConfig.xml");// If inside
																										// package

		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.greetCustomer();
		System.out.println();

		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		triangle2.greetCustomer();
		System.out.println();

		try {
			Triangle triangle3 = (Triangle) context.getBean("triangle3");
			triangle3.greetCustomer();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Triangle triangle4 = (Triangle) context.getBean("triangle4");
			triangle4.greetCustomer();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Triangle triangle5 = (Triangle) context.getBean("triangle5");
			triangle5.greetCustomer();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
