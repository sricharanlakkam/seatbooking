package com.seatbooking.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.seatbooking.seatbooking.dao.BookingDAO;
import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.User;

public class BookingController {

	@Autowired
	BookingDAO repo;
	
	
	@GetMapping("/viewbooking")
	public List<User> viewBooking() {
		return repo.viewBooking();
	}

	@PostMapping("/bookSeat")
	public Booking createbook(@RequestBody Booking user) {
		return this.repo.save(user);

	}

	@DeleteMapping("/cancel_booking/{bookingNumber}")
	public String delete(@PathVariable("bookingNumber") int bookingNumber) {
		Booking p = repo.getOne(bookingNumber);
		repo.delete(p);
		return "Deleted User Details";
	}

}
