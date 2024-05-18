package com.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface1 {

	//only one signgle abstract method  (SAM)
	void display();
	
	//Lab TryOut
	//can we write implemented method i.e default method in 
	//functional interface
	//YES
	
//	void test();
	
}
//Need :Functional Programming
//SAM
//step1:create provider class (ex. Abc)
//step2 :implements MyFunctionalInterface1
//Step3:override single abstract method in provider class
//Step4:create consumer class (ex.TestAbc)
//Step5:create an object of Provider class and invoke SAM
//Abc obj=new Abc()
//abc.display();










