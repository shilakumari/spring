package com.tutorial.spring.ioc._3InjectObject._1viaSetterDI._2usingInterface;

public class Tea implements IHotDrink {

	public void prepareHotDrink() {
		System.out.println("Dear customer, we are Preparing Hot Drink for you(via interface)!");
	}
}
