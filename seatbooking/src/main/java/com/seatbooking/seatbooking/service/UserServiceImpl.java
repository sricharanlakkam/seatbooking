package com.seatbooking.seatbooking.service;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;
import com.seatbooking.seatbooking.exception.NoSeatException;
import com.seatbooking.seatbooking.exception.NoUserException;
import com.seatbooking.seatbooking.exception.UserAlreadyExist;

@Service
public class UserServiceImpl implements UserService {
	private static final String USER_NOT_FOUND="User Not Found";
	private static final String SEAT_NOT_FOUND="Seat Not Found";

	@Autowired
	private UserDAO userdao;
	@Autowired
	private SeatDAO seatdao;

	@Override
	public boolean checkLogin(String emailId, String password) {
		

		User user = userdao.findByEmail(emailId);
		if (user != null && user.getPassword().equals(password)) {
			return true;
		}
		
		throw new NoUserException(USER_NOT_FOUND);

	}



	
	@Override
	public boolean checkIfUserExists(String emailId) {

		User user = userdao.findByEmail(emailId);
		if (user != null) {
			return false;
		} else
			return true;
	}

	@Override
	public boolean registerUser(User user) {
		Optional<User> checkUser = userdao.findById(user.getId());
		if (!checkUser.isPresent()) {
			userdao.save(user);
			return true;
		}

		else
			throw new UserAlreadyExist("User with Id:" + user.getId() + " Already Exist");
	}	

	
	@Override
	public boolean resetPassword(String emailId, String newPassword) {

		User user = userdao.findByEmail(emailId);
		if (user != null) {
			user.setPassword(newPassword);
			return true;
		}
		return false;
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
	public boolean searchSeat(int seatNumber) {
		userdao.findById(seatNumber);
		return true;

	}
	int temp;
	@Override
	public boolean swapRequest(int id1,int id2) {
		temp=id1;
		id1=id2;
		id2=temp;
		return false;
	}

	

	@Override
	public User addUser(User u) {
		userdao.save(u);
		return null;
	}

	
	
	@Override
	public boolean approveSeat(int seatNumber) {
		Seat seat = seatdao.findBySeatNumber(seatNumber);
		if(seat != null)
		{
			return true;
		}
		
		throw new NoSeatException(SEAT_NOT_FOUND);

			
	}

	@Override
	public void deleteUser(int id) {
		
		userdao.deleteById(id);
		
	}





	
	
}