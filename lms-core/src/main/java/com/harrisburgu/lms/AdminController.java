package com.harrisburgu.lms;

import com.harrisburgu.lms.entity.Author;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class AdminController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public String home(){
		return "Welcome to Library Management System!";
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET, produces = "application/json")
	public Author home2(){
		return new Author();
	}
	
}
