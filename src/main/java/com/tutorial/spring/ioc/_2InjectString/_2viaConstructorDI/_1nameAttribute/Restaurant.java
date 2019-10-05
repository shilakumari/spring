package com.tutorial.spring.ioc._2InjectString._2viaConstructorDI._1nameAttribute;



public class Restaurant {
	String welcomeNote;

	Restaurant(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
}
