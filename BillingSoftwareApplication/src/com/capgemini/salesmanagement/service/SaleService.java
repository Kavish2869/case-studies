package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAOImpl;
import com.capgemini.salesmanagement.exceptions.PriceLimitNotValidExceptions;
import com.capgemini.salesmanagement.exceptions.ProductCategoryInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductIDInvalidException;
import com.capgemini.salesmanagement.exceptions.ProductNameInvalidException;
import com.capgemini.salesmanagement.exceptions.QuantityLimitExceededException;

public class SaleService implements ISaleService {

	SaleDAOImpl service= new SaleDAOImpl();
	Sale sale;

	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale)
			throws ProductIDInvalidException, ProductNameInvalidException {


		return null;
	}

	@Override
	public boolean validateProductCode(int productId)
			throws ProductNameInvalidException, ProductCategoryInvalidException {
		if(productId!=sale.productId())	
			throw new ProductIDInvalidException("Product details not found" +productId);

		return false;
	}

	@Override
	public boolean validateQuantity(int qty) throws PriceLimitNotValidExceptions, QuantityLimitExceededException
	{
		if(qty!=sale.getQuantity())
			throw new QuantityLimitExceededException("Quantity exceeds" +qty);


		return false;
	}

	@Override
	public boolean validateProductCat(String prodCat)
			throws ProductCategoryInvalidException, ProductIDInvalidException {
		if(prodCat!=sale.getProductName())
			throw new ProductCategoryInvalidException("Product cat" +prodCat);
		return false;
	}

	@Override
	public boolean validateProductName(String prodName) throws ProductNameInvalidException {
		if(prodName!=sale.getProductName())
			throw new ProductNameInvalidException("Product Name" +prodName);

		return false;
	}

	@Override
	public boolean validateProductPrice(float price) throws PriceLimitNotValidExceptions {
		if(price!=sale.getProdCode())
			throw new PriceLimitNotValidExceptions("Product Price" +price);

		return false;
	}

	public int acceptSaleDetails(String string, String string2, String string3, String string4, int i, String string5,
			String string6, int j, int k, int l, int m, int n, String string7, String string8) {
		// TODO Auto-generated method stub
		return 0;
	}




}
