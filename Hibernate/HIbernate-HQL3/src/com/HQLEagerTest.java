package com;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HQLEagerTest {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();
	
		
		//Query qry = ses.createQuery("");
	
		Query qry=ses.getNamedQuery("q1");
		
		List<Object[]> emps = qry.list();
		System.out.println(emps);
		
		for(int i=0;i<emps.size();i++) {
			Object[] rows=emps.get(i);
			for(Object col:rows) {
				System.out.println(col);
			}
			System.out.println("-----------------------");
			
		}
		
		

		System.out.println(emps.size() + " Records processed");

		sf.close();

		System.out.println("---- Done ----");

	}

}
