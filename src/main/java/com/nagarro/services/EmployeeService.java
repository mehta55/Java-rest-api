package com.nagarro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.dao.EmployeeDao;
import com.nagarro.dto.Employee;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeDao empdao; 

	public List<Employee> getEmployees() {
		return empdao.getEmployees();
	}

	public Employee getEmployee(int empCode) {
		return empdao.getEmployee(empCode);
	}

	public boolean uploadEmployee(Employee emp) {
		empdao.addEmployee(emp);
		return true;
	}

	public boolean updateEmployee(Employee emp) {
		
		empdao.updateEmployee(emp);
		return true;
	}

	public boolean deleteEmployee(int empCode) {
		
		Employee emp = getEmployee(empCode);

		if (emp != null) {
			empdao.deleteEmployee(emp);
			return true;
		} else {
			return false;
		}

	}

}
