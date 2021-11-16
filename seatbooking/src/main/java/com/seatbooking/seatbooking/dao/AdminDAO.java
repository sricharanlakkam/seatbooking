package com.seatbooking.seatbooking.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.data.repository.CrudRepository;

import com.seatbooking.seatbooking.entity.Location;
import com.seatbooking.seatbooking.entity.User;

public interface AdminDAO extends CrudRepository<Admin, Integer>  {

	void save(Location location);

	Iterable<Admin> findAll();

	List<User> save(User user);

	void deleteById(int id);
	void save(String officeLocation);

	void deleteById(long bookingNumber);
	
	


}
