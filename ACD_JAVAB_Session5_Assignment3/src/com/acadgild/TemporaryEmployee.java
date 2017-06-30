package com.acadgild;

public class TemporaryEmployee extends Employee {

	private int paid_Leave,sick_Leave,casual_Leave;
	double basic,pfa,hra;
	Employee emp;
	
	public TemporaryEmployee(){
		
	}
	public TemporaryEmployee(int paid,int sick,int casual,double basic,Employee emp) {
		
		this.paid_Leave=paid;
		this.sick_Leave=sick;
		this.casual_Leave=casual;
		this.emp=emp;
		emp.setEmpId(111);
		emp.setEmpName("Sunil");
		this.basic=basic;
		this.hra=(0.5)*basic;
		this.pfa=(0.12)*basic;
	}
	@Override
	void calculate_balance_leaves() {
		
		
	}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		// TODO Auto-generated method stub
		return false; 
	}
	@Override
	void calculate_salary() {
	
		this.emp.total_Salary=this.basic+this.hra-this.pfa;
		
		System.out.println("*********Salary of Employee "+this.emp.getEmpId()+"|"+this.emp.getEmpName()+" is "+this.emp.total_Salary);
	}
	
	public static void main(String[] args){
		
		Employee emp=new TemporaryEmployee(10, 10, 10, 30.5,new TemporaryEmployee());
		emp.calculate_salary();
	}

}
