package com.example.hibernatetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HibernatetestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatetestApplication.class, args);
	}

}
