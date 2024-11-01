package com.dhanashri.dmc;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestApiClientApplication.class, args);
	}
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("RestTemplate created : " restTemplate);
		URI url = new URI();
		
		
	}

}
