package com.akronym.testApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApiApplication.class, args);
	}
	
	@RequestMapping("/status")
    public String healthCheck() {
        return "Akronym Secure API is up and running: Testing build pipeline 2: ELB connected : HTTPS enabled";
    }

}
