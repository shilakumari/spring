package com.tutorial.spring.ioc._3InjectObject._1viaSetterDI._2usingInterface;

public class Restaurant {
	IHotDrink iHotDrink;

	public void setiHotDrink(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}

	public void greetCustomer() {
		iHotDrink.prepareHotDrink();
	}
}
