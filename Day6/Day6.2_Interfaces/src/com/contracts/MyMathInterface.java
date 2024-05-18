package com.contracts;

public interface MyMathInterface {
	// i/f contins all abstract methods
	// by default methods are public abstract

	int add(int i, int j);// public abstract int add(int i,int j)

	int subs(int i, int j);
	// java 8 feature
	// default method:methods implemented by i/f

	 default int min(int i,int j) {
		 return (i<j?i:j);
	 }
	
	
	default int max(int i, int j) {
		// implemented methods
		if (i > j)
			return i;
		else
			return j;
	}
}

//Rule(contract): add,subs
//Can we create instance of i/f ?
//how to use i/f
//create provider class and implements Interface