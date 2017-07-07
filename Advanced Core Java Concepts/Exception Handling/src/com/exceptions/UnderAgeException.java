package com.exceptions;

import java.io.IOException;

public class UnderAgeException extends RuntimeException {

	/*
	 * public UnderAgeException() {
	 * System.out.println("---- You must be 18 to continue"); }
	 */

	public UnderAgeException(String msg) {

		super(msg);

	}
}
