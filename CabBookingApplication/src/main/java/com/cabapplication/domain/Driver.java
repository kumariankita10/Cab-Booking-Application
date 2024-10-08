package com.cabapplication.domain;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Driver extends AbstractUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int driverId;
   private String licenceNo;
   private float rating;
   @OneToOne(cascade = CascadeType.ALL)
   public Cab cab;
   
public Driver() {
	super();

}

public Driver(int driverId, String licenceNo, float rating, Cab cab) {
	super();
	this.driverId = driverId;
	this.licenceNo = licenceNo;
	this.rating = rating;
	this.cab = cab;
}

public int getDriverId() {
	return driverId;
}

public void setDriverId(int driverId) {
	this.driverId = driverId;
}

public String getLicenceNo() {
	return licenceNo;
}

public void setLicenceNo(String licenceNo) {
	this.licenceNo = licenceNo;
}

public float getRating() {
	return rating;
}

public void setRating(float rating) {
	this.rating = rating;
}

public Cab getCab() {
	return cab;
}

public void setCab(Cab cab) {
	this.cab = cab;
}

@Override
public int hashCode() {
	return Objects.hash(cab, driverId, licenceNo, rating);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Driver other = (Driver) obj;
	return Objects.equals(cab, other.cab) && driverId == other.driverId && Objects.equals(licenceNo, other.licenceNo)
			&& Float.floatToIntBits(rating) == Float.floatToIntBits(other.rating);
}

@Override
public String toString() {
	return "Driver [driverId=" + driverId + ", licenceNo=" + licenceNo + ", rating=" + rating + ", cab=" + cab + "]";
}
   
   

}
