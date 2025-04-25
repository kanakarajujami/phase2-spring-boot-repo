package com.nt.aspect;

import java.time.Duration;

import java.time.Instant;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	  //  @Before("execution(* com.example.service.UserService.createUser(..))")

	// @Around("execution(* com.example.service.Person.playMusic(..))")
	private Logger logger=Logger.getLogger(LoggingAspect.class.getName());
	  @Around("execution(* com.nt.service.Vehicle.playMusic(..))")
	    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
	        logger.info(joinPoint.getSignature().toString() + " method execution start");
	        
	        Instant start = Instant.now();
	        Object result = joinPoint.proceed();
	        Instant finish = Instant.now();
	        
	        long timeElapsed = Duration.between(start, finish).toMillis();
	        
	        logger.info("Time took to execute the method: " + timeElapsed + " ms");
	        logger.info(joinPoint.getSignature().toString() + " method execution end");
	        
	        return result;
	        
	      
	    }
}
