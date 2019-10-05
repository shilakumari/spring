package com.tutorial.spring.ioc._1FirstSpringApplication._2usingFactoryBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class FactoryBeanTest {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("/com/kumari/khusi/_1FirstSpringApplication/_2usingFactoryBean/springConfig.xml");//If
		// inside package

		// BeanFactory factory = new XmlBeanFactory(new
		// FileSystemResource("/com/kumari/khusi/_1FirstSpringApplication/_2usingFactoryBean/springConfig.xml"));
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
				"E:\\eclipse\\projects\\Spring1\\src\\com\\kumari\\khusi\\_1FirstSpringApplication\\_2usingFactoryBean\\springConfig.xml"));

		Restaurant restaurant = (Restaurant) factory.getBean("restaurantBean");
		restaurant.greetCustomer();

		restaurant = factory.getBean("restaurantBean", Restaurant.class);
		restaurant.greetCustomer();
	}
}
