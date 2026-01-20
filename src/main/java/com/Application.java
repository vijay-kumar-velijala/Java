package com;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.util.HibernateUtil;

public class Application {

	public static void main(String[] args) {
		
		
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
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
