package com.test.jdbc;

public class StudentDTO {

	private int sno;
	private String sname;
	private int fee;
	private String course;
	private String zipCode;

	public StudentDTO() {
		super();
	}

	public StudentDTO(int sno, String sname, int fee, String course, String zipCode) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.fee = fee;
		this.course = course;
		this.zipCode = zipCode;
	}

	public int getSno() {
		return sno;
	}

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", sname=" + sname + ", fee=" + fee + ", course=" + course + ", zipCode="
				+ zipCode + "]";
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
