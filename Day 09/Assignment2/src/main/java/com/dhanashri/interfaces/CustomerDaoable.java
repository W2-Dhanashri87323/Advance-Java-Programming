package com.dhanashri.interfaces;

import java.util.List;

import com.dhanashri.entities.Customer;


public interface CustomerDaoable {
	public List<Customer> findAllCustomer();
	public Customer findByEmail(String email);
	public int save(Customer c);
}