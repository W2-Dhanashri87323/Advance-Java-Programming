package com.dhanashri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan("com.config") //Annotation configuration
@ImportResource("bean.xml") // xml config
@SpringBootApplication
public class DependencyInjection01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjection01Application.class, args);
	}

	@Autowired
	private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		Personable obj = (Personable) context.getBean("p1");
		System.out.println("Person Data ::" + obj);

		Accountable accObj = (Accountable) context.getBean("acc");
		System.out.println("Account Data ::" + accObj);
		
		Personable person = (Personable) context.getBean("pers1");
		System.out.println("Annotation Person ::" + person);
		

	}
}
