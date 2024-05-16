package com.tester;

import com.bank.Account;

public class TestActRef {
	
	
	

	public static void main(String[] args) {
		
		
		int  a=10;
		int b;
		
		b=a;
		
		System.out.println(a+"     "+b);
		
		a=500;
		System.out.println("----------------");
		System.out.println(a+"     "+b);//500  10
		
		
		Account act1;
		act1=new Account(201, "Seeta", "seeta@gmail.com", 5000);
		
		
		
		Account act2;
		act2=new Account(202, "Geeta", "geeta@gmail.com", 8000);
		
		//geeta send 2000 to seeta
		
		 
		act1.show();
		
		System.out.println();
		act2.show();
		
		System.out.println("\n\n");
		
		Account act3;
		act3=act2;
		act3.show();
		System.out.println("\n\n");
		
		act2.setName("Geetanjali");
		act3.show();
		
		display(act3);
		change(a);
		System.out.println(a);
		
	}
	public static void change(int i)
	{
		i=i+100;
	}
	public static void display(Account act)
	{
		act.show();
	}

}
