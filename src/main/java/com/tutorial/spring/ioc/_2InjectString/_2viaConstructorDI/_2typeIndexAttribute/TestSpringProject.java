package com.tutorial.spring.ioc._2InjectString._2viaConstructorDI._2typeIndexAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_2InjectString/_2viaConstructorDI/_2typeIndexAttribute/springConfig.xml");//If inside package
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.greetCustomer();
		
		Restaurant restaurant2 = (Restaurant) context.getBean("restaurantBean2");
		restaurant2.greetCustomer();
	}
}
