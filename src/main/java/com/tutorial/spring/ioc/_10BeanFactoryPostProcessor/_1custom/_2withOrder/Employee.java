package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._1custom._2withOrder;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
	@PostConstruct
	public void initEmployee() {
		System.out.println("Inside initEmployee()");
	}
	@PreDestroy
	public void destroyEmployee() {
		System.out.println("Inside destroyEmployee()");
	}

}
