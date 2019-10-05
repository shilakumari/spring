package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._1custom._2withOrder;

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
