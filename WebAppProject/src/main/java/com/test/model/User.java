package com.test.model;

public class User {
	
	private String uname;
	private int uid;
	private String address;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String uname, int uid, String address) {
		super();
		this.uname = uname;
		this.uid = uid;
		this.address = address;
	}
	public User() {
		super();
	}
	

}
