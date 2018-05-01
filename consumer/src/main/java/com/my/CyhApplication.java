package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "controller;service")
public class CyhApplication {

	public static void main(String[] args) {
		SpringApplication.run(CyhApplication.class, args);
	}
}
