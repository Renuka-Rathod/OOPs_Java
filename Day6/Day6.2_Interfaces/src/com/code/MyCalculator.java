package com.code;

import com.contracts.MyMathInterface;

public class MyCalculator implements MyMathInterface {

	@Override
	public int add(int i, int j) {
		 System.out.println("---add----");
		return i+j;
	}

	@Override
	public int subs(int i, int j) {
		System.out.println("----subs-----");
		return i-j;
	}
	
	

}
