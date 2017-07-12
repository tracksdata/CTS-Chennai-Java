package com;
class C1{
	
}

class Employee{
	
	public void getEmpInfo() {
		System.out.println("--- empInfo");
	}
	
}

class Dept<T> extends Employee{
	
	
	public  T getEmpObj() {
		Employee emp=new  Dept();
		return (T) emp;
	}
	
	public void getDeptInfo() {
		System.out.println("--- dept info");
	}
}


public class Test {
	
	public static void main(String[] args) {
		
		Dept<Employee> dept=new Dept();
		Employee emp=(Employee) dept.getEmpObj();
		emp.getEmpInfo();
		Dept d=(Dept) dept.getEmpObj();
		d.getDeptInfo();
		d.getEmpInfo();
		
		
		
		//Dept d=(Dept)Dept.getEmpObj();
		
		//d.getDeptInfo();
		
		
	}
	

}
