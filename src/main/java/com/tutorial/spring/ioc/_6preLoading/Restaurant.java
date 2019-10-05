package com.tutorial.spring.ioc._6preLoading;
public class Restaurant {
	String welcomeNote;

	Restaurant() {
		System.out.println("Inside constructor");
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
}
