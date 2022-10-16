package com.example.libdemo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = {
//		"com.example.libdemo.service",
//		"org.example.libdemo.lib.service"
//})
@SpringBootApplication
@ComponentScan(basePackages = {
		"com.example.libdemo.service",
		"org.example.libdemo.lib.service"
})
@ConfigurationPropertiesScan
public class LibdemoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibdemoServiceApplication.class, args);
	}

}
