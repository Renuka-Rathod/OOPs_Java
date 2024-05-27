package com.thread3;

public class TestRunnable {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {


		Runnable obj1;
	 
		
		//class implements Runnable
		MyClass clsObj=new MyClass();
		obj1=clsObj;
		  
		Thread t1 =new Thread( clsObj);
		 //t1=new Thread(clsObj, "Thread1");
		
		t1.start();//
		t1.setPriority(Thread.MAX_PRIORITY);//10
		t1.join();
		t1.stop();
		System.out.println(t1.isAlive());
		
		//FP for Runnable i/f
		Runnable runObj=()->{
			System.out.println("-----");
			for(int i=1;i<=10;i++)
			{
			System.out.println("Table "+i*2);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		
		Thread t2=new Thread(runObj);
		t2.start();
		
		
		System.out.println("--------Main End-----------");
		
		

	}

}
