package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private final GreetingService greetingService;

	public DemoApplication(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	@Autowired
	private HelloService helloService; //wstrzykujemy HelloService

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(greetingService.great());
	}

}