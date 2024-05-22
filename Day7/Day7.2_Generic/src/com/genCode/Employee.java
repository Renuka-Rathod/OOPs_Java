package com.genCode;

interface Show
{
	void print();
}
interface Taxable
{
	void payTax();
}
public  abstract class Employee {

}
  class Manager extends Employee implements Taxable,Show
  {

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	  
  }
class ShopKeeper implements Taxable
{

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		
	}
	
}