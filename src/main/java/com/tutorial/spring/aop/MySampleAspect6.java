package com.tutorial.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MySampleAspect6 {

	@AfterReturning(pointcut = "args(name)", returning = "myReturnValue") 
	public void stringArgumentMethods(String name, String myReturnValue) {
		System.out.println(
				"Inside stringArgumentMethods & THE VALUE IS: " + name + ". The output value is " + myReturnValue);
	}

	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void stringArgumentMethods2(String name, Exception ex) {
		System.out.println("Inside stringArgumentMethods2 & THE VALUE IS: " + name + ". The Exception is: " + ex);
	}

	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void stringArgumentMethods3(String name, RuntimeException ex) {
		System.out.println("Inside stringArgumentMethods3 & THE VALUE IS: " + name + ". The runtime exception is: " + ex);
	}
}
