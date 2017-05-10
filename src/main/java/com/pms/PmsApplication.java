package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration @SpringBootApplication
@ComponentScan(basePackages = "com.pms")
public class PmsApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(PmsApplication.class, args);
	}
}

