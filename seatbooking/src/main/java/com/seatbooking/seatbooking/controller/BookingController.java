package com.seatbooking.seatbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.BookingDAO;
import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.User;
import com.seatbooking.seatbooking.service.BookingService;
@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;
	

	@GetMapping("/viewbooking")
	public boolean viewBooking(Booking booking) {
		return bookingService.viewBooking(booking);
	}

	@PostMapping("/bookSeat")
	public boolean createbook(@RequestBody Booking booking) {
		return this.bookingService.saveBooking(booking);

	}

	@DeleteMapping("/cancel_booking/{bookingNumber}")
	public boolean delete(@PathVariable("bookingNumber") int bookingNumber) {
		return bookingService.deleteByBookingNumber(bookingNumber);
		
	}

}
