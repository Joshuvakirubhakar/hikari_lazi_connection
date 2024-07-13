package com.example.hikari_lazy_initialize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HikariLazyInitializeApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(HikariLazyInitializeApplication.class, args);
	}

}
