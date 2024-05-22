package com.customException;

public class Customer {
	private int custId;
	private String name;
	private String email;
	private int age;//18 70   
	public Customer(int custId, String name, String email, int age) {
		super();
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

	
	
	
}
