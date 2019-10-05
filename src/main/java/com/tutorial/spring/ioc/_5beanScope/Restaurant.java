package com.tutorial.spring.ioc._5beanScope;

public class Restaurant {
	String welcomeNote;

	Restaurant() {
		System.out.println("inside constructor" + this.hashCode());
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
}
