package com;

// is 'A'
public class SalariedEmployee extends Employee {

	private int noOfDaysWorked;

	public int getNoOfDaysWorked() {
		return noOfDaysWorked;
	}

	public void setNoOfDaysWorked(int noOfDaysWorked) {
		this.noOfDaysWorked = noOfDaysWorked;
	}

	public void computeSalary() {
		
		setSalary(2500*noOfDaysWorked);

	}

}
