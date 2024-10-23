package com.example.hybe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SeventeenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeventeenApplication.class, args);
	}

}
