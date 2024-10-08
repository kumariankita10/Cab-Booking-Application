package com.cabapplication.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractUser {

	@Column(unique = true)
	@NotNull(message = "username cannot be null")
	@Size(min = 3,max = 10,message = "length of username must be between 3 & 10")

	private String username;
	
	@NotNull(message = "password cannot be null")
//	@JsonIgnore()
	@JsonProperty(access = Access.WRITE_ONLY)
	@Size(min = 5,max = 8,message = "password length should be between 5 & 8.")

	private String password;
	private String address;

	@NotNull(message = "mobile number cannot be null")
	@Pattern(regexp = "[789]{1}[0-9]{9}",message = "invalid mobile number")

	private String mobileNumber;
	private String email;
	public AbstractUser() {
		super();
	
	}
	public AbstractUser(String username, String password, String address, String mobileNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	@Override
	public String toString() {
		return "AbstractUser [username=" + username + ", password=" + password + ", address=" + address
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, email, mobileNumber, password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractUser other = (AbstractUser) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(password, other.password)
				&& Objects.equals(username, other.username);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}