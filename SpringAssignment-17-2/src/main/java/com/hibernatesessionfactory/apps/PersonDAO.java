package com.hibernatesessionfactory.apps;

import java.util.List;

public interface PersonDAO {

	public void save(Person person);
	
	public List<Person> list();
	
}
