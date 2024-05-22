package com.iacsd;

public class Employee {
	private int empid;
	
	private String name,city,email;
	private double salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Employee(int empid, String name, String city, String email, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.email = email;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", city=" + city + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
	
	
	
	public void calSalary( )
	{
		//BL
	}
	
	
	public void applyLeave(int days )
	{
		//BL
	}
	
	public void getBalanceLeaves( )
	{
		//BL
	}
	
	
	
	
	
	
	

}
