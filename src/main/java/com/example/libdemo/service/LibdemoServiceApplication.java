package com.example.libdemo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class LibdemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibdemoServiceApplication.class, args);
	}

}
