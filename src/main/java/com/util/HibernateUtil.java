package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.cfgxml.spi.CfgXmlAccessService;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HibernateUtil {

	private static SessionFactory sessionFactory=null;
	
	public static SessionFactory getSessionFactory () {
		
		if(sessionFactory == null) {
			 Configuration configuration=new Configuration();

		      configuration.configure("hibernate.cfg.xml");

		      configuration.addAnnotatedClass(Employee.class);
		      
		      configuration.buildSessionFactory();
		      
		      return sessionFactory;
		}
		
			return sessionFactory;
			

      

}
}