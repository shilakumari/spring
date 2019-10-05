package com.tutorial.spring.ioc._11BeanAutowiring._2byType;

public class Triangle {
	private Point pointA;
	private Side side;
	private Integer x;
	private String str;
	// private Point pointB;


	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void greetCustomer() {

		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
		System.out.println("length: " + side.getLength());
		System.out.println("x= " + x);
		System.out.println("str " + str);
	}
}
