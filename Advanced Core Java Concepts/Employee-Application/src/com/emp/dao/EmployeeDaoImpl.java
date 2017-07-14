package com.emp.dao;

import java.util.List;

import com.Employee;
import com.emp.utils.EmployeeUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveEmployee(Employee emp) {

		List<Employee> emps = EmployeeUtil.getEmpList();

		return emps.add(emp);
	}

	@Override
	public List<Employee> listEmps() {

		List<Employee> emps = EmployeeUtil.getEmpList();
		return emps;
	}

}
