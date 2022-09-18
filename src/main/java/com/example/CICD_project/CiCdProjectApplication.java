package com.example.CICD_project;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class CiCdProjectApplication {


	@RequestMapping("/")
	String home() {
		return "Hello Continuous Delivery!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CiCdProjectApplication.class, args);
	}

}