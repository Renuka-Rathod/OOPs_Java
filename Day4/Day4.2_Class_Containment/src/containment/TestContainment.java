package containment;

public class TestContainment {

	public static void main(String[] args) {
		 
	
//		Date mDate=new Date();
//		Product prd=new Product(902, "Sunflower Oil", 200, mDate);
//		
		
		
		int prdid=909;
		String name="sunflower oil";
		double price=200;
		Date mDate=new Date(23,4,2001);
		
		Product prd1=new Product(prdid, name, price, mDate);
		//prd1.print();
		System.out.println(prd1);
		
		//Product prd2=new Product();
		//prd2.print();
		
		
		
	}

}
