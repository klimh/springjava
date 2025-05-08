package com.typeshit.easy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EasyApplication {
		@GetMapping("/hello")
		public String hello() {
			return "SIEMA";
		}
}
