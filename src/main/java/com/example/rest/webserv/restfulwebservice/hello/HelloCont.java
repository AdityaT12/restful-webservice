package com.example.rest.webserv.restfulwebservice.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping(path = "/hello/path-variable/{name}")
	public HelloBean helloPath(@PathVariable String name) {
		return new HelloBean(String.format("Hello, %s", name));
	}
}
