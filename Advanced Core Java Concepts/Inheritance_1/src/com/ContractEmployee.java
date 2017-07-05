package com;

public class ContractEmployee extends Employee {

	private int noOfHorsWorked;

	public int getNoOfHorsWorked() {
		return noOfHorsWorked;
	}

	public void setNoOfHorsWorked(int noOfHorsWorked) {
		this.noOfHorsWorked = noOfHorsWorked;
	}

	public void computeSalary() {

		setSalary(3500 * noOfHorsWorked);

	}

}
