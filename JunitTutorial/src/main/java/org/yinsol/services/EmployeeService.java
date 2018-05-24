package org.yinsol.services;

import java.util.List;

import org.yinsol.beans.Employee;

public interface EmployeeService {
	
	public int addEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getEmployees();
	public void getAirports();
	
}
