package com.nagarro.dao;

import java.util.List;

import com.nagarro.dto.Employee;

public interface EmployeeDao {

	public List<Employee> getEmployees();
	
	public Employee getEmployee(int empCode);

	public Employee addEmployee(Employee emp);

	public void deleteEmployee(Employee emp);

	public void updateEmployee(Employee emp);
}
