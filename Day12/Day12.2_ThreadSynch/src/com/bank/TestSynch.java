package com.bank;

public class TestSynch {

	public static void main(String[] args) {

		final  BankAccount act1 = new BankAccount(101, "Abc", 5000);

		BankAccount act2 = new BankAccount(22, "aaa", 10);

		// act1=act2;//error

		BankOp1 t1 = new BankOp1(act1);
		t1.setName("BankEmp1");

		t1.start();
		
		
		BankOp2 t2=new BankOp2(act1);
		t2.setName("BankEmp2");
		t2.start();
		
		
		
	}

}
