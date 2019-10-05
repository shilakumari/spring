package com.tutorial.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MySampleAspect5 {
	
	@Before("allCircleMethods()")
	public void sampleAdvice(JoinPoint joinPoint){
		System.out.println("Inside sampleAdvice() of MySampleAspect5");
		//Circle circle=(Circle)joinPoint.getTarget();
		//System.out.println(circle.getName());
	}

	//@Pointcut("execution(* * com.aop._1BasicExample._1usingXML.Circle.*(..))")//allCircleMethods
	@Pointcut("within(com.aop._1BasicExample._1usingXML.Circle)")//allCircleMethods, More readable,
	public void allCircleMethods(){}
	
	@Before("args(String)")
	public void stringArgumentMethods(){
		System.out.println("Inside stringArgumentMethods");
	}

	//@After("args(name)")//Execute after actual method cALLED   
	@AfterReturning("args(name)")  
	//@AfterThrowing("args(name)")  
	public void stringArgumentMethods2(String name){
		System.out.println("Inside stringArgumentMethods2 & THE VALUE IS: "+name);
	}
}
