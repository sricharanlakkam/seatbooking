package com.seatbooking.seatbooking.dao;

import java.util.List;

import com.seatbooking.seatbooking.entity.Location;

public interface LocationDAO {

	static boolean addLocation(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	static List<Location> getAllLocationDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	List<Location> findAll();

	void save(Location location);

	Object findByOfficeLocation(String officeLocation);

	void deleteLocation(Location location);

	Object findByOfficeLocation();
	
}