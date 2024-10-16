package com.dhanashri.beans;

import com.dhanashri.daos.CustomerDao;
import com.dhanashri.entities.Customer;

public class LoginBean {
	private String email;
	private String passwd;
	private Customer cust;
	
	public LoginBean() {
		this.cust = null ;	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public void authenticate() {
		try(CustomerDao dao = new CustomerDao() ) {
		    Customer dbCust = dao.findByEmail(this.email);
			if(dbCust != null && this.passwd.equals(dbCust.getPassword()))
					this.cust = dbCust;
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
