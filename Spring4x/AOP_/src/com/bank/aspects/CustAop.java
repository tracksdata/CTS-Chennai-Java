package com.bank.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustAop {

	public CustAop() {
		System.out.println("-- CustAop Created");
	}

	@Before("execution(void com.service.CustomeerService.testMethod())")
	public void f1() {
		System.out.println("--- working");
	}

}
