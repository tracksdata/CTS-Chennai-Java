package com.bank.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/*
 *  AOP Terminology
 *  ----------------
 *   
 *   --> joinpoint
 *   --> pointcut
 *   --> advice
 *   --> aspect
 *   --> introuction
 *       
 *        --> To introduce new behav to 
 *            target at runtime
 *
 * ---------------------------------------------------
 * 
 * 
 *  Types of AOP Advices
 *  --------------------
 *  
 *   1. Before
 *   2. After
 *   3. AfterReturning
 *   4. AfterThrowing
 *   5. Around
 *   
 *   -------------------------------------------
 *   
 *   How to write effective pointcuts?
 *   
 *     --> Try to re-use same Pointcut Expression.
 *   
 *   
 * 
 * 
 */

// Aspect
@Aspect
//@Order(0)
public class LoggingAspect {
	
/*	public LoggingAspect() {
	System.out.println("-- Object Created");
	}*/

	// ------------------------------------

	// // All Pointcut def
	// @Pointcut(value="execution(* *.*(..))")
	// public void allMethods(){};

	// -------------------------------------

	//@Before("com.bank.aspects.PointcutExpressions.allMethods()")
	// @Before("within(com.service.*)")
	// @Before("@annotation(com.myanotations.Loggable)")
	/*public void logBefore(JoinPoint joinPoint) {
		String methodDet = joinPoint.toLongString();
		System.out.println("LOG: Before  Method :" + methodDet);
	}

	// ------------------------------------------------

	//@AfterReturning(pointcut = "execution(* *.with*(..))", returning = "amount")
	public void afterRetunAdvice(double amount) {
		System.out.println("After Return : Withdraw-" + amount);
	}

	//@AfterThrowing(pointcut = "execution(* *.with*(..))", throwing = "e")
	public void afterRetunThrow(Exception e) {
		System.out.println("After Throwing : Withdraw :" + e.getMessage());
	}

	//@After("com.bank.aspects.PointcutExpressions.allMethods()")
	public void afterAdvice() {
		System.out.println("After Withdraw :");
	}

	// --------------------------------------------------
*/
	@Around("execution(* *.withdraw2(..))")
	public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("--- Test");
		try {
			// Before
			System.out.println("Around Advice: Before");
			String v = "before";
			Object obj=pjp.proceed();
			System.out.println("Object: "+obj);
			// After Returning
			System.out.println("Around Advice: returning");

		} catch (Throwable e) {
			// AFter Throwing
			System.out.println("Around Advice: Throwing");
			throw e;
		}
		// After
		System.out.println("Around Advice: After");

	}

}
