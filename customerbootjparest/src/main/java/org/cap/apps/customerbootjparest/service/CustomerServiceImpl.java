package org.cap.apps.customerbootjparest.service;

import javax.transaction.Transactional;

import org.cap.apps.customerbootjparest.entities.Customer;
import org.cap.apps.customerbootjparest.repository.CustomerRepository;
import org.cap.apps.customerbootjparest.util.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{
//	private static final Logger Log = LoggerFactory.getLogger(CustomerServiceImpl.class);
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
		ValidationUtil.checkName(customer.getName());
		customer=repository.update(customer);
		return customer;
	}

}
