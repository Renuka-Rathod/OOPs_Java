package com.genCode;

public class TestGenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//imp:Generic works only for Object Type
		
		MyGenClass<String> strObj=new  MyGenClass<String>("abc", "xyz");
		
		
		String nm=strObj.getNo1();
		System.out.println(strObj.getNo1());

	
	//can i use MyGenClass for Date type
		Date d1=new Date();
		Date d2=new  Date();
		MyGenClass<Date> dateObj=new MyGenClass<Date>(d1, d2);
		Date d3=dateObj.getNo1();
	
	
	//can i use MyGenClass  class for int data type
		//int is primitive not ref type
		//int not extends Object
		//to use primitive(value type) with generic
		//Boxing And Unboxing is used
		
		
		//Boxing:converting value type into ref type
		
		//UnBoxing: converting ref type into value type
	
	
		
		int  x=100;//primitive type:value type
		
		//to convert int into ref type
		//java gives Wrapper class
		//int---->Integer
		//short---->Short
		//long----->Long
		//byte ----->Byte
		//char----->Character
		//double ---->Double
		//float--->Float
		//boolen---->Boolean
		
		Integer intObj=new Integer(x);//Boxing
		
		int y=intObj.intValue();//UnBoxing
		
		//java 5 onwords
		//autoBoxing,autoUnboxing
		
		int c=100;
		Integer iObj=c;//Integer=int  AutoBoxing
		
		
		int d=iObj;//int=Integer  AutoUnBoxing
		
		//Can we use int(premetive type) type in Generics?
		
		//Ans :Yes With the help of wrapper classes
		
		MyGenClass<Integer> intObj1=new MyGenClass<Integer>(12, 35);
		
		int e=intObj1.getNo1();//auto unboxing
		
		//bounded type:works for only Numbers
		 
		MyMathClass<Double > sMath=new MyMathClass<Double>(23.45, 34.56);
		
	}

}
