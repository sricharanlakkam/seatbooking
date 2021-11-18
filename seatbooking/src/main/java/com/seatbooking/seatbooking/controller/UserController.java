package com.seatbooking.seatbooking.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.User;
import com.seatbooking.seatbooking.service.BookingService;
import com.seatbooking.seatbooking.service.LocationService;
import com.seatbooking.seatbooking.service.SeatService;
import com.seatbooking.seatbooking.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private SeatService seatService;
	@Autowired
	private LocationService locationService;
	@Autowired
	private BookingService bookingService;
	

	
	
	

	@PutMapping("/modify_password")
	public boolean resetPassword(@RequestBody String emailId, String newPassword) {
		userService.resetPassword(emailId,newPassword);
		return true;
	}


	@GetMapping("/swap_request")
	public boolean swapRequest(int id1, int id2) {
		userService.swapRequest(id1, id2);
		return true;
	}

	@GetMapping("/user_registration")
	public String displayPort() {
		return "registrationview";
	}

	@PostMapping("/registered")
	public String registration(HttpServletRequest req, Model m1) {
		String username = req.getParameter("userName");
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		User u = new User();
		u.setEmail(email);
		u.setUserName(username);
		u.setPassword(pass);
		userService.addUser(u);


		
		return "success";
	}
		@GetMapping("/user/user")
		public void addUser(User user) {
			userService.addUser(user);
		}

		@PostMapping("/user/add")
		public void addLocation(Location location) {
			locationService.addLocation(location);
		}
		@PostMapping("/user/update")
		public void updateLocation(@RequestBody Location  location) {
		locationService.updateLocation(location);
		}
		@GetMapping("/user/booking")
		public void viewBooking(Booking booking) {
			bookingService.viewBooking(booking);	
			}
		@DeleteMapping("/user/cancel_booking/{bookingNumber}")
		public void cancelBooking(@RequestBody int bookingNumber ) {
		    bookingService.cancelBooking(bookingNumber);
			
		
		

	}

	}


