package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dhanashri.Account;
import com.dhanashri.Person;

@Configuration
public class AppConfig {
	
	@Bean
	public Person pers1() {
		Person p = new Person("Sakshi",23,"20202020");
		return p;

	}
	
	public Account acc1() {
		Account ac = new Account(1,"Rajvardhan",345.6f,pers1());
		return ac;
	}
	
	
	
}
