import java.util.Scanner;

public class Test_Switch {

	public static void main(String[] args) {

		System.out.println("Enter Number ");
		int no1;
		Scanner sc = new Scanner(System.in);
		no1 = sc.nextInt();

		switch (no1) {
		case 1:// if(no1==1)
			System.out.println("Jan");
			 break;
		case 2:// if(no1==2)
			System.out.println("Feb");
			  break;
		case 3:
			System.out.println("March");
			break;
			   
		default:
			System.out.println("Invalid ");

		}

	}

}
