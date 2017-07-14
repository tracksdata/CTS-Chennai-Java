package com;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1024;
	private int empId;
	private String empName;
	private double salary;

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
	
	public static void displayEmployee(List<Employee> emps) {
		System.out.println("EMpId\tEmpName\tSalary");
		System.out.println("----------------------------");
		for(Employee emp:emps) {
			System.out.print(emp.getEmpId()+"\t");
			System.out.print(emp.getEmpName()+"\t");
			System.out.print(emp.getSalary());
			System.out.println();
		}
		System.out.println("----------------------------");
	}

}
