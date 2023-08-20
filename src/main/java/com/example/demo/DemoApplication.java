package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Value("${test}")
	private String test;
	@GetMapping("/")
	public String getMessage() {
		System.out.println("value of test : "+test);
		return "Hurray!! Openshift deployment is successful; value of test : "+test;
	}
	
	@PostMapping("/{name}")
	public String getMessage(@PathVariable String name) {
		System.out.println("value of test : "+test);
		return "Your name is " + name+"; value of test : "+test;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
