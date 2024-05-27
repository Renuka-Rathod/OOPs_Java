package com.bank;

public class BankAccount {

	
	private int actid;
	private String name;
	private double balance;
	public BankAccount(int actid, String name, double balance) {
		super();
		this.actid = actid;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [actid=" + actid + ", name=" + name + ", balance=" + balance + "]";
	}
	
	//101 abc 5000
	//withdraw(7000)
	public synchronized void withdraw(double amount) throws InterruptedException
	{
		
		System.out.println("---Withdraw Operation Started-----");
		
		if(balance<amount)
		{
			System.out.println("----wait for deposite to occur----");
			this.wait();
		}
		
		balance=balance-amount;
		Thread.sleep(2000);
		System.out.println(" After Withdraw   Balance="+balance);
		
		
		System.out.println("---Withdraw Operation Ended-----");
		
	}
	public synchronized void deposite(double amount) throws InterruptedException
	{
		
		System.out.println("---deposite Operation Started-----");
		
		
		balance=balance+amount;
		Thread.sleep(2000);
		System.out.println(" After deposite   Balance="+balance);
		
		this.notifyAll();//wakeup all waiting thread
		
		System.out.println("---deposite Operation Ended-----");
		
	}
	
	
}
