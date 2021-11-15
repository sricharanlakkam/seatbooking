package com.seatbooking.seatbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seatbooking.seatbooking.entity.Location;

public interface LocationDAO extends CrudRepository<Location, Integer>{

	static boolean addLocation(Location location) {
		// TODO Auto-generated method stub
		return false;
	}

	static List<Location> getAllLocationDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	List<Location> findAll();
	Object findByOfficeLocation(String officeLocation);

	void deleteLocation(Location location);

	Object findByOfficeLocation();

	void save(String officeLocation);

	void deleteByOfficeLocation(String officeLocation);

	void addLocation(String officename);
	
}