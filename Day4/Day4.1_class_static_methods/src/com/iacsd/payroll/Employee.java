package com.iacsd.payroll;

public class Employee {
//copy per object
	private int empid;
	private String name;
	private int age;
	//single copy per class
	private static int count;
	
	public Employee()
	{
		System.out.println("---Employee Created----");
		empid=1;
		name="xyz";
		age=30;
		count++;
		
	}

	public Employee(int empid, String name, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		count++;
	}
	
	
	public static void showCount()
	{
		//only static data members accessed by static methods
		//instance(non-static) variables never get access by static methods
		//
		//how to call static methods
		//Ans:using class name
		System.out.println("Count:"+count);
	}
	
	
	
	public void show()
	{
		System.out.println("EmpId="+empid+"   Name   "+name+"   "+age+"    Count:"+count);
	}
	
}
