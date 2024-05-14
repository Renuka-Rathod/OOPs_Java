package varArgs;

public class MyClass {
	
	//varArgs:0 or many
	
//	public void sum(int... m,double... d )
//	{
//		
//	}
	
	public void show(String name,String... skills)
	{
		System.out.println("Student Name "+name); 
		System.out.println("----Skills----");
		for(String s:skills)
		{
			System.out.print (s+"  ");
		}
	}

}
