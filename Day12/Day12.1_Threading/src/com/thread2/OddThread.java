package com.thread2;

public class OddThread extends Thread {
	public void run() {

		System.out.println("Odd Thread Started By----->"+Thread.currentThread().getName());
		for (int i = 2; i <= 10; i++) {
			if (i % 2!= 0) {
				System.out.println("Odd number =" + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(" Odd Thread ended by----->");

	}
}
