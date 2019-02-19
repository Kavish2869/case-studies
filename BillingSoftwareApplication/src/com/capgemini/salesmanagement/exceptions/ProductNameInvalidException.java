package com.capgemini.salesmanagement.exceptions;

public class ProductNameInvalidException extends Exception {

	public ProductNameInvalidException() {
		super();
	}

	public ProductNameInvalidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductNameInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductNameInvalidException(String message) {
		super(message);
	}

	public ProductNameInvalidException(Throwable cause) {
		super(cause);
	}

}
