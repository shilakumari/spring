package com.tutorial.spring.dataSupport._4UsingHibernateWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingSprinDemo {

	public static void main(String[] args) {
		m1();
	}

	private static void m1() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/tutorial/spring/dataSupport/_4UsingHibernateWithSpring/mySpring.xml");
		HibernateDaoImpl hibernateDaoImpl = context.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(hibernateDaoImpl.getCircleCountUsingHibernate());
	}

}
