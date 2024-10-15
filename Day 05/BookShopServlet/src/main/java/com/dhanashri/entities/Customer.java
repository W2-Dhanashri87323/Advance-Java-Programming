package com.dhanashri.entities;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private Date birth;
	private String address;
	
	public Customer() {
	}

	public Customer(int id, String name,String email, String password, String mobile , Date birth ,String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.birth = birth;
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getMobile() {
		return mobile;
	}

	public Date getBirth() {
		return birth;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + ", birth=" + birth + ", address=" + address + "]";
	}

}
