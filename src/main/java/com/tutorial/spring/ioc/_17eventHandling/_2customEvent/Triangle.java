package com.tutorial.spring.ioc._17eventHandling._2customEvent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware, ApplicationContextAware {
	private Point pointA;
	private ApplicationEventPublisher applicationEventPublisher;
	private ApplicationContext applicationContext;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
		DrawEvent drawEvent = new DrawEvent(this);
		applicationEventPublisher.publishEvent(drawEvent);
		applicationContext.publishEvent(drawEvent);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
