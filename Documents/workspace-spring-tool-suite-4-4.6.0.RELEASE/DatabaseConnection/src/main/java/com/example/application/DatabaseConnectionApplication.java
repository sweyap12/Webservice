package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.details")
@EntityScan("com.entity")
@EnableJpaRepositories("com.Repository")
public class DatabaseConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConnectionApplication.class, args);
	}

}
