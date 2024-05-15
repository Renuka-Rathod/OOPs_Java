package gettersetter;

public class Product {

	private int prdid;
	private String name;
	private int qty;
	private double price;
	public Product(int prdid, String name, int qty, double price) {
		super();
		System.out.println("---parameter Product----");
		this.prdid = prdid;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	
	public void show()
	{
		
		System.out.println(prdid +"   "+name+"   "+qty+"    "+price);
			
		
	}
	
	
	
	//to read/assign value of individual data members
	//getters and setters are user
	
	
	
	//to read data member getters
	//to assign data member setters
	
	//getter for price
	public double getPrice()
	{
		return price;
	}
	
	//setter for price
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public int getQty()
	{return qty;
	}
	
	//lab:getters and setters for prd name
	//
	
	
}
