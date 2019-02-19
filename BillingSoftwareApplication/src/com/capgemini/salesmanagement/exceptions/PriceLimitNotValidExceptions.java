package com.capgemini.salesmanagement.exceptions;

public class PriceLimitNotValidExceptions extends Exception{

	public PriceLimitNotValidExceptions() {
		super();
	}

	public PriceLimitNotValidExceptions(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PriceLimitNotValidExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public PriceLimitNotValidExceptions(String message) {
		super(message);
	}

	public PriceLimitNotValidExceptions(Throwable cause) {
		super(cause);
	}

}
