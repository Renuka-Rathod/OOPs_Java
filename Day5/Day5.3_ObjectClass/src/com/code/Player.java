package com.code;

//Base ClasS:Object
public class Player {
	private int pId;
	private String name;
	private int age;
	
	public Player(int pId, String name, int age) {
	 
		this.pId = pId;
		this.name = name;
		this.age = age;
	}

	public Player() {
		super();
	}

	@Override
	public String toString() {
		return "pId=" + pId + ", name=" + name + ", age=" + age ;
	}

	
	//p1.equals(p3);
	@Override
	public boolean equals(Object obj) {
	
		//can we get age attribute in obj object of Object class
		//DownCasting
		
		//RTTI
		if(obj instanceof Player)
		{
		Player p=(Player)obj;//DownCasting
		System.out.println("---equals from player class");
		
		 return (this.age==p.age);
		//or
		 //if(this.age==p.age)
		 //return true;
		 //else
		 //return false;
		}
		else
		{
			System.out.println("obj is not type of Player");
			return false;
		}
		
	}
	

	
	
	
}
