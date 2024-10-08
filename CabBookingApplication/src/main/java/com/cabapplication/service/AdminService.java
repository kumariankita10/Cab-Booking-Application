package com.cabapplication.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cabapplication.domain.Admin;
import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.exceptions.WrongPassword;
import com.cabapplication.exceptions.WrongUsernameAndPassword;

public interface AdminService {
	public Admin insertAdmin(Admin admin);
	public Admin updateAdmin(Admin admin);
	public List<Admin> viewAdmin();
	public Optional<Admin> viewAdmin(int adminId);
	public void deleteAdmin(int adminId);
	public Admin loginAdmin(Admin admin) throws WrongPassword, WrongUsernameAndPassword;
	public List<TripBooking> getAllTrips(int customerId);
	public List<TripBooking> getTripsCabwise();
	public List<TripBooking> getTripsCustomerwise();
	public List<TripBooking> getTripsDatewise();
	public List<TripBooking> getAllTripsForDays(int customerId,LocalDateTime fromDate,LocalDateTime toDate);
}