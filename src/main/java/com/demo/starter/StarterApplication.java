package com.demo.starter;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterApplication {
	public static void main(String[] args) {

		System.setProperty("spring.devtools.restart.enabled", "true");
		SpringApplication.run(StarterApplication.class, args);
	}

}
