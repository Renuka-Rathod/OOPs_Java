package arrays;

import java.util.Scanner;

public class TestMenuArray {

	public static void main(String[] args) {

		System.out.println("1:show all 2:add element 3:search 4:sum 5:even 6:exit");

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter Size ");
		int no = sc.nextInt();
		int ch, number;
		int[] arr;
		arr = new int[no];

		do {
			System.out.println("enter Choice:");
			ch = sc.nextInt();

			switch (ch) {
			case 1:// if(ch==1)
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Enter Array element");
				for (int i = 0; i <arr.length;i++)
				{
					System.out.println("enter for index "+i);
					arr[i]=sc.nextInt();
				}
				break;
				
				
				
				
			}

		} while (ch != 6);

	}

}
