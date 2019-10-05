package com.tutorial.spring.ioc._2InjectString._2viaConstructorDI._2typeIndexAttribute;

public class Restaurant {
	String welcomeNote;
	int noOfCustomer;

	Restaurant(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	Restaurant(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}

	public Restaurant(String welcomeNote, int noOfCustomer) {
		super();
		this.welcomeNote = welcomeNote;
		this.noOfCustomer = noOfCustomer;

	}

	public void greetCustomer() {
		System.out.println(welcomeNote + " " + noOfCustomer);
	}
}
