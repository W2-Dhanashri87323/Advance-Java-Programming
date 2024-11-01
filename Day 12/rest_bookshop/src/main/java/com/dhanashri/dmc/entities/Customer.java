package com.dhanashri.dmc.entities;

import java.sql.Date;

public class Customer {
    private int id;
    private String name;
	private String password;
    private String email;
    private String address;
	private String mobile;
	private Date birth; 
	
	public Customer() {
	}

	public Customer(int id, String name, String password, String email, String address, String mobile, Date birth) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.birth = birth;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getMobile() {
		return mobile;
	}

	public Date getBirth() {
		return birth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", address="
				+ address + ", mobile=" + mobile + ", birth=" + birth + "]";
	}

}
