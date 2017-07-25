package com;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaAPI_Rest_Test {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();
	
		
		Criteria cr=ses.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary",new Double(20000)));
		//cr.add(Restrictions.eq("empName","Praveen"));
		List<Employee> emps= cr.list();
		
		for(Employee emp:emps) {
			System.out.println(emp.getEmpId());
			System.out.println(emp.getEmpName());
			System.out.println(emp.getSalary());
			System.out.println("-----------------");
			
		}
		
		
		
		sf.close();

		System.out.println("---- Done ----");

	}

}
