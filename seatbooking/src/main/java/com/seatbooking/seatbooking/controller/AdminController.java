package com.seatbooking.seatbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.AdminDAO;
@RestController
public class AdminController {
	

	@Autowired
	AdminDAO repo;

	@PostMapping("/add_admin")
	public void home1(Admin location) {
		repo.save(location);
	}
	
	

}
