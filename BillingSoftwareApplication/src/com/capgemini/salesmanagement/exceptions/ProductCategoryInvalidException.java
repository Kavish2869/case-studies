package com.capgemini.salesmanagement.exceptions;

public class ProductCategoryInvalidException extends Exception{

	public ProductCategoryInvalidException() {
		super();
	}

	public ProductCategoryInvalidException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ProductCategoryInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProductCategoryInvalidException(String message) {
		super(message);
	}

	public ProductCategoryInvalidException(Throwable cause) {
		super(cause);
	}

}
