package com.tutorial.spring.aop;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MySampleAspect2 {

	
	@Before("execution( * get*())")
	public void sampleAdvice2()
	{
		System.out.println("Inside sampleAdvice2() of MySampleAspect2");
	}
	
	@Before("execution( * get*())")
	public void sampleAdvice3()
	{
		System.out.println("Inside sampleAdvice3() of MySampleAspect2");
	}
	
	//@Before("allGetters() && allGetters2()")
	@Before("allGetters()")
	public void sampleAdvice4()
	{
		System.out.println("Inside sampleAdvice4() of MySampleAspect2");
	}
	
	@Before("allGetters()")
	//@Before("args(String)")
	public void sampleAdvice5()
	{
		System.out.println("Inside sampleAdvice5() of MySampleAspect2");
	}
	
	@Pointcut("execution( * get*())")
	//@Pointcut("execution(* * com.aop._1BasicExample._1usingXML.Circle.*(..))") //allCircleMethods
	//@Pointcut("within(com.aop._1BasicExample._1usingXML.Circle") //allCircleMethods
	//@Pointcut("within(com.aop._1BasicExample._1usingXML.*") //
	//@Pointcut("within(com.aop._1BasicExample._1usingXML..*") //in subpackage also
	//@Pointcut("args(String)")  // proxy objects, target??????????
	public void allGetters(){}
}
