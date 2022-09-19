package com.bilgeadam.hibernateexamples;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.hibernateexamples.dao.AddressDao;
import com.bilgeadam.hibernateexamples.dao.PersonDao;
import com.bilgeadam.hibernateexamples.entity.Address;
import com.bilgeadam.hibernateexamples.entity.Person;

public class Test {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		Address address = new Address();
		address.setStreet("ankara");
		address.setDoorNumber(7);
		address.setPeople(people);
		
		Address address2 = new Address();
		address2.setStreet("yaşamkent");
		address2.setDoorNumber(75);
		address2.setPeople(people);
		
		Person person = new Person();
				
		person.setFirstName("sakız");
		person.setLastName("başak");

		Person person2 = new Person();
		person2.setFirstName("çapaklı");
		person2.setLastName("örs");
		person2.setAddress(address2);
	
		people.add(person);
		
		AddressDao addressDao = new AddressDao();
		PersonDao personDao = new PersonDao();
		
		addressDao.create(address);
		personDao.create(person);
		addressDao.create(address2);
		personDao.create(person2);

	}

}
