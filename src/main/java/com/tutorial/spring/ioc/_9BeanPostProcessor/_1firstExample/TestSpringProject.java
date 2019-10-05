package com.tutorial.spring.ioc._9BeanPostProcessor._1firstExample;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_9BeanPostProcessor/_1firstExample/springConfig.xml");//If inside package
		System.out.println("Going to get restaurant bean");
		  
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		restaurant.greetCustomer();
		
		System.out.println("Going to get Tea bean");
		Tea tea = (Tea) context.getBean("teaBean");
		tea.greetCustomer();
		
		System.out.println("Going to get Employee bean");
		Employee employee = (Employee) context.getBean("employeeBean");
		employee.greetCustomer();
		
		System.out.println("Going to get Student bean");
		Student student = (Student) context.getBean("studentBean");
		student.greetCustomer();
	
		System.out.println("Going to get Teacher bean");
		Teacher teacher = (Teacher) context.getBean("teacherBean");
		teacher.greetCustomer();
	}
}
