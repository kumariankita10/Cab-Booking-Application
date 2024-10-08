package com.cabapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cabapplication.domain.Driver;

@Repository
public interface DriverRepository  extends JpaRepository<Driver, Integer>{
	

	
	
	@Query(value = "SELECT driver FROM Driver AS driver where driver.rating >= 4.5")
	public List<Driver> viewBestDriver();


}
