package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.manytomany.Course;
import com.manytomany.Student;
import com.onetomany.Department;
import com.onetomany.Employee;

public class ManyToMany_Save {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Transaction tx = ses.beginTransaction();

		Course c1 = new Course(10, "Java", 1500);
		Course c2 = new Course(11, "Hibernate", 18000);
		Course c3 = new Course(12, "Spring", 3000);

		Student s1 = new Student(100, "S1");
		Student s2 = new Student(101, "S2");
		Student s3 = new Student(102, "S3");
		Student s4 = new Student(103, "S4");
		Student s5 = new Student(104, "S5");
		Student s6 = new Student(105, "S6");
		Student s7 = new Student(106, "S7");
		Student s8 = new Student(107, "S8");

		List<Student> batch1 = new ArrayList<>();
		batch1.add(s1);
		batch1.add(s2);
		batch1.add(s3);
		batch1.add(s4);
		batch1.add(s5);
		batch1.add(s6);
		batch1.add(s7);
		batch1.add(s8);
		
		List<Student> batch2 = new ArrayList<>();
		batch2.add(s1);
		batch2.add(s8);
		batch2.add(s2);
		batch2.add(s7);
		
		List<Student> batch3 = new ArrayList<>();
		batch3.add(s1);
		batch3.add(s3);
		batch3.add(s6);
		batch3.add(s5);
		
		c1.setStudents(batch1);
		c2.setStudents(batch2);
		c3.setStudents(batch3);
		
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		

		tx.commit();

		System.out.println("-- Done --");

		sf.close();

	}

}
