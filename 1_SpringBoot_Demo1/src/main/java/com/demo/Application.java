package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@RequestMapping("/")
	public String load() {
		return "<h1><center> Welcome to Spring Boot class </center></h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
