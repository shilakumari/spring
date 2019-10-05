package com.tutorial.spring.ioc._9BeanPostProcessor._3requiredAnnotationBeanPostProcessor;

public class Tea {
	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
	}
}
