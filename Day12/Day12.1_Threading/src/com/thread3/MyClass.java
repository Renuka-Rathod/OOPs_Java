package com.thread3;
//Parent ClasS:Object
public class MyClass    implements Runnable {

	
	@Override
	public void run() {


		System.out.println("-----Thread Started-----");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("No:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("-----Thread ended-----");
		
	}

}
