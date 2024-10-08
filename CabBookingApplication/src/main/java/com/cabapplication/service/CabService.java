package com.cabapplication.service;

import java.util.List;
import java.util.Optional;

import com.cabapplication.domain.Cab;
import com.cabapplication.domain.Driver;

public interface CabService {
	
	public Cab insertCab(Cab cab);
	public Cab updateCab(Cab cab);
	public void deleteCab(int cabId);
	public List<Cab> viewCabsOfType(String carType);
	public int countCabsOfType(String carType);
	public List<Cab> viewall();
	public Optional<Cab> viewCab(int cabId);
	
}