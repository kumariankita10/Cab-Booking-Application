package com.cabapplication.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.cabapplication.domain.Admin;
import com.cabapplication.domain.Customer;
import com.cabapplication.domain.TripBooking;
import com.cabapplication.exceptions.WrongPassword;
import com.cabapplication.exceptions.WrongUsernameAndPassword;
import com.cabapplication.repository.AdminRepository;
import com.cabapplication.repository.TripBookingRepository;
import com.cabapplication.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	TripBookingRepository tripBookingRepo;

	@Override
	public Admin insertAdmin(Admin admin) {
		
		return adminRepo.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		
		return adminRepo.save(admin);
	}
	
	@Override
	public List<Admin> viewAdmin() {
		
		return adminRepo.findAll();
	}
	
	@Override
	public Optional<Admin> viewAdmin(int adminId) {
		
		return adminRepo.findById(adminId);
	}


	@Override
	public void deleteAdmin(int adminId) {
			
		adminRepo.deleteById(adminId);
	}
	
	public Admin loginAdmin(Admin admin) throws WrongPassword, WrongUsernameAndPassword {
		Admin adm1 = adminRepo.findByUsername(admin.getUsername());
		if (adm1 != null) {
			if (admin.getPassword().equals(adm1.getPassword())) {
				return adm1;
			} else {
				throw new WrongPassword("Wrong Password");
			}
		} else {
			throw new WrongUsernameAndPassword("Wrong USername or Password");
		}
	}

	@Override
	public List<TripBooking> getAllTrips(int customerId) {
		
		return tripBookingRepo.findByCustomerId(customerId);
	}

	@Override
	public List<TripBooking> getTripsCabwise() {
		
		return tripBookingRepo.findAll(Sort.by("Driver"));
	}

	@Override
	public List<TripBooking> getTripsCustomerwise() {
		
		return tripBookingRepo.findAll(Sort.by("customerId"));
	}

	@Override
	public List<TripBooking> getTripsDatewise() {
		
		return tripBookingRepo.findAll(Sort.by("fromDateTime"));
	}

	@Override
	public List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate) {
		
		return tripBookingRepo.getAllTripsForDays(customerId, fromDate, toDate);
	}
	

}