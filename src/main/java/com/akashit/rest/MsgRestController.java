package com.akashit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/")
	public String sayHi () {
		return "Hi, How are you man";
	}

}
