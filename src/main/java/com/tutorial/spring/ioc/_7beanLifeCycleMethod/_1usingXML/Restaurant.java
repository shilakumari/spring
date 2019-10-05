package com.tutorial.spring.ioc._7beanLifeCycleMethod._1usingXML;

public class Restaurant {
	String welcomeNote;

	Restaurant(){
		System.out.println("Inside Restaurant constructor");
	}
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
