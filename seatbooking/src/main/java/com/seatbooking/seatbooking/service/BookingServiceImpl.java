package com.seatbooking.seatbooking.service;

import java.util.List;
import java.util.Optional;

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
	public boolean cancelBooking(int bookingNumber) {
		Optional<Booking> booking = bookingDao.findById(bookingNumber);
		if (booking.isPresent()) {
			bookingDao.deleteById(bookingNumber);
			return true;
		}
		return false;

	}

	@Override
	public boolean checkSeatAvailability(String seatStatus, int seatNumber) {
		Optional<Seat> seat = seatDao.findById(seatNumber);
		if (seat.isPresent()) {
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

	//@Override
	/*public boolean updateSeat(String seatStatus, int seatNumber) {
	//	Seat seat = seatDao.save(seatNumber);
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
		
	}*/



	@Override
	public boolean viewBooking(Booking booking) {
		bookingDao.save(booking);
		return true;
	}



	@Override
	public boolean saveBooking(Booking booking) {
		 bookingDao.save(booking);
		return true;
	}



	@Override
	public boolean getBooking(int bookingNumber) {
		bookingDao.findById(bookingNumber);
		return false;
	}



	@Override
	public boolean deleteByBookingNumber(int bookingNumber) {
		bookingDao.deleteById(bookingNumber);
		return false;
	}



	@Override
	public boolean modifySeat(String seatStatus, int seatNumber) {
     bookingDao.findById(seatNumber);
		return false;
	}



	
}
