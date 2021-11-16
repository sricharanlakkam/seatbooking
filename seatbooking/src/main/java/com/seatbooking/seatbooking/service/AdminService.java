package com.seatbooking.seatbooking.service;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.User;

public interface AdminService {

	Iterable<Admin> getAllUser();



	void deleteUser(int id);
		void updateLocation(Location location);
		void updateOfficeLocation(String officeLocation);
		void approveSeat();
		void rejectSeat();
		void viewBooking();
		void cancelBooking(long bookingNumber);
		public void add(User user);


	


}
