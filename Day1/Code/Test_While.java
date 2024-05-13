import java.util.Scanner;

public class Test_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}

		System.out.println("---end of while---");
		// System.out.println(a);

		// Lab:even,odd,prime numbers from 1 to 10

		// task:sum of all +ve numbers
		int no1 = -10, sum = 0;
		while (no1 >= 0) {
			System.out.println("enter No1");
			no1 = sc.nextInt();
			sum = sum + no1;
		}
//		
//		System.out.println("Sum="+sum);

		System.out.println("---do---while");

		do {

			System.out.println("enter Positive Number");
			no1 = sc.nextInt();
		} while (no1 >= 0);

	}

}
