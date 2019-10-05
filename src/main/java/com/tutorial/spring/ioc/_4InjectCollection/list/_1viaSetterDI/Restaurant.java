package com.tutorial.spring.ioc._4InjectCollection.list._1viaSetterDI;

import java.util.List;

public class Restaurant {
	private List<String> restaurantWaitersList;

	public void setRestaurantWaitersList(List<String> restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}

	public void greetCustomer() {
		System.out.println("WaitersList in restaurant" + restaurantWaitersList);
	}
}
