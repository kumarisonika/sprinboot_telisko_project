package com.telisko.telisko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeliskoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TeliskoApplication.class, args);

		Dev obj = context.getBean(Dev.class);

	}
}