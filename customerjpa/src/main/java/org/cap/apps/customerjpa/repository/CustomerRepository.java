package org.cap.apps.customerjpa.repository;

import org.cap.apps.customerjpa.entities.Customer;

public interface CustomerRepository {
	
	Customer add(Customer customer);
	
	Customer update(Customer customer);

}
