package containment;

import java.util.Scanner;

public class TestShopApp {

	public static void main(String[] args) {

		System.out.println("1:add prd 2:show prd 3:search: 4:show prices 5:edit price  6:price> 500 ");

		Product[] shop = new Product[10];//

		Scanner sc = new Scanner(System.in);

		int index = 0;// 0 to 9
		int ch;
		do {

			System.out.println("enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				if (index < shop.length) {
					System.out.println("Please Enter PrdId Name Price mDate(d,m,y)");

//			    int prdid=sc.nextInt();
//				String pname=sc.next();
//				double price=sc.nextDouble();
//				int d=sc.nextInt();
//				int m=sc.nextInt();
//				int y=sc.nextInt();
//				Date mDate=new Date(d, m, y);				
//				Product prd=new Product(prdid, pname, price, mDate);

					// or

//					Product prd = new Product(sc.nextInt(), sc.next(), sc.nextDouble(),
//							new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
//
//					shop[index] = prd;
					// or

					shop[index] = new Product(sc.nextInt(), sc.next(), sc.nextDouble(),
							new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
					index++;

					System.out.println("----Prd added ----");
				} else {
					System.out.println("Array is full");
				}

				break;
			case 2:
//				for(int i=0;i<index;i++)
//				{
//					System.out.println(shop[i]);
//				}
				// or

				for (int i = 0; i < shop.length; i++) {
					if (shop[i] != null)
						System.out.println(shop[i]);
				}

				break;
			}

		} while (ch != 3);

	}

}
