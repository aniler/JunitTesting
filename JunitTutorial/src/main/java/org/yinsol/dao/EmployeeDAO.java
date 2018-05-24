package org.yinsol.dao;

import java.util.List;

import org.yinsol.beans.Employee;

public interface EmployeeDAO {
	public int addEmployee(Employee employee);
	public Employee getEmployee(int id);
	public List<Employee> getEmployees();
	
}
