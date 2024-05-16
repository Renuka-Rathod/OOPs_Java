package containment;

public class Product {

	private int  prdId;
	private String name;
	private double price;
	private Date mDate;
	
	
	public Product()
	{System.out.println("---default---product-----");
		prdId=101;
		name="xyz";
		price=100;
		mDate=new Date();//1 6 1990
		
	}
	
	public Product(int prdId,String name,double price,Date mDate)
	{
		System.out.println("-----parameter product-----");
		this.prdId=prdId;
		this.name=name;
		this.price=price;
		this.mDate=mDate;				
	}
	
	 public void print()
	 {
		System.out.println("------------Details----------"); 
		 
		 System.out.println("PrdId="+this.prdId);
		 System.out.println("Name="+this.name);
		 System.out.println("Price="+this.price);
		 System.out.println("mDate="+this.mDate);
		  
	 }
	public String toString()
	{
		
	return "PrdId:"+prdId+" Name "+name+"  Price "+price+"  mDate:"+mDate;	
		
	}
	
	
	
	
	
	
	
	
}
