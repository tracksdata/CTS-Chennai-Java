package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	// forward declaration --> has 'A'
	private Department dept;
	private Project proj;

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}

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

	public void display() {
		System.out.println("Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Dept Id: " + dept.getDeptId());
		System.out.println("Dept Name: " + dept.getDeptName());
		System.out.println("Location: " + dept.getLoc());
		System.out.println("----------------------------------------");

	}

}
