package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = (Employee) ac.getBean("e1");
		// Department dept= (Department) ac.getBean("d1");

		// emp.setDept(dept);// DI

		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());

		/*
		 * for(Department t:emp.getDepts()) { System.out.println(t.getDeptId()); }
		 */
		System.out.println(emp.getDept().getDeptId());

		/*
		 * System.out.println(dept.getDeptId()); System.out.println(dept.getDeptName());
		 */

		ac.registerShutdownHook();

	}

}
