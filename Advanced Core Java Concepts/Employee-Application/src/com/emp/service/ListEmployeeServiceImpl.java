package com.emp.service;

import java.util.List;

import com.Employee;
import com.emp.dao.EmployeeDao;
import com.emp.dao.EmployeeDaoImpl;

public class ListEmployeeServiceImpl implements ListEmployeeService {

	private EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public List<Employee> listEmps() {

		return empDao.listEmps();
	}

}
