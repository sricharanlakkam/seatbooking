package com.seatbooking.seatbooking.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seatbooking.seatbooking.entity.User;
@Repository
public interface UserDAO extends CrudRepository<User ,Integer>{
	public User findByEmail(@Param("email") String email);



}
