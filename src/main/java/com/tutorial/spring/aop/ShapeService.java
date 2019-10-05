package com.tutorial.spring.aop;
public class ShapeService {

	private Circle circle;
	private Triangle triangle;

	public Circle getCircle() {
		//System.out.println("inside ShapeService:getCircle()");
		return circle;
	}

	public void setCircle(Circle circle) {
		//System.out.println("inside ShapeService: setCircle(): " + circle.getName());
		this.circle = circle;
	}

	public Triangle getTriangle() {
		//System.out.println("inside ShapeService:getTriangle()");
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		//System.out.println("inside ShapeService: setTriangle(): " + triangle.getName());
		this.triangle = triangle;
	}

}
