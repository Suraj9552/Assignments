package org.cap.apps.customerjpa.ui;

import org.cap.apps.customerjpa.entities.Customer;
import org.cap.apps.customerjpa.exceptions.InvalidArgumentException;
import org.cap.apps.customerjpa.exceptions.InvalidCustomerNameException;
import org.cap.apps.customerjpa.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectUi {
	
	@Autowired
	private ICustomerService service;
	
	public void runUi() {
		try {
		Customer customer1=add("John");
		Customer customer2=add("Thomas");
		Customer customer3=add("Lucy");
		Customer updateCustomer=updateName(3,"Eric");
	
	}catch(InvalidArgumentException e) {
		System.out.println(e.getMessage());
	}catch(InvalidCustomerNameException e) {
		System.out.println(e.getMessage());
	}catch(Exception e) {
		System.out.println("Something Went Wrong");
	}
	}
	public Customer add(String name) {
		Customer customer = new Customer(name);
		customer=service.register(customer);
		System.out.println("Customer added: "+customer.getId()+ " "+customer.getName());
		return customer;
	}
	
	public Customer updateName(long id,String name) {
		Customer customer = service.updateName(id, name);
		System.out.println("Customer Updated Details: "+customer.getId()+" "+customer.getName());
	return customer;
	}

}
