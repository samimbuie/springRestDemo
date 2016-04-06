package com.spring.rest.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class UserAspect {

	@Around("execution(* com.spring.rest.demo.controller.UserRestController.*.* (..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("in---");
		joinPoint.proceed();
		System.out.println("out--");
	}
	
	

}
