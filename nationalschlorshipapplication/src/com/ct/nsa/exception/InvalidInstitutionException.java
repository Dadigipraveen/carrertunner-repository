package com.ct.nsa.exception;

public class InvalidInstitutionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInstitutionException() {

	}

	public InvalidInstitutionException(String message) {
		super(message);

	}

	public InvalidInstitutionException(Throwable cause) {
		super(cause);

	}

	public InvalidInstitutionException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidInstitutionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
