package pkg1;

public class Date {

	
	private int day,month,year;
	
	//Constructor
	//special method
	//constr name must be same as class name
	//constr never returns value not even void
	
	
	//when constr get invoked?
	//as soon as new keyword get execute
	//Date dob=new Date();
	public Date()
	{
		System.out.println("-----default constructor----");
		System.out.println("---Date Object Created On Heap--------");
	//assign values to private data members
		day=1;
		month=1;
		year=1960;
	}
	
	//Types Of Constr
	//1:Default(argless,parameter less) constructor
	//constr not accepting args
	
	//2 parameterConstr
	//constr accepting parameters
	public Date(int d1,int m1,int y1)
	{
		System.out.println("---Parameter Constr Date----");
		day=d1;
		month=m1;
		year=y1;
	}
	
 	public void assign(int d,int m,int y)
	{
	 day=d;
	 month=m;
	 year=y;
	}
	public void show()
	{
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
	
	
}








