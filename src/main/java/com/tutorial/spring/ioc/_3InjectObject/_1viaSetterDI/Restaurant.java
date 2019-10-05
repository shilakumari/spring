package com.tutorial.spring.ioc._3InjectObject._1viaSetterDI;

public class Restaurant {
	Tea tea;

	public void setTea(Tea tea) {
		this.tea = tea;
	}

	public void greetCustomer() {
		tea.prepareHotDrink();
	}
}
