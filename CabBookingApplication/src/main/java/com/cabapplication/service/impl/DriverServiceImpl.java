package com.cabapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabapplication.domain.Cab;
import com.cabapplication.domain.Driver;
import com.cabapplication.repository.DriverRepository;
import com.cabapplication.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository driverRepo;
	
	@Override
	public Driver insertDriver(Driver driver) {
		
		return driverRepo.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		
		return driverRepo.save(driver);
	}

	@Override
	public void deleteDriver(int driverId) {
		
		driverRepo.deleteById(driverId);
	}

	@Override
	public List<Driver> viewBestDriver() {
		
		return driverRepo.viewBestDriver();
	}

	@Override
	public Optional<Driver> viewDriver(int driverId) {
		
		return driverRepo.findById(driverId);
	}
	@Override
	public List<Driver> showAllDriver() {
		
		return driverRepo.findAll();
	}

}