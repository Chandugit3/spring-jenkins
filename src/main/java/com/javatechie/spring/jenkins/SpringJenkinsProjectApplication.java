package com.javatechie.spring.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsProjectApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Java";
		return "Welcome to python";
		return "Welcome to node";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsProjectApplication.class, args);
	}

}
