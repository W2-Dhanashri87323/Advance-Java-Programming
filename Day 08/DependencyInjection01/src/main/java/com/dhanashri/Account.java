package com.dhanashri;

public class Account implements Accountable {
	private int accNo;
	private String type;
	private float balance;
	private Person accHolder;
	
	public Account() {
		
	}

	public Account(int accNo, String type, float balance, Person accHolder) {
		this.accNo = accNo;
		this.type = type;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getType() {
		return type;
	}

	public float getBalance() {
		return balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", type=" + type + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	@Override
	public void deposit(float amount) {
		balance = balance + amount;
	
	}

	@Override
	public void withdraw(float amount) {
		balance = balance - amount;
	}

	

}
