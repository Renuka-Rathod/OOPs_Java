package com.bank;

public class BankOp1 extends Thread {

	private BankAccount act;

	public BankOp1(BankAccount act) {
		this.act = act;
	}

	public void run() {
		try
		{
		System.out.println("----BankOp1 started By Thread:" + Thread.currentThread().getName());

		act.deposite(1000);
		Thread.sleep(1000);
		System.out.println("----BankOp1 ended By Thread:" + Thread.currentThread().getName());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
