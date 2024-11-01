package com.dhanashri.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@Column(name="empID")
	private int id;
	private String addr;
	private String country;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Emp emp;
	
	
	public Address() {
		
	}


	public Address(int id, String addr, String country) {
		super();
		this.id = id;
		this.addr = addr;
		this.country = country;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", addr=" + addr + ", country=" + country + "]";
	}
	
	
	
	
}
