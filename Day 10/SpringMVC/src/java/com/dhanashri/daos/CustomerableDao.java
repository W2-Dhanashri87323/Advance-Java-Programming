package com.dhanashri.daos;

import com.dhanashri.entities.Customer;

public interface CustomerableDao {
	Customer findByEmail(String email);
	int save(Customer c);

}
