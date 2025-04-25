package com.nt.log;

import org.aspectj.lang.ProceedingJoinPoint;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

	 @Before("execution(* com.nt.service.*.*(..))")
	  public void logBefore() {
		  System.out.println("Executing before method...");
	  }
	 
	 @After("execution(* com.nt.service.*.*(..))")
	 public void logAfter() {
		 System.out.println("Executing after method...");
	 }

	 
	    @Around("execution(* com.example.service.*.*(..))")
	    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
	        System.out.println("Before method: " + joinPoint.getSignature().getName());
	        Object result = joinPoint.proceed();
	        System.out.println("After method: " + joinPoint.getSignature().getName());
	        return result;
	       
	    }
}
