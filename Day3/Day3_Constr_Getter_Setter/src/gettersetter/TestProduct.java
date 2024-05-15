package gettersetter;

import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1:create prd 2:show prd 3:show price  4:show qty 5:change price");

		Scanner sc = new Scanner(System.in);
		int ch;

		Product prdObj=null;

		do {
			System.out.println("Enter Choice ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Prdid Name qty price");
				prdObj = new Product(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
				// or
				// int prdid=sc.nextInt();

				break;
			case 2://The local variable prdObj may not have been initialized
				
				if(prdObj!=null)
				   prdObj.show();
				else
					System.out.println("first create product");
				break;
			case 3:
				
				  System.out.println("Price:"+ prdObj.getPrice());
				break;
			case 4:
				  System.out.println("Price:"+ prdObj.getQty());
					
				break;
			case 5:
				System.out.println("Enter new price");
				double p=sc.nextDouble();
				prdObj.setPrice(p);
				break;
			}

		} while (ch != 6);

	}

}
