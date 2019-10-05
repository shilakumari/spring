package com.tutorial.spring.aop;
import org.aspectj.lang.annotation.Before;

//@Aspect
public class MySampleAspect {
	@Before(value="execution(public String com.aop._1BasicExample._1usingXML.Circle.getName())")
	// @Before("execution(public String getName())")
	// @Before("execution(public String get*())")
	// @Before("execution(public * get*())")
	// @Before("execution(       * get*())")// 0 argument
	// @Before("execution(       * get*(*))")//1 or more argument
	// @Before("execution(       * get*(..))")//0 or more argument
	// @Before("execution( * com.aop._1BasicExample._1usingXML.*.get*(..))")
	// @Before("execution( * com.aop._1BasicExample._1usingXML.*Service.get*(..))")
	public void sampleAdvice() {
		System.out.println("Inside sampleAdvice() of MySampleAspect");
	}
}
