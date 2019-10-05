package com.tutorial.spring.ioc._7beanLifeCycleMethod._3usingInterfaces;

public class Restaurant {
	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}

	public void initRestaurant() {
		System.out.println("Inside initRestaurant()");
	}

	public void destroyRestaurant() {
		System.out.println("Inside destroyRestaurant()");
	}
}
