package com.tutorial.spring.ioc._12UsingApplicationContextAware._3UseOfApplicationContextAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware {
	private Point pointA;
	private ApplicationContext context = null;

	public Point getPointA() {
		//this.pointA  = (Point) context.getBean("pointA");
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		//System.out.println("Before setApplicationContext");
		this.context = context;
		//Triangle triangle = (Triangle) context.getBean("triangle");
		//System.out.println("Point A:(" + getPointA().getX() + "," + getPointA().getY() + ")");
		//System.out.println("After setApplicationContext");
	}
}
