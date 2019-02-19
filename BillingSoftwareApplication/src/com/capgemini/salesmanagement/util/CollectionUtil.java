package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;


public class CollectionUtil {
	public static Map<Integer,Sale>sales=new HashMap<Integer,Sale>();
	public static HashMap<Integer, Sale>sale=new HashMap<>();
	public static	int SALE_ID_COUNTER=1001;
	public static int getASSOCIATE_ID_COUNTER() {

		return ++SALE_ID_COUNTER;

	}
	public static Object getSALE_ID_COUNTER() {
		return null;
	}

}
