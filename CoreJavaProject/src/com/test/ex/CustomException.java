package com.test.ex;

public class CustomException extends Exception { // Chk Exception
	
	private String expCode;
	private String expMsg;
	
	public CustomException(String expCode,String expMsg){
		super(expMsg);
		this.expCode=expCode;
		this.expMsg =expMsg;
	}

	public String getExpCode() {
		return expCode;
	}

	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}

	public String getExpMsg() {
		return expMsg;
	}

	public void setExpMsg(String expMsg) {
		this.expMsg = expMsg;
	}
	
}
