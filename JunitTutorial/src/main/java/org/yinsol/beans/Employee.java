package org.yinsol.beans;

public class Employee {
	private int empid;
	private String name;
	private float salary;
	
	
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary="
				+ salary + "]";
	}
	
	

}
