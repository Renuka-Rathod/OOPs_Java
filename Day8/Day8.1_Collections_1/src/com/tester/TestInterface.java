package com.tester;


interface myMath{
	void add();
}

class MyMathClass implements myMath
{	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("---add----");
	}
		
}
public class TestInterface {
		public static void main(String[] args) {
		myMath obj;
		
//		obj=new MyMathClass();
//					myMath obj1=new myMath() {
//			
//			@Override
//			public void add() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		obj=()->{System.out.println("---add----");};
	}
}
