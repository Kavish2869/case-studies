package com.capgemini.salesmanagement.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.ProductNameInvalidException;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;
import com.cg.payroll.beans.Associate;
import com.cg.payroll.beans.BankDetails;
import com.cg.payroll.beans.Salary;
import com.cg.payroll.exceptions.AssociateDetailNotfoundException;
import com.cg.payroll.services.PayrollServices;
import com.cg.payroll.services.PayrollServicesImpl;
import com.cg.payroll.util.PayrollDBUTIL;

public class BillingSoftwareApplicationTest {
	public class PayrollServicesTest {
		private SaleService sale;
		@BeforeClass
		public void setUpTestEnv() {
			sale=new SaleService();
		}
		@Before
		public void setUpTestData() {

		}
		@Test(expected=ProductNameInvalidException.class)
	}
	@Test


}
@Test
public void testAcceptAssociateDetailsForValidData() {
	int expectedId=1003;
	int actualId=sale.acceptSaleDetails("xyz", "abc", "asfsaf@fda", "IT", 1500, "analyst", "dsgsgs", 15000, 500, 150, 150, 456321, "dsaga", "agae");
}

public void testGetAllAssociateDetails() {



}
@After
public void tearDownTestData() {
	CollectionUtil.sales.clear();
	CollectionUtil.SALE_ID_COUNTER=100;
}
@AfterClass
public void TearDownTestEnv() {
	sale=null;
}

}


}
