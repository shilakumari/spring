package com.tutorial.spring.aop;
public class MySpringAopTest2 {

	public static void main(String[] args) {
		FactoryService factoryService = new FactoryService();
		MyCircle myCircle = (MyCircle) factoryService.getBean("myCircle");
		myCircle.getName();
	}

}

class MyCircleProxy extends MyCircle {
	public String getName() {
		System.out.println("MyCircleProxy: getName() called");
		new MyAspect().myAdvice();
		return super.getName();
	}
}

class FactoryService {
	public Object getBean(String beanType) {
		if (beanType.equals("myCircle")) {
			// return new MyCircle();
			return new MyCircleProxy();
		}
		return null;
	}
}

class MyAspect {
	public void myAdvice() {
		System.out.println("myAdvice  called");
	}
}

class MyCircle {
	private String name;

	public String getName() {
		System.out.println("MyCircle: getName() called");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
