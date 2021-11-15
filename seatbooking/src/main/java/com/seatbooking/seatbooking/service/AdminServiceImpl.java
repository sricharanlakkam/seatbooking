package com.seatbooking.seatbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.seatbooking.seatbooking.dao.AdminDAO;
import com.seatbooking.seatbooking.dao.LocationDAO;
import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public class AdminServiceImpl implements AdminService{
	
	
	
	@Autowired
	private User user;
	@Autowired
	private Seat seat;
	@Autowired
	private Location location;

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return UserDAO.addUser(user);
	}

	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return UserDAO.modifyUser(user) ;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return UserDAO.deleteUser(user);
	}


	@Override
	public boolean addSeat(Seat seat) {
		// TODO Auto-generated method stub
		return SeatDAO.CreateSeat(seat);
	}
	@Override
	public boolean cancelSeat(Seat seat) {
		// TODO Auto-generated method stub
		return SeatDAO.cancelSeat(seat);
	}

	@Override
	public List<Seat> getAllSeatDetail(Seat seat) {
		// TODO Auto-generated method stub
		return SeatDAO.getAllSeatDetails(seat);
	}

	@Override
	public boolean addLocation(Location location) {
		// TODO Auto-generated method stub
		return LocationDAO.addLocation(location);
	}

	@Override
	public boolean modifyLocation(Location location) {
		// TODO Auto-generated method stub
		return LocationDAO.addLocation(location);
	}

	@Override
	public boolean deleteLocation(Location location) {
		// TODO Auto-generated method stub
		return LocationDAO.addLocation(location);
	}

	@Override
	public List<Location> getAllLocationDetail(Location location) {
		// TODO Auto-generated method stub
		return LocationDAO.getAllLocationDetail();
	}

	@Override
	public boolean changeSeat(Seat seat) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getAllUserDetails() {
		// TODO Auto-generated method stub
		return false;
	}

}
