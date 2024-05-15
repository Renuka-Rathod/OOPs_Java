package tester;

import pkg1.Student;

public class TestStudent {

	public static void main(String[] args) {

		// Student.class get loaded by JVm
		// metadata is geting loaded in method area

		Student std1;
		// allocate memory on heap using new

		std1 = new Student();
		std1.showStudent();

		std1.assignStudent(101, "Nitesh", 67);

		std1.showStudent();
		System.out.println(std1.hashCode());
		
		//Lab: create class Book,Employee,Product,Car,Account
		
		Student std2=new Student();
		System.out.println(std2.hashCode());
		
		
		
	}

}
