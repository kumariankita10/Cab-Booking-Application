package com.cabapplication.domain;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin extends AbstractUser {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;

	public Admin() {
		super();
		
	}

	public Admin(String username, String password, String address, String mobileNumber, String email) {
		super(username, password, address, mobileNumber, email);
		
	}

	public Admin(Integer adminId) {
		super();
		this.adminId = adminId;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(adminId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return Objects.equals(adminId, other.adminId);
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]";
	}

	
	
}