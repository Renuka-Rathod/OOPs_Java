package com.tester;

import com.code.MyCalculator;
import com.code.MyMathClass;
import com.contracts.MyMathInterface;

public class TestInterface {
	
	public static void show(MyMathInterface obj)//loose coupling
	{
		obj.add(45, 67);
	}
 
public static void main(String[] args) {
	
	 //MyMathInterface myObj=new MyMathInterface();
	 
	MyCalculator obj1=new MyCalculator();
	obj1.add(56, 67);
		 
	MyMathClass obj2=new MyMathClass();
	
	obj2.add(90, 90);
	show(obj2);//
	show(obj1);//
	
	MyMathInterface myObj;
	myObj=obj1;
	//Interface obj can hold ref of class which implements 
	//contact given by i/f
	
	//Student stud=new Student();
	
	//myObj=stud;//error as Student does not implements MyMathInterface
	
	
}
}
