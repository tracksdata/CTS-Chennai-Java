package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;

//Dependent
@Service("biller")
public class BillingImpl {

	@Autowired
	private PriceMatrix price;

	
	public double checkOut(String[] cart) {

		double total = 0.0;
		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);

		}

		return total;
	}

}
