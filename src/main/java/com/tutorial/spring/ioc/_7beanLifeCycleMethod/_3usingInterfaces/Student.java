package com.tutorial.spring.ioc._7beanLifeCycleMethod._3usingInterfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {

	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Inside myInitStudent()");
	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("Inside myDestroyStudent()");
	}

}
