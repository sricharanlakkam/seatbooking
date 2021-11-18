package com.seatbooking.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.service.SeatService;

@RestController
public class SeatController {

	@Autowired
	private SeatService seatService;

	@GetMapping("/getseat")
	public List<Seat> getAllSeat() {
		return seatService.getAllSeat();
	}

	@PostMapping("/addseat")
	public Seat createUser(@RequestBody Seat seat) {
		return seatService.createUser(seat);
	}

	@DeleteMapping("/deleteseat")
	public void cancelSeat(@PathVariable("seatNumber") int seatNumber) {
		
		seatService.cancelSeat(seatNumber);
		
	}

}
