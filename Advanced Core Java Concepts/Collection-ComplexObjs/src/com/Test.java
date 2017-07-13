package com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortByDob implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp2.getDob().compareTo(emp1.getDob());
	}
	
}
public class Test {

	public static void main(String[] args) {
		
		
		/*Address addr1=new Address();
		Address addr2=new Address();
		
		addr1.setAddrType("Present");
		addr1.setAddress("#10/D/1,Chennai");
		
		addr2.setAddrType("Parmanent");
		addr2.setAddress("#10-10/1,H/K2,GOA");*/
		
		Calendar cl1=Calendar.getInstance();
		cl1.set(1987, 8-1, 30);
		
		Calendar cl2=Calendar.getInstance();
		cl2.set(1987, 8-1, 12);
		
		Calendar cl3=Calendar.getInstance();
		cl3.set(1987, 4-1, 12);
		
		Calendar cl4=Calendar.getInstance();
		cl4.set(1981, 2-1, 15);
		
		Calendar cl5=Calendar.getInstance();
		cl5.set(1989, 6-1, 19);
		
		
		/*List<Address> addrs=new ArrayList<>();
		addrs.add(addr1);
		addrs.add(addr2);
		
		e1.setAddrs(addrs);
		
		//e1.getAddrs().add(addr1);
		//e1.getAddrs().add(addr2);
		
		Employee.displayEmp(e1);*/
		
		
		Employee e1=new Employee(14, "Zera", 35000,cl1);
		Employee e2=new Employee(18, "Kara", 18000,cl2);
		Employee e3=new Employee(12, "Azta", 17000,cl3);
		Employee e4=new Employee(17, "Bita", 12000,cl4);
		Employee e5=new Employee(10, "Cyta", 23000,cl5);
		
		List<Employee> emps=new ArrayList<>();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		System.out.println("---- Original Data ----");
		Employee.display(emps);
		System.out.println("---- Sort by EmpId ----");
		
		Collections.sort(emps,new Employee());
		
		Employee.display(emps); // SOrt by Id
		
		
		
		
		System.out.println("---- Sort by EMpName ----");
		
		Collections.sort(emps,new Employee());
		
		Employee.display(emps); // SOrt by Name
		
		
		System.out.println("---- Sort by Salary ----");
		
		Collections.sort(emps,new Comparator<Employee>() {
		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return (int) (emp1.getSalary()-emp2.getSalary());
		}
		
		});
		
		Employee.display(emps); // SOrt by Salary
		
		
		System.out.println("---- Sort by DOB ----");
		
		Collections.sort(emps,new SortByDob());
		
		Employee.display(emps); // SOrt by DOB
		
		
		
		
	}
}
