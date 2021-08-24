package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/")
	public String all() {
		return "Welcome";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin";
	}
	@GetMapping("/user")
	public String getAllUsers(){
		return "Welcome User";
	}

}
