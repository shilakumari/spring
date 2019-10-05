package com.tutorial.spring.ioc._16messageSourceAndI18N._1messageSource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/tutorial/spring/ioc/_16messageSourceAndI18N/_1messageSource/springConfig.xml");//If inside package
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.greetCustomer();
		System.out.println();

		String greetingMessage = context.getMessage("greeting", null, "Default greeting message", null);
		System.out.println(greetingMessage);
		greetingMessage = context.getMessage("hgvhb", null, "Default greeting message", null);
		System.out.println(greetingMessage);
		String centerPointMessage = context.getMessage("center.point", new Object[] { 11, 22 },
				"Default centerPointMessage", null);
		System.out.println(centerPointMessage);
		System.out.println();
		
		
		MessageSource messageSource = (MessageSource) context.getBean("messageSource");
		greetingMessage = messageSource.getMessage("greeting", null, "Default greeting message", null);
		System.out.println(greetingMessage);
		centerPointMessage = messageSource.getMessage("center.point", new Object[] { 22, 33 },
				"Default centerPointMessage", null);
		System.out.println(centerPointMessage);
	}
}
 