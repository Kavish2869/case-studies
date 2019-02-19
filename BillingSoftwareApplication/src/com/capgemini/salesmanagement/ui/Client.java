package com.capgemini.salesmanagement.ui;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;

public class Client {
	public static void main(String[] args) {

		Sale sale=new Sale();
		Scanner sc = new Scanner(System.in); 
		int index = 0;
		System.out.println("-----------------------:Billing Software Apllication:-------------------------");
		System.out.println("Choose among the given options: ");
		System.out.println("1.Create SaleId: ");
		System.out.println("2.Get Product Detail:");
		System.out.println("3.Get All Product Details: ");
		System.out.println("4.Calculate discount:");

		System.out.println("Enter the function you want to perform: ");
		index =sc.nextInt();

		switch(index) {
		case 1: System.out.println("Enter the Product Details:");
		System.out.println("saleId:"); 
		String firstName=sc.next();
		System.out.println("prodCode:"); 
		System.out.println("Enter the prod code: "); 
		int accountNumber=sc.nextInt();
		System.out.println("Enter the quantity ");
		String bankName=sc.next(); 
		System.out.println("Enter product name ");
		String ifscCode = sc.next(); 
		System.out.println("enter category ");
		String saleId;
		System.out.println("Your Sale ID is : ");
		break; 
		
		case 3:System.out.println("Details of all Accounts:");
		System.out.println(); 
		break; 

		default:
			System.out.println("Invalid Option,Please Try Again!!!!!"); 
		}
		System.out.println("---------------------------------------------------------------------------------------"); 
		System.out.println("Do you want to continue?");
		System.out.println("1.Yes"); 
		System.out.println("2.No"); 
		int count =sc.nextInt();
		if(count==2) { 
			System.exit(0);
		}else { 
			main(null);
		}			
	}

}
