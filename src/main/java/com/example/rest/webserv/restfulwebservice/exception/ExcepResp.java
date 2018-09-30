package com.example.rest.webserv.restfulwebservice.exception;

import java.util.Date;

public class ExcepResp {

	private Date timestamp;
	private String details;
	private String message;
	public ExcepResp(Date timestamp, String details, String message) {
		super();
		this.timestamp = timestamp;
		this.details = details;
		this.message = message;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public String getDetails() {
		return details;
	}
	public String getMessage() {
		return message;
	}
	
}
