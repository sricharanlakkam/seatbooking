package com.seatbooking.seatbooking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.AdminDAO;
import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.User;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO admindao;

	@Override
	public List<User> getAllUser() {
// TODO Auto-generated method stub
		return admindao.findAll();
	}

	@Override
	public void saveUser(User user) {
// TODO Auto-generated method stub

	}

	@Override
	public void deleteUserbyId(int id) {
// TODO Auto-generated method stub

	}

	@Override
	public void updateLocation(Location location) {
// TODO Auto-generated method stub

	}

	@Override
	public void updateOfficeLocation(String officeLocation) {
// TODO Auto-generated method stub

	}

	@Override
	public void manageBooking(Booking booking) {

	}

	@Override
	public void approveSeat() {

	}

	@Override
	public void rejectSeat() {

	}

	@Override
	public void viewBooking() {

	}

	@Override
	public void cancelBooking() {

	}

	@Override
	public void add(User user) {

	}
}
