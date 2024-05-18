package com.code;

public class Date {
	private int day, month, year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		super();
		this.day = 1;
		this.month = 2;
		this.year = 1990;

	}

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

	@Override
	public String toString() {
		return "Date:" + day + "/" + month + "/" + year;
	}

	// d1.equals(d2)
	@Override
	public boolean equals(Object obj) {

		System.out.println("---date class equals -----");

		// obj is Object :compiler
		// obj is holding ref of Date:dynamic

		// convert Object into Date
		//run time chk if obj holds ref of Date type
		//RTTI
		if(obj instanceof Date)
		{
		Date d = (Date) obj;// DownCasting

		if (this.day == d.day && this.month == d.month && this.year == d.year)
			return true;
		else
			return false;
		}
		else
		{
			System.out.println("---not Date Type-----");
			return false;
		}
	}

	// override Object.equals(Object obj)

}
