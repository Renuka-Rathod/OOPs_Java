package com.iacsd.study;

public class TestAutoIncrement {
public static void main(String[] args) {
	
	Student s1=new Student();//on heap:rollno
	s1.show();
	
	Student s2=new Student("Vinit", "Pune");//rollno 2
	s2.show();
	
	
	Student s3=new Student("Mohit", "Pune");//rollno 2
	s3.show();
}
}
