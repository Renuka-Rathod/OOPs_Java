package com.code;

public class MyMath {
	

	
	public static int add(int i,int j)
	{
		return i+j;
	}
	public static  int subs(int i,int j)
	{
		return i-j;
	}
	public static int div(int i,int j)
	{
		
		return i/j;
	}
	
	public static int division(int i,int j)
	{
//		if(j>0)
//			return i/j;
//		else
//			throw new  ArithmeticException("error:No2 > Zero");
//		
//			
		
		
		 try
		 {
			 int k=i/j;
			 return k;
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
			throw    new ArithmeticException();
		 }
			 
	}
	public static int multi(int i,int j)
	{
		return i*j;
	}

}
