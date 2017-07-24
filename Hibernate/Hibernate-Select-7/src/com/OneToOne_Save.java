package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.onetoone.Department;
import com.onetoone.Employee;

public class OneToOne_Save {
	

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");
	
	

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();
		
		Transaction tx=ses.beginTransaction();

	
		Department dept=new Department();
		Employee emp=new Employee();
		Employee emp1=new Employee();
		
		dept.setDeptId(10);
		dept.setDeptName("HR");
		dept.setLoc("Chennai");
		
		emp.setEmpId(100);
		emp.setEmpName("James");
		emp.setSalary(3846346);
		emp.setDept(dept);
		
		emp1.setEmpId(1001);
		emp1.setEmpName("Praveen");
		emp1.setSalary(638568);
		emp1.setDept(dept);
		
		ses.save(emp);
		ses.save(emp1);
		
		
		tx.commit();
		sf.close();
		System.out.println("-- Done --");
		
		
	}

}
