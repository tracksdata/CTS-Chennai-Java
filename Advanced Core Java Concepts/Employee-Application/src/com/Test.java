package com;

import java.util.List;
import java.util.Scanner;

import com.emp.service.ListEmployeeService;
import com.emp.service.ListEmployeeServiceImpl;
import com.emp.service.SaveEmployeeService;
import com.emp.service.SaveEmployeeServiceImpl;
import com.emp.utils.EmployeeUtil;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {

			System.out.println("MENU");
			System.out.println("---------");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Update Employee");
			System.out.println("6. Backup Records");
			System.out.println("7. Restore Records");
			System.out.println("8. Exit");
			System.out.println("Enter a Choice: ");

			choice = sc.nextInt();
			ListEmployeeService listEmp = new ListEmployeeServiceImpl();
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				System.out.println("Enter id,name and salary");
				emp.setEmpId(sc.nextInt());
				emp.setEmpName(sc.nextLine());
				emp.setSalary(sc.nextDouble());

				SaveEmployeeService saveEmp = new SaveEmployeeServiceImpl();
				boolean status = saveEmp.saveEmployee(emp);
				if (status)
					System.out.println("Employee Saved to DB");
				else {
					System.out.println("Some issue while Saving");
				}

				break;
			case 2:

				List<Employee> emps = listEmp.listEmps();
				if (emps.size() != 0)
					Employee.displayEmployee(emps);
				else
					System.out.println("No Records to Display");

				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				EmployeeUtil.backUpRecords(listEmp.listEmps());

				break;
			case 7:
				List<Employee> recoredObjects = EmployeeUtil.restoreRecords();
				Employee.displayEmployee(recoredObjects);
				emps = EmployeeUtil.getEmpList();
				for (Employee e : recoredObjects) {
					emps.add(e);
				}

				break;
			case 8:
				System.out.println("Thank you. Visit again");
				System.exit(0);
			default:
				System.out.println("Invalid Choice: ");

			}

		} // end of while

	}

}
