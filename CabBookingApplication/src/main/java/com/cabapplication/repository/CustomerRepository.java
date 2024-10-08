package com.cabapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cabapplication.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	

	
	
	
	
	@Query(value = "SELECT customer FROM Customer AS customer where customer.username = ?1 AND customer.password = ?2")
	public Customer validateCustomer(String username,String password);

}
