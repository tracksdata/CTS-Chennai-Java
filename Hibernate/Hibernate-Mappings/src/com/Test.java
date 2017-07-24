package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {
	/*
	 * Fetch ------- --> Single Row --> get/load --> Multi Row --> list/iterate
	 * 
	 * Single Row --------------- 1. get: eager initialization 2. load: lazy
	 * initialization
	 *
	 */

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");
	
	

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Employee emp = (Employee) ses.load(Employee.class, 200);
	
		
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getSalary());
		System.out.println("----------------------------");

		sf.close();

		System.out.println("---- Done ----");

	}

}
