package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
	
		Employee emp1= (Employee) ac.getBean("e1");
		//Employee emp2= (Employee) ac.getBean("e1");
	
		
		emp1.setEmpName("Praveen");
		System.out.println("-- Test1 is sleeping");
	
		//Thread.sleep(15000);
		
		System.out.println("Test1: "+emp1.getEmpName());
		ac.registerShutdownHook();
		
		//Employee emp=new Employee();
		
		
		
		
	}

}
