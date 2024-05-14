package arrays;

import java.util.Scanner;

public class TestTwoDArray {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		//3 rows 3 cols
		int[][] arr=new int[3][3];
		System.out.println("enter array elements");
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		
		
		System.out.println("--------------------------");
		
		
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				 System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		//accept two 2D aarays and make addition of array store it in 3rd array

	}

}
