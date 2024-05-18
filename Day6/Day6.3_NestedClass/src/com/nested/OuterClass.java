package com.nested;

public class OuterClass {
	
	private int no;
	
	private String name;

	private InnerClass innerObj;//data member
	
	//getters and setters
	public void setInnerObj(int a)
	{
		innerObj=new InnerClass(a);//constr
		
		System.out.println(innerObj);
	}
	
 	public OuterClass(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "OuterClass [no=" + no + ", name=" + name + "]";
	}
	
	
	
	
	//hide  class
	//private class
	
	private class InnerClass{
		
		int no1;
		
		public InnerClass(int no1)
		{
			this.no1=no1;
		}
		public String toString()
		{
			return " Inner Class No1 :"+no1+"     OuterClass No= "+no+"   Name:"+name;
		}
	}
	
	

}
