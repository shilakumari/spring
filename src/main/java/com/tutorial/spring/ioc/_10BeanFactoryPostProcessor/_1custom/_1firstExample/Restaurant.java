package com.tutorial.spring.ioc._10BeanFactoryPostProcessor._1custom._1firstExample;

public class Restaurant {
	String welcomeNote;

	Restaurant()
	{
		System.out.println("inside constructor");
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
