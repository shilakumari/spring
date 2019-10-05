package com.tutorial.spring.ioc._13beanDefinitionInheritance._3abstractAttribute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorial/spring/ioc/_13beanDefinitionInheritance/_3abstractAttribute/springConfig.xml");//If inside package
		
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.greetCustomer();
		System.out.println();
	}
}
 