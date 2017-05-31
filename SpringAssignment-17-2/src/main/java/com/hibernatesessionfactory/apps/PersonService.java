package com.hibernatesessionfactory.apps;

import java.util.List;

public interface PersonService {

	public void addPerson(Person person);
	
	public List<Person> fetchAllPersons();
	
}
