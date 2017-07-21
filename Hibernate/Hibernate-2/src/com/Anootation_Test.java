package com;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Anootation_Test {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Account acc = new Account();
		acc.setAccountNo(1321234);
		acc.setCustomerName("Praveen");
		acc.setAccountType("Savings");
		acc.setBalance(86485);

		Employee emp = new Employee();
		
		
		emp.setEmpId(111);
		emp.setEmpName("James");
		emp.setSalary(34343);
		emp.setInfo("Info about this employee");
		emp.setDob(new Date());
		
		
		/*Employee emp1 = new Employee();
		emp1.setEmpId(112);
		emp1.setEmpName("Praveen");
		emp1.setSalary(34343);*/

		//ses.save(acc);
		ses.save(emp);
		//ses.save(emp1);
		
	/*	ses.evict(emp1);
		ses.clear();
		ses.delete(emp1); // --> DB -  CRUD
*/		

		ses.beginTransaction().commit();

		sf.close();

		System.out.println("---- Done ----");

	}

}
