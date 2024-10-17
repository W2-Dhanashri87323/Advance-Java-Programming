package com.dhanashri;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class HelloWorld implements CommandLineRunner {
    public static void main(String[] args) {
     SpringApplication.run(HelloWorld.class);	
    }
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot !!");
		int a = 10;
		int b = 20;
		int add = a+b;
		System.out.println("Addition :" + add);
		
	}

}