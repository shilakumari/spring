package com.tutorial.spring.ioc._9BeanPostProcessor._2orderedBeanPP;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {

	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Teacher.afterPropertiesSet()");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside Teacher.destroy()");

	}

}
