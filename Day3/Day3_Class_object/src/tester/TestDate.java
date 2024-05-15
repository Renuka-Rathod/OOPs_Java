package tester;
import pkg1.Date;
public class TestDate {

	public static void main(String[] args) {
		
		//Class ObjName
		
		//class is refDataType
		//class is User Define Data Type
		
		//to access methods given by class
		//we have create an object of class
		
		int a;//primitive :value data type
		a=20;
		Date dob1;//non primitive:ref data type
		//initialize dob1
		//allocate memory for storing values of day,month,year
		dob1=new Date();
		//System.out.println(dob1);
		
		//access methods from Date cllass using object of class Date
		dob1.showDate();
		
		//dob1.day=1000;
		
		
		Date dob2=new Date();
		 dob2.showDate();
		
		System.out.println("---------assign Date-----");
		Date dob3=new Date();
		
		dob3.showDate();//0 0 0
		//methods need to be called explicitly
		dob3.assignDate(8, 5, 2001);
		
		dob3.showDate();
		dob1.showDate();//
	}

}
