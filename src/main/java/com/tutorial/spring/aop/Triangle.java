package com.tutorial.spring.aop;
public class Triangle {
	private String name;

	public String getName() {
		//System.out.println("inside Triangle:getName()");
		return name;
	}

	public void setName(String name) {
		//System.out.println("inside Triangle: setName(): " + name);
		this.name = name;
	}

}
