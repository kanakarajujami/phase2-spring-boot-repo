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
public class LogAspect {

	private Logger logger=Logger.getLogger(LogAspect.class.getName());
	@Around("execution(* com.nt.service.Car.start(..))")
	public void logAroundStart(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info(joinPoint.getSignature().toString() + " method execution start");
		Instant start=Instant.now();
		joinPoint.proceed();
		Instant finish=Instant.now();
		long timeElapsed=Duration.between(start, finish).toMillis();
		logger.info("Time took to execute the  "+joinPoint.getSignature().toString() +"  method: "+timeElapsed+" ms");
		logger.info(joinPoint.getSignature().toString() + " method execution end");
		
	}
	
	@Around("execution(* com.nt.service.MusicPlayer.playMusic(..))")
	public void logAroundPlayMusic(ProceedingJoinPoint joinPoint) throws Throwable{
		
		logger.info(joinPoint.getSignature().toString()+" method execution start");
		Instant start=Instant.now();
	    joinPoint.proceed();
	    Instant finish=Instant.now();
	    long timeElapsed=Duration.between(start, finish).toMillis();
	    logger.info("Time took to execute the " +joinPoint.getSignature().toString()+" method: "+timeElapsed+" ms");
	    logger.info(joinPoint.getSignature().toString()+" method execution end");
	}
}
