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
	
		Department dept=new Department();
		dept.setDeptId(100);
		dept.setDeptName("HR");
		//ses.update(dept);
		String q1="update Department as d set d.deptName='New Dept' where d.deptId=100";
		
		Query qry=ses.createQuery(q1);
		
		int x=qry.executeUpdate();
		System.out.println(x+" records effected");
		
		ses.beginTransaction().commit();
		
		sf.close();

		System.out.println("---- Done ----");

	}

}
