package com.seatbooking.seatbooking.service;

import com.seatbooking.seatbooking.entity.Seat;

public interface BookingService {
	
	public boolean checkSeat(Seat seat);
	public boolean bookSeat(String seatNumber);
	public boolean cancelTicket();
	public boolean updateSeat(int flightMasterId,int seat,String classType);

}
