package com.cabapplication.controllers;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabapplication.domain.AbstractUser;
import com.cabapplication.domain.Customer;
import com.cabapplication.service.impl.CustomerServiceImpl;

@CrossOrigin("*")
@RestController
public class CustomerController {
	
	@Autowired
	public CustomerServiceImpl customerServiceImpl;
	
	@PostMapping("/insertCustomer")
	public Customer insertCustomer(@RequestBody Customer customer) {
		return customerServiceImpl.insertCustomer(customer);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerServiceImpl.updateCustomer(customer);
	}
	
	@GetMapping("/viewCustomer")
	public List<Customer> viewCustomer() {
		return customerServiceImpl.viewCustomer();
	}
	
	@DeleteMapping("/deleteCustomer/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int customerId) {
		customerServiceImpl.deleteCustomer(customerId);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);

	}

	
	@GetMapping("/viewCustomer/{customerId}")
	public Optional<Customer> viewCustomer(@PathVariable int customerId) {
		// TODO Auto-generated method stub
		return customerServiceImpl.viewCustomer(customerId);
	}

	@GetMapping("/validateCustomer/{username}/{password}")
	public Customer validateCustomer(@PathVariable String username, @PathVariable String password) {
		// TODO Auto-generated method stub
		return customerServiceImpl.validateCustomer(username, password);
	}
}

