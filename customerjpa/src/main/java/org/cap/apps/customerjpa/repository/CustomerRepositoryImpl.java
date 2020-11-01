package org.cap.apps.customerjpa.repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.cap.apps.customerjpa.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

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
