package com.tutorial.spring.ioc._3InjectObject._2viaConstructorDI;

public class Restaurant {
	Tea tea;

	Restaurant(Tea tea) {
		this.tea = tea;
	}

	public void greetCustomer() {
		tea.prepareHotDrink();
	}
}
