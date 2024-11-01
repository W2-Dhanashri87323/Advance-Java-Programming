package com.dhanashri;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	List<Employee> findByNameStartsWith(String prefix);

	List<Employee> findByJob(String job);

	List<Employee> findByNameContaining(String name);

	List<Employee> findByCommLessThan(double i);

	List<Employee> findBySalBetween(double d, double e);

	List<Employee> findByJobOrderBySalDesc(String string);

	List<Employee> findByDeptnoAndSalBetween(int i, double d, double e);

}
