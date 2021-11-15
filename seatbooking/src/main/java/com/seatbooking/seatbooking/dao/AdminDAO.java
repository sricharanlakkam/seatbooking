package com.seatbooking.seatbooking.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.seatbooking.seatbooking.entity.User;

public interface AdminDAO {

	void save(Admin location);

	List<User> findAll();


}
