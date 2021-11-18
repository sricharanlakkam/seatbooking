package com.seatbooking.seatbooking.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.seatbooking.seatbooking.entity.Location;
@Repository
public interface LocationDAO extends CrudRepository<Location, Integer>{

	@Query(value="DELETE FROM LOCATION WHERE officelocation=?1", nativeQuery =true)
	void deleteByOfficeLocation(String officeLocation);
}