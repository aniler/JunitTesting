package org.yinsol.services;

import java.util.List;

import org.yinsol.beans.Employee;
import org.yinsol.dao.EmployeeDAO;

public class EmployeeServicesImpl implements EmployeeService{
	
	private EmployeeDAO empDao;
	
	public EmployeeServicesImpl(EmployeeDAO empDao) {
		this.empDao = empDao;
	}

	public int addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}

	public Employee getEmployee(int id) {
		return empDao.getEmployee(id);
	}

	public List<Employee> getEmployees() {
		return empDao.getEmployees();
	}

	protected String getMessage(String msg){
		if(msg!=null && msg.length()>0)
		return msg;
		return null;
	}

	public void getAirports() {
		System.out.println("https://raw.githubusercontent.com/jbrooksuk/JSON-Airports/master/airports.json");
	}
	
}
