package com.seatbooking.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.LocationDAO;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.service.LocationService;
@RestController
@RequestMapping("/api/User")
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping("/all_loc")
	@ResponseBody
	public List<Location> getloc() {

		return locationService;
	}

	@PostMapping("/add_loc")
	public Location home1(Location location) {
		locationService.save(location);
		return location;
	}

	@PutMapping("/modify_loc")
	public Location update(Location location) {
		locationService.save(location);
		return location;
	}
}