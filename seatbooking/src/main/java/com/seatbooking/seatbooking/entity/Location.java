package com.seatbooking.seatbooking.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Location {
	@Id
	private String officename;
	private String officelocation;
	private String officefloor;

	public Location(String officename, String officelocation, String officefloor) {
		super();
		this.officename = officename;
		this.officelocation = officelocation;
		this.officefloor = officefloor;
	}

	public String getOfficename() {
		return officename;
	}

	public void setOfficename(String officename) {
		this.officename = officename;
	}

	public String getOfficelocation() {
		return officelocation;
	}

	public void setOfficelocation(String officelocation) {
		this.officelocation = officelocation;
	}

	public String getOfficefloor() {
		return officefloor;
	}

	public void setOfficefloor(String officefloor) {
		this.officefloor = officefloor;
	}
}
