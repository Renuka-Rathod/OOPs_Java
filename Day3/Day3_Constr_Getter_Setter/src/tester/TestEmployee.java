package tester;

import java.util.Scanner;

import iacsd.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Empid name salary email");
		int empid=sc.nextInt();//909
		String name=sc.next();//vaishali
		double salary=sc.nextDouble();//70000
		String email=sc.next();//abc@gmail.com
		
		
	
	 	Employee emp=new Employee(empid, name, salary, email);
	 	emp.show();//
		
		
		
	}

}
