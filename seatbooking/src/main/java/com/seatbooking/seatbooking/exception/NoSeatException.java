package com.seatbooking.seatbooking.exception;

public class NoSeatException extends RuntimeException {
	public NoSeatException() {
		super();

	}

	public NoSeatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoSeatException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSeatException(String message) {
		super(message);
	}

	public NoSeatException(Throwable cause) {
		super(cause);

	}

}
