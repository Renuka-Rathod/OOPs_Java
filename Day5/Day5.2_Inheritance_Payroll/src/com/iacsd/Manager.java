package com.iacsd;

//Manager is a Employee
//Manager extends Employee
//Base class For Manager:Manager
//Base class for Employee Object
public class Manager extends Employee {

	private int allounces;
	private String deptName;
	
	public Manager()
	{
		System.out.println("---default constr Manager----");
		allounces=5000;
		deptName="NotYet";
	}
	
	
	
	
	
	public Manager( int empid,String name,double salary ,int allounces, String deptName) {
		//super();//default constr of parent
		

		 super(empid,name,salary);//constr call must be first statement in constr
		
		System.out.println("---parameter constr Manager-----\n");
		this.allounces = allounces;
		this.deptName = deptName;
	}

//Cannot override the final method from Employee
//	public void calIncomeTax()
//	{
//		System.out.println("----Tax-----");
//	}

	//overrding method from Employee

	public void managerTask()
	{
		System.out.println("----Task Done By Manager---");
	}
	
	
	
	//overriding:keeping fun name same and signature same and return type same
	//child class hides methods of parent class
	//object of child class will call child class methods
	//object of parent class will call parent class methods
	//annotations:to give extra info to compiler  and JVM
	
	 @Override
	public void calSalary()
	{
		
		System.out.println("Manager salary="+(super.salary+this.allounces));
		
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("manager:"+allounces+"    "+deptName);
	}




	
	
	
	
}
