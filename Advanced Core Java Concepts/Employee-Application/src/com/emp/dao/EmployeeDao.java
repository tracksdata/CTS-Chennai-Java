package com.emp.dao;

import java.util.List;

import com.Employee;

public interface EmployeeDao {

	boolean saveEmployee(Employee emp);

	List<Employee> listEmps();

}