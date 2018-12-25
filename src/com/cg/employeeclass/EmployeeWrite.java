package com.cg.employeeclass;

import java.io.Serializable;

public class EmployeeWrite implements Serializable{
	private int id;
	private String employeeName;
	private double salary;
	
	public EmployeeWrite(int id, String employeeName, double salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.salary = salary;
			
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName
				+ ", salary=" + salary + "]";
	}
	
}
