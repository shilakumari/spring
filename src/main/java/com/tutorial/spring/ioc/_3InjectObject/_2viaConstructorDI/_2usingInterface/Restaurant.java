package com.tutorial.spring.ioc._3InjectObject._2viaConstructorDI._2usingInterface;

public class Restaurant {
	IHotDrink iHotDrink;

	Restaurant(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}

	public void greetCustomer() {
		iHotDrink.prepareHotDrink();
	}
}
