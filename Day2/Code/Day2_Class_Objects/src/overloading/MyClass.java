package overloading;

public class MyClass {
		
	//
	public void add(int no1,int no2) {
		System.out.println("Add(i,j)="+(no1+no2));
	}
	
	
	public void add2(int i,int j,int k)
	{
	System.out.println("add(i,j,k)="+(i+j+k));	
	}
	
	
	public void add3(double d1,int i)
	{
		System.out.println("add(d1,i)="+(d1+i));
	}
	//int double
	//double double double
	
	
	
	//method overloading
	//fun with same name but with diff signature
	// number of arguments
	//data type 
	//sequence of args
	
	public void addition(int i,int j)
	{
		System.out.println("Addition(i,j)="+(i+j));
	}
	
 //fix signature
	public void addition(int i,int j,int k)
	{
		System.out.println("Addition(i,j,k)="+(i+j+k));
	}

	public void addition(double i,double j)
	{
		System.out.println("Addition(d1,d2)="+(i+j));
	}

	public void addition(double i,int j)
	{
		System.out.println("Addition(d1,j)="+(i+j));
	}

	public void addition(int i, double j)
	{
		System.out.println("Addition(i,d1)="+(i+j));
	}

//return data type is not considered in fun overloading
//	public int  addition(int i,int j)
//	{
//		System.out.println("Addition(i,j)="+(i+j));
//		return 0;
//	}


//dynamic signature

	public void sum(int... a)
	{
		System.out.println("------sum of-----  "+a.length);
		
		int total=0;
//		for(int i:a)
//		{
//			total+=i;
//		}
		//or
		for(int i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		System.out.println("Total="+total);
		
	}
	
	
	
	
	
	
	
	

}
