package org.cap.apps.customerjpa.service;

import javax.transaction.Transactional;

import org.cap.apps.customerjpa.entities.Customer;
import org.cap.apps.customerjpa.repository.CustomerRepository;
import org.cap.apps.customerjpa.util.ValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
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
