package com.bill;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		String cart1[] = { "P001", "P002", "P003" };
		String cart2[] = { "P0010", "P0020" };


		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		BillingImpl biller = ac.getBean("biller", BillingImpl.class);

		double total = biller.checkOut(cart1);
		System.out.println("Cart 1 Total: " + total);

		total = biller.checkOut(cart2);
		System.out.println("Cart 2 Total: " + total);

	}

}
