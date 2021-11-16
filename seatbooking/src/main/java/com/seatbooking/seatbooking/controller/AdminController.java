package com.seatbooking.seatbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.AdminDAO;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.service.AdminService;
@RestController
public class AdminController {
	

	@Autowired
	AdminService adminService;

	@PostMapping("/add_admin")
	public void home1(Location location) {
		adminService.saveLocation(location);
	}
	
	

}
