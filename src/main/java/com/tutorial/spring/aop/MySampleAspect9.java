package com.tutorial.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;

public class MySampleAspect9 {

	public Object myAroundAdvice(ProceedingJoinPoint ProceedingJoinPoint) {
		Object returnValue = null;
		try {
			System.out.println("Before Calling getters()");
			returnValue = ProceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("After Finally");
		return returnValue + " from myAroundAdvice of MySampleAspect9";
	}

}
