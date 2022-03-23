package com.springbootrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootRestApplication.class);
		// ... customize application settings here
		application.run(args);
	}
}
