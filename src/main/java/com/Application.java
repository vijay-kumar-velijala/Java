package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class Application {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		configuration.addAnnotatedClass(Employee.class);
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Employee emp = new Employee(10,"vijaykumarvelijala07@gmail.com",60000);
		
		
		session.beginTransaction();
		
		//Save-Insert
		//insert into employees values (10,"vijaykumarvelijala07@gmail.com",60000)
		session.persist(emp);
		
		session.getTransaction().commit();
		
		System.out.println("Inserted");
		
	}

}
