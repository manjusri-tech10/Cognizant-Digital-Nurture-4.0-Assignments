package com.example.spring_data_jpa_quick_example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class SpringDataJpaQuickExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaQuickExampleApplication.class, args);
	}
	@Bean
	public CommandLineRunner runOnStartup() {
		return args -> {
			System.out.println("✅ Spring Boot App Started Successfully!");
			System.out.println("Initializing...");
		};
	}
}
