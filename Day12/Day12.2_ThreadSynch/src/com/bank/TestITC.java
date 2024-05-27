package com.bank;

public class TestITC {

	public static void main(String[] args) throws InterruptedException {
		 
		
		
	final	BankAccount act=new BankAccount(101, "Abc", 1000);
		
		BankOp2 op2=new BankOp2(act);
		
		op2.start();
		//op2.join();
		
		
		BankOp1 op1=new BankOp1(act);
		op1.start();
		op1.join();
		
		System.out.println("------------end------");

	}

}
