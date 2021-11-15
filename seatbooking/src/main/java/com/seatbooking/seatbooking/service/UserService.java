package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface UserService {
	

	public boolean addUser(User user);
	public boolean modifyUser(User user);
	public boolean verifyEmail(String emailId);
	public boolean checkLogin(String emailId, String password);
	public boolean checkSeat(Seat seatStatus);
	public boolean resetPassword(String password);
	public boolean swapSeat(int seatNumber);
	
	


}
