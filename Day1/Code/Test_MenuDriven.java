import java.util.Scanner;

public class Test_MenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// menu
		// 1 :pen-10 2:pencil=5 3:cBox-30 4:color box-50 5:Bottle-100 6:NoteBooks:35
		// 7:exit

		System.out.println("1:Pen 2:Pencil 3:CBox 4:Color Box 5:Bottle 6:exit");
		int total = 0;
		int ch, qty;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Qty for Pen");
				qty = sc.nextInt();
				total += qty * 10;
				break;
			case 2:
				System.out.println("Enter Qty for Pencil");
				qty = sc.nextInt();
				total += qty * 5;
				break;
			case 3:
				System.out.println("Enter Qty for cBox");
				qty = sc.nextInt();
				total += qty * 30;
				break;
			case 4:
				System.out.println("Enter Qty for Color Box");
				qty = sc.nextInt();
				total = total + (qty * 50);
				break;
			case 5:
				System.out.println("Enter Qty for Bottle");
				qty = sc.nextInt();
				total += qty * 100;
				break;
			default:
				break;
			}

		} while (ch != 6);

		System.out.println("Total:" + total);
		System.out.println("----Thank You----");
	}

}
