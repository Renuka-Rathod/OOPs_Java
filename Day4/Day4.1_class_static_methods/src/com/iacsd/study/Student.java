package com.iacsd.study;

public class Student {

	
	//instance variable
	private int rollno;
	private String name,city;
	
	//class variable:single copy per class
	private static int rollCounter ;
	
	//static block
	static
	{
	System.out.println("static block----only used for static----");	
		rollCounter=100;
		
	}
	
	
	
	
	
	public Student()
	{
		System.out.println("------default-----\n");
		rollCounter=rollCounter+1;//1
		rollno=rollCounter;
		name="sham";
		city="pune";
		
	}

	public Student(String name, String city) {
		System.out.println("------parameter-----\n");
		
		rollCounter=rollCounter+1;//2
		rollno=rollCounter;
		this.name = name;
		this.city = city;
	}
	
	public void show()
	{
		System.out.println(rollno+"   "+name+"    "+city);
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

	public int getRollno() {
		return rollno;
	}
	
	
	
	
}
