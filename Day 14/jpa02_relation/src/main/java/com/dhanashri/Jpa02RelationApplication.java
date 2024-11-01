package com.dhanashri;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Jpa02RelationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jpa02RelationApplication.class, args);
	}
	
	@Autowired
	private EmpDao dao;

	@Override
	public void run(String... args) throws Exception {
//		Optional<Emp> eo = dao.findById(7900);
//		if(eo.isPresent()) {
//			Emp e = eo.get();
//			System.out.println("Found: " + e);
//		}
//		else
//			System.out.println("Emp Not Found");
//		 
		
		// add new emp "JOHN" in dept 40
		//create dept object with dept id or find dept from db using deptDao
//		Dept d = new Dept();
//		d.setDeptid(40);
//		//create emp object with given dept object 
//		Emp e = new Emp(1000, "JOHN", 2500.0, d);
//		//save emp object into db using EmpDao
//		e=dao.save(e);
//		System.out.println("Employee saved : " + e);
		
		//update emp "1000"
//		Dept d1 = new Dept();
//		d1.setDeptid(40);
//		
//		Emp e = new Emp(1000, "SAM", 200.0, d1);
//		e = dao.save(e);

		
		
//		Optional<Emp> eo = dao.findById(1000);
//		if(eo.isPresent()) {
//			Emp e = eo.get();
//			dao.delete(e);
//			System.out.println("Employee Deleted: " + e);
//		}
//		else
//			System.out.println("Employee Not Found.");
//		
		
		
		
		
		
	}

}
