package com.seatbooking.seatbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
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
	public Iterable<Admin> getAllUser() {
		return admindao.findAll();
	}

	@Override
	public void deleteUser(int id) {
		 admindao.deleteById(id);

	}

	@Override
	public void updateLocation(Location location) {
		admindao.save(location);

	}

	@Override
	public void updateOfficeLocation(String officeLocation) {
		

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
