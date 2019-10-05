package com.tutorial.spring.ioc._9BeanPostProcessor._3requiredAnnotationBeanPostProcessor;

import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
	String welcomeNote;
	Tea tea;

	public Tea getTea() {
		return tea;
	}

	@Required
	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer() {
		System.out.println(welcomeNote);
		System.out.println(tea.welcomeNote);
	}

}
