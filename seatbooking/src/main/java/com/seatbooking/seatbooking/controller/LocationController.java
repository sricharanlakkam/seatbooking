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
@Configuration
@RestController
@RequestMapping("/api/User")
public class LocationController {

	@Autowired
	LocationDAO repo;

	@RequestMapping("/all_loc")
	@ResponseBody
	public List<Location> getloc() {

		return repo.findAll();
	}

	@PostMapping("/add_loc")
	public Location home1(Location location) {
		repo.save(location);
		return location;
	}

	@PutMapping("/modify_loc")
	public Location update(Location location) {
		repo.save(location);
		return location;
	}
}