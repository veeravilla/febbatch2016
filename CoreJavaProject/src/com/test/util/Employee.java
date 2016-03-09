package com.test.util;

public class Employee implements Comparable<Employee> {

	private int eno;
	private String ename;
	private int sal;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public Employee() {
		super();
	}

	public Employee(int eno, String ename, int sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}

	public String getEname() {
		return ename;
	}
	
	

	/*@Override
	public int hashCode() {
		System.out.println(" Emp Hash Code ()");
		int hCode = eno + ename.hashCode() + sal;
		System.out.println(" HCode  :  " + hCode);
		return hCode;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println( " Equals Method   :  " + this.toString() + " vs " + obj);
		if(obj instanceof Employee){
			Employee emp = (Employee) obj;
			if(this.eno == emp.getEno())
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee : Eno " + eno + " Ename : " + ename + " Sal : " + sal;
	}*/

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public int getSal() {
		return sal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + eno;
		result = prime * result + sal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (eno != other.eno)
			return false;
		if (sal != other.sal)
			return false;
		return true;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee emp) {
		System.out.println( " Compare Method   :  " + this.toString() + " vs " + emp);
		if(this.eno > emp.getEno())
			return 1;
		else if (this.eno < emp.getEno())
			return -1;
		else 
			return 0;
	}

}
