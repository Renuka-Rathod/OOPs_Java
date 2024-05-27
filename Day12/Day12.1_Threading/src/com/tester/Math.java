package com.tester;

public class Math {

	
	public double maxPercentage()
	{
		//double[] percentage=new double[5000];
		// 94.45  94.451  10 sec
		double max=99;
			System.out.println("------calculating percentage-----");
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return max;
	}
	
	public void getSchNames()
	{
		System.out.println("------get schl names-----");//5
	}
	public void add()
	{
		System.out.println("------add-----");//5
	}
	public void subs()
	{
		System.out.println("------subs-----");//5
	}
	public void div()
	{
		System.out.println("------div-----");//5
	}
}
