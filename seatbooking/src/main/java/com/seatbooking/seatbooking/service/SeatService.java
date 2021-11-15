package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Seat;

public interface SeatService {
	
	public List<Seat> searchSeat(int seatNumber, String seatStatus, String seatRequest);
	public boolean getSeatStatus(String seatStatus);
	
	

}
