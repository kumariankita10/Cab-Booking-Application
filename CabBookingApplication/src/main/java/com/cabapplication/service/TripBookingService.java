package com.cabapplication.service;

import java.util.List;
import java.util.Optional;

import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;

public interface TripBookingService {
	
	public TripBooking insertTripBooking(TripBooking tripBooking);
	public TripBooking updateTripBooking(TripBooking tripBooking);
	public void deleteTripBooking(int tripBookingId);
	public List<TripBooking> viewAllTripsCustomer();
	public Optional<TripBooking> viewTripsById(int tripId);
	public float calculateBill(int customerId);
	
	

}
