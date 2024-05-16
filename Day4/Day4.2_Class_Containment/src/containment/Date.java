package containment;
//Object is parent
public class Date {
	
	private int day,month,year;

	public Date(int day, int month, int year) {
		 System.out.println("---parameter Date-----");
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date() {
		//super();
		System.out.println("---default Date-----");
		day=1;month=6;year=1990;
	}
	
	
	
	public String toString()
	{
		return "Date:"+day+"/"+month+"/"+year;
	}

}
