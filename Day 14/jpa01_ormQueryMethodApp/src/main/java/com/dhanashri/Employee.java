package com.dhanashri;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@Column(name = "empno")
	private int id;

	@Column(name = "ename")
	private String name;
	private String job;
	private Integer mgr;
	@Temporal(TemporalType.DATE)
	private Date hire;
	private double sal;
	private Double comm;
	private int deptno;
	@Transient
	private Double income;

	public Employee() {

	}

	public Employee(int id, String name, String job, Integer mgr, Date hire, double sal, Double comm, int deptno,
			Double income) {
		
		this.id = id;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hire = hire;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
		this.income = income;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public Date getHire() {
		return hire;
	}

	public double getSal() {
		return sal;
	}

	public Double getComm() {
		return comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public Double getIncome() {
		return income;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public void setHire(Date hire) {
		this.hire = hire;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", job=" + job + ", mgr=" + mgr + ", hire=" + hire + ", sal="
				+ sal + ", comm=" + comm + ", deptno=" + deptno + ", income=" + income + "]";
	}

}