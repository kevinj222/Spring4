package com.ust.EmployeeSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class Empcontroller 
{
	@GetMapping("/goodmorning")
	public String greeting()
	{
		return "hi sasi good morning";
	}

}
