package com.bilgeadam.hibernateexamples.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.hibernateexamples.entity.Address;
import com.bilgeadam.hibernateexamples.entity.Person;

public class HibernateSession {
private static final SessionFactory sessionfactory = sessionFactory();
	
	private static SessionFactory sessionFactory() {
		
		SessionFactory factory = null;
		try {
			Configuration configuration = new Configuration();
			
			//entity classlar eklenecek
			configuration.addAnnotatedClass(Person.class);
			configuration.addAnnotatedClass(Address.class);
			
			
			factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			System.out.println("Connection to PostgreSQL via Hibernate is established ");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return factory;	
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionfactory;
	}
	

}
