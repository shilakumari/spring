package com.tutorial.spring.ioc._17eventHandling._1allEventsListener;

public class Triangle {
	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void greetCustomer() {
		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
	}
}
