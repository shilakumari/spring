package com.tutorial.spring.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MySampleAspect3 {

	
	
	@Before("allGetters && allCircleMethods()")
	public void sampleAdvice()
	{
		System.out.println("Inside sampleAdvice() of MySampleAspect3");
	}
	
	
	
	@Pointcut("execution( * get*())")
	public void allGetters(){}
	
	//@Pointcut("execution(* * com.aop._1BasicExample._1usingXML.Circle.*(..))") //allCircleMethods
	@Pointcut("within(com.aop._1BasicExample._1usingXML.Circle)") //allCircleMethods, More readable,
	public void allCircleMethods(){}
	
	@Pointcut("within(com.aop._1BasicExample._1usingXML.*)") 
	public void allMethodsOfPackage(){}
	
	@Pointcut("within(com.aop._1BasicExample._1usingXML..*)") 
	public void allMethodsOfPackageAndSubPackage(){}

}
