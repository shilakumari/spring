package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._2predefined._propertyPlaceholderConfigurer;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/ioc/_10BeanFactoryPostProcessor/_2predefined/_propertyPlaceholderConfigurer/springConfig.xml");// If
																																// inside
																																// package
		System.out.println("Going to get restaurant bean");

		((AbstractApplicationContext) context).registerShutdownHook();

		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.greetCustomer();

	}
}
