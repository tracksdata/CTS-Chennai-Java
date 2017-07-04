package com;

import java.io.PrintStream;

public class Test {
	
	
	
	/*
	 * static
	 * --------
	 * used toi share properties data to all the objects
	 * use: --> used to share common data like managerName to all objs
	 * 
	 * note: static data shoub be accessed in a static way
	 * 	--> non-static data not available directly to the  static methods.
	 *  --> you need a obj to access or modify non static data in a static method
	 *  ------------------------------------
	 *  
	 *  non static/ instance
	 *  -------------------------
	 *  used to define properties which are unique to each object
	 *  use: same property can be set to different objects with diffrent data. (no sharing)
	 *  
	 *  Note:
	 *  ------
	 *  non static methods allow you to access non static and static data directly.
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	int y;
	static int x=1000;
	
	void myOperations() {
		x=2000;
		y=200;
		Employee emp;
		emp = new Employee();
		Employee emp1 = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("Ozvitha");
		emp.setSalary(38384);

		emp1.setEmpId(11);
		emp1.setEmpName("Rudhira");
		emp1.setSalary(1234);
		
		emp.display();
		emp1.display();
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.myOperations();
		
		t.y=2000;

		/*
		 * System.out.println(emp.getEmpId()); System.out.println(emp.getEmpName());
		 * System.out.println(emp.getSalary());
		 */

		/*
		 * System.out.println("--------------------");
		 * System.out.println(emp1.getEmpId()); System.out.println(emp1.getEmpName());
		 * System.out.println(emp1.getSalary());
		 */

	}

}
