package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.onetomany.Department;
import com.onetomany.Employee;

public class OneToMany_Save {

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

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		/*List<Employee> emps1 = new ArrayList<>();
		emps1.add(e1);*/
		
	 dept.setEmps(emps);
	//dept1.setEmps(emps1);

	 ses.save(dept);
		//ses.save(dept1);

		tx.commit();
		
		System.out.println("-- Done --");
		
		sf.close();

	}

}
