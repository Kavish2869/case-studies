package com.capgemini.salesmanagement.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.util.PayrollDBUTIL;

public class SaleDAOImpl implements ISaleDAO {
	private static final int HashMap = 0;
	private static final int Integer = 0;
	private static final int Sale = 0;

	public Sale save(Sale sale) {
		return sale;
		sale.setSaleId(CollectionUtil.getSALE_ID_COUNTER());
		CollectionUtil.sale.put(sale.getSaleId(), sale);
		return sale{


			public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
				com.capgemini.salesmanagement.bean.Sale sale1;
				sale1.setSaleId(CollectionUtil.getSALE_ID_COUNTER());


				return null;
			}

			@Override
			public Sale save1(Sale sale) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean update(Sale sale) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Sale findOne(int saleId) {}
			return CollectionUtil.sale.get(saleId);{
			}


			public List<Sale> findAll() {
				return new ArrayList<Sale>(CollectionUtil.sales.values());	}

		}
	}
