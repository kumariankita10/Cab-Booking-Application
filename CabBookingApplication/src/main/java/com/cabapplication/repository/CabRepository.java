package com.cabapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabapplication.domain.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Integer> {

	

	
	
	public List<Cab> findByCarType(String carType); 
	public int countByCarType(String carType);
	 
}
