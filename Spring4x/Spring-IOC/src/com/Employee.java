package com;

public class Employee {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- GC got EMployee Object ");
	}
	
	public Employee() {
		System.out.println("---- Employee Object Created "+this.hashCode());
	}

	public void info() {
		System.out.println("Hash Code: "+this.hashCode());
	}
	private int empId;
	private String empName;
	private double price;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
