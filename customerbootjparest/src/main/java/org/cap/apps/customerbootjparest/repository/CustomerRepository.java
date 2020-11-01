package org.cap.apps.customerbootjparest.repository;

import org.cap.apps.customerbootjparest.entities.Customer;

public interface CustomerRepository {
	
	Customer add(Customer customer);
	
	Customer update(Customer customer);

}
