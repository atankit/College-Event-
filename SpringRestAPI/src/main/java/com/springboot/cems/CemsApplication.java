package com.springboot.cems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.springboot.cems")
@EnableAutoConfiguration
public class CemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CemsApplication.class, args);
	}

}
