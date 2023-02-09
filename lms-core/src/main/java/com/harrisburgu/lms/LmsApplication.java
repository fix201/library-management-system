package com.harrisburgu.lms;

import com.harrisburgu.lms.services.AdminService;
import com.harrisburgu.lms.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner {
	
	@Autowired
	AdminService adminService;

	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		adminService.getAccessLevelRepository();
	}
}
