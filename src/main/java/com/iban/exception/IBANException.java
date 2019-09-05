package com.iban.exception;

public class IBANException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;

	public IBANException(String message) {
		
		super(message);
	}

}