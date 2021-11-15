package com.seatbooking.seatbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seatbooking.seatbooking.dao.SeatDAO;
import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;

@Service
public class SeatSeviceImpl implements SeatService {
	@Autowired
	private SeatDAO seatDao;

	public boolean checkSeatAvailability(int seatNumber, String seatStatus) {

		Seat s = seatDao.getSeat();
		if (s != null) {

			if (seatStatus.equals("green")) {

				return false;
			} else
				return true;

		}
		return false;
	}

	@Override
	public boolean bookSeat(Booking booking) {
// TODO Auto-generated method stub

		return false;
	}

	@Override
	public boolean cancelSeat(int bookingNumber) {
// TODO Auto-generated method stub
		return false;
	}

@Override
public boolean updateSeat(int bookingNumber, int seatNumber) {
// TODO Auto-generated method stub
return false;
}
}