package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface UserService {
	

	boolean checkLogin(String emailId,String password);
	boolean checkIfUserExists(String emailId);
	boolean registerUser(User user);
	boolean modifyUser(User user);
	boolean resetPassword(String emailId,String newPassword);
	boolean searchSeatStatus(String seatStatus);
	public boolean swapRequest(int id1,int id2);
	boolean searchSeat();
	void getAllUser();
	


}
