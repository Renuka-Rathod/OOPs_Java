package com.pojos;

public class Customer {
	
	// custid | custname | email           | password   | age
	private int custid;
	private String custName,email,password;
	private int age;
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(int custid, String custName, String email, String password, int age) {
		super();
		this.custid = custid;
		this.custName = custName;
		this.email = email;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custName=" + custName + ", email=" + email + ", password=" + password
				+ ", age=" + age + "]";
	}
	

}
