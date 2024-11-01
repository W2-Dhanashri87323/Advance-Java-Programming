package com.dhanashri.services;

import com.dhanashri.entities.Customer;
import com.dhanashri.models.Credentials;

public interface CustomerServiceable {
	
	 Customer authenticate(Credentials cr);

}
