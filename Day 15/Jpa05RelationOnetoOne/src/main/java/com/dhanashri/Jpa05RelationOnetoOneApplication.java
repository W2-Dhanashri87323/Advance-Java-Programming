package com.dhanashri;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dhanashri.entities.Emp;
import com.dhanashri.interfaces.EmployeeDaoable;

@SpringBootApplication
public class Jpa05RelationOnetoOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Jpa05RelationOnetoOneApplication.class, args);
	}

	@Autowired
	private EmployeeDaoable daoable;

	@Override
	public void run(String... args) throws Exception {

		int choice, empno;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("==========MENU DRIVEN==========");
			System.out.println("1.Find By Id");

			System.out.print("\nEnter your choice ::");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("\t\t*********Find By Id**********");
				System.out.print("Enter empno ::");
				empno = sc.nextInt();
				
				 Optional<Emp> var = daoable.findById(empno);
				 Emp emp = var.orElse(null);
				 if(emp!=null) {
					 System.out.println("Employee found....");
					 System.out.println(emp);
				 }else {
					 System.out.println("Employee not found!");
				 }
				 
				break;
				
			case 2:
				
				
				break;
				
				

			default:
				System.out.println("Exiting code....");
				System.exit(1);

				break;
			}

		}

	}

}
