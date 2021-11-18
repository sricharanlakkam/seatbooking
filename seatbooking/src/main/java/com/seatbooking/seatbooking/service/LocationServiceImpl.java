package com.seatbooking.seatbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.LocationDAO;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.exception.NoLocationException;


@Service

public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationDAO locationdao;

	@Override
	public void updateLocation(Location location) {
		locationdao.save(location);
		
	}

	@Override
	public void deleteLocation(String officeLocation) {
		locationdao.deleteByOfficeLocation(officeLocation);
		
	}

	@Override
	public void addLocation(Location location) {
		locationdao.save(location);
		
	}

	@Override
	public  Iterable<Location> getLocation(Location location) {
		Optional<Location> checkLocation = locationdao.findById(location.getLocationId());
		if(checkLocation.isPresent())
		{
			return (Iterable<Location>) location;
		}
		
		else
			throw new NoLocationException("No Location Found");
			
		
	}


	

}
