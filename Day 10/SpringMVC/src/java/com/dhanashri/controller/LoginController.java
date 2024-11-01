package com.dhanashri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dhanashri.entities.Customer;
import com.dhanashri.models.Credentials;
import com.dhanashri.services.CustomerServiceable;

@Controller
public class LoginController {
 
	@Autowired
	private CustomerServiceable custService;
	
	public String authenticate(Credentials cr) {
		Customer cust = custService.authenticate(cr);
		if(cust == null)
			return "failed";
		return "welcome";
		
		
		
	}
	
}
