package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
	
	@GetMapping(value="test")
	public String test() {
		return "AuthorsApp working very fine!";
	}	

}
