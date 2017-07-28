package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee e = ac.getBean(Employee.class);
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());

		System.out.println(e.getDept().getDeptId());
		System.out.println(e.getDept().getDeptName());

		ac.registerShutdownHook();

	}

}
