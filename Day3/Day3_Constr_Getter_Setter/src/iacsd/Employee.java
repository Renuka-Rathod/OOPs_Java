package iacsd;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	private String email;
	
	public Employee(int empid,String name,double salary,String email)
	{
		
		System.out.println("---parameter employee----");
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		this.email=email;
		
		
		
		
	}
	public void show()
	{
		System.out.println("empId "+empid);
		System.out.println("name "+name);
		System.out.println("salary "+salary
				);
		System.out.println("email "+email);
	}
	
	
}
