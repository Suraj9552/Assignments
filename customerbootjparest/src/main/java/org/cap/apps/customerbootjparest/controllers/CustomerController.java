package org.cap.apps.customerbootjparest.controllers;

import org.cap.apps.customerbootjparest.dto.CreateCustomerRequest;
import org.cap.apps.customerbootjparest.dto.CustomerDetails;
import org.cap.apps.customerbootjparest.dto.UpdateCustomerDetails;
import org.cap.apps.customerbootjparest.entities.Customer;
import org.cap.apps.customerbootjparest.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	
	public CustomerDetails add(@RequestBody CreateCustomerRequest requestData) {
		Customer customer = new Customer(requestData.getName());
		customer = service.register(customer);
		CustomerDetails details=toDetails(customer);
		return details;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PutMapping("/update")
	public CustomerDetails update(@RequestBody UpdateCustomerDetails requestData) {
		String name=requestData.getName();
		long id=requestData.getId();
		Customer customer = service.updateName(id, name);
		CustomerDetails details=toDetails(customer);
		return details;
	}
	
	public CustomerDetails toDetails(Customer customer) {
		CustomerDetails details=new CustomerDetails(customer.getId(), customer.getName());
		return details;
	}

}
