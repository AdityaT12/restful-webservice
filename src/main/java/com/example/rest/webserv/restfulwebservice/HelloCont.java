package com.example.rest.webserv.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCont {

	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping(path = "/hello-bean")
	public HelloBean helloBean() {
		return new HelloBean("Hello");
	}
}
