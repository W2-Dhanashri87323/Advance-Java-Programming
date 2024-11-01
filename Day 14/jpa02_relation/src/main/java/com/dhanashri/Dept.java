package com.dhanashri;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Dept {
	@Id
	@Column(name="deptno")
	private int deptid; 
	private String dname;
	private String loc;
	
	public Dept() {
		
	}

	public Dept(int deptid, String dname, String loc) {
		super();
		this.deptid = deptid;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptid() {
		return deptid;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", dname=" + dname + ", loc=" + loc + "]";
	}

	
}
