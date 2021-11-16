package com.seatbooking.seatbooking.entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private long bookingNumber;
	private Date bookingDate;
	private Time bookingDuration;
	private String bookingStatus;

	public Booking(long bookingNumber, Date bookingDate, Time bookingDuration, String bookingStatus) {
		super();
		this.bookingNumber = bookingNumber;
		this.bookingDate = bookingDate;
		this.bookingDuration = bookingDuration;
		this.bookingStatus = bookingStatus;
	}

	public long getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(long bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Time getBookingDuration() {
		return bookingDuration;
	}

	public void setBookingDuration(Time bookingDuration) {
		this.bookingDuration = bookingDuration;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}

