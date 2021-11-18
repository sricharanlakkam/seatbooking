package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Seat;


public interface SeatService {
public boolean checkSeatAvailability(int seatNumber, String seatStatus);
public void bookSeat(Seat seat);
public void cancelSeat(int seatNumber);
public void updateSeat(Seat seat);
public List<Seat> getAllSeat();
public Seat createUser(Seat seat);





}
