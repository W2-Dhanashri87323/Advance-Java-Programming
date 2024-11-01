package com.dhanashri;

import java.util.List;
import java.util.Optional;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class Jpa01OrmQueryMethodAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jpa01OrmQueryMethodAppApplication.class, args);
	}

	@Autowired
	private EmployeeDao dao;

	@Override
	public void run(String... args) throws Exception {

		// print all emp
//		List<Employee> list = dao.findAll();
//		for (Employee e : list) {
//			System.out.println(e);
//
//		}

		// get emp by id
//		int id = 7900;
//		Optional<Employee> empOpt = dao.findById(id);
//		if (empOpt.isPresent()) {
//			Employee e = empOpt.get();
//			System.out.println("Employee found with id :" + e);
//		} else {
//			System.out.println("employee not found");
//		}

//		Employee e = new Employee(5000, "Dhanashri", "Developer", 200, null, 2000.0, 500.0, 323, 5000.0);
//		e = dao.save(e);
//		System.out.println("new Employee saved :" + e);
//		

		// delete by id
//		int id1= 5000;
//		if(dao.existsById(id1)) {
//			dao.deleteById(id1);
//			System.out.println("employee deleted ");
//		}else{
//		 System.out.println("Employee not fount");
//	}

//		List<Employee> list = dao.findByNameStartsWith("M");
//		for (Employee e3 : list) {
//			System.out.println( " names starts with M : " + e3);
//		}

//		
//		  List<Employee>  list = dao.findByJob("MANAGER");
//		  for (Employee e4 : list) {
//			System.out.println( e4);
//		}

//		  List<Employee> list = dao.findByNameContaining("U");
//		  for (Employee e5 : list) {
//			System.out.println( " names containing U : " + e5);
//		}

//		List<Employee> list = dao.findByCommLessThan(8000);
//		for (Employee e6 : list) {
//			System.out.println(e6);
//		}

//		
//		List<Employee> list = dao.findBySalBetween(1000.0,2000.0);
//		for (Employee e7 : list) {
//			System.out.println(e7);
//		}

//		List<Employee> list = dao.findByJobOrderBySalDesc("SALESMAN");
//		 for (Employee e8 : list) {
//			System.out.println(e8);
//		}
//		

//		List<Employee> list = dao.findByDeptnoAndSalBetween(30, 1000.0, 2000.0);
//		for (Employee e9 : list)
//			System.out.println(e9);

		
		List<Employee> list = dao.findAll(Sort.by("name"));
		for (Employee e10 : list) {
			System.out.println(e10);
		}
			

	}

}
