package com.tutorial.spring.ioc._1FirstSpringApplication._1usingApplicationContext;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorial/spring/ioc/_1FirstSpringApplication/_1usingApplicationContext/springConfig.xml");//If inside package
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		System.out.println(restaurant);
		restaurant.greetCustomer();

		restaurant =  context.getBean("restaurantBean",Restaurant.class);
		System.out.println(restaurant);
		restaurant.greetCustomer();

		
	}
}
