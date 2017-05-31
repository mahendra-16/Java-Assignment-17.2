package com.hibernatesessionfactory.apps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonDAOImpl implements PersonDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

/*	public PersonDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
*/
	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(person);
	}


	@Override
	public List<Person> list() {
		// TODO Auto-generated method stub
		List<Person> listUser = (List<Person>) sessionFactory.getCurrentSession()
                .createCriteria(Person.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
 
        return listUser;
	}

}
