package com.tutorial.spring.ioc._7beanLifeCycleMethod._3usingInterfaces;

public class Tea {
	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}

	public void myInit() {
		System.out.println("Inside initTea()");
	}

	public void myDestroy() {
		System.out.println("Inside destroyTea()");
	}
}
