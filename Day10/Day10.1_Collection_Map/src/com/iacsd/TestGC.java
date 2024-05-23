package com.iacsd;

public class TestGC {

	public void createStudent() {
		System.out.println("----create Student----");
		Student std1 = new Student(11, "Abc11", "Pune11");
		System.out.println(std1);
		//100

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;// local variable

		Student std = new Student(11, "Abc", "Pune");

		TestGC obj = new TestGC();

		obj.createStudent();
		
		System.gc();
		
		System.out.println("----End----");

	}

}
