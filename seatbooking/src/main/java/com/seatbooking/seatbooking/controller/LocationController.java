package com.seatbooking.seatbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.service.LocationService;
@RestController
@RequestMapping("/api/User")
public class LocationController {

	@Autowired
	private LocationService locationService;

	@RequestMapping("/all_loc")
	@ResponseBody
	public Iterable<Location> getLocation(Location location) {

		return locationService.getLocation(location);
	}


	@PutMapping("/modify_loc")
	public Location updateLocation(Location location) {
		locationService.updateLocation(location);
		return location;
	}
}