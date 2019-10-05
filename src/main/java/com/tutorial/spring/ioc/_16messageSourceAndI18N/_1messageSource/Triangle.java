package com.tutorial.spring.ioc._16messageSourceAndI18N._1messageSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Triangle {
	private Point pointA;

	@Autowired
	private MessageSource messageSource;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void greetCustomer() {
		String centerPointMessage = messageSource.getMessage("center.point", new Object[] { 00, 11 }, "Default centerPointMessage", null);
		System.out.println(centerPointMessage);
		System.out.println("PointA: " + pointA.getX() + " " + pointA.getY());
	}
}
