package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface AdminService {
	
	public boolean addUser(User user);
	public boolean modifyUser(User user);
	public boolean deleteUser(User user);
	public boolean getAllUserDetails();
	
	public boolean addSeat(Seat seat);
	public boolean cancelSeat(Seat seat);
	public boolean changeSeat(Seat seat);
	public List<Seat> getAllSeatDetail(Seat seat);
	
	public boolean addLocation(Location location);
	public boolean modifyLocation(Location location);
	public boolean deleteLocation(Location location);
	public List<Location> getAllLocationDetail(Location location);
	
}
