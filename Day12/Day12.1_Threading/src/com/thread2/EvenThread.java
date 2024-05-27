package com.thread2;

public class EvenThread extends Thread {

	public void run() {

		System.out.println("Even Thread Started By----->"+Thread.currentThread().getName());
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("\t  even number =" + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(" Even Thread ended by----->");

	}

}
