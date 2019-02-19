package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.List;
import com.capgemini.salesmanagement.bean.Sale;

public interface ISaleDAO {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale);

	Sale save(Sale associate);
	boolean update(Sale sale);
	Sale findOne(int saleId);
	List<Sale > findAll();

	Sale save1(Sale sale);


}
