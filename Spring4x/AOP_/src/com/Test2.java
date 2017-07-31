package com;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.model.Account;
import com.service.BankSerive;
import com.service.CustomeerService;

public class Test2 {

	public static void main(String[] args) {

		// Instantiate Spring Container:

		try {
			AbstractApplicationContext sc = null;
			sc = new ClassPathXmlApplicationContext("spring.xml");

			CustomeerService cs = sc.getBean("cust", CustomeerService.class);
			cs.testMethod();
			System.out.println("-- DOne ");

		} catch (Exception e) {
			System.err.println("Ex Handled...");
		}

	}

}
