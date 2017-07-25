package com;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HQLLazyTest {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Query qry = ses.createQuery("from Product");

		// Lazy
		Iterator<Product> prods = qry.iterate();

		while (prods.hasNext()) {

			Product prod = prods.next();
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("----------------------");
		}

		sf.close();

		System.out.println("---- Done ----");

	}

}
