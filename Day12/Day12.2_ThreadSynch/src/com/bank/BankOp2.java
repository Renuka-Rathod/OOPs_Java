package com.bank;

public class BankOp2 extends Thread {
	
	
	private BankAccount act;
	
	public BankOp2(BankAccount act)
	{
		this.act=act;
	}
	
	public void run()
	{
		try
		{
			
			System.out.println("----BankOp2 started By Thread:" + Thread.currentThread().getName());

			act.withdraw(2000);
			Thread.sleep(1000);
			System.out.println("----BankOp2 ended By Thread:" + Thread.currentThread().getName());
		
		}
		catch(Exception ex)
		{
			
		}
		
		
	}
	
	

}
