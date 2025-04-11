package com.Controller;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Endpoint(id="new")
public class HomeController1 {

	@ReadOperation
	public String getMes() {
		
		return "Hello I am java developer";
	}
	
public String getMesssage() {
		
		return "Welcome";
	}
	
	
}
