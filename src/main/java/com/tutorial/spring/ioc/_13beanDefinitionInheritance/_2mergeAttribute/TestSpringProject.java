package com.tutorial.spring.ioc._13beanDefinitionInheritance._2mergeAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_13beanDefinitionInheritance/_2mergeAttribute/springConfig.xml");// If inside package

		System.out.println("Triangle 1");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.greetCustomer();
		System.out.println();

		System.out.println("Triangle 2");
		Triangle triangle2 = (Triangle) context.getBean("triangle2");
		triangle2.greetCustomer();
		System.out.println();

		System.out.println("Triangle 3");
		try {
			Triangle triangle3 = (Triangle) context.getBean("triangle3");
			triangle3.greetCustomer();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Triangle 4");
		try {
			Triangle triangle4 = (Triangle) context.getBean("triangle4");
			triangle4.greetCustomer();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
