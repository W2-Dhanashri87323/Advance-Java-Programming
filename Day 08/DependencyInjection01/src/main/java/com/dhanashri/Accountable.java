package com.dhanashri;

public interface Accountable {
	public int getAccNo();
	public String getType();
	public Person getAccHolder();
	
	public void setAccNo(int accNo);
	public void setType(String type);
	public void setAccHolder(Person accHolder);
	public void deposit(float amount);
	public void withdraw(float amount);
}
