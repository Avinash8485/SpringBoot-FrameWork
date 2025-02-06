package com.jsp.springboot.actorsdb.utility;

public class ErrorStructure {

	private int status;
	private String message;
	private String rootCause;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}
	
	public static ErrorStructure cause(int status,String message,String rootCause) {
		
		ErrorStructure structure = new ErrorStructure();
		structure.setStatus(status);
		structure.setMessage(message);
		structure.setRootCause(rootCause);

		
		return structure;
		
		
	}
	
}
