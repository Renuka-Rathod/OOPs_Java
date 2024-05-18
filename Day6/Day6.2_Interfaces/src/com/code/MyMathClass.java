package com.code;

import com.contracts.MyMathInterface;

//provider class
public class MyMathClass implements MyMathInterface   {

	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

	@Override
	public int subs(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}
	
	 

	//can we overrride default method in provider class:YES
	//Lab tryout
	
	
	
	
}
