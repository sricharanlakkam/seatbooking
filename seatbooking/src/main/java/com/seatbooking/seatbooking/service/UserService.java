package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.entity.User;

public interface UserService {

	boolean checkLogin(String emailId, String password);

	boolean checkIfUserExists(String emailId);

	boolean registerUser(User user);

	boolean resetPassword(String emailId, String newPassword);

	boolean searchSeatStatus(String seatStatus);

	public boolean swapRequest(int id1, int id2);

	boolean searchSeat(int seatNumber);

	public User addUser(User u);

	public void deleteUser(int id);

	public boolean approveSeat(int seatNumber);

}
