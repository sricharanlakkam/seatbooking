package com.seatbooking.seatbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.seatbooking.entity.Seat;
@Repository
public interface SeatDAO extends CrudRepository<Seat, Integer> {
 
	@Query(value="SELECT * FROM BOOKING WHERE id=bookingId", nativeQuery=true)
	public Seat findBySeatNumber(int seatNumber);





}
