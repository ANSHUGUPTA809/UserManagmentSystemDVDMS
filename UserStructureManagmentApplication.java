package com.UserStructure;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication

@ComponentScan("com.UserStructure")
public class UserStructureManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserStructureManagmentApplication.class, args);
	}

}
