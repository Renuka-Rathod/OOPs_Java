package com.genCode;

public class MyGenClass<T> {

	private T  no1;
	private T no2;
	
	public MyGenClass(T no1,T no2)
	{
		this.no1=no1;
		this.no2=no2;
		
	}
	public T getNo1()
	{
		return no1;
	}
	public void setNo1(T no1)
	{
		this.no1=no1;
	}


public void swap(T a,T b)
{
	T temp;
	temp=a;
	a=b;
	b=temp;
	
}

}
