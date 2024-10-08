package com.cabapplication.service;

import java.util.List;
import java.util.Optional;

import com.cabapplication.domain.Driver;

public interface DriverService {
	
	public Driver insertDriver(Driver driver);
	public Driver updateDriver(Driver driver);
	public void deleteDriver(int driverId);
	public List<Driver> viewBestDriver();
	public Optional<Driver> viewDriver(int driverId);
	public List<Driver> showAllDriver();
}