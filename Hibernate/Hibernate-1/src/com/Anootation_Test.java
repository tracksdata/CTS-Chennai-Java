package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Anootation_Test {

	public static void main(String[] args) {

		AnnotationConfiguration ac = new AnnotationConfiguration();
		ac.configure();

		SessionFactory sf = ac.buildSessionFactory();

		Session ses = sf.openSession();

		Account acc = new Account();
		acc.setAccountNo(12233);
		acc.setCustomerName("James");
		acc.setAccountType("Savings");
		acc.setBalance(86485);

		ses.save(acc);

		ses.beginTransaction().commit();

		System.out.println("---- Done ----");

	}

}
