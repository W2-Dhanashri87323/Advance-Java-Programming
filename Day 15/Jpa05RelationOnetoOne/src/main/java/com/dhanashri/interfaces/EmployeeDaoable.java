package com.dhanashri.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhanashri.entities.Emp;


public interface EmployeeDaoable extends JpaRepository<Emp, Integer> {
	

}
