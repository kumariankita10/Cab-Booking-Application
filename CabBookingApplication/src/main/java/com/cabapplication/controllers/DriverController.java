package com.cabapplication.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cabapplication.domain.Driver;
import com.cabapplication.service.impl.DriverServiceImpl;

@CrossOrigin("*")
@RestController
public class DriverController {
	
	@Autowired
	DriverServiceImpl driverServiceImpl;
	
	@PostMapping("/insertDriver")
	public Driver insertDriver(@RequestBody Driver driver) {
		
		return driverServiceImpl.insertDriver(driver);
	}

	
	@PutMapping("/updateDriver")
	public Driver updateDriver(@RequestBody Driver driver) {
		
		return driverServiceImpl.updateDriver(driver);
	}
	
	@DeleteMapping("/deleteDriver/{driverId}")
	public void deleteDriver(@PathVariable int driverId) {
		
		driverServiceImpl.deleteDriver(driverId);
	}
	
	@GetMapping("/viewBestDriver")
	public List<Driver> viewBestDriver() {
		
		return driverServiceImpl.viewBestDriver();
	}
	
	@GetMapping("/viewDriver/{driverId}")
	public Optional<Driver> viewDriver(@PathVariable int driverId) {
		
		return driverServiceImpl.viewDriver(driverId);
	}
	
	@GetMapping("/showAllDriver")
	public List<Driver> showAllDriver() {
		
		return driverServiceImpl.showAllDriver();
	}

}