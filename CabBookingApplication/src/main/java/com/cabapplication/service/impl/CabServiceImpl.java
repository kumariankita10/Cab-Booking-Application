package com.cabapplication.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabapplication.domain.Cab;
import com.cabapplication.domain.Driver;
import com.cabapplication.repository.CabRepository;
import com.cabapplication.service.CabService;

@Service
public class CabServiceImpl implements CabService {

	@Autowired
	CabRepository cabRepo;

	@Override
	public Cab insertCab(Cab cab) {
		
		return cabRepo.save(cab);
	}

	@Override
	public Cab updateCab(Cab cab) {
		
		return cabRepo.save(cab);
	}

	@Override
	public void deleteCab(int cabId) {
		
		cabRepo.deleteById(cabId);
	}

	@Override
	public List<Cab> viewCabsOfType(String carType) {
		
		return cabRepo.findByCarType(carType);
	}

	@Override
	public List<Cab> viewall() {
		
		return cabRepo.findAll();
	}

	@Override
	public int countCabsOfType(String carType) {
		
		 return cabRepo.countByCarType(carType); 
	}
	@Override
	public Optional<Cab> viewCab(int cabId) {
		
		return cabRepo.findById(cabId);
	}

}