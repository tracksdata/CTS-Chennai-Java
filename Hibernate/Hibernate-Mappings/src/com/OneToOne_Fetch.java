package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.onetoone.Employee;

public class OneToOne_Fetch {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Employee emp = (Employee) ses.get(Employee.class, 1001);

		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Emp Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Dept Id: " + emp.getDept().getDeptId());
		System.out.println("Dept Name: " + emp.getDept().getDeptName());
		System.out.println("Loc: " + emp.getDept().getLoc());

		System.out.println("-- Done --");
		sf.close();

	}

}
