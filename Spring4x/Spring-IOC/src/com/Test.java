package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
	
		Employee emp1= (Employee) ac.getBean("e1");
		Employee emp2= (Employee) ac.getBean("e1");
	
		
		emp1.setEmpName("Praveen");
		emp1.info();
		emp2.info();
		ac.registerShutdownHook();
		
		//Employee emp=new Employee();
		
		
		
		
	}

}
