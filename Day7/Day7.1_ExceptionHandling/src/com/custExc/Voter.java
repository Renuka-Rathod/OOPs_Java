package com.custExc;

public class Voter {
	
	private int voterId;
	private String name;
	private int age;
	public Voter(int voterId, String name, int age) {
		super();
		this.voterId = voterId;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [voterId=" + voterId + ", name=" + name + ", age=" + age + "]";
	}
	
	public void isValidAge() throws VoterException {
		if(age>18)
			System.out.println("Can Do Voting");
		else
			throw new VoterException("Invalid age");
	}
	@Deprecated
	public void fun1()
	{
		
	}
	
	public void newFun()
	{
		
	}
	

}
