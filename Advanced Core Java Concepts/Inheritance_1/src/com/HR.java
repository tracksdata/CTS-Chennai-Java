package com;

public class HR {
	
	/*
	 * Notes
	 * ------
	 * 
	 * 1. A Super class reference can store/hold all its sub class
	 *     Objects, vice-versa not possible
	 *     
	 * 2. The reference of super class can be used to access all the
	 *     methods from super class and overridden methods from
	 *     sub class (a method which is available both super and sub
	 *     
	 * 3. The reference of super class cannot be used to access the 
	 *    individual methods of a sub class (a method which is 
	 *    available in subclass but not in super class)
	 * 
	 *            
	 *     
	 */

	public static void main(String[] args) {

		/*SalariedEmployee se = new SalariedEmployee();
		se.setEmpId("EMp001");
		se.setEmpName("James");
		se.setNoOfDaysWorked(22);

		se.computeSalary();
		se.display();

		ContractEmployee ce = new ContractEmployee();
		ce.setEmpId("Con001");
		ce.setEmpName("Praveen");
		ce.setNoOfHorsWorked(30);

		ce.computeSalary();
		ce.display();*/
		
		Employee emp;
		emp=new SalariedEmployee();
		
		//emp.se
		
		
		

	}

}
