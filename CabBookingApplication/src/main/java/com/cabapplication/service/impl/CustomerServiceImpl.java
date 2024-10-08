package com.cabapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.repository.CustomerRepository;
import com.cabapplication.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public Customer insertCustomer(Customer customer) {
	
		return customerRepo.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		return customerRepo.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		
		customerRepo.deleteById(customerId);
	}

	@Override
	public List<Customer> viewCustomer() {
	
		return customerRepo.findAll();
		}

	@Override
	public Optional<Customer> viewCustomer(int customerId) {
	
		return customerRepo.findById(customerId);
	}

	@Override
	public Customer validateCustomer(String username, String password) {

		return customerRepo.validateCustomer(username, password);
	}

}
