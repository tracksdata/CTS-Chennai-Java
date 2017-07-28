package com.pricematrix;

import org.springframework.stereotype.Repository;

// Dependency
@Repository("price")
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
