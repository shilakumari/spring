package com.tutorial.spring.aop;

public class Circle {
	private String name;

	@MyLoggable
	public String getName() {
		System.out.println("inside Circle:getName()");
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("inside Circle: setName(): " + name);
		//throw new RuntimeException();
	}

	public String setNameAndReturn(String name) {
		this.name = name;
		//System.out.println("inside Circle: setNameAndReturn(): " + name);
		return "returned: " + name;
	}
}
