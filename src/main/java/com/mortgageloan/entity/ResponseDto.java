package com.mortgageloan.entity;

public class ResponseDto {

	private String message;

	public ResponseDto() {
		super();
	}

	public ResponseDto(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
