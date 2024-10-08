package com.cabapplication.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.cabapplication.domain.Admin;
import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.exceptions.WrongPassword;
import com.cabapplication.exceptions.WrongUsernameAndPassword;
import com.cabapplication.service.impl.AdminServiceImpl;
@CrossOrigin("*")
@RestController
public class AdminController {

	@Autowired
	AdminServiceImpl adminServiceImpl;
	
	@PostMapping("/login")
	public ResponseEntity<Admin> adminLogin(@RequestBody Admin admin, HttpSession session)
			throws WrongPassword, WrongUsernameAndPassword {
		Admin admin1 = adminServiceImpl.loginAdmin(admin);
		session.setAttribute("customer", admin1);
		return new ResponseEntity<>(admin1, HttpStatus.OK);
	}
	
	@PostMapping("/insertAdmin")
	public Admin insertAdmin(@RequestBody Admin admin) {
		
		return adminServiceImpl.insertAdmin(admin);
	}
	
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
		
		return adminServiceImpl.updateAdmin(admin);
	}
	
	@GetMapping("/viewAdmin")
	public List<Admin> viewAdmin() {
		
		return adminServiceImpl.viewAdmin();
	}
	
	@GetMapping("/viewAdmin/{adminId}")
	public Optional<Admin> viewAdmin(@PathVariable int adminId) {
		
		return adminServiceImpl.viewAdmin(adminId);
	}
	
	@DeleteMapping("/deleteAdmin/{adminId}")
	public void deleteAdmin(@PathVariable int adminId) {
				
		adminServiceImpl.deleteAdmin(adminId);
	}
	
	
	@GetMapping("/getAllTrips/{customerId}")
	public List<TripBooking> getAllTrips(@PathVariable int customerId) {
		
		return adminServiceImpl.getAllTrips(customerId);
		
	}
	
	

	@GetMapping("/getTripsCabwise")
	public List<TripBooking> getTripsCabwise() {
		
		return adminServiceImpl.getTripsCabwise();
	}
		
	
	@GetMapping("/getTripsCustomerwise")
	public List<TripBooking> getTripsCustomerwise() {
		
		return adminServiceImpl.getTripsCustomerwise();
	}

	@GetMapping("/getTripsDatewise")
	public List<TripBooking> getTripsDatewise() {
		
		return adminServiceImpl.getTripsDatewise();
	}
	
	@GetMapping("/getAllTripsForDays/{customerId}/{fromDate}/{toDate}")
	public List<TripBooking> getAllTripsForDays(@PathVariable int customerId, @PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime fromDate, @PathVariable @DateTimeFormat(pattern =  "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime toDate) {
		
		return adminServiceImpl.getAllTripsForDays(customerId, fromDate, toDate);
	}
}