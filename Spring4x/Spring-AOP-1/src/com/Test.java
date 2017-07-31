package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cust.CustomerService;
import com.emp.Employee;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp = ac.getBean("emp", Employee.class);
		emp.setEmpId(1024);
		emp.setEmpName("Praveen");
		emp.setSalary(3949734);

		CustomerService cs = ac.getBean("cust", CustomerService.class);
		cs.setCustomer(emp);

		ac.registerShutdownHook();
		System.out.println("--- DOne ---");
	}

}
