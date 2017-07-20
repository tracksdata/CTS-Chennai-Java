package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		SessionFactory sf = ac.buildSessionFactory();

		Session ses = sf.openSession();

		Employee emp = new Employee();
		
		emp.setEmpId(1026);
		emp.setEmpName("Praveen");
		emp.setSalary(876666);

		ses.save(emp);

		ses.beginTransaction().commit();

		System.out.println("---- Done ----");

	}

}
