package com.example.rest.webserv.restfulwebservice.hello;

public class HelloBean {

	private String message;
	public HelloBean(String message) {
		this.message = message;
		
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return String.format("HelloBean [message=%s]", message);
	}
	public String getMessage() {
		return message;
	}

}