package com.bank;

import java.util.Scanner;

public class TestAccountLocker {

	public static void main(String[] args) {
		
		//1:create Account
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter actdId Name Balance ");
		Account act1=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
		
		//3:Apply For Locker
		System.out.println("Do You Want To Apply for Locker");
		String  str=sc.next();
		//Yes NO 
		if(str.toLowerCase().equals("yes"))
		{
			System.out.println("Enter Number Of Years ");
			int year=sc.nextInt();
			act1.applyForLocker(year);
		}
		else
		{
			System.out.println("---no locker---");
		}
		
		
		System.out.println(act1);
		 
		
		
		
		
		
	}
	
	
	
	
}
