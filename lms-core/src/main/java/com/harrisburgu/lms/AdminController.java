package com.harrisburgu.lms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public String home(){
		return "Welcome to Library Management System!";
	}
	
}
