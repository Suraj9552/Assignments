package org.cap.apps.customerjpa.exceptions;

public class InvalidCustomerNameException extends RuntimeException{

	public InvalidCustomerNameException() {
		
	}
	
	public InvalidCustomerNameException(String msg) {
		super(msg);
	}
}
