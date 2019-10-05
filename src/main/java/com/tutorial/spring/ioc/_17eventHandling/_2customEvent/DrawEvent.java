package com.tutorial.spring.ioc._17eventHandling._2customEvent;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "DrawEvent []";
	}

}
