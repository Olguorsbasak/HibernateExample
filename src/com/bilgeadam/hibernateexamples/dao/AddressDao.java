package com.bilgeadam.hibernateexamples.dao;

import org.hibernate.Session;

import com.bilgeadam.hibernateexamples.entity.Address;

public class AddressDao implements IRepository<Address> {

	@Override
	public void create(Address address) { //bu metodun içinde ne yazıyorsa 
									      //persist metodunun içine aynısını yazıyoruz
		try {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			System.out.println(session);
			session.persist(address);
			session.getTransaction().commit();
			System.out.println("Address data is added to Database");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("A problem is oocured while adding address data");
		}
		
	}

	@Override
	public void update(Address entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Address entity) {
		// TODO Auto-generated method stub
		
	}

}
