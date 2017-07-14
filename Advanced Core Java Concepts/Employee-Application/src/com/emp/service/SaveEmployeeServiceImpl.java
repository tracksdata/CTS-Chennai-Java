package com.emp.service;

import com.Employee;
import com.emp.dao.EmployeeDao;
import com.emp.dao.EmployeeDaoImpl;

public class SaveEmployeeServiceImpl implements SaveEmployeeService {
	private EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public boolean saveEmployee(Employee emp) {

		return empDao.saveEmployee(emp);
	
	}

}
