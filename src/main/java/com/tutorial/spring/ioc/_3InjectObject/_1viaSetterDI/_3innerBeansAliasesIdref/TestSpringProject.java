package com.tutorial.spring.ioc._3InjectObject._1viaSetterDI._3innerBeansAliasesIdref;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("/springConfig.xml");//If directly inside src
		//ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");//If directly inside src
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/kumari/khusi/_3InjectObject/_1viaSetterDI/_3innerBeansAliasesIdref/springConfig.xml");//If inside package
		
		//Tea teaBean = (Tea) context.getBean("teaBean");
		//Tea teaBean2 = (Tea) context.getBean("teaBean2");//INNER BEAN
		//Tea teaBean3 = (Tea) context.getBean("teaBean3");//inner bEAN
		
		Restaurant restaurant = (Restaurant) context.getBean("restaurantBean");
		//restaurant.greetCustomer();
//		restaurant = (Restaurant) context.getBean("restaurantBeanAlias1");
//		restaurant.greetCustomer();
//		restaurant = (Restaurant) context.getBean("restaurantBeanAlias2");
//		restaurant.greetCustomer();
//		restaurant = (Restaurant) context.getBean("restaurantBeanAlias3");
//		restaurant.greetCustomer();
		
	    restaurant = (Restaurant) context.getBean("restaurantBean");
		System.out.println(restaurant.getIdRef());//teaBean
		Tea tea=(Tea) context.getBean(restaurant.getIdRef());
		System.out.println(tea);
	}
}
