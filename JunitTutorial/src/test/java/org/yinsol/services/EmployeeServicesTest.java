package org.yinsol.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.yinsol.beans.Employee;
import org.yinsol.dao.EmployeeDAO;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class EmployeeServicesTest {
	private EmployeeService employeeService;
	
	@Mock
	private EmployeeDAO employeemock;
	
	@Before
	public   void setUp(){
		 MockitoAnnotations.initMocks( this );
		employeeService=new EmployeeServicesImpl(employeemock);
	}
	
	@Test
	public void testaddEmployee(){
		Employee emp=new Employee(1,"Anil Kumar", 15000.00f);
		/*when(employeemock.addEmployee(emp)).thenReturn(1);
		when(employeemock.addEmployee(null)).thenReturn(0);
		assertEquals(1, employeeService.addEmployee(emp));
		assertNotEquals(1, employeeService.addEmployee(null));
		assertEquals(0, employeeService.addEmployee(null));
		System.out.println(verify(employeemock).addEmployee(emp));*/
		when(employeemock.addEmployee(emp)).thenReturn(1);
		when(employeemock.addEmployee(null)).thenReturn(0);
		assertEquals(1, employeeService.addEmployee(emp));
	}
	
	@Test
	public void testgetEmployee(){
		when(employeemock.getEmployee(1)).thenReturn(new Employee(1,"Anil Kumar", 15000.00f));
		assertEquals(new Employee(1,"Anil Kumar", 15000.00f).getEmpid(), 1);
		assertNotEquals(new Employee(1,"Anil Kumar", 15000.00f).getEmpid(), null);
	}
	
	@Test
	public void testgetEmployees(){
		List<Employee> list=new ArrayList();
		list.add(new Employee(1,"Anil Kumar", 15000.00f));
		list.add(new Employee(2,"Mayur Bhole", 15000.00f));
		list.add(new Employee(2,"Neeraj", 15000.00f));
		when(employeemock.getEmployees()).thenReturn(list);
		//assertEquals();
	}
	
	@Test
	public void testgetMessage(){
		EmployeeServicesImpl employee=new EmployeeServicesImpl(employeemock);
	}
	
	
	
	
	@After
	public   void tareDown(){
		employeeService=null;
	}
	

}
