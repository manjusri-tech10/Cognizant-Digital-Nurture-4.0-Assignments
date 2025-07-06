package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		System.out.println("=========== Starting SpringLearnApplication ===========");
		SpringApplication.run(SpringLearnApplication.class, args);

		LOGGER.info("Inside main() - Application started successfully");

		System.out.println(">>> Application is running on http://localhost:8080");
		System.out.println(">>> You can start adding your controllers and services now.");
		System.out.println("=========== SpringLearnApplication Booted ===========");
	}
}
