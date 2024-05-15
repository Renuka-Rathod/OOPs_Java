package tester;

import java.util.Scanner;

import pkg1.Date;

public class TestDate {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a=10;
		Date dob;
		dob = new Date();
		dob.show();//

		System.out.println("------------");
		
		Date dob2=new Date();
		dob2.show();
		
		//
		System.out.println("Enter Day month year:");
		int d,m,y;
		Scanner sc=new Scanner(System.in);
		
		d=sc.nextInt();
		m=sc.nextInt();
		y=sc.nextInt();
		
		Date dob3;//dob3 will get creted on stack
		dob3=new Date(d,m,y);
		dob3.show();
		
		
		 
	}

}
