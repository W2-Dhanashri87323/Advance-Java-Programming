package com.dhanashri;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp {
	@Id
	private int empno;
	private String ename;
	private double sal;
	@ManyToOne( cascade ={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="deptno")
	private Dept dept;
	
	
	public Emp() {	
	}


	public Emp(int empno, String ename, double sal, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dept = dept;
	}


	public int getEmpno() {
		return empno;
	}


	public String getEname() {
		return ename;
	}


	public double getSal() {
		return sal;
	}


	public Dept getDept() {
		return dept;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public void setDept(Dept dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
	
	
}
