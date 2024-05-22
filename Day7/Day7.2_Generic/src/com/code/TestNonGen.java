package com.code;

public class TestNonGen {

	
	public static void main(String[] args) {
		
		
		int a=10,b=20;
		MyNonGen m1=new MyNonGen(a, b);
		
		 
		int no1=(int) m1.getNo1();
		
		
		
		String s1="abc",s2="xyz";
		MyNonGen obj=new MyNonGen(s1, s2);
		
		int s3=(int) obj.getNo1();//No Type Saftey
		
		//int x="abc";
		
		//problem with non-gen
		//Upcasting and downCasting
		//no type saftey at  the  time of compilation
		
		//Solution:Generic
		
	}
}
