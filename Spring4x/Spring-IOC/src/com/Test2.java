package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
	
		Employee emp2= (Employee) ac.getBean("e1");
		
		//ac.registerShutdownHook();
		
		System.out.println("Test 2 Name is : "+emp2.getEmpName());
		
		//Employee emp=new Employee();
		
		
		
		
	}

}
