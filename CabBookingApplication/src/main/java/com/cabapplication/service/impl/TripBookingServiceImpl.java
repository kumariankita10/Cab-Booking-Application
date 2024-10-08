package com.cabapplication.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cabapplication.domain.Driver;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.repository.TripBookingRepository;
import com.cabapplication.service.TripBookingService;

@Service
public class TripBookingServiceImpl implements TripBookingService {
	
	@Autowired
	TripBookingRepository tripBookingRepo;

	@Override
	public TripBooking insertTripBooking(TripBooking tripBooking) {
		
		return tripBookingRepo.save(tripBooking);
	}

	@Override
	public TripBooking updateTripBooking(TripBooking tripBooking) {
		
		return tripBookingRepo.save(tripBooking);
	}

	@Override
	public void deleteTripBooking(int tripBookingId) {
	
		tripBookingRepo.deleteById(tripBookingId);
	}

	@Override
	public List<TripBooking> viewAllTripsCustomer() {
		
		return tripBookingRepo.findAll();	}


	@Override
	public float calculateBill(int customerId) {
		
		return tripBookingRepo.calculateBill(customerId);
	}
     @Override
	public Optional<TripBooking> viewTripsById(int tripId) {
		// TODO Auto-generated method stub
		return tripBookingRepo.findById(tripId);
	}

	

}