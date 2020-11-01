package org.cap.apps.customer.service;

import org.cap.apps.customer.entities.Customer;
import org.cap.apps.customer.repository.CustomerRepository;
import org.cap.apps.customer.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerRepository repository; 
	
	@Override
	public Customer register(Customer customer) {
		ValidationUtil.checkArgumentNotNull(customer);
		ValidationUtil.checkName(customer.getName());
		
		customer=repository.add(customer);
		return customer;
	}

	@Override
	public Customer updateName(long id, String name) {
		
		Customer customer=new Customer();
		customer.setId(id);
		customer.setName(name);
		customer=repository.update(customer);
		return customer;
	}

}
