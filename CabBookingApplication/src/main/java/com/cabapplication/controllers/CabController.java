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

import com.cabapplication.domain.Cab;
import com.cabapplication.domain.Driver;
import com.cabapplication.service.impl.CabServiceImpl;

@CrossOrigin("*")
@RestController
public class CabController {
	
	@Autowired
	public CabServiceImpl cabServiceImpl;
	
	@PostMapping("/insertCab")
	public Cab insertCab(@RequestBody Cab cab) {
		
		return cabServiceImpl.insertCab(cab);
	}
	
	
	@PutMapping("/updateCab")
	public Cab updateCab(@RequestBody Cab cab) {
		
		return cabServiceImpl.updateCab(cab);
	}
	
	@DeleteMapping("/deleteCab/{cabId}")
	public void deleteCab(@PathVariable int cabId) {
		
		cabServiceImpl.deleteCab(cabId);
	}
	
	
	@GetMapping("/viewCabsOfType/{carType}")
	public List<Cab> viewCabsOfType(@PathVariable String carType) {
		
		return cabServiceImpl.viewCabsOfType(carType);
	}
	
	@GetMapping("/countCabsOfType/{carType}")
	public int countCabsOfType(@PathVariable String carType) {
		
		return cabServiceImpl.countCabsOfType(carType);
	}
	
	@GetMapping("/viewall")
	public List<Cab> viewall() {
		
		return cabServiceImpl.viewall();
	}
	
	@GetMapping("/viewCab/{cabId}")
	public Optional<Cab> viewCab(@PathVariable int cabId) {
		
		return cabServiceImpl.viewCab(cabId);
	}
	
}