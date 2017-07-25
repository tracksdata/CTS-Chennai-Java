package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.onetomany.Department;
import com.onetomany.Employee;

public class OneToMany_Fetch {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Department dept=(Department) ses.get(Department.class, 200);
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Dept Namae: "+dept.getDeptName());
		System.out.println("Loc: "+dept.getLoc());
		
		for(Employee emp:dept.getEmps()) {
			
			System.out.println("Emp Id: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("----------------------------------");
			
		}

		
		
		
		
		sf.close();

	}

}
