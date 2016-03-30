package com.test.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {
	
	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@After ("execution(* find*(..))")
	public void writeLogStmt(JoinPoint joinPoint){
		//Aspect B.L
		
		logger.debug("Log @After Aspect .. Invoking Method  " + joinPoint.getSignature().getName());
		
		Object [] arguments =  joinPoint.getArgs();
		for(Object obj :arguments)		{
			logger.debug("Log  Aspect ..   " + obj);
		}
		
		
	}
	
	@Before ("execution(* set*(..))")
	public void trackSetterMethods(JoinPoint joinPoint){
		//Aspect B.L
		
		logger.debug("Log @Before Aspect .. Invoking Method  " + joinPoint.getSignature().getName());
		
		Object [] arguments =  joinPoint.getArgs();
		for(Object obj :arguments)		{
			logger.debug("Log  Aspect ..   " + obj);
		}
		
		
	}

}
