package com.acadgild;

public  abstract class Employee {

	private int empId;
	String empName;
	int total_Leaves;
	double total_Salary;
	
	abstract void calculate_balance_leaves();
	 abstract boolean avail_leave(int no_of_leaves, char type_of_leave); 
	abstract void calculate_salary();
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}
