package com.basic.Oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Ha bi-bi welcome to the site";
	}
	
	

}
