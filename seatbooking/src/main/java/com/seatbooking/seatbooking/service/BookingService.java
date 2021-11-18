package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface BookingService {
	public boolean bookSeat(Seat seat, List<User> user);
	public boolean checkSeatAvailability(String seatStatus, int seatNumber);
	public boolean modifySeat(String seatStatus, int seatNumber);
	public boolean viewBooking(Booking booking);
	public boolean saveBooking(Booking booking);
	public boolean getBooking(int bookingNumber);
	public boolean deleteByBookingNumber(int bookingNumber);
	public boolean cancelBooking(int bookingNumber);
}