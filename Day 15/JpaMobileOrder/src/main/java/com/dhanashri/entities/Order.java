package com.dhanashri.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude= {"user","mobile"})
@Entity
@Table(name="orders")
public class Order {
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name="uid")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="mid")
	private Mobile mobile;
		

	
	
	
	
	
}
