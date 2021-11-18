package com.seatbooking.seatbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.seatbooking.entity.Booking;

	@Repository
	public interface BookingDAO extends CrudRepository<Booking, Integer> {
		@Query(value="SELECT * FROM BOOKING WHERE id=bookingId", nativeQuery=true)
		public Booking findByBookingId(int bookingId);




}
