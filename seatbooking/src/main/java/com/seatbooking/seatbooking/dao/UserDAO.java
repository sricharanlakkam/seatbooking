package com.seatbooking.seatbooking.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.seatbooking.seatbooking.entity.User;

public interface UserDAO extends CrudRepository<User ,Integer>{

	static boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	static boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	static List<User> getAllUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	  default boolean addUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}

	static User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	static User getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	List<User> getAllUser();

	void save(String password);



}
