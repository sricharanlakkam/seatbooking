package com.seatbooking.seatbooking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int locationId;
	private String officename;
	private String officelocation;
	private String officefloor;

	public Location(String officename, String officelocation, String officefloor,int locationId) {
		super();
		this.officename = officename;
		this.officelocation = officelocation;
		this.officefloor = officefloor;
		this.locationId= locationId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
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
