package com.hibernatesessionfactory.apps;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.jpamodelgen.xml.jaxb.GenerationType;

@Entity
@Table(name="User")
public class Person {
	
	private int id;

	private String name;
	
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String toString(){
		return "Person [ id = " + id + " name = " + name + " email = " + email + " ] ";
	}
	
}
