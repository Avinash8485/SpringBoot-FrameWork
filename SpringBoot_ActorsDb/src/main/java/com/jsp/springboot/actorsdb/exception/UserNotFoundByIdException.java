package com.jsp.springboot.actorsdb.exception;

public class UserNotFoundByIdException extends RuntimeException{
	
	private final String message;
	
	public UserNotFoundByIdException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
