package com.seatbooking.seatbooking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.seatbooking.seatbooking.entity.Seat;

public interface SeatDAO extends CrudRepository<Seat, Integer> {

	 boolean CreateSeat(Seat seat);

	 boolean cancelSeat(Seat seat);

	 List<Seat> getAllSeatDetails(Seat seat);
	 Seat getSeat(Seat seatStatus);
	List<Seat> getAllSeats();

	List<Seat> findAll();

	Seat save(Seat seat);

	Seat getOne(int seat);

	void delete(Seat p);

	Seat getSeat();

	Object getRemainingSeat();

	void setRemainingSeat(int remainingSeat);

	void setRemainingSeat(Object remainingSeat);

	Seat findBySeatNumber(String seatNumber);



}
