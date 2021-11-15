package com.seatbooking.seatbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;
import com.seatbooking.seatbooking.entity.User;

public interface BookingDAO extends CrudRepository<User, Integer> {

	public Booking save(Booking user);

	public void delete(Booking p);

	public Booking getOne(int bookingNumber);

	public List<User> viewBooking();

	public Object save(Seat seat);

	public Booking findByBookingNumber(long bookingNumber);

	public void deleteByBookingNumber(long bookingNumber);

}
