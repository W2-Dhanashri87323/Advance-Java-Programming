package com.dhanashri.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
@ToString(exclude = "addr")

@Entity
@Table(name="emp")
public class Emp {
	@Id
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hire;
	private Double sal;
	private Double comm;
	private int deptno;
	
	@OneToOne(mappedBy = "emp")
	private Address addr;
	
	
	

}
