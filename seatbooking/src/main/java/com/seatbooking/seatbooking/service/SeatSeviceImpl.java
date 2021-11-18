package com.seatbooking.seatbooking.service;

import java.util.List;
import java.util.Optional;

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

		Optional<Seat> s = seatDao.findById(seatNumber);
		if (s.isPresent()) {

			if (seatStatus.equals("green")) {

				return true;
			} else
				return false;

		}
		return false;
	}

	@Override
	public void bookSeat(Seat seat) {
		seatDao.save(seat);
	}

	@Override
	public void cancelSeat(int seatNumber) {
		seatDao.deleteById(seatNumber);
	}

	@Override
	public void updateSeat(Seat seat) {
		seatDao.save(seat);

	}

	@Override
	public List<Seat> getAllSeat() {
		seatDao.findAll();
		return null;
	}

	@Override
	public Seat createUser(Seat seat) {
		seatDao.save(seat);
		return seat;
	}

	
	

}