package com.tutorial.spring.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class MySampleAspect4 {
	
	@Before("allCircleMethods()")
	public void sampleAdvice(JoinPoint joinPoint){
		System.out.println("Inside sampleAdvice() of MySampleAspect4");
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
		
		//Circle circle=(Circle)joinPoint.getTarget();
	}

	//@Pointcut("execution(* * com.aop._1BasicExample._1usingXML.Circle.*(..))") //allCircleMethods
	@Pointcut("within(com.aop._1BasicExample._1usingXML.Circle)") //allCircleMethods, More readable,
	public void allCircleMethods(){}
	
	@Before("args(String)")
	public void stringArgumentMethods(){
		System.out.println("Inside stringArgumentMethods");
	}

	//We may use for preprocessing of arguments before actual method cALLED
	@Before("args(name)")   
	public void stringArgumentMethods2(String name){
		System.out.println("Inside stringArgumentMethods2 & THE VALUE IS: "+name);
	}
}
