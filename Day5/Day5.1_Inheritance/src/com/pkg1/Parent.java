package com.pkg1;

//Baseclass:java.lang.Object
public class Parent {

	public int pubInt;
	int defaultInt;
	private int prvInt;
	protected int proInt;

	public Parent() {
		System.out.println("----parent default constr---");
	}

	private void privateMethod() {
		System.out.println("---Private Method---Parent----");
	}

	public void publicMethod() {
		
		System.out.println("---Public Method---Parent----");
	}
	protected void protectedMethod() {
		System.out.println("---protected Method---Parent----");
	}

	void defaultMethod() {
		System.out.println("---default Method---Parent----");
	}

	public void print() {

		System.out.println("---I am inside Parent class----");
	}

}
