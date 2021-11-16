package com.seatbooking.seatbooking.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;
import com.seatbooking.seatbooking.service.SeatService;
import com.seatbooking.seatbooking.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	SeatService seatService;

	@GetMapping("/getuser")
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}

	@PostMapping("/adduser")
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}

	@PutMapping("/modify_user")
	public User update(User user) {
		userRepository.save(user);
		return user;

	}

	@PutMapping("/modify_password")
	public String resetPassword(@RequestBody String password) {
		userRepository.save(password);
		return password;
	}

	@GetMapping("/search_seat")
	public boolean searchSeat() {
		return true;
	}

	@GetMapping("/swap_request")
	public boolean swapRequest(int id1, int id2) {
		return true;
	}

	@GetMapping("/get_seatstatus")
	public List<Seat> getAllSeats() {
		return seatdao.getAllSeats();
	}
	@PostMapping("/seat_booking")
	

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
		userRepository.addUser(u);

		return "success";
	}

}
