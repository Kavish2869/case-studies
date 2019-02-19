package com.capgemini.salesmanagement.exceptions;

public class ProductIDInvalidException extends Exception{

	public ProductIDInvalidException() {
		super();
	}

	public ProductIDInvalidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductIDInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductIDInvalidException(String message) {
		super(message);
	}

	public ProductIDInvalidException(Throwable cause) {
		super(cause);
	}

}
