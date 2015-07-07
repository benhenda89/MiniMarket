package com.minimarket.core.dao;

import java.util.List;

import com.minimarket.core.domain.Employee;

public interface EmployeeDao {
	
	public Employee create();
	
	public Employee saveEmployee(Employee employee);
	
	public void 	deleteEmployee(Employee employee);
	
	public Employee readEmployeeById(Long employeeId);
	
	public List<Employee> readAllEmployees();
}
