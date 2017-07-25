package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.manytoone.Department;
import com.manytoone.Employee;

public class ManyToOne_Save {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Transaction tx = ses.beginTransaction();

		Employee e1 = new Employee(1, "Praveen", 10000);
		Employee e2 = new Employee(2, "James", 20000);
		Employee e3 = new Employee(3, "Ruth", 150000);
		Employee e4 = new Employee(4, "Rose", 210000);
		Employee e5 = new Employee(5, "Stella", 106000);

		Department dept = new Department();
		dept.setDeptId(100);
		dept.setDeptName("HR");
		dept.setLoc("CHN");

		Department dept1 = new Department();
		dept1.setDeptId(101);
		dept1.setDeptName("Accounts");
		dept1.setLoc("HYD");

		// Map a dept to emps

		e1.setDept(dept);
		e2.setDept(dept);
		e3.setDept(dept);
		e5.setDept(dept1);
		e4.setDept(dept1);

		ses.save(e1);
		ses.save(e2);
		ses.save(e3);
		ses.save(e4);
		ses.save(e5);

		tx.commit();

		System.out.println("-- Done --");

		sf.close();

	}

}
