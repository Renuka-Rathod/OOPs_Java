package com.thread2;

public class TestOddEvenThreads {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("---Main THread Started----"+Thread.currentThread().getName());
		
		
		EvenThread even=new EvenThread();
		even.setName("EvenThread");
		even.start();//run
		
		System.out.println("even thread isAlive :"+even.isAlive());
		
		OddThread odd=new OddThread();
		odd.setName("OddThread");
		odd.start();
		
		even.join();//main thread will wait for even thread to complete
		odd.join();//main thread will wait for odd thread to complete
		System.out.println("---write data into file-------");
		
		System.out.println("---Main THread ended----");
		System.out.println("even thread isAlive :"+even.isAlive());//false
		
	}

}
