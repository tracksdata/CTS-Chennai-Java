package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String cart1[] = { "P001", "P002", "P003" };
		String cart2[] = { "P0010", "P0020"};
		
		PriceMatrix price=new PriceMatrixImpl();
		
		//--------------------------------------
		BillingImpl biller = new BillingImpl(); // Dependency Obj
		biller.setPrice(price); // DI
		//---------------------------------------
		
		double total = biller.checkOut(cart1);
		System.out.println("Cart 1 Total: " + total);
		
		total = biller.checkOut(cart2);
		System.out.println("Cart 2 Total: " + total);

	}

}
