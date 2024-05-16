package com.bank;

public class Account {

	private int actid;// need:auto increment
	private String name;
	private String email;
	private double balance;

	// default
	public Account() {
		System.out.println("---Default---Account---");
		this.actid = 101;
		this.name = "Ram";
		this.email = "ram@gmail.com";
		this.balance = 10000;
	}

	public Account(int actid, String name, String email, double balance) {
		System.out.println("---parameter---Account---");
		this.actid = actid;
		this.name = name;
		this.email = email;
		this.balance = balance;

	}

	public double deposite(double amount) {
		System.out.println("Balance :" + this.balance);
		this.balance = this.balance + amount;
		System.out.println("After Deposite Balance:" + balance);
		return balance;

	}

	public double withdraw(double amount) {
		System.out.println("Balance :" + this.balance);
		this.balance = this.balance - amount;
		System.out.println("After withdraw Balance:" + balance);
		return balance;

	}

//moneyTransefer 
	// act2.moneyTransfer(act1,5000)

	public void moneyTransfer(Account reciver, double amount) {

		System.out.println(" Sender:" + this.getName());
		System.out.println(" Reciver:" + reciver.getName());

		// get balance of Sender
		this.balance = this.balance - amount;

		// get balance of reciver
		reciver.balance = reciver.balance + amount;

		System.out.println(" Sender Balance :" + this.balance);
		System.out.println(" Reciver Balance:" + reciver.balance);

	}

	public void show() {
		//System.out.println("Details Of Object at loc:" + this.hashCode());
		System.out.println(actid + "   " + name + "    " + email + "    " + balance);
	}

	// getters and setters

	// getters:reading
	// setters:assigning/editing

	// get email id
	public String getEmail() {
		return email;

	}

	// set:edit/update

	public void setEmail(String email) {
		this.email = email;
	}

	// read only
	public double getBalance() {
		return balance;
	}

	public int getActId() {
		return actid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
