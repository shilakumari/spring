package com.tutorial.spring.ioc._12UsingApplicationContextAware._2ApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	public void draw() {
		
		System.out.println("Point A:(" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point B:(" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C:(" + getPointC().getX() + "," + getPointC().getY() + ")");
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("Before setApplicationContext");
		this.context = context;
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		System.out.println("After setApplicationContext");
	}
}
