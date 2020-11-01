package org.cap.apps.customerbootjparest.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.apps.customerbootjparest.entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

//	private static final Logger Log=LoggerFactory.getLogger(CustomerRepositoryImpl.class);
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		entityManager.merge(customer);
		return customer;
	}

}
