package com.dhanashri.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@ToString(exclude = "orderList")


@Entity
@Table(name="users")
public class User {
	@Id
	private int id;
	@Column(name="uname")
	private String name;
	private String email;
	private String password;
	private String mobile;
	
	@OneToMany(mappedBy = "user")
	private List<Order> orderList;
	
	
	
	
	
	
	

}
