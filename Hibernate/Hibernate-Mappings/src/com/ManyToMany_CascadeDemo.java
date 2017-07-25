package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.manytomany.Course;
import com.manytomany.Student;

public class ManyToMany_CascadeDemo {

	public static void main(String[] args) {

		Configuration ac = new Configuration();
		ac.configure("hibernate.cfg.xml");

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
		builder.applySettings(ac.getProperties());

		SessionFactory sf = ac.buildSessionFactory(builder.build());

		Session ses = sf.openSession();

		Course course = (Course) ses.get(Course.class, 10);

		ses.delete(course);
		ses.beginTransaction().commit();
		sf.close();

	}

}
