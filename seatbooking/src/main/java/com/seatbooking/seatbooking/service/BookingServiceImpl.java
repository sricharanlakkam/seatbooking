package com.seatbooking.seatbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.BookingDAO;
import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.dao.UserDAO;
import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingDAO bookingDao;
	@Autowired
	private UserDAO userDao;
	@Autowired
	private SeatDAO seatDao;

	@Override
	public boolean bookSeat(Seat seat, List<User> user) {
		return false;


	}



	@Override
	public boolean cancelSeat(long bookingNumber) {
		Booking booking = bookingDao.findByBookingNumber(bookingNumber);
		if (booking != null) {
			bookingDao.deleteByBookingNumber(bookingNumber);
			return true;
		}
		return false;

	}

	@Override
	public boolean checkSeatAvailability(String seatStatus, String seatNumber) {
		Seat seat = seatDao.findBySeatNumber(seatNumber);
		if (seat != null) {
			if (seatStatus.equals("Green")) {
				return true;
			}

			else if (seatStatus.equals("Grey")) {
				return true;
			} 
			else {

				return false;
			}
		}
		return false;

	}

	@Override
	public boolean updateSeat(String seatStatus, String seatNumber) {
		Seat seat = seatDao.findBySeatNumber(seatNumber);
		if (seat != null) {
			if (seatStatus.equalsIgnoreCase("Green")) {
				seatDao.save(seat);
			}
			else if (seatStatus.equalsIgnoreCase("Grey")) {
				seatDao.save(seat);
			}
			else {
				return true;
			}
			
		}
		return false;
	}

	
}
