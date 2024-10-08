package com.cabapplication.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cabapplication.domain.Admin;
import com.cabapplication.domain.TripBooking;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	public Admin findByUsername(String username);
}