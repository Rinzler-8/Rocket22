package com.vti.entity;

public class InvalidAgeException extends RuntimeException {
	private static final String MESSAGE_ERROR = "AAAAAAAA";

	public InvalidAgeException() {
		super(MESSAGE_ERROR);
	}

}
