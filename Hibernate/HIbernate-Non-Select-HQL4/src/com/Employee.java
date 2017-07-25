package com;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@NamedQuery(query="select eb.empName,eb.empId,eb.salary,d.deptId,d.deptName,d.loc from Employee as eb,Department as d where eb.deptId=d.deptId",name="q1")
//@NamedQueries(value= {@NamedQuery(name="q2",query=""),@NamedQuery(name="q3",query="")})
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double salary;

	private int deptId;

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
