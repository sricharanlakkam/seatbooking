package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public class UserServiceImpl implements UserService {

	@Override
	public boolean addUser(User user) {
		UserDAO.addUser(user);
		System.out.println("Deadpool");
		return false;
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEmail(String emailId) {
		User user = UserDAO.getUser(emailId);
		if (user != null)
			return false;
		else
			return true;
	}





	@Override
	public boolean resetPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swapSeat(int seatNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkLogin(String emailId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkSeat(Seat seatStatus) {
		// TODO Auto-generated method stub
		return false;
	}

}
