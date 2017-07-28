package com;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int empId;
	private String empName;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Department dept) {
		this.dept = dept;
	}

	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
