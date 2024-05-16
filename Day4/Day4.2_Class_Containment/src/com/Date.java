package com;
//byDefault:java.lang.Object is parent
public class Date {

	private int day,month,year;

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Date(int day, int month, int year) {
		 
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
	 
		this.day = 1;
		this.month = 2;
		this.year = 2000;
		
		
	}
	
	//public String toString() :Object class 
	//Overriding:same fun name and same signature,same return type
	//as parent class method
	
	//Date class is overriding Object class toString()
	
	public String toString()
	{
		//System.out.println("---Date Class toString()----");
		return "My Date :"+day+"/"+month+"/"+year;
	}
	
	
	
	
	
	
}
