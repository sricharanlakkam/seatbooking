package com.seatbooking.seatbooking.service;

import java.util.List;

import com.seatbooking.seatbooking.entity.Booking;
import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.User;

public interface AdminService {

	default List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
		}



		void deleteUserbyId(int id);
		void updateLocation(Location location);
		void updateOfficeLocation(String officeLocation);
		void manageBooking(Booking booking);
		void approveSeat();
		void rejectSeat();
		void viewBooking();
		void cancelBooking();
		public void add(User user);



		void saveUser(User user);


}
