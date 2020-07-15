package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("In the index method...");
		return "Hello From Spring Boot...";
	}

}
