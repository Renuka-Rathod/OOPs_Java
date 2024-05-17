package com.code;

public class TestPlayers {

	public static void main(String[] args) {


		Player p1=new Player(101, "Sachin", 40);
		
		
		
		Player p2=new Player(102, "Ritesh", 30);
		
		Player p3=new Player(101, "Sachin", 40);
		//hashCode
		if(p1==p3)
		{
			System.out.println("p1==p3");
		}
		else
			System.out.println("p1!=p3");
		
		
		//object class equals method
		
		
		//p1.equals(Object obj)
		//p1.equals(p3);// obj=p3 Upcasting
		System.out.println();
		//object class equals method chk hashcode
		
		if(p1.equals(p3))
		{
			System.out.println("p1==p3");
		}
		else
		{
			System.out.println("p1!=p3");
		}
		
		
		
		Student s=new Student();
		
		if(p1.equals(s))
		{
			System.out.println("p1==s");
		}
		else
		{
			System.out.println("p1!=s");
		}
			
			
			
			
			
			
			
			
			
		
	}

}
