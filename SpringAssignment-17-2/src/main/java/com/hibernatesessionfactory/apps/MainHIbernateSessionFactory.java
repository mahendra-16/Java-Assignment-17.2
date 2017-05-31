package com.hibernatesessionfactory.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class MainHIbernateSessionFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************************************************************BEGINNING PROGRAM*************************************************************************************");
		ApplicationContext coin = new ClassPathXmlApplicationContext("spring.xml");
		PersonService personService = (PersonService) coin.getBean("personService");
		
		Person person = new Person();
		person.setId(1);
		person.setName("Ashok");
		person.setEmail("ashok@yahoo.com");
		System.out.println("Person  : " + person + " added Successfully");
		
		System.out.println("The list of all Person : " + person);
		
		System.out.println("***********************************************************************THE END********************************************************************************************");
	}

}
