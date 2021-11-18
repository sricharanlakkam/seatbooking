package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.entity.Location;

public interface LocationService {
	public void updateLocation(Location location);
	public void deleteLocation(String officeLocation);
	public void addLocation(Location location);
	public Iterable<Location> getLocation(Location location);

	
	

}
