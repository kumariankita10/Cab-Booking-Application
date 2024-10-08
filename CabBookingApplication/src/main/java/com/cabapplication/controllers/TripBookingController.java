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

import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.service.impl.TripBookingServiceImpl;
@CrossOrigin("*")
@RestController
public class TripBookingController {

	@Autowired
	public TripBookingServiceImpl tripBookingServiceImpl;
	
	@PostMapping("/insertTripBooking")
	public TripBooking insertTripBooking(@RequestBody TripBooking tripBooking) {
		return tripBookingServiceImpl.insertTripBooking(tripBooking);
	}
	
	@PutMapping("/updateTripBooking")
	public TripBooking updateTripBooking(@RequestBody TripBooking tripBooking) {
		return tripBookingServiceImpl.updateTripBooking(tripBooking);
	}

	@DeleteMapping("/deleteTripBooking/{tripBookingId}")
	public void deleteTripBooking(@PathVariable int tripBookingId) {
		tripBookingServiceImpl.deleteTripBooking(tripBookingId);
	}

	@GetMapping("/viewAllTripsCustomer/")
	public List<TripBooking> viewAllTripsCustomer() {
		return tripBookingServiceImpl.viewAllTripsCustomer();
	}
	@GetMapping("/viewTripsById/{tripId}")
	public Optional<TripBooking> viewTripsById(@PathVariable int tripId) {
		// TODO Auto-generated method stub
		return tripBookingServiceImpl.viewTripsById(tripId);
	}
	
	@GetMapping("/calculateBill/{customerId}")
	public Float calculateBill(@PathVariable int customerId) {
		return tripBookingServiceImpl.calculateBill(customerId);
	}
	
}



