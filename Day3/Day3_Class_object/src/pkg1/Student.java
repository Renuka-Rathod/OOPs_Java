package pkg1;

public class Student {

	//data members
	private int rollno;
	private String name;
	private double perc;
	
	//to assign/read private datamembers
	//write public
	
	public void assignStudent(int no,String nm,double pr)
	{
		System.out.println("---assign Student----");
		//no=rollno;
		//nm=name;
		rollno=no;
		name=nm;
		perc=pr;
		
	}
	
	public void showStudent()
	{
		System.out.println("----------------------------------");
		System.out.println("RollNO:"+rollno);
		System.out.println("Name"+name);
		System.out.println("Per:"+perc);
	}
	
	
	
	
	
	
	
	
	
	
}
