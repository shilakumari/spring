package com.tutorial.spring.ioc._5beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_5beanScope/springConfig.xml");//If inside package
		System.out.println("hiiiiiii");
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean0");
		restaurant.greetCustomer();
		restaurant.setWelcomeNote("Bean scope not declared hence it is singleton");
		restaurant = (Restaurant) context.getBean("restaurantBean0");
		restaurant.greetCustomer();
		System.out.println();
			
		restaurant = (Restaurant) context.getBean("restaurantBean1");
		restaurant.setWelcomeNote("Bean scope is singleton");
		restaurant.greetCustomer();
		restaurant = (Restaurant) context.getBean("restaurantBean1");
		restaurant.greetCustomer();
		System.out.println();
		
		restaurant = (Restaurant) context.getBean("restaurantBean2");
		restaurant.setWelcomeNote("Bean scope is prototyped");
		restaurant.greetCustomer();
		restaurant = (Restaurant) context.getBean("restaurantBean2");
		restaurant.greetCustomer();
		System.out.println();
		
			
		restaurant = (Restaurant) context.getBean("restaurantBean00");
		restaurant.setWelcomeNote("Bean scope not declared hence it is singleton");
		restaurant.greetCustomer();
		restaurant = (Restaurant) context.getBean("restaurantBean00");
		restaurant.greetCustomer();
		System.out.println();
		
		 restaurant = (Restaurant) context.getBean("restaurantBean11");
		restaurant.setWelcomeNote("Bean scope is singleton");
		restaurant.greetCustomer();
		restaurant = (Restaurant) context.getBean("restaurantBean11");
		restaurant.greetCustomer();
		System.out.println();
		
		restaurant = (Restaurant) context.getBean("restaurantBean22");
		restaurant.setWelcomeNote("Bean scope is prototyped");
		restaurant.greetCustomer();
		restaurant = (Restaurant) context.getBean("restaurantBean22");
		restaurant.greetCustomer();
	}
}
