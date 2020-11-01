package org.cap.apps.customer.repository;

import java.util.HashMap;
import java.util.Map;

import org.cap.apps.customer.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{

	private Map<Long, Customer> store=new HashMap<>();
	
	private long generatedId;
	
	long generatedId() {
		   ++generatedId;
		return generatedId;
	}
	
	@Override
	public Customer add(Customer customer) {
		long id=generatedId();
		customer.setId(id);
		store.put(id,customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
	 Customer newCustomer=store.get(customer.getId());
	  newCustomer.setName(customer.getName());
		return newCustomer;
	}

}
