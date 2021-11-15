package com.seatbooking.seatbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.LocationDAO;

@Service
public class LocationServiceImpl implements LocationService{
	
	@Autowired
	private LocationDAO locationdao;

	@Override
	public void updateLocation(String officeLocation) {
		locationdao.save(officeLocation);
		
	}

	@Override
	public void deleteLocation(String officeLocation) {
		locationdao.deleteByOfficeLocation(officeLocation);
		
	}

	@Override
	public void addLocation(String officename) {
		locationdao.addLocation(officename);
		
	}
	

}
