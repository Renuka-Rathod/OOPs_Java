package com.code.set1;

public class Employee {
	
	private String empid;
	private String name;
	private double salary;
	public Employee(String empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee(String empid)
	{
		this.empid=empid;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public int hashCode() {
		System.out.println("---hashcode----");
		 return empid.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("---equals----");
		//RTTI
		
		if(obj instanceof Employee)
		{
			Employee emp=(Employee)obj;
			
			return this.empid.equals(emp.empid);
		}
		else
			return false;
	}
	
	
	
	
	
	
	

}
