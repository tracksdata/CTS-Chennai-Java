package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TrackEmployee {
	
	public TrackEmployee() {
		System.out.println("-- TackEmployee Object creted");
	}

	@Before("execution(void set*(*))")
	public void f1(JoinPoint jp) {
		System.out.println("Property Changed on "+jp.getSignature()+" Successfully");

	}
	
	@After("execution(void set*(*))")
	public void f2(JoinPoint jp) {
		System.out.println("Property about to Change on "+jp.getSignature());

	}

}
