package com.iacsd;


//BaseClass:
public final class SalesPerson extends Employee{

	
	private int pa,fa,ta;
	
	public SalesPerson()
	{
		//super()
		System.out.println("---default constr SalesPerson----");
		pa=fa=ta=500;
	}
	
	public SalesPerson(int empid,String name,double salary,int pa,int fa,int ta)
	{
		super(empid,name,salary);//parameter constr of Employee
		
		this.pa=pa;
		this.ta=ta;
		this.fa=fa;
	}
	
	
	@Override
	public void calSalary()
	{
		System.out.println("SalesPerson:="+(super.salary+pa+fa+ta));
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("SalesPerson "+pa+"  "+fa+"    "+ta);
	}
	

	
	
	
	
}
