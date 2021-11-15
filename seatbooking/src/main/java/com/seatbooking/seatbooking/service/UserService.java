package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface UserService {
	

	boolean checkLogin(String emailId,String password);
	boolean checkIfUserExists(String emailId);
	boolean registerUser(User user);
	boolean modifyUser(User user);
	boolean resetPassword(String emailId,String newPassword);
	boolean searchSeatStatus(String seatStatus);
	boolean swapRequest();
	boolean searchSeat();
	


}
