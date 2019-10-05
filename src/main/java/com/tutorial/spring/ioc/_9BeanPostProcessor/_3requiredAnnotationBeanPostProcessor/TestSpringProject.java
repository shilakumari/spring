package com.tutorial.spring.ioc._9BeanPostProcessor._3requiredAnnotationBeanPostProcessor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("/springConfig.xml");//If directly
		// inside src
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("springConfig.xml");//If directly
		// inside src
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/kumari/khusi/_9BeanPostProcessor/_3requiredAnnotationBeanPostProcessor/springConfig.xml");// If
																												// inside
																												// package

		// ((AbstractApplicationContext) context).registerShutdownHook();

		System.out.println("Going to get restaurant bean");
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.greetCustomer();
	}
}
