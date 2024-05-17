package com.pkg1;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parObj=new Parent();
		//default is accessible inside package only
		
		parObj.defaultMethod();
		
		//private are not accessible outside class
		
		//protected are accessible inside package
		//* protected are accessible out side package but
		//only in sub class
		parObj.protectedMethod();
		
		parObj.publicMethod();
		
		parObj.print();
		

	}

}
