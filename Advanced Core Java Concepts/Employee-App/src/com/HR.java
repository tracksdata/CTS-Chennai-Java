package com;

public class HR {

	public static void main(String[] args) {
		
		Project proj=new Project();
		proj.setProdId("FORD001");
		proj.setProjName("FORD-Internal");
		proj.setCustomer("FORD");
		proj.setLoc("Hyderabad");
		
		
		Department dept=new Department();
		dept.setDeptId(1);
		dept.setDeptName("HR");
		dept.setLoc("Chennai");
		
		Employee emp=new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("james");
		emp.setSalary(348384);
		
		emp.setDept(dept);
		emp.setProj(proj);
		
		
		emp.display();
		emp.getProj().projInfo();
		
		
		
		
	}
}
