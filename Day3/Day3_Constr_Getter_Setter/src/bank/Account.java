package bank;

public class Account {
	//
	private int actid;
	private String name;
	private double balance;
	private String email;

	// to initialize private data members use constr
	public Account() {
		System.out.println("----default Account----");
		actid = 101;
		name = "Ram";
		balance = 10000;
		email = "ram@gmail.com";

	}

	public Account(int acNo, String nm, double bal, String em) {
		System.out.println("----Parameter Constr-----");
		actid = acNo;
		name = nm;
		balance = bal;
		email = em;

	}

	public void showDetails() {
		System.out.println(actid + "    " + name + "   " + balance + "   " + email);
	}

	public double getBalance() {
		return balance;
	}
	
	
	
	public void withdraw(double amount)
	{
		System.out.println("----Withdraw----");
		balance=balance-amount;
	}
	
	public void deposite(double amount)
	{
		System.out.println("----Deposite----");
		balance=balance+amount;
	}
	
	
	
	
	
	
	
	
	
	

}
