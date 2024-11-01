package com.dhanashri.daos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dhanashri.entities.Customer;

@Repository
public class CustomerDao implements CustomerableDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Customer findByEmail(String email) {
		String sql = "SELECT * FROM customers WHERE email = ? ";
		List<Customer> list = jdbcTemplate.query(sql, custRowMapper,email );
		return list.isEmpty() ? 
		
		
	}

	@Override
	public int save(Customer c) {
	
	}
	

}
