package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.PriceLimitNotValidExceptions;
import com.capgemini.salesmanagement.exceptions.ProductCategoryInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductIDInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductNameInvalidException;
import com.capgemini.salesmanagement.exceptions.QuantityLimitExceededException;

public interface ISaleService {
	public HashMap<Integer,Sale>insertSalesDetails(Sale sale)
			throws ProductIDInvalidException,ProductNameInvalidException;

	public boolean validateProductCode(int productId)
			throws ProductNameInvalidException,ProductCategoryInvalidException;

	boolean validateQuantity(int qty)
			throws PriceLimitNotValidExceptions,QuantityLimitExceededException;

	public boolean validateProductCat(String prodCat)
			throws ProductCategoryInvalidException,ProductIDInvalidException;

	public boolean validateProductName(String prodName)
			throws ProductNameInvalidException;

	public boolean validateProductPrice(float price)
			throws PriceLimitNotValidExceptions;
}
