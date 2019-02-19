package com.capgemini.salesmanagement.exceptions;

public class QuantityLimitExceededException extends Exception{

	public QuantityLimitExceededException() {
		super();
	}

	public QuantityLimitExceededException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public QuantityLimitExceededException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuantityLimitExceededException(String message) {
		super(message);
	}

	public QuantityLimitExceededException(Throwable cause) {
		super(cause);
	}

}
