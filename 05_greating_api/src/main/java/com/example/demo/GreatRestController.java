package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatRestController {
	@Autowired
	public FeignClientInterface fi;
	
	@GetMapping("/greating")
	public String getGreating() {
		return "This is Greting msg!!!!";
	}
	
	@GetMapping("/greating1")
	public String msg() {
		
		String getwelcomeMsg = fi.getwelcomeMsg();
		return "This is Greting msg!!!!"+getwelcomeMsg;
	}

	
	
}
