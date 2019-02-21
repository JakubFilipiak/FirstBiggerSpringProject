package com.jakubfilipiak.springtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringtrainingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringtrainingApplication.class, args);

	}

}

