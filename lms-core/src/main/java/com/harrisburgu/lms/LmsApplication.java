package com.harrisburgu.lms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LmsApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(LmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
