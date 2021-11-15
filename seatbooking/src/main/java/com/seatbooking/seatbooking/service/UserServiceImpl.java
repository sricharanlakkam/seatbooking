package com.seatbooking.seatbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userdao;

	@Override
	public boolean checkLogin(String emailId, String password) {

		User user = UserDAO.getUser(emailId);
		if (user != null) {
			String userPass = user.getPassword();
			if (userPass.equals(password))
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public boolean checkIfUserExists(String emailId) {

		User user = UserDAO.getUser(emailId);
		if (user != null) {
			return false;
		} else
			return true;
	}

	@Override
	public boolean registerUser(User user) {

		userdao.addUser(user);
		System.out.println("Registered");
		return false;
	}

	@Override
	public boolean modifyUser(User user) {

		return false;
	}

	@Override
	public boolean resetPassword(String emailId, String newPassword) {

		User user = UserDAO.getUser(emailId);
		if (user != null) {
			user.setPassword(newPassword);
			return UserDAO.modifyUser(user);
		}
		return true;
	}

	@Override
	public boolean searchSeatStatus(String seatStatus) {
		if (seatStatus.equals("green")) {
			return true;
		} else if (seatStatus.equals("grey"))
			return false;
		else
			return false;
	}

	@Override
	public boolean searchSeat() {
		return false;

	}
	int temp;
	@Override
	public boolean swapRequest(int id1,int id2) {
		temp=id1;
		id1=id2;
		id2=temp;
		return false;
	}
}