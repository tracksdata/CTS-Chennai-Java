package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Employee emp = new Employee();

		emp.setEmpName("James");
		emp.setSalary(34343);
		emp.setDob(new Date());

	

		ses.save(emp);

		ses.beginTransaction().commit();

		sf.close();

		System.out.println("---- Done ----");

	}

}
