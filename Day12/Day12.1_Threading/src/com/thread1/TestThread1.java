package com.thread1;

public class TestThread1 {

	public static void main(String[] args) {


		System.out.println("--------Main Started------");
		
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println("i="+i);
//		}
		 MyThread1 t1=new MyThread1();
		
		 t1.start();//
		
		System.out.println("--------Main ends------");
		
		

	}

}
