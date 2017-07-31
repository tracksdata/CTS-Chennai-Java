package com.bank.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointcutExpressions {

	// All Pointcut def
	@Pointcut(value = "execution(* *.*(..))")
	public void allMethods() {
	};
	
	

}
