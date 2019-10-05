package com.tutorial.spring.ioc._13beanDefinitionInheritance._2mergeAttribute;

import java.util.List;

public class Triangle {
	private List<Point> points;

	Triangle(){
		System.out.println("Inside triangle constructor");
	}
	public void greetCustomer() {
		for (int i = 0; i < points.size(); i++) {
			System.out.println("Points: " + points.get(i).getX()+","+points.get(i).getY());
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
