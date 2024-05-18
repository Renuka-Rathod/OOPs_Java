package com.code;

public class TestString_Date {

	public static void main(String[] args) {


		Date d1=new Date(12, 12, 2012);
		
		Date d2=new Date(12, 12, 2012);
		
		System.out.println(d1.hashCode()  +"     "+d1);
		System.out.println(d2.hashCode()  +"     "+d2);

		Date d3=d1;
		
		
		
		
		int a=10;
		String  str1="IACSD";
		
		String  str2="IACSD";
		
		System.out.println(str1.hashCode()+"    "+str1);
		
		System.out.println(str2.hashCode()+"    "+str2);
		
		
		if(str1==str2)
			System.out.println("str1==str2");
		else
			System.out.println("str1!=str2");
	     str1="New IACSD";
		
		//System.out.println(str2);
		
		System.out.println("------------------------------");
		
		//in case of String type 
		//equals method is used for checking
		
		if(str1.equals(str2))
			System.out.println("str1 is IACSD ");
		else
			System.out.println("str1 Not");
		
		
		
		System.out.println("------------------------------");
		//equals(Object obj)
		//Base classObj=ref of derived class
		if(d1.equals(d2))//UpCasting
		{
			System.out.println("d1==d2");
		}
		else
			System.out.println("d1!=d2");
		
		
		
		
		
		if(d1.equals(str2))//UpCasting
		{
			System.out.println("d1==str2");
		}
		else
			System.out.println("d1!=str2");
		
		
		//lab:try to access String class Methods
		
		System.out.println(str1.length());
		System.out.println(str1.charAt(4));
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.contains("@"));
		System.out.println(str1.concat("  Pune"));
		
	}

}
