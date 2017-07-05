package com;

public class Employee {

	private String empId;
	private String empName;
	private double salary;
	
	SalariedEmployee se;
	

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void computeSalary() {

	}

	public void display() {
		System.out.println("Emp Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("--------------------------");
	}

}
