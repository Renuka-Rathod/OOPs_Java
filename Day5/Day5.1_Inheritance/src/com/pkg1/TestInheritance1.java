package com.pkg1;

public class TestInheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child childObj = new Child();

		childObj.test();

		childObj.defaultMethod();
		childObj.protectedMethod();
		childObj.publicMethod();
		childObj.print();

		// childObj.hashCode();//Object class

		Child1 ch1 = new Child1();
		ch1.display();
		ch1.hashCode();
		
		ch1.publicMethod();//Parent class
		
		

	}

}
