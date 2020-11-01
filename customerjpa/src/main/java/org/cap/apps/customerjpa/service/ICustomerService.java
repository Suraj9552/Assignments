package org.cap.apps.customerjpa.service;

import org.cap.apps.customerjpa.entities.Customer;

public interface ICustomerService {
	
	Customer register(Customer customer);
	
	Customer updateName(long id,String name);
	
}
