package com.thread1;

public class MyThread1 extends Thread {

	@Override
	public void run() {
	 
		System.out.println("\n-----Thread Started-----");
		for(int i=1;i<=10;i++)
		{
			System.out.println("i="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n-----Thread Ended-----");
		
	}
	
	
	
	

}
