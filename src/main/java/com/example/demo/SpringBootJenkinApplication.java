package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinApplication.class, args);
		
		System.out.println("Welcome to Spring boot project");
	}
}
