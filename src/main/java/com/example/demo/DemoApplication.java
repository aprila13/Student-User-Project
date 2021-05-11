package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	//Serves to localhost 8080
//	@GetMapping
//	public String hello() { //Rest endpoint
//		return "Hello World";
//	}

//	@GetMapping
//	public List<String> hello() { //Rest endpoint as an array
//		return List.of("Hello", "World");
//	}



}
