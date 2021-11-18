package com.seatbooking.seatbooking.exception;

public class UserAlreadyExist extends RuntimeException {
	public UserAlreadyExist() {
	super();
	}


public UserAlreadyExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);

}

public UserAlreadyExist(String message, Throwable cause) {
	super(message, cause);
}

public UserAlreadyExist(String message) {
	super(message);
}

public UserAlreadyExist(Throwable cause) {
	super(cause);

}
}


