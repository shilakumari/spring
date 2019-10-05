package com.tutorial.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MySampleAspect8 {

	@Around("@annotation(com.aop._1BasicExample._1usingXML.MyLoggable)")
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
		return returnValue + " from myAroundAdvice";
	}

	@Pointcut("execution(* getName())")
	public void allGetters() {
	}
}
