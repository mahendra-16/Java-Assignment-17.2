package com.hibernatesessionfactory.apps;

import java.util.List;

public class PersonServiceImpl implements PersonService {

	private PersonDAO personDAO;
	
	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		getPersonDAO().save(person);
	}

	@Override
	public List<Person> fetchAllPersons() {
		// TODO Auto-generated method stub
		return getPersonDAO().list();
	}

}
