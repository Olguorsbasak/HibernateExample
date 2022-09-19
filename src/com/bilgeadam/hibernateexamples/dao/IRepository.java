package com.bilgeadam.hibernateexamples.dao;

import org.hibernate.Session;

import com.bilgeadam.hibernateexamples.utils.HibernateSession;

public interface IRepository <T> { ////buradaki t harfi buraya bir sınıfın geleceğini belirtiyor. ne yazdığımız önemli değil
	
	public void create(T entity);
	public void update (T entity);
	public void delete(T entity);
	
	default T find(long id) {
		return null;
	}
	
	default Session databaseConnectionHibernate() {
		return HibernateSession.getSessionFactory().openSession();
	}
}
