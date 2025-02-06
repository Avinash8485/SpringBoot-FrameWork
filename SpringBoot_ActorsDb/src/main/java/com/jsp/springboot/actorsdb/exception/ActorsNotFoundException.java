package com.jsp.springboot.actorsdb.exception;

public class ActorsNotFoundException extends RuntimeException{
	
	private final String message;

	public ActorsNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	

}
