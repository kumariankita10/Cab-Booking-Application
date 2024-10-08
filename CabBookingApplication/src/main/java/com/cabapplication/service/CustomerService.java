package com.cabapplication.service;

import java.util.List;
import java.util.Optional;

import com.cabapplication.domain.Customer;


public interface CustomerService {
	
	public Customer insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int customerId);
	public List<Customer> viewCustomer();
	public Optional<Customer> viewCustomer(int customerId);
	public Customer validateCustomer(String username,String password);	

}
