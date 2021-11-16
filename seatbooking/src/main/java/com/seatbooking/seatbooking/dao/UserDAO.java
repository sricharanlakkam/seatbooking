package com.seatbooking.seatbooking.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.seatbooking.seatbooking.entity.User;

public interface UserDAO extends CrudRepository<User ,Integer>{

	 static boolean modifyUser(User user) {
		
		return false;
	}
	 boolean deleteUser(User user);

	 List<User> getAllUserDetails();

	  boolean addUser(User u);

	 User getUser();

	 public static User getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}
	List<User> getAllUser();

	void save(String password);
	void getSeat();



}
