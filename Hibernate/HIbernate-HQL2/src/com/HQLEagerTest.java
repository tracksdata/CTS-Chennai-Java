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

		Query qry = ses.createQuery("from Employee");

		List<Employee> emps = qry.list();

		for (Employee emp : emps) {
			System.out.println("EID: " + emp.getEmpId());
			System.out.println("ENAME: " + emp.getEmpName());
			System.out.println("Salary: " + emp.getSalary());
			System.out.println("Dept Id: " + emp.getDept().getDeptId());
			System.out.println("Dept Name: " + emp.getDept().getDeptName());
			System.out.println("Dept Loc: " + emp.getDept().getLoc());
			System.out.println();
		}

		System.out.println(emps.size() + " Records processed");

		sf.close();

		System.out.println("---- Done ----");

	}

}
