package com.iacsd.pojo;

//DTO:Data Transfer Object
public class Account {
	//actid | name     | username | password   | balance
	
	private int actid;
	private String name,username,password;
	private double balance;
	public Account(int actid, String name, String username, String password, double balance) {
		super();
		this.actid = actid;
		this.name = name;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	public int getActid() {
		return actid;
	}
	public void setActid(int actid) {
		this.actid = actid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "actid=" + actid + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", balance=" + balance ;
	}
	

	
	
	
	
	
}
