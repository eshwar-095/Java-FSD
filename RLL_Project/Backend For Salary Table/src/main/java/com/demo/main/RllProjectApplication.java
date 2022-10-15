package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.main")
public class RllProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RllProjectApplication.class, args);
	}
}
