package com.tutorial.spring.ioc._11BeanAutowiring._3constructor;

public class Triangle {
	private Point pointA;
	private Side side;
	private Integer x;
	private String str;

	public void greetCustomer() {
		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
		System.out.println("length: " + side.getLength());
		System.out.println("x= " + x);
		System.out.println("str " + str);
	}

	public Triangle(Point pointA, Side side) {
		super();
		System.out.println("Point pointA, Side side");
		this.pointA = pointA;
		this.side = side;

	}

	public Triangle(Point pointA, Side side, Integer x, String str) {
		super();
		System.out.println("Point pointA, Side side, Integer x, String str");
		this.pointA = pointA;
		this.side = side;
		this.x = x;
		this.str = str;
	}
}
