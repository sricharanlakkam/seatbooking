package com.seatbooking.seatbooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {
	@Id
	private int seatNumber;
	private String seatStatus;
	private String seatRequest;

	public Seat(int seatNumber, String seatStatus, String seatRequest) {
		super();
		this.seatNumber = seatNumber;
		this.seatStatus = seatStatus;
		this.seatRequest = seatRequest;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(String seatStatus) {
		this.seatStatus = seatStatus;
	}

	public String getSeatRequest() {
		return seatRequest;
	}

	public void setSeatRequest(String seatRequest) {
		this.seatRequest = seatRequest;
	}
}
