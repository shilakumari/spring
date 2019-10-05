package com.tutorial.spring.ioc._4InjectCollection.list._2viaContructorDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_4InjectCollection/list/_2viaContructorDI/springConfig.xml");//If inside package
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.greetCustomer();
	}
}
