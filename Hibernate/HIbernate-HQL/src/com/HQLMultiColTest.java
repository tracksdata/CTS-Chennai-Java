package com;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HQLMultiColTest {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

Query qry=ses.createQuery("select prod.price,prod.prodName from Product as prod");
		
	List<Object[]> rows=qry.list();
		
	
	for(int i=0;i<rows.size();i++) {
		Object[] row=rows.get(i);
		
		  for(Object col:row) {
			  System.out.println(col);
		  }
		
		
	}
		
		
		sf.close();

		System.out.println("---- Done ----");

	}

}
