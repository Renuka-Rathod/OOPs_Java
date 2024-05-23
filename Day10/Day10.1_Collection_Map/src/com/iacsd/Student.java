package com.iacsd;

public class Student {

	private int rollno;
	private String name, city;

	public Student(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		System.out.println("---constr Student----");
		//
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("---remove stud object----");

	}

}
