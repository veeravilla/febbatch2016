package com.test.oops;

public class Employee {
	
	private int eno;
	private String ename;
	private double salary;
	
	public void setEno(int eno){
		//B.L
		this.eno=eno;
	}
	
	public int getEno(){
		return eno;
	}
	
	
	public boolean equals(Object obj) {
		System.out.println(" Equals Method () ... ");
		if(obj instanceof Employee){
			Employee emp = (Employee) obj;
			if(eno == emp.getEno())
				return true;
		}
		
		return false;
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getTax(){
		double tax = salary*0.3;
		System.out.println(" Tax Amount : " + tax);
		return tax;
	}
	
	public void printPayStub(){
		System.out.println(" Eno : " + eno + " Ename " + ename +
				" Salary " + salary + " Tax : " + getTax()) ;
	}

	public void printPayStub(int taxRate){
		System.out.println(" Eno : " + eno + " Ename " + ename +
				" Salary " + salary + " Tax : " + (salary*taxRate)/100 ) ;
	}

	
	public Employee() {
		//super();
	}

	public Employee(int eno) {
		super();
		this.eno = eno;
	}

	public Employee(int eno, String ename, double salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

}
