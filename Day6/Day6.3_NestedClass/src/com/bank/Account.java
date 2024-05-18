package com.bank;



public class Account {

	private int actdid;
	private String name;
	private double balance;
	private Locker locker;

	public Account(int actdid, String name, double balance) {
		super();
		this.actdid = actdid;
		this.name = name;
		this.balance = balance;
		System.out.println("---Account Created ----for :" + actdid);
	}

	@Override
	public String toString() {
		if(locker==null)
		return "Account [actdid=" + actdid + ", name=" + name + ", balance=" + balance + "  No Locker  ";
		else
			return "Account [actdid=" + actdid + ", name=" + name + ", balance=" + balance + "  "+locker ;
		
	}

	// assign values to Locker

	public void applyForLocker(int year) {
		locker=new Locker(year);
	}
	
	private class Locker {

		private int duration;

		public Locker(int duration) {
			this.duration = duration;
			System.out.println("---Locker is assigned to actId:" + actdid + "   Name:" + name);
		}

		public String toString() {
			return "Locker Charges=" + (duration * 5000);
		}

	}

}
