package org.cap.apps.customer.repository;

import org.cap.apps.customer.entities.Customer;

public interface CustomerRepository {
	
	Customer add(Customer customer);
	
	Customer update(Customer customer);

}
