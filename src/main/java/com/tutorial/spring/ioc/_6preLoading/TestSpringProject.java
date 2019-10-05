package com.tutorial.spring.ioc._6preLoading;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_6preLoading/springConfig.xml");//If inside package
		//BeanFactory context = new XmlBeanFactory(new FileSystemResource("E:\\eclipse\\projects\\Spring1\\src\\com\\kumari\\khusi\\_6preLoading\\springConfig.xml"));

		System.out.println("hi");
		System.out.println("Going to get restaurantBean0");
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean0");
		restaurant.greetCustomer();
		
		System.out.println("Going to get restaurantBean1");
		restaurant = (Restaurant) context.getBean("restaurantBean1");
		restaurant.greetCustomer();
		
		System.out.println("Going to get restaurantBean2");
	    restaurant = (Restaurant) context.getBean("restaurantBean2");
		restaurant.greetCustomer();
		System.out.println();

		System.out.println("Going to get restaurantBean3");
		restaurant = (Restaurant) context.getBean("restaurantBean3");
		restaurant.greetCustomer();
		System.out.println(restaurant.hashCode());
		System.out.println("Going to get restaurantBean3");
		restaurant = (Restaurant) context.getBean("restaurantBean3");
		restaurant.greetCustomer();
		System.out.println(restaurant.hashCode());
		System.out.println();
		
		System.out.println("Going to get restaurantBean4");
		restaurant = (Restaurant) context.getBean("restaurantBean4");
		restaurant.greetCustomer();
		System.out.println(restaurant.hashCode());
		System.out.println("Going to get restaurantBean4");
		restaurant = (Restaurant) context.getBean("restaurantBean4");
		restaurant.greetCustomer();
		System.out.println(restaurant.hashCode());
		System.out.println();
		
				
	}
}
