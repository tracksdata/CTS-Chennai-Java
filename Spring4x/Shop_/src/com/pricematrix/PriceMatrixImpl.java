package com.pricematrix;
// Dependency
public class PriceMatrixImpl implements PriceMatrix {
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl Obj created");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price 
		
		return 100.00;
	}

}
