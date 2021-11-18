package com.seatbooking.seatbooking.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.seatbooking.seatbooking.exception.NoLocationException;
import com.seatbooking.seatbooking.exception.NoSeatException;
import com.seatbooking.seatbooking.exception.NoUserException;
import com.seatbooking.seatbooking.exception.UserAlreadyExist;

@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(NoSeatException.class)
	public ResponseEntity<Object> handleNoSeatFound(NoSeatException exception){
	return new ResponseEntity<>("Seat not found", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoUserException.class)
	public ResponseEntity<Object> handleNoUserFound(NoUserException exception){
	return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoLocationException.class)
	public ResponseEntity<Object> handleNoLocationFound(NoLocationException exception){
	return new ResponseEntity<>("Location not found", HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(UserAlreadyExist.class)
	public ResponseEntity<Object> handleUserAlreadyExist(UserAlreadyExist exception){
	return new ResponseEntity<>("User already exist", HttpStatus.NOT_FOUND);

	}


	}

