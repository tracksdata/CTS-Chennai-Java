package com.bill;

import com.pricematrix.PriceMatrix;
import com.pricematrix.PriceMatrixImpl;
//Dependent
public class BillingImpl {
	/*
	 * Design Issues
	 * --------------
	 * 1. Toomany Dependency objs creations
	 * 		--> Per down
	 * 		--> Memory occupency
	 * Why this issue?
	 * -----------------
	 * 1. Creating a dependency obj in dependent class
	 * 		Sol --> Do not create dependency obj in dependent
	 * 			--> Insted search/locate object from other locations
	 * 			--> Using JNDI
	 * 				--> tight couple b/w java obj and jndi loc
	 * 
	 * Best Solution
	 * --------------
	 * --> Do not create, or do not find/search,
	 * 		insted ask  sone one to create/get object (IOC)
	 * --> Injecting a Dependency obj to the Dependent obj is called DI
	 * --> Use interfaces (Dependencies)
	 * 	 * 
	 * 
	 * 
	 */
	
	
	private PriceMatrix price;
	
	

	public void setPrice(PriceMatrix price) {
		this.price = price;
	}



	public double checkOut(String[] cart) {

		double total = 0.0;
		//PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);

		}

		return total;
	}

}
