package com.tutorial.spring.ioc._4InjectCollection.list._2viaContructorDI;

import java.util.List;

public class Restaurant {
	private List restaurantWaitersList;

	Restaurant(List restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}

	public void greetCustomer() {
		System.out.println("com.kumari.khusi._4InjectCollection.list._2viaContructorDI");
		System.out.println("WaitersList in restaurant" + restaurantWaitersList);
	}
}
