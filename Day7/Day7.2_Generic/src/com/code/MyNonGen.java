package com.code;

public class MyNonGen {	
	private Object no1;
	private Object no2;
	
	public MyNonGen(Object o1,Object o2)
	{
		no1=o1;
		no2=o2;
	}

	public Object getNo1()
	{
		return no1;
	}
	
	public void setNo1(Object o1)
	{
		no1=o1;
	}

	@Override
	public String toString() {
		return "MyNonGen [no1=" + no1 + ", no2=" + no2 + "]";
	}
	
	
	
}
