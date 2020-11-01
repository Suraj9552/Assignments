package org.cap.apps.customerbootjparest.service;

import org.cap.apps.customerbootjparest.entities.Customer;

public interface ICustomerService {
	
	Customer register(Customer customer);
	
	Customer updateName(long id,String name);
	
}
