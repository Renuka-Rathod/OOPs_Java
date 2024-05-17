package com.iacsd;

public class Employee   {

	private int empid;// lab:auto increment of empid
	private String name;
	protected double salary;

	 
	public Employee() {
		// super();//super: parent class object
		// this is object of current class

		System.out.println("---default constr Employee-----\n");
		empid = 101;
		name = "Ram";
		salary = 10000;
	}

	public Employee(int empid, String name, double salary) {
		// super();
		System.out.println("---parameter constr Employee-----\n");

		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public final void calIncomeTax()
	{
		System.out.println("----Tax-----");
	}
	
	
	public void calSalary() {

		System.out.println("Employee Salary :" + salary);
	}
	public void show()
	{
		System.out.println("EmpId:"+empid+" Name:"+name+" Salary:"+salary);
	}

}
