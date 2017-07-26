package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Course c1 = (Course) ses.get(Course.class, 10);
		System.out.println("Cours Name: " + c1.getCourseName());

		ses.close();
		
		ses = sf.openSession();

		Course c2 = (Course) ses.get(Course.class, 10);
		System.out.println("Cours Name: " + c2.getCourseName());

		
		
		
		sf.close();

		System.out.println("---- Done ----");

	}

}
