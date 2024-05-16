package com.tester;

import com.bank.Account;

public class TestMoneyTransfer {

	public static void main(String[] args) {

		Account act1 = new Account(101, "seeta", "a", 5000);
		act1.show();
		System.out.println();
		System.out.println();
		Account act2 = new Account(202, "geeta", "g", 8000);

		act2.show();

		System.out.println();
		System.out.println();

		act2.moneyTransfer(act1, 5000);

		System.out.println();
		System.out.println();

		act1.show();
		act2.show();

	}

}
