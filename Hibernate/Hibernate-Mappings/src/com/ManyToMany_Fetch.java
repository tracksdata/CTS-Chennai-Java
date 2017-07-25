package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.manytomany.Course;
import com.manytomany.Student;

public class ManyToMany_Fetch {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Course course = (Course) ses.get(Course.class, 11);

		System.out.println("Coursre Id: " + course.getCourseId());
		System.out.println("Course Name: " + course.getCourseName());
		System.out.println("Price: " + course.getPrice());

		for (Student stu : course.getStudents()) {

			System.out.println("Student Id: " + stu.getStudentId());
			System.out.println("Name: " + stu.getStudentName());
			System.out.println("-----------------------------------");

		}

		sf.close();

	}

}
