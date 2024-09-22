package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOMEMSG")
public interface FeignClientInterface {
	
	@GetMapping("/welcome")
	public String getwelcomeMsg();
	

}
