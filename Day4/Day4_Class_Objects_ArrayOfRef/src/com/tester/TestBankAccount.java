package com.tester;

import com.bank.Account;

public class TestBankAccount {

	
	public static void test(Account actObj)
	{
		System.out.println("actObj="+actObj.hashCode());
		
		actObj.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Account act1=new Account();
		System.out.println("act1="+act1.hashCode());
		
		act1.show();
		
		
		Account act2=new Account(909, "Nita", "abc", 45000);
		System.out.println("act2="+act2.hashCode());
		act2.show();
		
		
		act2.deposite(20000);
		
		System.out.println("Enter New email Id");
		String emailid="nita@gmail.com";
		
		//
		act2.setEmail(emailid);
		System.out.println("Updated Email:"+act2.getEmail());
		 
		act2.show();
		
		
		
		
		
	}

}
