package com.seatbooking.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.service.SeatService;

@RestController
public class SeatController {

	@Autowired
	private SeatService seatService;

	@GetMapping("/getseat")
	public List<Seat> getAllSeat() {
		return this.seatService.findAll();
	}

	@PostMapping("/addseat")
	public Seat createUser(@RequestBody Seat seat) {
		return this.seatService.save(seat);
	}

	@DeleteMapping("/deleteseat")
	public String delete(@PathVariable("seatNumber") int seatNumber) {
		Seat p = seatService.getOne(seatNumber);
		seatService.delete(p);
		return "Deleted User Details";
	}

}
