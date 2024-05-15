package pkg1;

public class Date {
//attribute/field/data members
	
	//private:inside class only,outside class private data members are hidden
	private int day;
	private int month;
	private int year;
	
	
	//to work with private data members
	//we have to create public methods
	
	public void showDate()
	{
		System.out.println("Date:"+day+"/"+month+"/"+year);
	}
	
	public void assignDate(int d,int m,int y) {
		
		day=d;
		month=m;
		year=y;
		System.out.println("---Date is assigned---");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
