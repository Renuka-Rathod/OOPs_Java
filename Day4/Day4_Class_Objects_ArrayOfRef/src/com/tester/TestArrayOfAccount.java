package com.tester;

import com.bank.Account;

public class TestArrayOfAccount {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Account[] bank;
		bank = new Account[5];
		// array of refType:by default all will get assugned to null

		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i]);
		}

		Account act1 = new Account(101, "Sonali", "s@gmail.com", 60000);

		bank[0] = act1;

		Account act2 = new Account(102, "Monali", "m@gmail.com", 45000);

		bank[1] = act2;

		bank[2] = new Account(103, "Vinit", "v@gmail.com", 34000);
		bank[3] = new Account(104, "Ritesh", "v21@gmail.com", 54000);
		bank[4] = new Account(105, "Gauri", "v3@gmail.com", 84000);

		System.out.println("\n\n");

		for (int i = 0; i < bank.length; i++) {
			bank[i].show();
		}

		// show all emails id

		System.out.println("---------------all email id---------");

		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].getEmail());
		}

		System.out.println("--------------balance--------");

		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].getBalance());
		}

		System.out.println("---------------all name--------");

		for (int i = 0; i < bank.length; i++) {
			System.out.println(bank[i].getEmail());
		}
		
		
		//get balance of act2
		
		//withdraw,deposite
		
		//moneyTransfer
		

	}

}
